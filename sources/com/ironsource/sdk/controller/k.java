package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC4320g;
import com.ironsource.InterfaceC4337h;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface k {

    public static final class a implements InterfaceC4320g {
        @Override // com.ironsource.InterfaceC4320g
        @NotNull
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    public static final class b implements InterfaceC4337h {
        @Override // com.ironsource.InterfaceC4337h
        @NotNull
        public Intent a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) InlineStoreActivity.class);
        }
    }

    public static final class c implements InterfaceC4337h {
        @Override // com.ironsource.InterfaceC4337h
        @NotNull
        public Intent a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
