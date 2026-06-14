package com.ironsource.mediationsdk.adunit.adapter.listener;

import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface NetworkInitializationListener {
    void onInitFailed(int i10, @Nullable String str);

    void onInitFailed(int i10, @Nullable String str, Map<String, Object> map);

    void onInitSuccess();

    void onInitSuccess(Map<String, Object> map);
}
