package io.bidmachine.analytics.internal.h;

import io.bidmachine.analytics.ReaderConfig;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public interface c {
    void a(List list);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReaderConfig.Rule f79569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f79570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.bidmachine.analytics.internal.g.e f79571c;

        public a(ReaderConfig.Rule rule, String str, io.bidmachine.analytics.internal.g.e eVar) {
            this.f79569a = rule;
            this.f79570b = str;
            this.f79571c = eVar;
        }

        public final String a() {
            return this.f79570b;
        }

        public final io.bidmachine.analytics.internal.g.e b() {
            return this.f79571c;
        }

        public final ReaderConfig.Rule c() {
            return this.f79569a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f79569a, aVar.f79569a) && Intrinsics.areEqual(this.f79570b, aVar.f79570b) && Intrinsics.areEqual(this.f79571c, aVar.f79571c);
        }

        public int hashCode() {
            int iHashCode = this.f79569a.hashCode() * 31;
            String str = this.f79570b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            io.bidmachine.analytics.internal.g.e eVar = this.f79571c;
            return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
        }

        public String toString() {
            return "Data(rule=" + this.f79569a + ", dataHash=" + this.f79570b + ", error=" + this.f79571c + ')';
        }

        public /* synthetic */ a(ReaderConfig.Rule rule, String str, io.bidmachine.analytics.internal.g.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(rule, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : eVar);
        }
    }
}
