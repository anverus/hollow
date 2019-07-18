package com.netflix.vms.transformer.input.api.gen.exhibitDealAttribute;

import com.netflix.hollow.api.custom.HollowSetTypeAPI;
import com.netflix.hollow.api.objects.delegate.HollowSetLookupDelegate;
import com.netflix.hollow.core.read.dataaccess.HollowSetTypeDataAccess;

@SuppressWarnings("all")
public class SetOfDisallowedAssetBundleEntryTypeAPI extends HollowSetTypeAPI {

    private final HollowSetLookupDelegate delegateLookupImpl;

    public SetOfDisallowedAssetBundleEntryTypeAPI(ExhibitDealAttributeV1API api, HollowSetTypeDataAccess dataAccess) {
        super(api, dataAccess);
        this.delegateLookupImpl = new HollowSetLookupDelegate(this);
    }

    public DisallowedAssetBundleEntryTypeAPI getElementAPI() {
        return getAPI().getDisallowedAssetBundleEntryTypeAPI();
    }

    public ExhibitDealAttributeV1API getAPI() {
        return (ExhibitDealAttributeV1API)api;
    }

    public HollowSetLookupDelegate getDelegateLookupImpl() {
        return delegateLookupImpl;
    }

}