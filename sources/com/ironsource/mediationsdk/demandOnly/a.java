package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C4424m2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface a {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    public static final class C0470a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<C4424m2> f43867a;

        public C0470a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @Nullable
        public C4424m2 a(@NotNull String instanceName) {
            Object next;
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            Iterator<T> it = this.f43867a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((C4424m2) next).c(), instanceName)) {
                    break;
                }
            }
            return (C4424m2) next;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @NotNull
        public String b() {
            if (this.f43867a.isEmpty()) {
                return "";
            }
            return "1" + ((C4424m2) CollectionsKt.first((List) this.f43867a)).c();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @Nullable
        public C4424m2 get(int i10) {
            if (i10 < 0 || i10 >= this.f43867a.size()) {
                return null;
            }
            return this.f43867a.get(i10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.f43867a.isEmpty();
        }

        public C0470a(@NotNull List<C4424m2> waterfall) {
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            this.f43867a = waterfall;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @NotNull
        public List<C4424m2> a() {
            return this.f43867a;
        }

        public /* synthetic */ C0470a(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new ArrayList() : list);
        }
    }

    @Nullable
    C4424m2 a(@NotNull String str);

    @NotNull
    List<C4424m2> a();

    @NotNull
    String b();

    @Nullable
    C4424m2 get(int i10);

    boolean isEmpty();
}
