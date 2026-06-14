package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public enum AFh1uSDK {
    application,
    activity,
    other;

    public static AFh1uSDK getRevenue(Context context) {
        return context instanceof Activity ? activity : context instanceof Application ? application : other;
    }
}
