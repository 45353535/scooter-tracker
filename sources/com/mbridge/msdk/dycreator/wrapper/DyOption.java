package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DyOption {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f48183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f48184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f48185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DyAdType f48186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f48187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f48188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f48189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f48190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f48191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f48192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f48193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f48194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f48195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f48196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f48197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f48198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f48199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f48200r;

    public static class Builder implements IViewOptionBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f48201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f48202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f48203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private DyAdType f48204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f48205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f48206f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f48207g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f48208h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f48209i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f48210j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f48211k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f48212l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f48213m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f48214n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f48215o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f48216p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f48206f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f48203c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z10) {
            this.f48205e = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i10) {
            this.f48215o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f48204d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f48202b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f48201a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z10) {
            this.f48210j = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z10) {
            this.f48208h = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z10) {
            this.f48211k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z10) {
            this.f48207g = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z10) {
            this.f48209i = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i10) {
            this.f48214n = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i10) {
            this.f48212l = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i10) {
            this.f48213m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i10) {
            this.f48216p = i10;
            return this;
        }
    }

    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z10);

        IViewOptionBuilder countDownTime(int i10);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z10);

        IViewOptionBuilder isClickButtonVisible(boolean z10);

        IViewOptionBuilder isLogoVisible(boolean z10);

        IViewOptionBuilder isScreenClick(boolean z10);

        IViewOptionBuilder isShakeVisible(boolean z10);

        IViewOptionBuilder orientation(int i10);

        IViewOptionBuilder shakeStrenght(int i10);

        IViewOptionBuilder shakeTime(int i10);

        IViewOptionBuilder templateType(int i10);
    }

    public DyOption(Builder builder) {
        this.f48183a = builder.f48201a;
        this.f48184b = builder.f48202b;
        this.f48185c = builder.f48203c;
        this.f48186d = builder.f48204d;
        this.f48189g = builder.f48205e;
        this.f48187e = builder.f48206f;
        this.f48188f = builder.f48207g;
        this.f48190h = builder.f48208h;
        this.f48192j = builder.f48210j;
        this.f48191i = builder.f48209i;
        this.f48193k = builder.f48211k;
        this.f48194l = builder.f48212l;
        this.f48195m = builder.f48213m;
        this.f48196n = builder.f48214n;
        this.f48197o = builder.f48215o;
        this.f48199q = builder.f48216p;
    }

    public String getAdChoiceLink() {
        return this.f48187e;
    }

    public CampaignEx getCampaignEx() {
        return this.f48185c;
    }

    public int getCountDownTime() {
        return this.f48197o;
    }

    public int getCurrentCountDown() {
        return this.f48198p;
    }

    public DyAdType getDyAdType() {
        return this.f48186d;
    }

    public File getFile() {
        return this.f48184b;
    }

    public List<String> getFileDirs() {
        return this.f48183a;
    }

    public int getOrientation() {
        return this.f48196n;
    }

    public int getShakeStrenght() {
        return this.f48194l;
    }

    public int getShakeTime() {
        return this.f48195m;
    }

    public int getTemplateType() {
        return this.f48199q;
    }

    public boolean isApkInfoVisible() {
        return this.f48192j;
    }

    public boolean isCanSkip() {
        return this.f48189g;
    }

    public boolean isClickButtonVisible() {
        return this.f48190h;
    }

    public boolean isClickScreen() {
        return this.f48188f;
    }

    public boolean isLogoVisible() {
        return this.f48193k;
    }

    public boolean isShakeVisible() {
        return this.f48191i;
    }

    public void setDyCountDownListener(int i10) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f48200r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i10);
        }
        this.f48198p = i10;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f48200r = dyCountDownListenerWrapper;
    }
}
