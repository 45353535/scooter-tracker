package com.taurusx.tax.vast;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class VastConfig implements Serializable {
    public static final long G = 1;
    public int A;
    public boolean B;
    public String C;
    public String D;
    public String E;
    public VideoViewabilityTracker F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VastIconConfig f66953b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66955d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f66959h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f66962k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f66968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f66969r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f66972u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<VastVideoBean> f66975x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList<VastTracker> f66977z = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList<VastFractionalProgressTracker> f66974w = new ArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList<VastAbsoluteProgressTracker> f66976y = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<VastFractionalProgressTracker> f66954c = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<VastAbsoluteProgressTracker> f66966o = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList<VastTracker> f66970s = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<VastTracker> f66952a = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<VastTracker> f66965n = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList<VastTracker> f66971t = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<String> f66958g = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<VastFractionalProgressTracker> f66957f = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<VastFractionalProgressTracker> f66964m = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<VastFractionalProgressTracker> f66967p = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<VastTracker> f66960i = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList<VastTracker> f66973v = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<VastTracker> f66963l = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set<ViewabilityVendor> f66956e = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Set<VastCompanionAdConfig> f66961j = new HashSet();

    public void addAbsoluteTrackers(List<VastAbsoluteProgressTracker> list) {
        this.f66966o.addAll(list);
    }

    public void addClickTrackers(List<VastTracker> list) {
        this.f66973v.addAll(list);
    }

    public void addCloseTrackers(List<VastTracker> list) {
        this.f66971t.addAll(list);
    }

    public void addCompleteTrackers(List<VastTracker> list) {
        this.f66965n.addAll(list);
    }

    public void addErrorTrackers(List<VastTracker> list) {
        this.f66963l.addAll(list);
    }

    public void addFirstQuartileTrackers(List<VastFractionalProgressTracker> list) {
        this.f66957f.addAll(list);
    }

    public void addFractionalTrackers(List<VastFractionalProgressTracker> list) {
        this.f66954c.addAll(list);
    }

    public void addImpressionTrackers(List<VastTracker> list) {
        this.f66977z.addAll(list);
    }

    public void addMidPointTrackers(List<VastFractionalProgressTracker> list) {
        this.f66964m.addAll(list);
    }

    public void addOffsetAbsoluteProgressTrackers(List<VastAbsoluteProgressTracker> list) {
        this.f66976y.addAll(list);
    }

    public void addOffsetPercentProgressTrackers(List<VastFractionalProgressTracker> list) {
        this.f66974w.addAll(list);
    }

    public void addPauseTrackers(List<VastTracker> list) {
        this.f66970s.addAll(list);
    }

    public void addResumeTrackers(List<VastTracker> list) {
        this.f66952a.addAll(list);
    }

    public void addSkipTrackers(List<VastTracker> list) {
        this.f66960i.addAll(list);
    }

    public void addStartTrackers(List<String> list) {
        this.f66958g.addAll(list);
    }

    public void addThirdQuartileTrackers(List<VastFractionalProgressTracker> list) {
        this.f66967p.addAll(list);
    }

    public void addVastCompanionAdConfig(VastCompanionAdConfig vastCompanionAdConfig) {
        this.f66961j.add(vastCompanionAdConfig);
    }

    public void addVastCompanionAdConfigs(Set<VastCompanionAdConfig> set) {
        Iterator<VastCompanionAdConfig> it = set.iterator();
        while (it.hasNext()) {
            addVastCompanionAdConfig(it.next());
        }
    }

    public void addViewabilityVendors(Set<ViewabilityVendor> set) {
        this.f66956e.addAll(set);
    }

    public ArrayList<VastAbsoluteProgressTracker> getAbsoluteTrackers() {
        return this.f66966o;
    }

    public String getClickThroughUrl() {
        return this.f66962k;
    }

    public ArrayList<VastTracker> getClickTrackers() {
        return this.f66973v;
    }

    public ArrayList<VastTracker> getCloseTrackers() {
        return this.f66971t;
    }

    public ArrayList<VastTracker> getCompleteTrackers() {
        return this.f66965n;
    }

    public String getCustomCloseIconUrl() {
        return this.E;
    }

    public String getCustomCtaText() {
        return this.C;
    }

    public String getCustomSkipText() {
        return this.D;
    }

    public String getDiskMediaFileUrl() {
        return this.f66969r;
    }

    public int getDownloadRetriedCount() {
        return this.A;
    }

    public ArrayList<VastTracker> getErrorTrackers() {
        return this.f66963l;
    }

    public ArrayList<VastFractionalProgressTracker> getFirstQuartileTrackers() {
        return this.f66957f;
    }

    public ArrayList<VastFractionalProgressTracker> getFractionalTrackers() {
        return this.f66954c;
    }

    public ArrayList<VastTracker> getImpressionTrackers() {
        return this.f66977z;
    }

    public ArrayList<VastFractionalProgressTracker> getMidPointTrackers() {
        return this.f66964m;
    }

    public String getNetworkMediaFileUrl() {
        return this.f66972u;
    }

    public ArrayList<VastVideoBean> getNetworkVideoBeans() {
        return this.f66975x;
    }

    public ArrayList<VastAbsoluteProgressTracker> getOffsetAbsoluteProgressTrackers() {
        return this.f66976y;
    }

    public ArrayList<VastFractionalProgressTracker> getOffsetPercentProgressTrackers() {
        return this.f66974w;
    }

    public ArrayList<VastTracker> getPauseTrackers() {
        return this.f66970s;
    }

    public ArrayList<VastTracker> getResumeTrackers() {
        return this.f66952a;
    }

    public String getSkipOffset() {
        return this.f66959h;
    }

    public ArrayList<VastTracker> getSkipTrackers() {
        return this.f66960i;
    }

    public ArrayList<String> getStartTrackers() {
        return this.f66958g;
    }

    public ArrayList<VastFractionalProgressTracker> getThirdQuartileTrackers() {
        return this.f66967p;
    }

    public Set<VastCompanionAdConfig> getVastCompanionAdConfigs() {
        return this.f66961j;
    }

    public VastIconConfig getVastIconConfig() {
        return this.f66953b;
    }

    public int getVideoHeight() {
        return this.f66968q;
    }

    public VideoViewabilityTracker getVideoViewabilityTracker() {
        return this.F;
    }

    public int getVideoWidth() {
        return this.f66955d;
    }

    public Set<ViewabilityVendor> getViewabilityVendors() {
        return this.f66956e;
    }

    public boolean hasCompanionAd() {
        return this.f66961j != null;
    }

    public boolean isDownloadFromCache() {
        return this.B;
    }

    public void setClickThroughUrl(String str) {
        this.f66962k = str;
    }

    public void setCustomCloseIconUrl(String str) {
        this.E = str;
    }

    public void setCustomCtaText(String str) {
        this.C = str;
    }

    public void setCustomSkipText(String str) {
        this.D = str;
    }

    public void setDiskMediaFileUrl(String str) {
        this.f66969r = str;
    }

    public void setDownloadRetriedCount(int i10) {
        this.A = i10;
    }

    public void setIsDownloadFromCache(boolean z10) {
        this.B = z10;
    }

    public void setNetworkMediaFileUrl(String str) {
        this.f66972u = str;
    }

    public void setNetworkVideoBeans(ArrayList<VastVideoBean> arrayList) {
        this.f66975x = arrayList;
    }

    public void setPauseTrackers(ArrayList<VastTracker> arrayList) {
        this.f66970s = this.f66970s;
    }

    public void setSkipOffset(String str) {
        this.f66959h = str;
    }

    public void setVastIconConfig(VastIconConfig vastIconConfig) {
        this.f66953b = vastIconConfig;
    }

    public void setVideoHeight(int i10) {
        this.f66968q = i10;
    }

    public void setVideoViewabilityTracker(VideoViewabilityTracker videoViewabilityTracker) {
        this.F = videoViewabilityTracker;
    }

    public void setVideoWidth(int i10) {
        this.f66955d = i10;
    }

    public String toJsonString() {
        return new Gson().toJson(this);
    }
}
