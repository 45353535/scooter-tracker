package com.appodeal.ads.api;

import com.appodeal.ads.api.Device;
import com.appodeal.ads.api.Event;
import com.appodeal.ads.api.Geo;
import com.appodeal.ads.api.Stats;
import com.appodeal.ads.api.d;
import com.appodeal.ads.api.e;
import com.appodeal.ads.api.f;
import com.appodeal.ads.api.g;
import com.appodeal.ads.api.i;
import com.appodeal.ads.api.j;
import com.appodeal.ads.api.k;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final h f12966r = new h();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final p1 f12967s = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f12968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f12969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Device f12970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f12971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f12972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Geo f12973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f12974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Object f12975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile Object f12976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f12977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Stats f12978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Event f12979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f12980n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile Object f12981o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i f12982p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private byte f12983q;

    class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public h parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new h(lVar, wVar, null);
        }
    }

    public static final class b extends h0.b implements MessageOrBuilder {
        private a2 A;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f12984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a2 f12985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private j f12986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private a2 f12987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Device f12988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private a2 f12989g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private k f12990h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private a2 f12991i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private g f12992j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private a2 f12993k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Geo f12994l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a2 f12995m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private e f12996n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private a2 f12997o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Object f12998p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Object f12999q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private f f13000r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private a2 f13001s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Stats f13002t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private a2 f13003u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Event f13004v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private a2 f13005w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private long f13006x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Object f13007y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private i f13008z;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public b A(i iVar) {
            a2 a2Var = this.A;
            if (a2Var != null) {
                a2Var.g(iVar);
                return this;
            }
            i iVar2 = this.f13008z;
            if (iVar2 != null) {
                this.f13008z = i.E(iVar2).u(iVar).buildPartial();
            } else {
                this.f13008z = iVar;
            }
            onChanged();
            return this;
        }

        public b B(j jVar) {
            a2 a2Var = this.f12987e;
            if (a2Var != null) {
                a2Var.g(jVar);
                return this;
            }
            j jVar2 = this.f12986d;
            if (jVar2 != null) {
                this.f12986d = j.Y(jVar2).r(jVar).buildPartial();
            } else {
                this.f12986d = jVar;
            }
            onChanged();
            return this;
        }

        public b C(Stats stats) {
            a2 a2Var = this.f13003u;
            if (a2Var != null) {
                a2Var.g(stats);
                return this;
            }
            Stats stats2 = this.f13002t;
            if (stats2 != null) {
                this.f13002t = Stats.K(stats2).v(stats).buildPartial();
            } else {
                this.f13002t = stats;
            }
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(r2 r2Var) {
            return (b) super.mergeUnknownFields(r2Var);
        }

        public b E(k kVar) {
            a2 a2Var = this.f12991i;
            if (a2Var != null) {
                a2Var.g(kVar);
                return this;
            }
            k kVar2 = this.f12990h;
            if (kVar2 != null) {
                this.f12990h = k.C(kVar2).q(kVar).buildPartial();
            } else {
                this.f12990h = kVar;
            }
            onChanged();
            return this;
        }

        public b F(d dVar) {
            a2 a2Var = this.f12985c;
            if (a2Var != null) {
                a2Var.i(dVar);
                return this;
            }
            dVar.getClass();
            this.f12984b = dVar;
            onChanged();
            return this;
        }

        public b G(String str) {
            str.getClass();
            this.f13007y = str;
            onChanged();
            return this;
        }

        public b H(Device device) {
            a2 a2Var = this.f12989g;
            if (a2Var != null) {
                a2Var.i(device);
                return this;
            }
            device.getClass();
            this.f12988f = device;
            onChanged();
            return this;
        }

        public b I(e eVar) {
            a2 a2Var = this.f12997o;
            if (a2Var != null) {
                a2Var.i(eVar);
                return this;
            }
            eVar.getClass();
            this.f12996n = eVar;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b K(Geo geo) {
            a2 a2Var = this.f12995m;
            if (a2Var != null) {
                a2Var.i(geo);
                return this;
            }
            geo.getClass();
            this.f12994l = geo;
            onChanged();
            return this;
        }

        public b L(String str) {
            str.getClass();
            this.f12998p = str;
            onChanged();
            return this;
        }

        public b M(String str) {
            str.getClass();
            this.f12999q = str;
            onChanged();
            return this;
        }

        public b N(g gVar) {
            a2 a2Var = this.f12993k;
            if (a2Var != null) {
                a2Var.i(gVar);
                return this;
            }
            gVar.getClass();
            this.f12992j = gVar;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        public b P(i iVar) {
            a2 a2Var = this.A;
            if (a2Var != null) {
                a2Var.i(iVar);
                return this;
            }
            iVar.getClass();
            this.f13008z = iVar;
            onChanged();
            return this;
        }

        public b Q(j jVar) {
            a2 a2Var = this.f12987e;
            if (a2Var != null) {
                a2Var.i(jVar);
                return this;
            }
            jVar.getClass();
            this.f12986d = jVar;
            onChanged();
            return this;
        }

        public b R(Stats stats) {
            a2 a2Var = this.f13003u;
            if (a2Var != null) {
                a2Var.i(stats);
                return this;
            }
            stats.getClass();
            this.f13002t = stats;
            onChanged();
            return this;
        }

        public b S(long j10) {
            this.f13006x = j10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r2 r2Var) {
            return (b) super.setUnknownFields(r2Var);
        }

        public b U(k kVar) {
            a2 a2Var = this.f12991i;
            if (a2Var != null) {
                a2Var.i(kVar);
                return this;
            }
            kVar.getClass();
            this.f12990h = kVar;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return c.f12896u;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public h build() {
            h hVarBuildPartial = buildPartial();
            if (hVarBuildPartial.isInitialized()) {
                return hVarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) hVarBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return c.f12897v.d(h.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public h buildPartial() {
            h hVar = new h(this, (a) null);
            a2 a2Var = this.f12985c;
            if (a2Var == null) {
                hVar.f12968b = this.f12984b;
            } else {
                hVar.f12968b = (d) a2Var.a();
            }
            a2 a2Var2 = this.f12987e;
            if (a2Var2 == null) {
                hVar.f12969c = this.f12986d;
            } else {
                hVar.f12969c = (j) a2Var2.a();
            }
            a2 a2Var3 = this.f12989g;
            if (a2Var3 == null) {
                hVar.f12970d = this.f12988f;
            } else {
                hVar.f12970d = (Device) a2Var3.a();
            }
            a2 a2Var4 = this.f12991i;
            if (a2Var4 == null) {
                hVar.f12971e = this.f12990h;
            } else {
                hVar.f12971e = (k) a2Var4.a();
            }
            a2 a2Var5 = this.f12993k;
            if (a2Var5 == null) {
                hVar.f12972f = this.f12992j;
            } else {
                hVar.f12972f = (g) a2Var5.a();
            }
            a2 a2Var6 = this.f12995m;
            if (a2Var6 == null) {
                hVar.f12973g = this.f12994l;
            } else {
                hVar.f12973g = (Geo) a2Var6.a();
            }
            a2 a2Var7 = this.f12997o;
            if (a2Var7 == null) {
                hVar.f12974h = this.f12996n;
            } else {
                hVar.f12974h = (e) a2Var7.a();
            }
            hVar.f12975i = this.f12998p;
            hVar.f12976j = this.f12999q;
            a2 a2Var8 = this.f13001s;
            if (a2Var8 == null) {
                hVar.f12977k = this.f13000r;
            } else {
                hVar.f12977k = (f) a2Var8.a();
            }
            a2 a2Var9 = this.f13003u;
            if (a2Var9 == null) {
                hVar.f12978l = this.f13002t;
            } else {
                hVar.f12978l = (Stats) a2Var9.a();
            }
            a2 a2Var10 = this.f13005w;
            if (a2Var10 == null) {
                hVar.f12979m = this.f13004v;
            } else {
                hVar.f12979m = (Event) a2Var10.a();
            }
            hVar.f12980n = this.f13006x;
            hVar.f12981o = this.f13007y;
            a2 a2Var11 = this.A;
            if (a2Var11 == null) {
                hVar.f12982p = this.f13008z;
            } else {
                hVar.f12982p = (i) a2Var11.a();
            }
            onBuilt();
            return hVar;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            if (this.f12985c == null) {
                this.f12984b = null;
            } else {
                this.f12984b = null;
                this.f12985c = null;
            }
            if (this.f12987e == null) {
                this.f12986d = null;
            } else {
                this.f12986d = null;
                this.f12987e = null;
            }
            if (this.f12989g == null) {
                this.f12988f = null;
            } else {
                this.f12988f = null;
                this.f12989g = null;
            }
            if (this.f12991i == null) {
                this.f12990h = null;
            } else {
                this.f12990h = null;
                this.f12991i = null;
            }
            if (this.f12993k == null) {
                this.f12992j = null;
            } else {
                this.f12992j = null;
                this.f12993k = null;
            }
            if (this.f12995m == null) {
                this.f12994l = null;
            } else {
                this.f12994l = null;
                this.f12995m = null;
            }
            if (this.f12997o == null) {
                this.f12996n = null;
            } else {
                this.f12996n = null;
                this.f12997o = null;
            }
            this.f12998p = "";
            this.f12999q = "";
            if (this.f13001s == null) {
                this.f13000r = null;
            } else {
                this.f13000r = null;
                this.f13001s = null;
            }
            if (this.f13003u == null) {
                this.f13002t = null;
            } else {
                this.f13002t = null;
                this.f13003u = null;
            }
            if (this.f13005w == null) {
                this.f13004v = null;
            } else {
                this.f13004v = null;
                this.f13005w = null;
            }
            this.f13006x = 0L;
            this.f13007y = "";
            if (this.A == null) {
                this.f13008z = null;
                return this;
            }
            this.f13008z = null;
            this.A = null;
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (b) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (b) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b mo4427clone() {
            return (b) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public h getDefaultInstanceForType() {
            return h.J();
        }

        public b q(d dVar) {
            a2 a2Var = this.f12985c;
            if (a2Var != null) {
                a2Var.g(dVar);
                return this;
            }
            d dVar2 = this.f12984b;
            if (dVar2 != null) {
                this.f12984b = d.e0(dVar2).q(dVar).buildPartial();
            } else {
                this.f12984b = dVar;
            }
            onChanged();
            return this;
        }

        public b r(Device device) {
            a2 a2Var = this.f12989g;
            if (a2Var != null) {
                a2Var.g(device);
                return this;
            }
            Device device2 = this.f12988f;
            if (device2 != null) {
                this.f12988f = Device.R0(device2).q(device).buildPartial();
            } else {
                this.f12988f = device;
            }
            onChanged();
            return this;
        }

        public b s(Event event) {
            a2 a2Var = this.f13005w;
            if (a2Var != null) {
                a2Var.g(event);
                return this;
            }
            Event event2 = this.f13004v;
            if (event2 != null) {
                this.f13004v = Event.E(event2).q(event).buildPartial();
            } else {
                this.f13004v = event;
            }
            onChanged();
            return this;
        }

        public b t(e eVar) {
            a2 a2Var = this.f12997o;
            if (a2Var != null) {
                a2Var.g(eVar);
                return this;
            }
            e eVar2 = this.f12996n;
            if (eVar2 != null) {
                this.f12996n = e.F(eVar2).s(eVar).buildPartial();
            } else {
                this.f12996n = eVar;
            }
            onChanged();
            return this;
        }

        public b u(h hVar) {
            if (hVar == h.J()) {
                return this;
            }
            if (hVar.hasApp()) {
                q(hVar.G());
            }
            if (hVar.hasSession()) {
                B(hVar.X());
            }
            if (hVar.hasDevice()) {
                r(hVar.L());
            }
            if (hVar.hasUser()) {
                E(hVar.Z());
            }
            if (hVar.hasRegs()) {
                z(hVar.V());
            }
            if (hVar.hasGeo()) {
                x(hVar.O());
            }
            if (hVar.hasExt()) {
                t(hVar.N());
            }
            if (!hVar.Q().isEmpty()) {
                this.f12998p = hVar.f12975i;
                onChanged();
            }
            if (!hVar.T().isEmpty()) {
                this.f12999q = hVar.f12976j;
                onChanged();
            }
            if (hVar.a0()) {
                y(hVar.P());
            }
            if (hVar.c0()) {
                C(hVar.Y());
            }
            if (hVar.hasEvent()) {
                s(hVar.M());
            }
            if (hVar.getTimestamp() != 0) {
                S(hVar.getTimestamp());
            }
            if (!hVar.H().isEmpty()) {
                this.f13007y = hVar.f12981o;
                onChanged();
            }
            if (hVar.b0()) {
                A(hVar.W());
            }
            mergeUnknownFields(((h0) hVar).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.appodeal.ads.api.h.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.h.access$2000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.h r3 = (com.appodeal.ads.api.h) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.u(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.appodeal.ads.api.h r4 = (com.appodeal.ads.api.h) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.u(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.h.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.h$b");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof h) {
                return u((h) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public b x(Geo geo) {
            a2 a2Var = this.f12995m;
            if (a2Var != null) {
                a2Var.g(geo);
                return this;
            }
            Geo geo2 = this.f12994l;
            if (geo2 != null) {
                this.f12994l = Geo.x(geo2).q(geo).buildPartial();
            } else {
                this.f12994l = geo;
            }
            onChanged();
            return this;
        }

        public b y(f fVar) {
            a2 a2Var = this.f13001s;
            if (a2Var != null) {
                a2Var.g(fVar);
                return this;
            }
            f fVar2 = this.f13000r;
            if (fVar2 != null) {
                this.f13000r = f.F(fVar2).r(fVar).buildPartial();
            } else {
                this.f13000r = fVar;
            }
            onChanged();
            return this;
        }

        public b z(g gVar) {
            a2 a2Var = this.f12993k;
            if (a2Var != null) {
                a2Var.g(gVar);
                return this;
            }
            g gVar2 = this.f12992j;
            if (gVar2 != null) {
                this.f12992j = g.o(gVar2).q(gVar).buildPartial();
            } else {
                this.f12992j = gVar;
            }
            onChanged();
            return this;
        }

        /* synthetic */ b(h0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            this.f12998p = "";
            this.f12999q = "";
            this.f13007y = "";
            maybeForceBuilderInitialization();
        }

        private b(h0.c cVar) {
            super(cVar);
            this.f12998p = "";
            this.f12999q = "";
            this.f13007y = "";
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ h(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static h J() {
        return f12966r;
    }

    public static b d0() {
        return f12966r.toBuilder();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return c.f12896u;
    }

    public d G() {
        d dVar = this.f12968b;
        return dVar == null ? d.O() : dVar;
    }

    public String H() {
        Object obj = this.f12981o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12981o = stringUtf8;
        return stringUtf8;
    }

    public ByteString I() {
        Object obj = this.f12981o;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12981o = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public h getDefaultInstanceForType() {
        return f12966r;
    }

    public Device L() {
        Device device = this.f12970d;
        return device == null ? Device.v0() : device;
    }

    public Event M() {
        Event event = this.f12979m;
        return event == null ? Event.x() : event;
    }

    public e N() {
        e eVar = this.f12974h;
        return eVar == null ? e.x() : eVar;
    }

    public Geo O() {
        Geo geo = this.f12973g;
        return geo == null ? Geo.r() : geo;
    }

    public f P() {
        f fVar = this.f12977k;
        return fVar == null ? f.v() : fVar;
    }

    public String Q() {
        Object obj = this.f12975i;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12975i = stringUtf8;
        return stringUtf8;
    }

    public ByteString S() {
        Object obj = this.f12975i;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12975i = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String T() {
        Object obj = this.f12976j;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12976j = stringUtf8;
        return stringUtf8;
    }

    public ByteString U() {
        Object obj = this.f12976j;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12976j = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public g V() {
        g gVar = this.f12972f;
        return gVar == null ? g.l() : gVar;
    }

    public i W() {
        i iVar = this.f12982p;
        return iVar == null ? i.s() : iVar;
    }

    public j X() {
        j jVar = this.f12969c;
        return jVar == null ? j.I() : jVar;
    }

    public Stats Y() {
        Stats stats = this.f12978l;
        return stats == null ? Stats.E() : stats;
    }

    public k Z() {
        k kVar = this.f12971e;
        return kVar == null ? k.s() : kVar;
    }

    public boolean a0() {
        return this.f12977k != null;
    }

    public boolean b0() {
        return this.f12982p != null;
    }

    public boolean c0() {
        return this.f12978l != null;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return d0();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        if (hasApp() != hVar.hasApp()) {
            return false;
        }
        if ((hasApp() && !G().equals(hVar.G())) || hasSession() != hVar.hasSession()) {
            return false;
        }
        if ((hasSession() && !X().equals(hVar.X())) || hasDevice() != hVar.hasDevice()) {
            return false;
        }
        if ((hasDevice() && !L().equals(hVar.L())) || hasUser() != hVar.hasUser()) {
            return false;
        }
        if ((hasUser() && !Z().equals(hVar.Z())) || hasRegs() != hVar.hasRegs()) {
            return false;
        }
        if ((hasRegs() && !V().equals(hVar.V())) || hasGeo() != hVar.hasGeo()) {
            return false;
        }
        if ((hasGeo() && !O().equals(hVar.O())) || hasExt() != hVar.hasExt()) {
            return false;
        }
        if ((hasExt() && !N().equals(hVar.N())) || !Q().equals(hVar.Q()) || !T().equals(hVar.T()) || a0() != hVar.a0()) {
            return false;
        }
        if ((a0() && !P().equals(hVar.P())) || c0() != hVar.c0()) {
            return false;
        }
        if ((c0() && !Y().equals(hVar.Y())) || hasEvent() != hVar.hasEvent()) {
            return false;
        }
        if ((!hasEvent() || M().equals(hVar.M())) && getTimestamp() == hVar.getTimestamp() && H().equals(hVar.H()) && b0() == hVar.b0()) {
            return (!b0() || W().equals(hVar.W())) && this.unknownFields.equals(hVar.unknownFields);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(h0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == f12966r ? new b(aVar) : new b(aVar).u(this);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f12967s;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.f12968b != null ? n.G(1, G()) : 0;
        if (this.f12969c != null) {
            iG += n.G(2, X());
        }
        if (this.f12970d != null) {
            iG += n.G(3, L());
        }
        if (this.f12971e != null) {
            iG += n.G(4, Z());
        }
        if (this.f12972f != null) {
            iG += n.G(5, V());
        }
        if (this.f12973g != null) {
            iG += n.G(6, O());
        }
        if (this.f12974h != null) {
            iG += n.G(7, N());
        }
        if (!S().isEmpty()) {
            iG += h0.computeStringSize(8, this.f12975i);
        }
        if (!U().isEmpty()) {
            iG += h0.computeStringSize(9, this.f12976j);
        }
        if (this.f12977k != null) {
            iG += n.G(10, P());
        }
        if (this.f12978l != null) {
            iG += n.G(11, Y());
        }
        if (this.f12979m != null) {
            iG += n.G(12, M());
        }
        long j10 = this.f12980n;
        if (j10 != 0) {
            iG += n.z(13, j10);
        }
        if (!I().isEmpty()) {
            iG += h0.computeStringSize(14, this.f12981o);
        }
        if (this.f12982p != null) {
            iG += n.G(15, W());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public long getTimestamp() {
        return this.f12980n;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasApp() {
        return this.f12968b != null;
    }

    public boolean hasDevice() {
        return this.f12970d != null;
    }

    public boolean hasEvent() {
        return this.f12979m != null;
    }

    public boolean hasExt() {
        return this.f12974h != null;
    }

    public boolean hasGeo() {
        return this.f12973g != null;
    }

    public boolean hasRegs() {
        return this.f12972f != null;
    }

    public boolean hasSession() {
        return this.f12969c != null;
    }

    public boolean hasUser() {
        return this.f12971e != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasApp()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + G().hashCode();
        }
        if (hasSession()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + X().hashCode();
        }
        if (hasDevice()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + L().hashCode();
        }
        if (hasUser()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + Z().hashCode();
        }
        if (hasRegs()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + V().hashCode();
        }
        if (hasGeo()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + O().hashCode();
        }
        if (hasExt()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + N().hashCode();
        }
        int iHashCode2 = (((((((iHashCode * 37) + 8) * 53) + Q().hashCode()) * 37) + 9) * 53) + T().hashCode();
        if (a0()) {
            iHashCode2 = (((iHashCode2 * 37) + 10) * 53) + P().hashCode();
        }
        if (c0()) {
            iHashCode2 = (((iHashCode2 * 37) + 11) * 53) + Y().hashCode();
        }
        if (hasEvent()) {
            iHashCode2 = (((iHashCode2 * 37) + 12) * 53) + M().hashCode();
        }
        int i11 = (((((((iHashCode2 * 37) + 13) * 53) + j0.i(getTimestamp())) * 37) + 14) * 53) + H().hashCode();
        if (b0()) {
            i11 = (((i11 * 37) + 15) * 53) + W().hashCode();
        }
        int iHashCode3 = (i11 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return c.f12897v.d(h.class, b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f12983q;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f12983q = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new h();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.f12968b != null) {
            nVar.J0(1, G());
        }
        if (this.f12969c != null) {
            nVar.J0(2, X());
        }
        if (this.f12970d != null) {
            nVar.J0(3, L());
        }
        if (this.f12971e != null) {
            nVar.J0(4, Z());
        }
        if (this.f12972f != null) {
            nVar.J0(5, V());
        }
        if (this.f12973g != null) {
            nVar.J0(6, O());
        }
        if (this.f12974h != null) {
            nVar.J0(7, N());
        }
        if (!S().isEmpty()) {
            h0.writeString(nVar, 8, this.f12975i);
        }
        if (!U().isEmpty()) {
            h0.writeString(nVar, 9, this.f12976j);
        }
        if (this.f12977k != null) {
            nVar.J0(10, P());
        }
        if (this.f12978l != null) {
            nVar.J0(11, Y());
        }
        if (this.f12979m != null) {
            nVar.J0(12, M());
        }
        long j10 = this.f12980n;
        if (j10 != 0) {
            nVar.H0(13, j10);
        }
        if (!I().isEmpty()) {
            h0.writeString(nVar, 14, this.f12981o);
        }
        if (this.f12982p != null) {
            nVar.J0(15, W());
        }
        this.unknownFields.writeTo(nVar);
    }

    /* synthetic */ h(h0.b bVar, a aVar) {
        this(bVar);
    }

    private h(h0.b bVar) {
        super(bVar);
        this.f12983q = (byte) -1;
    }

    private h() {
        this.f12983q = (byte) -1;
        this.f12975i = "";
        this.f12976j = "";
        this.f12981o = "";
    }

    private h(com.explorestack.protobuf.l lVar, w wVar) {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    switch (iK) {
                        case 0:
                            z10 = true;
                            break;
                        case 10:
                            d dVar = this.f12968b;
                            d.b builder = dVar != null ? dVar.toBuilder() : null;
                            d dVar2 = (d) lVar.A(d.parser(), wVar);
                            this.f12968b = dVar2;
                            if (builder != null) {
                                builder.q(dVar2);
                                this.f12968b = builder.buildPartial();
                            }
                            break;
                        case 18:
                            j jVar = this.f12969c;
                            j.b bVarB0 = jVar != null ? jVar.toBuilder() : null;
                            j jVar2 = (j) lVar.A(j.parser(), wVar);
                            this.f12969c = jVar2;
                            if (bVarB0 != null) {
                                bVarB0.r(jVar2);
                                this.f12969c = bVarB0.buildPartial();
                            }
                            break;
                        case 26:
                            Device device = this.f12970d;
                            Device.b builder2 = device != null ? device.toBuilder() : null;
                            Device device2 = (Device) lVar.A(Device.parser(), wVar);
                            this.f12970d = device2;
                            if (builder2 != null) {
                                builder2.q(device2);
                                this.f12970d = builder2.buildPartial();
                            }
                            break;
                        case 34:
                            k kVar = this.f12971e;
                            k.b bVarF = kVar != null ? kVar.toBuilder() : null;
                            k kVar2 = (k) lVar.A(k.parser(), wVar);
                            this.f12971e = kVar2;
                            if (bVarF != null) {
                                bVarF.q(kVar2);
                                this.f12971e = bVarF.buildPartial();
                            }
                            break;
                        case 42:
                            g gVar = this.f12972f;
                            g.b builder3 = gVar != null ? gVar.toBuilder() : null;
                            g gVar2 = (g) lVar.A(g.parser(), wVar);
                            this.f12972f = gVar2;
                            if (builder3 != null) {
                                builder3.q(gVar2);
                                this.f12972f = builder3.buildPartial();
                            }
                            break;
                        case 50:
                            Geo geo = this.f12973g;
                            Geo.b builder4 = geo != null ? geo.toBuilder() : null;
                            Geo geo2 = (Geo) lVar.A(Geo.parser(), wVar);
                            this.f12973g = geo2;
                            if (builder4 != null) {
                                builder4.q(geo2);
                                this.f12973g = builder4.buildPartial();
                            }
                            break;
                        case 58:
                            e eVar = this.f12974h;
                            e.b builder5 = eVar != null ? eVar.toBuilder() : null;
                            e eVar2 = (e) lVar.A(e.parser(), wVar);
                            this.f12974h = eVar2;
                            if (builder5 != null) {
                                builder5.s(eVar2);
                                this.f12974h = builder5.buildPartial();
                            }
                            break;
                        case 66:
                            this.f12975i = lVar.J();
                            break;
                        case 74:
                            this.f12976j = lVar.J();
                            break;
                        case 82:
                            f fVar = this.f12977k;
                            f.b bVarI = fVar != null ? fVar.toBuilder() : null;
                            f fVar2 = (f) lVar.A(f.parser(), wVar);
                            this.f12977k = fVar2;
                            if (bVarI != null) {
                                bVarI.r(fVar2);
                                this.f12977k = bVarI.buildPartial();
                            }
                            break;
                        case 90:
                            Stats stats = this.f12978l;
                            Stats.c builder6 = stats != null ? stats.toBuilder() : null;
                            Stats stats2 = (Stats) lVar.A(Stats.parser(), wVar);
                            this.f12978l = stats2;
                            if (builder6 != null) {
                                builder6.v(stats2);
                                this.f12978l = builder6.buildPartial();
                            }
                            break;
                        case 98:
                            Event event = this.f12979m;
                            Event.b bVarH = event != null ? event.toBuilder() : null;
                            Event event2 = (Event) lVar.A(Event.parser(), wVar);
                            this.f12979m = event2;
                            if (bVarH != null) {
                                bVarH.q(event2);
                                this.f12979m = bVarH.buildPartial();
                            }
                            break;
                        case 104:
                            this.f12980n = lVar.z();
                            break;
                        case 114:
                            this.f12981o = lVar.J();
                            break;
                        case 122:
                            i iVar = this.f12982p;
                            i.d dVarH = iVar != null ? iVar.toBuilder() : null;
                            i iVar2 = (i) lVar.A(i.parser(), wVar);
                            this.f12982p = iVar2;
                            if (dVarH != null) {
                                dVarH.u(iVar2);
                                this.f12982p = dVarH.buildPartial();
                            }
                            break;
                        default:
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                z10 = true;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
