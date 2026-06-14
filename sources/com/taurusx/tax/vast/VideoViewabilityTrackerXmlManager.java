package com.taurusx.tax.vast;

import com.taurusx.tax.g.m0;
import com.taurusx.tax.g.r;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.vast.VastAbsoluteProgressTracker;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public class VideoViewabilityTrackerXmlManager {
    public static final String PERCENT_VIEWABLE = "percentViewable";
    public static final String VIEWABLE_PLAYTIME = "viewablePlaytime";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Node f67063z;

    public VideoViewabilityTrackerXmlManager(Node node) {
        r.z(node);
        this.f67063z = node;
    }

    public String w() {
        return m0.z(this.f67063z);
    }

    public Integer y() {
        Integer absoluteOffset;
        String strZ = m0.z(this.f67063z, VIEWABLE_PLAYTIME);
        if (strZ == null) {
            return null;
        }
        VastAbsoluteProgressTracker.Companion companion = VastAbsoluteProgressTracker.INSTANCE;
        if (companion.isAbsoluteTracker(strZ)) {
            try {
                absoluteOffset = companion.parseAbsoluteOffset(strZ);
            } catch (NumberFormatException unused) {
                LogUtil.v("taurusx", String.format("Invalid VAST viewablePlaytime format for \"HH:MM:SS[.mmm]\": %s:", strZ));
                absoluteOffset = null;
            }
        } else {
            try {
                absoluteOffset = Integer.valueOf((int) (Float.parseFloat(strZ) * 1000.0f));
            } catch (NumberFormatException unused2) {
                LogUtil.v("taurusx", String.format("Invalid VAST viewablePlaytime format for \"SS[.mmm]\": %s:", strZ));
                absoluteOffset = null;
            }
        }
        if (absoluteOffset == null || absoluteOffset.intValue() < 0) {
            return null;
        }
        return absoluteOffset;
    }

    public Integer z() {
        Integer numValueOf;
        String strZ = m0.z(this.f67063z, PERCENT_VIEWABLE);
        if (strZ == null) {
            return null;
        }
        try {
            numValueOf = Integer.valueOf((int) Float.parseFloat(strZ.replace("%", "")));
        } catch (NumberFormatException unused) {
            LogUtil.v("taurusx", String.format("Invalid VAST percentViewable format for \"d{1,3}%%\": %s:", strZ));
            numValueOf = null;
        }
        if (numValueOf == null || numValueOf.intValue() < 0 || numValueOf.intValue() > 100) {
            return null;
        }
        return numValueOf;
    }
}
