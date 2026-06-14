package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5256lm implements InterfaceC5331om {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile C5204jm f77717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f77718b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC5331om
    public final void a(@NotNull C5204jm c5204jm) {
        this.f77717a = c5204jm;
        Iterator it = this.f77718b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5331om) it.next()).a(c5204jm);
        }
    }

    @NotNull
    public final C5204jm b() {
        C5204jm c5204jm = this.f77717a;
        if (c5204jm != null) {
            return c5204jm;
        }
        Intrinsics.throwUninitializedPropertyAccessException("startupState");
        return null;
    }

    public final void b(@NotNull InterfaceC5331om interfaceC5331om) {
        this.f77718b.remove(interfaceC5331om);
    }

    public final void a(@NotNull InterfaceC5331om interfaceC5331om) {
        this.f77718b.add(interfaceC5331om);
        if (this.f77717a != null) {
            C5204jm c5204jm = this.f77717a;
            if (c5204jm == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startupState");
                c5204jm = null;
            }
            interfaceC5331om.a(c5204jm);
        }
    }

    public final void a(@NotNull Context context) {
        String strOptStringOrNull;
        ProtobufStateStorage<Object> protobufStateStorageCreate = ((Vm) Tm.a(C5306nm.class)).create(context);
        yo yoVarA = C5468ua.k().D().a();
        synchronized (yoVarA) {
            strOptStringOrNull = JsonUtils.optStringOrNull(yoVarA.f78594a.a(), "device_id");
        }
        a(new C5204jm(strOptStringOrNull, yoVarA.a(), (C5306nm) protobufStateStorageCreate.read()));
    }
}
