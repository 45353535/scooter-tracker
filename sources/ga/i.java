package ga;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableList f72348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f72349c;

    private static final class a implements d1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d1 f72350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImmutableList f72351c;

        public a(d1 d1Var, List list) {
            this.f72350b = d1Var;
            this.f72351c = ImmutableList.copyOf((Collection) list);
        }

        @Override // ga.d1
        public boolean a(io.bidmachine.media3.exoplayer.l1 l1Var) {
            return this.f72350b.a(l1Var);
        }

        public ImmutableList d() {
            return this.f72351c;
        }

        @Override // ga.d1
        public long getBufferedPositionUs() {
            return this.f72350b.getBufferedPositionUs();
        }

        @Override // ga.d1
        public long getNextLoadPositionUs() {
            return this.f72350b.getNextLoadPositionUs();
        }

        @Override // ga.d1
        public boolean isLoading() {
            return this.f72350b.isLoading();
        }

        @Override // ga.d1
        public void reevaluateBuffer(long j10) {
            this.f72350b.reevaluateBuffer(j10);
        }
    }

    public i(List list, List list2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        q9.a.a(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            builder.add(new a((d1) list.get(i10), (List) list2.get(i10)));
        }
        this.f72348b = builder.build();
        this.f72349c = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ga.d1
    public boolean a(io.bidmachine.media3.exoplayer.l1 l1Var) {
        boolean zA;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z10;
            }
            zA = false;
            for (int i10 = 0; i10 < this.f72348b.size(); i10++) {
                long nextLoadPositionUs2 = ((a) this.f72348b.get(i10)).getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= l1Var.f81195a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zA |= ((a) this.f72348b.get(i10)).a(l1Var);
                }
            }
            z10 |= zA;
        } while (zA);
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ga.d1
    public long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f72348b.size(); i10++) {
            a aVar = (a) this.f72348b.get(i10);
            long bufferedPositionUs = aVar.getBufferedPositionUs();
            if ((aVar.d().contains(1) || aVar.d().contains(2) || aVar.d().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f72349c = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f72349c;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ga.d1
    public long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f72348b.size(); i10++) {
            long nextLoadPositionUs = ((a) this.f72348b.get(i10)).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ga.d1
    public boolean isLoading() {
        for (int i10 = 0; i10 < this.f72348b.size(); i10++) {
            if (((a) this.f72348b.get(i10)).isLoading()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ga.d1
    public void reevaluateBuffer(long j10) {
        for (int i10 = 0; i10 < this.f72348b.size(); i10++) {
            ((a) this.f72348b.get(i10)).reevaluateBuffer(j10);
        }
    }
}
