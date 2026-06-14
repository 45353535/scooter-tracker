package com.yandex.div.core;

import androidx.annotation.Px;

/* JADX INFO: loaded from: classes11.dex */
public interface DivViewConfig {
    public static final DivViewConfig DEFAULT = new DivViewConfig() { // from class: y6.m
        @Override // com.yandex.div.core.DivViewConfig
        public /* synthetic */ int getLogCardScrollSignificantThreshold() {
            return n.a(this);
        }
    };

    @Px
    int getLogCardScrollSignificantThreshold();
}
