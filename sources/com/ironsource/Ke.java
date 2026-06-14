package com.ironsource;

import com.ironsource.L8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Ke implements L8, L8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Integer> f41217a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Integer> f41218b = new HashMap();

    @Override // com.ironsource.L8.a
    public void a(@NotNull List<? extends L8.b> smashes) {
        Intrinsics.checkNotNullParameter(smashes, "smashes");
        for (L8.b bVar : smashes) {
            this.f41217a.put(bVar.c(), 0);
            this.f41218b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // com.ironsource.L8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(@org.jetbrains.annotations.NotNull com.ironsource.L8.b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "smash"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            monitor-enter(r2)
            java.lang.String r0 = r3.c()     // Catch: java.lang.Throwable -> L29
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f41217a     // Catch: java.lang.Throwable -> L29
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L2b
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f41217a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L29
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L29
            int r3 = r3.b()     // Catch: java.lang.Throwable -> L29
            if (r0 < r3) goto L2b
            r3 = 1
            goto L2c
        L29:
            r3 = move-exception
            goto L2e
        L2b:
            r3 = 0
        L2c:
            monitor-exit(r2)
            return r3
        L2e:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.Ke.b(com.ironsource.L8$b):boolean");
    }

    @Override // com.ironsource.L8.a
    public void a(@NotNull L8.b smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            try {
                String strC = smash.c();
                if (this.f41217a.containsKey(strC)) {
                    Map<String, Integer> map = this.f41217a;
                    Integer num = map.get(strC);
                    Intrinsics.checkNotNull(num);
                    map.put(strC, Integer.valueOf(num.intValue() + 1));
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.L8
    public boolean a() {
        for (String str : this.f41218b.keySet()) {
            Integer num = this.f41217a.get(str);
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f41218b.get(str);
            Intrinsics.checkNotNull(num2);
            if (iIntValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
