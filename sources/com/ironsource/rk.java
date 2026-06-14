package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class rk {
    public static boolean a(InterfaceC4343h5 interfaceC4343h5) {
        return interfaceC4343h5.k().exists();
    }

    public static void b(InterfaceC4343h5 interfaceC4343h5) {
        interfaceC4343h5.l().a(interfaceC4343h5);
        if (interfaceC4343h5.k().exists()) {
            IronSourceStorageUtils.deleteFile(interfaceC4343h5.k());
        }
        try {
            interfaceC4343h5.l().a(interfaceC4343h5.k(), interfaceC4343h5.d().value(), 5, 5);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            Function1<Result, Unit> function1I = interfaceC4343h5.i();
            Result.Companion companion = Result.f93230c;
            function1I.invoke(Result.a(Result.b(kotlin.d.a(e10))));
        }
    }
}
