package com.ironsource.mediationsdk.adunit.adapter.utility;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public enum AdOptionsPosition {
    TOP_LEFT,
    TOP_RIGHT,
    BOTTOM_LEFT,
    BOTTOM_RIGHT;


    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static String AD_OPTIONS_POSITION_KEY = "adOptionsPos";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
