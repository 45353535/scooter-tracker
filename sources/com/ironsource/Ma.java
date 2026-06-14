package com.ironsource;

import com.ironsource.InterfaceC4433mb;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class Ma {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC4433mb<LevelPlayAdInfo> interfaceC4433mb) {
        if (interfaceC4433mb instanceof InterfaceC4433mb.b) {
            return "success";
        }
        if (interfaceC4433mb instanceof InterfaceC4433mb.a) {
            return "failure";
        }
        throw new lf.m();
    }
}
