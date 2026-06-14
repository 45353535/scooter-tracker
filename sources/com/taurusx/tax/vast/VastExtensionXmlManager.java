package com.taurusx.tax.vast;

import android.text.TextUtils;
import com.taurusx.tax.g.m0;
import com.taurusx.tax.g.r;
import com.taurusx.tax.vast.VideoViewabilityTracker;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public class VastExtensionXmlManager {
    public static final String TYPE = "type";
    public static final String VIDEO_VIEWABILITY_TRACKER = "MoPubViewabilityTracker";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Node f66982z;

    public VastExtensionXmlManager(Node node) {
        r.z(node);
        this.f66982z = node;
    }

    public VideoViewabilityTracker w() {
        Node nodeY = m0.y(this.f66982z, VIDEO_VIEWABILITY_TRACKER);
        if (nodeY == null) {
            return null;
        }
        VideoViewabilityTrackerXmlManager videoViewabilityTrackerXmlManager = new VideoViewabilityTrackerXmlManager(nodeY);
        Integer numY = videoViewabilityTrackerXmlManager.y();
        Integer numZ = videoViewabilityTrackerXmlManager.z();
        String strW = videoViewabilityTrackerXmlManager.w();
        if (numY == null || numZ == null || TextUtils.isEmpty(strW)) {
            return null;
        }
        return new VideoViewabilityTracker.Builder(strW, numY.intValue(), numZ.intValue()).build();
    }

    public String z() {
        return m0.z(this.f66982z, "type");
    }
}
