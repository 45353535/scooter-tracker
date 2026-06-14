package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4500q8 {

    /* JADX INFO: renamed from: com.ironsource.q8$a */
    public enum a {
        None,
        Device,
        Controller
    }

    /* JADX INFO: renamed from: com.ironsource.q8$b */
    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    /* JADX INFO: renamed from: com.ironsource.q8$c */
    public enum c {
        Web,
        Native,
        None
    }

    /* JADX INFO: renamed from: com.ironsource.q8$d */
    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44716a;

        d(int i10) {
            this.f44716a = i10;
        }

        public int b() {
            return this.f44716a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q8$e */
    public enum e {
        Banner,
        Interstitial,
        RewardedVideo,
        NativeAd,
        None
    }
}
