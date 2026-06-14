package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class Device extends h0 implements MessageOrBuilder {
    private static final Device G = new Device();
    private static final p1 H = new a();
    private long A;
    private float B;
    private volatile Object C;
    private volatile Object D;
    private volatile Object E;
    private byte F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f12708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f12709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Object f12710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f12713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Object f12715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile Object f12716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f12717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile Object f12718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f12719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Object f12720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile Object f12721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f12722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile Object f12723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f12724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f12725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f12726t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile Object f12727u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f12728v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f12729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f12730x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f12731y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f12732z;

    public enum ConnectionType implements j0.c {
        CONNECTIONTYPE_UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        MOBILE_UNKNOWN(3),
        MOBILE_2G(4),
        MOBILE_3G(5),
        MOBILE_4G(6),
        UNRECOGNIZED(-1);

        public static final int CONNECTIONTYPE_UNKNOWN_VALUE = 0;
        public static final int ETHERNET_VALUE = 1;
        public static final int MOBILE_2G_VALUE = 4;
        public static final int MOBILE_3G_VALUE = 5;
        public static final int MOBILE_4G_VALUE = 6;
        public static final int MOBILE_UNKNOWN_VALUE = 3;
        public static final int WIFI_VALUE = 2;
        private final int value;
        private static final j0.d internalValueMap = new a();
        private static final ConnectionType[] VALUES = values();

        class a implements j0.d {
            a() {
            }
        }

        ConnectionType(int i10) {
            this.value = i10;
        }

        public static ConnectionType forNumber(int i10) {
            switch (i10) {
                case 0:
                    return CONNECTIONTYPE_UNKNOWN;
                case 1:
                    return ETHERNET;
                case 2:
                    return WIFI;
                case 3:
                    return MOBILE_UNKNOWN;
                case 4:
                    return MOBILE_2G;
                case 5:
                    return MOBILE_3G;
                case 6:
                    return MOBILE_4G;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Device.getDescriptor().getEnumTypes().get(0);
        }

        public static j0.d internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.j0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static ConnectionType valueOf(int i10) {
            return forNumber(i10);
        }

        public static ConnectionType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum DeviceType implements j0.c {
        DEVICETYPE_UNKNOWN(0),
        PHONE(4),
        TABLET(5),
        UNRECOGNIZED(-1);

        public static final int DEVICETYPE_UNKNOWN_VALUE = 0;
        public static final int PHONE_VALUE = 4;
        public static final int TABLET_VALUE = 5;
        private final int value;
        private static final j0.d internalValueMap = new a();
        private static final DeviceType[] VALUES = values();

        class a implements j0.d {
            a() {
            }
        }

        DeviceType(int i10) {
            this.value = i10;
        }

        public static DeviceType forNumber(int i10) {
            if (i10 == 0) {
                return DEVICETYPE_UNKNOWN;
            }
            if (i10 == 4) {
                return PHONE;
            }
            if (i10 != 5) {
                return null;
            }
            return TABLET;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Device.getDescriptor().getEnumTypes().get(1);
        }

        public static j0.d internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.j0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static DeviceType valueOf(int i10) {
            return forNumber(i10);
        }

        public static DeviceType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum TrackingAuthorizationStatus implements j0.c {
        NOT_DETERMINED(0),
        RESTRICTED(1),
        DENIED(2),
        AUTHORIZED(3),
        UNRECOGNIZED(-1);

        public static final int AUTHORIZED_VALUE = 3;
        public static final int DENIED_VALUE = 2;
        public static final int NOT_DETERMINED_VALUE = 0;
        public static final int RESTRICTED_VALUE = 1;
        private final int value;
        private static final j0.d internalValueMap = new a();
        private static final TrackingAuthorizationStatus[] VALUES = values();

        class a implements j0.d {
            a() {
            }
        }

        TrackingAuthorizationStatus(int i10) {
            this.value = i10;
        }

        public static TrackingAuthorizationStatus forNumber(int i10) {
            if (i10 == 0) {
                return NOT_DETERMINED;
            }
            if (i10 == 1) {
                return RESTRICTED;
            }
            if (i10 == 2) {
                return DENIED;
            }
            if (i10 != 3) {
                return null;
            }
            return AUTHORIZED;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Device.getDescriptor().getEnumTypes().get(2);
        }

        public static j0.d internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.j0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static TrackingAuthorizationStatus valueOf(int i10) {
            return forNumber(i10);
        }

        public static TrackingAuthorizationStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Device parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new Device(lVar, wVar, null);
        }
    }

    public static final class b extends h0.b implements MessageOrBuilder {
        private long A;
        private float B;
        private Object C;
        private Object D;
        private Object E;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f12733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f12734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f12735d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f12736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f12737f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f12738g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f12739h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Object f12740i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f12741j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f12742k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Object f12743l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f12744m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Object f12745n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Object f12746o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f12747p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Object f12748q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f12749r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f12750s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f12751t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Object f12752u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private long f12753v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private long f12754w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private long f12755x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private long f12756y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private long f12757z;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public b A(float f10) {
            this.B = f10;
            onChanged();
            return this;
        }

        public b B(DeviceType deviceType) {
            deviceType.getClass();
            this.f12739h = deviceType.getNumber();
            onChanged();
            return this;
        }

        public b C(int i10) {
            this.f12739h = i10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b E(int i10) {
            this.f12737f = i10;
            onChanged();
            return this;
        }

        public b F(String str) {
            str.getClass();
            this.f12748q = str;
            onChanged();
            return this;
        }

        public b G(int i10) {
            this.f12749r = i10;
            onChanged();
            return this;
        }

        public b H(String str) {
            str.getClass();
            this.f12746o = str;
            onChanged();
            return this;
        }

        public b I(String str) {
            str.getClass();
            this.f12740i = str;
            onChanged();
            return this;
        }

        public b J(String str) {
            str.getClass();
            this.f12745n = str;
            onChanged();
            return this;
        }

        public b K(String str) {
            str.getClass();
            this.f12741j = str;
            onChanged();
            return this;
        }

        public b L(String str) {
            str.getClass();
            this.f12735d = str;
            onChanged();
            return this;
        }

        public b M(String str) {
            str.getClass();
            this.f12734c = str;
            onChanged();
            return this;
        }

        public b N(float f10) {
            this.f12738g = f10;
            onChanged();
            return this;
        }

        public b O(long j10) {
            this.f12757z = j10;
            onChanged();
            return this;
        }

        public b P(long j10) {
            this.f12756y = j10;
            onChanged();
            return this;
        }

        public b Q(long j10) {
            this.A = j10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        public b S(boolean z10) {
            this.f12742k = z10;
            onChanged();
            return this;
        }

        public b T(long j10) {
            this.f12754w = j10;
            onChanged();
            return this;
        }

        public b U(long j10) {
            this.f12753v = j10;
            onChanged();
            return this;
        }

        public b V(long j10) {
            this.f12755x = j10;
            onChanged();
            return this;
        }

        public b W(int i10) {
            this.f12751t = i10;
            onChanged();
            return this;
        }

        public b X(String str) {
            str.getClass();
            this.f12733b = str;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r2 r2Var) {
            return (b) super.setUnknownFields(r2Var);
        }

        public b Z(int i10) {
            this.f12736e = i10;
            onChanged();
            return this;
        }

        public b a0(String str) {
            str.getClass();
            this.f12743l = str;
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
            return c.f12878c;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Device build() {
            Device deviceBuildPartial = buildPartial();
            if (deviceBuildPartial.isInitialized()) {
                return deviceBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return c.f12879d.d(Device.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Device buildPartial() {
            Device device = new Device(this, (a) null);
            device.f12708b = this.f12733b;
            device.f12709c = this.f12734c;
            device.f12710d = this.f12735d;
            device.f12711e = this.f12736e;
            device.f12712f = this.f12737f;
            device.f12713g = this.f12738g;
            device.f12714h = this.f12739h;
            device.f12715i = this.f12740i;
            device.f12716j = this.f12741j;
            device.f12717k = this.f12742k;
            device.f12718l = this.f12743l;
            device.f12719m = this.f12744m;
            device.f12720n = this.f12745n;
            device.f12721o = this.f12746o;
            device.f12722p = this.f12747p;
            device.f12723q = this.f12748q;
            device.f12724r = this.f12749r;
            device.f12725s = this.f12750s;
            device.f12726t = this.f12751t;
            device.f12727u = this.f12752u;
            device.f12728v = this.f12753v;
            device.f12729w = this.f12754w;
            device.f12730x = this.f12755x;
            device.f12731y = this.f12756y;
            device.f12732z = this.f12757z;
            device.A = this.A;
            device.B = this.B;
            device.C = this.C;
            device.D = this.D;
            device.E = this.E;
            onBuilt();
            return device;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f12733b = "";
            this.f12734c = "";
            this.f12735d = "";
            this.f12736e = 0;
            this.f12737f = 0;
            this.f12738g = 0.0f;
            this.f12739h = 0;
            this.f12740i = "";
            this.f12741j = "";
            this.f12742k = false;
            this.f12743l = "";
            this.f12744m = 0;
            this.f12745n = "";
            this.f12746o = "";
            this.f12747p = 0;
            this.f12748q = "";
            this.f12749r = 0;
            this.f12750s = false;
            this.f12751t = 0;
            this.f12752u = "";
            this.f12753v = 0L;
            this.f12754w = 0L;
            this.f12755x = 0L;
            this.f12756y = 0L;
            this.f12757z = 0L;
            this.A = 0L;
            this.B = 0.0f;
            this.C = "";
            this.D = "";
            this.E = "";
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
        public Device getDefaultInstanceForType() {
            return Device.v0();
        }

        public b q(Device device) {
            if (device == Device.v0()) {
                return this;
            }
            if (!device.getUa().isEmpty()) {
                this.f12733b = device.f12708b;
                onChanged();
            }
            if (!device.getOsv().isEmpty()) {
                this.f12734c = device.f12709c;
                onChanged();
            }
            if (!device.D0().isEmpty()) {
                this.f12735d = device.f12710d;
                onChanged();
            }
            if (device.getW() != 0) {
                Z(device.getW());
            }
            if (device.getH() != 0) {
                E(device.getH());
            }
            if (device.getPxratio() != 0.0f) {
                N(device.getPxratio());
            }
            if (device.f12714h != 0) {
                C(device.x0());
            }
            if (!device.getMake().isEmpty()) {
                this.f12740i = device.f12715i;
                onChanged();
            }
            if (!device.getModel().isEmpty()) {
                this.f12741j = device.f12716j;
                onChanged();
            }
            if (device.getRooted()) {
                S(device.getRooted());
            }
            if (!device.O0().isEmpty()) {
                this.f12743l = device.f12718l;
                onChanged();
            }
            if (device.getBattery() != 0) {
                x(device.getBattery());
            }
            if (!device.getMccmnc().isEmpty()) {
                this.f12745n = device.f12720n;
                onChanged();
            }
            if (!device.B0().isEmpty()) {
                this.f12746o = device.f12721o;
                onChanged();
            }
            if (device.f12722p != 0) {
                z(device.p0());
            }
            if (!device.getIfa().isEmpty()) {
                this.f12748q = device.f12723q;
                onChanged();
            }
            if (device.A0() != 0) {
                G(device.A0());
            }
            if (device.j0()) {
                u(device.j0());
            }
            if (device.f12726t != 0) {
                W(device.N0());
            }
            if (!device.y0().isEmpty()) {
                this.f12752u = device.f12727u;
                onChanged();
            }
            if (device.L0() != 0) {
                U(device.L0());
            }
            if (device.K0() != 0) {
                T(device.K0());
            }
            if (device.M0() != 0) {
                V(device.M0());
            }
            if (device.G0() != 0) {
                P(device.G0());
            }
            if (device.F0() != 0) {
                O(device.F0());
            }
            if (device.H0() != 0) {
                Q(device.H0());
            }
            if (device.q0() != 0.0f) {
                A(device.q0());
            }
            if (!device.I0().isEmpty()) {
                this.C = device.C;
                onChanged();
            }
            if (!device.k0().isEmpty()) {
                this.D = device.D;
                onChanged();
            }
            if (!device.m0().isEmpty()) {
                this.E = device.E;
                onChanged();
            }
            mergeUnknownFields(((h0) device).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.appodeal.ads.api.Device.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.Device.access$3500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.Device r3 = (com.appodeal.ads.api.Device) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.q(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.appodeal.ads.api.Device r4 = (com.appodeal.ads.api.Device) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.q(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Device.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.Device$b");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof Device) {
                return q((Device) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(r2 r2Var) {
            return (b) super.mergeUnknownFields(r2Var);
        }

        public b u(boolean z10) {
            this.f12750s = z10;
            onChanged();
            return this;
        }

        public b v(String str) {
            str.getClass();
            this.D = str;
            onChanged();
            return this;
        }

        public b w(String str) {
            str.getClass();
            this.E = str;
            onChanged();
            return this;
        }

        public b x(int i10) {
            this.f12744m = i10;
            onChanged();
            return this;
        }

        public b y(ConnectionType connectionType) {
            connectionType.getClass();
            this.f12747p = connectionType.getNumber();
            onChanged();
            return this;
        }

        public b z(int i10) {
            this.f12747p = i10;
            onChanged();
            return this;
        }

        /* synthetic */ b(h0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            this.f12733b = "";
            this.f12734c = "";
            this.f12735d = "";
            this.f12739h = 0;
            this.f12740i = "";
            this.f12741j = "";
            this.f12743l = "";
            this.f12745n = "";
            this.f12746o = "";
            this.f12747p = 0;
            this.f12748q = "";
            this.f12751t = 0;
            this.f12752u = "";
            this.C = "";
            this.D = "";
            this.E = "";
            maybeForceBuilderInitialization();
        }

        private b(h0.c cVar) {
            super(cVar);
            this.f12733b = "";
            this.f12734c = "";
            this.f12735d = "";
            this.f12739h = 0;
            this.f12740i = "";
            this.f12741j = "";
            this.f12743l = "";
            this.f12745n = "";
            this.f12746o = "";
            this.f12747p = 0;
            this.f12748q = "";
            this.f12751t = 0;
            this.f12752u = "";
            this.C = "";
            this.D = "";
            this.E = "";
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ Device(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static b Q0() {
        return G.toBuilder();
    }

    public static b R0(Device device) {
        return G.toBuilder().q(device);
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return c.f12878c;
    }

    public static p1 parser() {
        return H;
    }

    public static Device v0() {
        return G;
    }

    public int A0() {
        return this.f12724r;
    }

    public String B0() {
        Object obj = this.f12721o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12721o = stringUtf8;
        return stringUtf8;
    }

    public ByteString C0() {
        Object obj = this.f12721o;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12721o = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String D0() {
        Object obj = this.f12710d;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12710d = stringUtf8;
        return stringUtf8;
    }

    public ByteString E0() {
        Object obj = this.f12710d;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12710d = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public long F0() {
        return this.f12732z;
    }

    public long G0() {
        return this.f12731y;
    }

    public long H0() {
        return this.A;
    }

    public String I0() {
        Object obj = this.C;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.C = stringUtf8;
        return stringUtf8;
    }

    public ByteString J0() {
        Object obj = this.C;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.C = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public long K0() {
        return this.f12729w;
    }

    public long L0() {
        return this.f12728v;
    }

    public long M0() {
        return this.f12730x;
    }

    public int N0() {
        return this.f12726t;
    }

    public String O0() {
        Object obj = this.f12718l;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12718l = stringUtf8;
        return stringUtf8;
    }

    public ByteString P0() {
        Object obj = this.f12718l;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12718l = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return Q0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(h0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == G ? new b(aVar) : new b(aVar).q(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return super.equals(obj);
        }
        Device device = (Device) obj;
        return getUa().equals(device.getUa()) && getOsv().equals(device.getOsv()) && D0().equals(device.D0()) && getW() == device.getW() && getH() == device.getH() && Float.floatToIntBits(getPxratio()) == Float.floatToIntBits(device.getPxratio()) && this.f12714h == device.f12714h && getMake().equals(device.getMake()) && getModel().equals(device.getModel()) && getRooted() == device.getRooted() && O0().equals(device.O0()) && getBattery() == device.getBattery() && getMccmnc().equals(device.getMccmnc()) && B0().equals(device.B0()) && this.f12722p == device.f12722p && getIfa().equals(device.getIfa()) && A0() == device.A0() && j0() == device.j0() && this.f12726t == device.f12726t && y0().equals(device.y0()) && L0() == device.L0() && K0() == device.K0() && M0() == device.M0() && G0() == device.G0() && F0() == device.F0() && H0() == device.H0() && Float.floatToIntBits(q0()) == Float.floatToIntBits(device.q0()) && I0().equals(device.I0()) && k0().equals(device.k0()) && m0().equals(device.m0()) && this.unknownFields.equals(device.unknownFields);
    }

    public int getBattery() {
        return this.f12719m;
    }

    public int getH() {
        return this.f12712f;
    }

    public String getIfa() {
        Object obj = this.f12723q;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12723q = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIfaBytes() {
        Object obj = this.f12723q;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12723q = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getMake() {
        Object obj = this.f12715i;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12715i = stringUtf8;
        return stringUtf8;
    }

    public ByteString getMakeBytes() {
        Object obj = this.f12715i;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12715i = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getMccmnc() {
        Object obj = this.f12720n;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12720n = stringUtf8;
        return stringUtf8;
    }

    public ByteString getMccmncBytes() {
        Object obj = this.f12720n;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12720n = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getModel() {
        Object obj = this.f12716j;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12716j = stringUtf8;
        return stringUtf8;
    }

    public ByteString getModelBytes() {
        Object obj = this.f12716j;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12716j = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getOsv() {
        Object obj = this.f12709c;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12709c = stringUtf8;
        return stringUtf8;
    }

    public ByteString getOsvBytes() {
        Object obj = this.f12709c;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12709c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return H;
    }

    public float getPxratio() {
        return this.f12713g;
    }

    public boolean getRooted() {
        return this.f12717k;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getUaBytes().isEmpty() ? h0.computeStringSize(1, this.f12708b) : 0;
        if (!getOsvBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.f12709c);
        }
        if (!E0().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(3, this.f12710d);
        }
        int i11 = this.f12711e;
        if (i11 != 0) {
            iComputeStringSize += n.x(4, i11);
        }
        int i12 = this.f12712f;
        if (i12 != 0) {
            iComputeStringSize += n.x(5, i12);
        }
        float f10 = this.f12713g;
        if (f10 != 0.0f) {
            iComputeStringSize += n.r(6, f10);
        }
        if (this.f12714h != DeviceType.DEVICETYPE_UNKNOWN.getNumber()) {
            iComputeStringSize += n.l(7, this.f12714h);
        }
        if (!getMakeBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(8, this.f12715i);
        }
        if (!getModelBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(9, this.f12716j);
        }
        boolean z10 = this.f12717k;
        if (z10) {
            iComputeStringSize += n.e(10, z10);
        }
        if (!P0().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(11, this.f12718l);
        }
        int i13 = this.f12719m;
        if (i13 != 0) {
            iComputeStringSize += n.x(12, i13);
        }
        if (!getMccmncBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(13, this.f12720n);
        }
        if (!C0().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(14, this.f12721o);
        }
        if (this.f12722p != ConnectionType.CONNECTIONTYPE_UNKNOWN.getNumber()) {
            iComputeStringSize += n.l(15, this.f12722p);
        }
        if (!getIfaBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(16, this.f12723q);
        }
        int i14 = this.f12724r;
        if (i14 != 0) {
            iComputeStringSize += n.x(17, i14);
        }
        boolean z11 = this.f12725s;
        if (z11) {
            iComputeStringSize += n.e(18, z11);
        }
        if (this.f12726t != TrackingAuthorizationStatus.NOT_DETERMINED.getNumber()) {
            iComputeStringSize += n.l(19, this.f12726t);
        }
        if (!z0().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(20, this.f12727u);
        }
        long j10 = this.f12728v;
        if (j10 != 0) {
            iComputeStringSize += n.a0(21, j10);
        }
        long j11 = this.f12729w;
        if (j11 != 0) {
            iComputeStringSize += n.a0(22, j11);
        }
        long j12 = this.f12730x;
        if (j12 != 0) {
            iComputeStringSize += n.a0(23, j12);
        }
        long j13 = this.f12731y;
        if (j13 != 0) {
            iComputeStringSize += n.a0(24, j13);
        }
        long j14 = this.f12732z;
        if (j14 != 0) {
            iComputeStringSize += n.a0(25, j14);
        }
        long j15 = this.A;
        if (j15 != 0) {
            iComputeStringSize += n.a0(26, j15);
        }
        float f11 = this.B;
        if (f11 != 0.0f) {
            iComputeStringSize += n.r(27, f11);
        }
        if (!J0().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(28, this.C);
        }
        if (!l0().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(29, this.D);
        }
        if (!o0().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(30, this.E);
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public String getUa() {
        Object obj = this.f12708b;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12708b = stringUtf8;
        return stringUtf8;
    }

    public ByteString getUaBytes() {
        Object obj = this.f12708b;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12708b = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public int getW() {
        return this.f12711e;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUa().hashCode()) * 37) + 2) * 53) + getOsv().hashCode()) * 37) + 3) * 53) + D0().hashCode()) * 37) + 4) * 53) + getW()) * 37) + 5) * 53) + getH()) * 37) + 6) * 53) + Float.floatToIntBits(getPxratio())) * 37) + 7) * 53) + this.f12714h) * 37) + 8) * 53) + getMake().hashCode()) * 37) + 9) * 53) + getModel().hashCode()) * 37) + 10) * 53) + j0.d(getRooted())) * 37) + 11) * 53) + O0().hashCode()) * 37) + 12) * 53) + getBattery()) * 37) + 13) * 53) + getMccmnc().hashCode()) * 37) + 14) * 53) + B0().hashCode()) * 37) + 15) * 53) + this.f12722p) * 37) + 16) * 53) + getIfa().hashCode()) * 37) + 17) * 53) + A0()) * 37) + 18) * 53) + j0.d(j0())) * 37) + 19) * 53) + this.f12726t) * 37) + 20) * 53) + y0().hashCode()) * 37) + 21) * 53) + j0.i(L0())) * 37) + 22) * 53) + j0.i(K0())) * 37) + 23) * 53) + j0.i(M0())) * 37) + 24) * 53) + j0.i(G0())) * 37) + 25) * 53) + j0.i(F0())) * 37) + 26) * 53) + j0.i(H0())) * 37) + 27) * 53) + Float.floatToIntBits(q0())) * 37) + 28) * 53) + I0().hashCode()) * 37) + 29) * 53) + k0().hashCode()) * 37) + 30) * 53) + m0().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return c.f12879d.d(Device.class, b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.F;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.F = (byte) 1;
        return true;
    }

    public boolean j0() {
        return this.f12725s;
    }

    public String k0() {
        Object obj = this.D;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.D = stringUtf8;
        return stringUtf8;
    }

    public ByteString l0() {
        Object obj = this.D;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.D = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String m0() {
        Object obj = this.E;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.E = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new Device();
    }

    public ByteString o0() {
        Object obj = this.E;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.E = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public int p0() {
        return this.f12722p;
    }

    public float q0() {
        return this.B;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public Device getDefaultInstanceForType() {
        return G;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getUaBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.f12708b);
        }
        if (!getOsvBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.f12709c);
        }
        if (!E0().isEmpty()) {
            h0.writeString(nVar, 3, this.f12710d);
        }
        int i10 = this.f12711e;
        if (i10 != 0) {
            nVar.F0(4, i10);
        }
        int i11 = this.f12712f;
        if (i11 != 0) {
            nVar.F0(5, i11);
        }
        float f10 = this.f12713g;
        if (f10 != 0.0f) {
            nVar.B0(6, f10);
        }
        if (this.f12714h != DeviceType.DEVICETYPE_UNKNOWN.getNumber()) {
            nVar.v0(7, this.f12714h);
        }
        if (!getMakeBytes().isEmpty()) {
            h0.writeString(nVar, 8, this.f12715i);
        }
        if (!getModelBytes().isEmpty()) {
            h0.writeString(nVar, 9, this.f12716j);
        }
        boolean z10 = this.f12717k;
        if (z10) {
            nVar.n0(10, z10);
        }
        if (!P0().isEmpty()) {
            h0.writeString(nVar, 11, this.f12718l);
        }
        int i12 = this.f12719m;
        if (i12 != 0) {
            nVar.F0(12, i12);
        }
        if (!getMccmncBytes().isEmpty()) {
            h0.writeString(nVar, 13, this.f12720n);
        }
        if (!C0().isEmpty()) {
            h0.writeString(nVar, 14, this.f12721o);
        }
        if (this.f12722p != ConnectionType.CONNECTIONTYPE_UNKNOWN.getNumber()) {
            nVar.v0(15, this.f12722p);
        }
        if (!getIfaBytes().isEmpty()) {
            h0.writeString(nVar, 16, this.f12723q);
        }
        int i13 = this.f12724r;
        if (i13 != 0) {
            nVar.F0(17, i13);
        }
        boolean z11 = this.f12725s;
        if (z11) {
            nVar.n0(18, z11);
        }
        if (this.f12726t != TrackingAuthorizationStatus.NOT_DETERMINED.getNumber()) {
            nVar.v0(19, this.f12726t);
        }
        if (!z0().isEmpty()) {
            h0.writeString(nVar, 20, this.f12727u);
        }
        long j10 = this.f12728v;
        if (j10 != 0) {
            nVar.Y0(21, j10);
        }
        long j11 = this.f12729w;
        if (j11 != 0) {
            nVar.Y0(22, j11);
        }
        long j12 = this.f12730x;
        if (j12 != 0) {
            nVar.Y0(23, j12);
        }
        long j13 = this.f12731y;
        if (j13 != 0) {
            nVar.Y0(24, j13);
        }
        long j14 = this.f12732z;
        if (j14 != 0) {
            nVar.Y0(25, j14);
        }
        long j15 = this.A;
        if (j15 != 0) {
            nVar.Y0(26, j15);
        }
        float f11 = this.B;
        if (f11 != 0.0f) {
            nVar.B0(27, f11);
        }
        if (!J0().isEmpty()) {
            h0.writeString(nVar, 28, this.C);
        }
        if (!l0().isEmpty()) {
            h0.writeString(nVar, 29, this.D);
        }
        if (!o0().isEmpty()) {
            h0.writeString(nVar, 30, this.E);
        }
        this.unknownFields.writeTo(nVar);
    }

    public int x0() {
        return this.f12714h;
    }

    public String y0() {
        Object obj = this.f12727u;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12727u = stringUtf8;
        return stringUtf8;
    }

    public ByteString z0() {
        Object obj = this.f12727u;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12727u = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    /* synthetic */ Device(h0.b bVar, a aVar) {
        this(bVar);
    }

    private Device(h0.b bVar) {
        super(bVar);
        this.F = (byte) -1;
    }

    private Device() {
        this.F = (byte) -1;
        this.f12708b = "";
        this.f12709c = "";
        this.f12710d = "";
        this.f12714h = 0;
        this.f12715i = "";
        this.f12716j = "";
        this.f12718l = "";
        this.f12720n = "";
        this.f12721o = "";
        this.f12722p = 0;
        this.f12723q = "";
        this.f12726t = 0;
        this.f12727u = "";
        this.C = "";
        this.D = "";
        this.E = "";
    }

    private Device(com.explorestack.protobuf.l lVar, w wVar) {
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
                            this.f12708b = lVar.J();
                            break;
                        case 18:
                            this.f12709c = lVar.J();
                            break;
                        case 26:
                            this.f12710d = lVar.J();
                            break;
                        case 32:
                            this.f12711e = lVar.y();
                            break;
                        case 40:
                            this.f12712f = lVar.y();
                            break;
                        case 53:
                            this.f12713g = lVar.w();
                            break;
                        case 56:
                            this.f12714h = lVar.t();
                            break;
                        case 66:
                            this.f12715i = lVar.J();
                            break;
                        case 74:
                            this.f12716j = lVar.J();
                            break;
                        case 80:
                            this.f12717k = lVar.q();
                            break;
                        case 90:
                            this.f12718l = lVar.J();
                            break;
                        case 96:
                            this.f12719m = lVar.y();
                            break;
                        case 106:
                            this.f12720n = lVar.J();
                            break;
                        case 114:
                            this.f12721o = lVar.J();
                            break;
                        case 120:
                            this.f12722p = lVar.t();
                            break;
                        case 130:
                            this.f12723q = lVar.J();
                            break;
                        case 136:
                            this.f12724r = lVar.y();
                            break;
                        case 144:
                            this.f12725s = lVar.q();
                            break;
                        case 152:
                            this.f12726t = lVar.t();
                            break;
                        case 162:
                            this.f12727u = lVar.J();
                            break;
                        case 168:
                            this.f12728v = lVar.M();
                            break;
                        case 176:
                            this.f12729w = lVar.M();
                            break;
                        case 184:
                            this.f12730x = lVar.M();
                            break;
                        case 192:
                            this.f12731y = lVar.M();
                            break;
                        case 200:
                            this.f12732z = lVar.M();
                            break;
                        case 208:
                            this.A = lVar.M();
                            break;
                        case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                            this.B = lVar.w();
                            break;
                        case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                            this.C = lVar.J();
                            break;
                        case 234:
                            this.D = lVar.J();
                            break;
                        case 242:
                            this.E = lVar.J();
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
