package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.api.objects.provider.HollowFactory;
import com.netflix.hollow.core.read.dataaccess.HollowTypeDataAccess;
import com.netflix.hollow.api.custom.HollowTypeAPI;
import com.netflix.hollow.api.objects.delegate.HollowListCachedDelegate;

@SuppressWarnings("all")
public class ListOfRightsContractAssetHollowFactory<T extends ListOfRightsContractAssetHollow> extends HollowFactory<T> {

    @Override
    public T newHollowObject(HollowTypeDataAccess dataAccess, HollowTypeAPI typeAPI, int ordinal) {
        return (T)new ListOfRightsContractAssetHollow(((ListOfRightsContractAssetTypeAPI)typeAPI).getDelegateLookupImpl(), ordinal);
    }

    @Override
    public T newCachedHollowObject(HollowTypeDataAccess dataAccess, HollowTypeAPI typeAPI, int ordinal) {
        return (T)new ListOfRightsContractAssetHollow(new HollowListCachedDelegate((ListOfRightsContractAssetTypeAPI)typeAPI, ordinal), ordinal);
    }

}