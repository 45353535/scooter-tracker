package com.mobilefuse.videoplayer.model;

import com.taurusx.tax.f.c;
import com.taurusx.tax.f.s;
import com.taurusx.tax.f.y;
import com.taurusx.tax.vast.VastIconXmlManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/videoplayer/model/EventType;", "", "(Ljava/lang/String;I)V", "Error", y.f66057w, "Tracking", s.f66026s, "CustomClick", c.f66002s, VastIconXmlManager.ICON_VIEW_TRACKING, VastIconXmlManager.ICON_CLICK_TRACKING, "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public enum EventType {
    Error,
    Impression,
    Tracking,
    ClickTracking,
    CustomClick,
    CompanionClickTracking,
    IconViewTracking,
    IconClickTracking
}
