package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5553xk implements Pc {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        IBinaryDataHelper iBinaryDataHelperF;
        C5528wk c5528wk = new C5528wk();
        C5503vk c5503vk = new C5503vk();
        C5257ln c5257ln = new C5257ln(c5503vk, c5503vk, new C5518wa(false), new InterfaceC5282mn() { // from class: io.appmetrica.analytics.impl.ar
            @Override // io.appmetrica.analytics.impl.InterfaceC5282mn
            public final boolean a(SQLiteDatabase sQLiteDatabase) {
                return C5553xk.a(sQLiteDatabase);
            }
        });
        C5112g7 c5112g7A = C5112g7.a(context);
        c5112g7A.getClass();
        Context context2 = c5112g7A.f77222e;
        C5164i7 c5164i7 = c5112g7A.f77233p;
        byte[] bArr = new C4953a3(new C5479ul(new C5086f7(context2, new C5138h7(c5164i7.f77382a, c5164i7.f77383b, false).a(context2, c5528wk), c5257ln, PublicLogger.getAnonymousInstance())), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr == null) {
            int i10 = C5478uk.f78395a;
            return;
        }
        C5112g7 c5112g7A2 = C5112g7.a(context);
        synchronized (c5112g7A2) {
            iBinaryDataHelperF = c5112g7A2.f();
        }
        ((C4953a3) iBinaryDataHelperF).insert("auto_inapp_collecting_info_data", bArr);
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final void a(@NotNull Context context) {
        Vm vm = (Vm) Tm.a(C5306nm.class);
        ProtobufStateStorage<Object> protobufStateStorageA = vm.a(context, vm.b(context));
        C5306nm c5306nm = (C5306nm) protobufStateStorageA.read();
        C5281mm c5281mmA = c5306nm.a(c5306nm.f77855m);
        c5281mmA.f77784o = 0L;
        protobufStateStorageA.save(new C5306nm(c5281mmA));
        b(context);
    }
}
