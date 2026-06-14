package com.mbridge.msdk.foundation.download.resource;

import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;

/* JADX INFO: loaded from: classes10.dex */
interface IResourceStrategy {
    String getResourceStrategyName();

    void processResource(MBResourceManager mBResourceManager, IDatabaseHelper iDatabaseHelper, ResourceConfig resourceConfig);
}
