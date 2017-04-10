package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.api.objects.delegate.HollowObjectDelegate;


@SuppressWarnings("all")
public interface VideoRatingRatingDelegate extends HollowObjectDelegate {

    public int getReasonOrdinal(int ordinal);

    public long getRatingId(int ordinal);

    public Long getRatingIdBoxed(int ordinal);

    public long getCertificationSystemId(int ordinal);

    public Long getCertificationSystemIdBoxed(int ordinal);

    public VideoRatingRatingTypeAPI getTypeAPI();

}