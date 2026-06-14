package com.pubmatic.sdk.webrendering.mraid;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
interface n {
    void checkAppInstallStatus(String str);

    void close();

    void createCalendarEvent(JSONObject jSONObject, boolean z10);

    void expand(String str, boolean z10, boolean z11);

    boolean isUserInteracted(boolean z10);

    void listenerChanged(String str, boolean z10);

    void open(String str, boolean z10);

    void playVideo(String str, boolean z10);

    void resize(int i10, int i11, int i12, int i13, boolean z10, boolean z11);

    void setOrientation(boolean z10, String str, boolean z11);

    void storePicture(String str, boolean z10);

    void unload();

    void useCustomClose(boolean z10);
}
