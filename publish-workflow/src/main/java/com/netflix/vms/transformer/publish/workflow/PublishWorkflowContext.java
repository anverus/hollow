package com.netflix.vms.transformer.publish.workflow;

import com.netflix.vms.transformer.publish.status.PublishWorkflowStatusIndicator;

import com.netflix.vms.transformer.publish.poison.PoisonedStateMarker;
import com.netflix.aws.file.FileStore;
import com.netflix.vms.transformer.common.TransformerLogger;
import com.netflix.vms.transformer.common.TransformerMetricRecorder;
import com.netflix.vms.transformer.common.config.OctoberSkyData;
import com.netflix.vms.transformer.common.config.TransformerConfig;
import com.netflix.vms.transformer.common.publish.workflow.TransformerCassandraHelper;
import com.netflix.vms.transformer.common.publish.workflow.VipAnnouncer;
import java.util.function.Supplier;
import netflix.admin.videometadata.uploadstat.ServerUploadStatus;

public interface PublishWorkflowContext {

    PublishWorkflowContext withCurrentLoggerAndConfig();
    
    String getVip();

    TransformerLogger getLogger();

    TransformerConfig getConfig();

    TransformerCassandraHelper getValidationStatsCassandraHelper();

    TransformerCassandraHelper getCanaryResultsCassandraHelper();

    PoisonedStateMarker getPoisonStateMarker();

    FileStore getFileStore();

    VipAnnouncer getVipAnnouncer();
    
    long getNowMillis();
    
    OctoberSkyData getOctoberSkyData();
    
    TransformerMetricRecorder getMetricRecorder();

    Supplier<ServerUploadStatus> serverUploadStatus();
    
    PublishWorkflowStatusIndicator getStatusIndicator();
}
