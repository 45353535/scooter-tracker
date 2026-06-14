package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.o0;
import com.explorestack.protobuf.p0;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.t1;
import com.explorestack.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Device extends h0 implements DeviceOrBuilder {
    public static final int ACCESS_FIELD_NUMBER = 19;
    public static final int AIRPLANE_FIELD_NUMBER = 12;
    public static final int APILEVEL_FIELD_NUMBER = 31;
    public static final int ATTS_FIELD_NUMBER = 22;
    public static final int AUDIOCONTEXT_FIELD_NUMBER = 24;
    public static final int BATTERYLEVEL_FIELD_NUMBER = 9;
    public static final int BATTERYSAVER_FIELD_NUMBER = 10;
    public static final int BM_IFV_FIELD_NUMBER = 2;
    public static final int CHARGING_FIELD_NUMBER = 7;
    public static final int CONNECTION_FIELD_NUMBER = 23;
    public static final int CPUNAME_FIELD_NUMBER = 25;
    public static final int CPUVENDOR_FIELD_NUMBER = 26;
    public static final int DARKMODE_FIELD_NUMBER = 11;
    public static final int DEVICENAME_FIELD_NUMBER = 14;
    public static final int DISKSPACE_FIELD_NUMBER = 4;
    public static final int DND_FIELD_NUMBER = 13;
    public static final int FREEMEM_FIELD_NUMBER = 30;
    public static final int GPUNAME_FIELD_NUMBER = 27;
    public static final int GPUVENDOR_FIELD_NUMBER = 28;
    public static final int HEADSETNAME_FIELD_NUMBER = 20;
    public static final int HEADSET_FIELD_NUMBER = 8;
    public static final int IFV_FIELD_NUMBER = 1;
    public static final int INPUTLANGUAGE_FIELD_NUMBER = 3;
    public static final int JAILBREAK_FIELD_NUMBER = 17;
    public static final int LASTBOOTUP_FIELD_NUMBER = 18;
    public static final int RINGMUTE_FIELD_NUMBER = 6;
    public static final int SCREENBRIGHT_FIELD_NUMBER = 16;
    public static final int TIMEZONE_FIELD_NUMBER = 29;
    public static final int TIME_FIELD_NUMBER = 15;
    public static final int TOTALDISK_FIELD_NUMBER = 5;
    public static final int TOTALMEM_FIELD_NUMBER = 21;
    private static final long serialVersionUID = 0;
    private volatile Object access_;
    private boolean airplane_;
    private int apilevel_;
    private int atts_;
    private Context.Device.AudioContext audioContext_;
    private float batterylevel_;
    private boolean batterysaver_;
    private volatile Object bmIfv_;
    private boolean charging_;
    private Context.Device.Connection connection_;
    private volatile Object cpuname_;
    private volatile Object cpuvendor_;
    private boolean darkmode_;
    private volatile Object devicename_;
    private long diskspace_;
    private boolean dnd_;
    private long freemem_;
    private volatile Object gpuname_;
    private volatile Object gpuvendor_;
    private boolean headset_;
    private volatile Object headsetname_;
    private volatile Object ifv_;
    private p0 inputlanguage_;
    private boolean jailbreak_;
    private long lastbootup_;
    private byte memoizedIsInitialized;
    private boolean ringmute_;
    private float screenbright_;
    private long time_;
    private volatile Object timezone_;
    private long totaldisk_;
    private long totalmem_;
    private static final Device DEFAULT_INSTANCE = new Device();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Device.1
        @Override // com.explorestack.protobuf.p1
        public Device parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Device(lVar, wVar);
        }
    };

    public static final class Builder extends h0.b implements DeviceOrBuilder {
        private Object access_;
        private boolean airplane_;
        private int apilevel_;
        private int atts_;
        private a2 audioContextBuilder_;
        private Context.Device.AudioContext audioContext_;
        private float batterylevel_;
        private boolean batterysaver_;
        private int bitField0_;
        private Object bmIfv_;
        private boolean charging_;
        private a2 connectionBuilder_;
        private Context.Device.Connection connection_;
        private Object cpuname_;
        private Object cpuvendor_;
        private boolean darkmode_;
        private Object devicename_;
        private long diskspace_;
        private boolean dnd_;
        private long freemem_;
        private Object gpuname_;
        private Object gpuvendor_;
        private boolean headset_;
        private Object headsetname_;
        private Object ifv_;
        private p0 inputlanguage_;
        private boolean jailbreak_;
        private long lastbootup_;
        private boolean ringmute_;
        private float screenbright_;
        private long time_;
        private Object timezone_;
        private long totaldisk_;
        private long totalmem_;

        private void ensureInputlanguageIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.inputlanguage_ = new o0(this.inputlanguage_);
                this.bitField0_ |= 1;
            }
        }

        private a2 getAudioContextFieldBuilder() {
            if (this.audioContextBuilder_ == null) {
                this.audioContextBuilder_ = new a2(getAudioContext(), getParentForChildren(), isClean());
                this.audioContext_ = null;
            }
            return this.audioContextBuilder_;
        }

        private a2 getConnectionFieldBuilder() {
            if (this.connectionBuilder_ == null) {
                this.connectionBuilder_ = new a2(getConnection(), getParentForChildren(), isClean());
                this.connection_ = null;
            }
            return this.connectionBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder addAllInputlanguage(Iterable<String> iterable) {
            ensureInputlanguageIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.inputlanguage_);
            onChanged();
            return this;
        }

        public Builder addInputlanguage(String str) {
            str.getClass();
            ensureInputlanguageIsMutable();
            this.inputlanguage_.add(str);
            onChanged();
            return this;
        }

        public Builder addInputlanguageBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureInputlanguageIsMutable();
            this.inputlanguage_.c(byteString);
            onChanged();
            return this;
        }

        public Builder clearAccess() {
            this.access_ = Device.getDefaultInstance().getAccess();
            onChanged();
            return this;
        }

        public Builder clearAirplane() {
            this.airplane_ = false;
            onChanged();
            return this;
        }

        public Builder clearApilevel() {
            this.apilevel_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAtts() {
            this.atts_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAudioContext() {
            if (this.audioContextBuilder_ == null) {
                this.audioContext_ = null;
                onChanged();
                return this;
            }
            this.audioContext_ = null;
            this.audioContextBuilder_ = null;
            return this;
        }

        public Builder clearBatterylevel() {
            this.batterylevel_ = 0.0f;
            onChanged();
            return this;
        }

        public Builder clearBatterysaver() {
            this.batterysaver_ = false;
            onChanged();
            return this;
        }

        public Builder clearBmIfv() {
            this.bmIfv_ = Device.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder clearCharging() {
            this.charging_ = false;
            onChanged();
            return this;
        }

        public Builder clearConnection() {
            if (this.connectionBuilder_ == null) {
                this.connection_ = null;
                onChanged();
                return this;
            }
            this.connection_ = null;
            this.connectionBuilder_ = null;
            return this;
        }

        public Builder clearCpuname() {
            this.cpuname_ = Device.getDefaultInstance().getCpuname();
            onChanged();
            return this;
        }

        public Builder clearCpuvendor() {
            this.cpuvendor_ = Device.getDefaultInstance().getCpuvendor();
            onChanged();
            return this;
        }

        public Builder clearDarkmode() {
            this.darkmode_ = false;
            onChanged();
            return this;
        }

        public Builder clearDevicename() {
            this.devicename_ = Device.getDefaultInstance().getDevicename();
            onChanged();
            return this;
        }

        public Builder clearDiskspace() {
            this.diskspace_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearDnd() {
            this.dnd_ = false;
            onChanged();
            return this;
        }

        public Builder clearFreemem() {
            this.freemem_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearGpuname() {
            this.gpuname_ = Device.getDefaultInstance().getGpuname();
            onChanged();
            return this;
        }

        public Builder clearGpuvendor() {
            this.gpuvendor_ = Device.getDefaultInstance().getGpuvendor();
            onChanged();
            return this;
        }

        public Builder clearHeadset() {
            this.headset_ = false;
            onChanged();
            return this;
        }

        public Builder clearHeadsetname() {
            this.headsetname_ = Device.getDefaultInstance().getHeadsetname();
            onChanged();
            return this;
        }

        public Builder clearIfv() {
            this.ifv_ = Device.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder clearInputlanguage() {
            this.inputlanguage_ = o0.f19269e;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearJailbreak() {
            this.jailbreak_ = false;
            onChanged();
            return this;
        }

        public Builder clearLastbootup() {
            this.lastbootup_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearRingmute() {
            this.ringmute_ = false;
            onChanged();
            return this;
        }

        public Builder clearScreenbright() {
            this.screenbright_ = 0.0f;
            onChanged();
            return this;
        }

        public Builder clearTime() {
            this.time_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearTimezone() {
            this.timezone_ = Device.getDefaultInstance().getTimezone();
            onChanged();
            return this;
        }

        public Builder clearTotaldisk() {
            this.totaldisk_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearTotalmem() {
            this.totalmem_ = 0L;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getAccess() {
            Object obj = this.access_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.access_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getAccessBytes() {
            Object obj = this.access_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.access_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getAirplane() {
            return this.airplane_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public int getApilevel() {
            return this.apilevel_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public int getAtts() {
            return this.atts_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public Context.Device.AudioContext getAudioContext() {
            a2 a2Var = this.audioContextBuilder_;
            if (a2Var != null) {
                return (Context.Device.AudioContext) a2Var.e();
            }
            Context.Device.AudioContext audioContext = this.audioContext_;
            return audioContext == null ? Context.Device.AudioContext.getDefaultInstance() : audioContext;
        }

        public Context.Device.AudioContext.Builder getAudioContextBuilder() {
            onChanged();
            return (Context.Device.AudioContext.Builder) getAudioContextFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public Context.Device.AudioContextOrBuilder getAudioContextOrBuilder() {
            a2 a2Var = this.audioContextBuilder_;
            if (a2Var != null) {
                return (Context.Device.AudioContextOrBuilder) a2Var.f();
            }
            Context.Device.AudioContext audioContext = this.audioContext_;
            return audioContext == null ? Context.Device.AudioContext.getDefaultInstance() : audioContext;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public float getBatterylevel() {
            return this.batterylevel_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getBatterysaver() {
            return this.batterysaver_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getBmIfv() {
            Object obj = this.bmIfv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bmIfv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getBmIfvBytes() {
            Object obj = this.bmIfv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bmIfv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getCharging() {
            return this.charging_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public Context.Device.Connection getConnection() {
            a2 a2Var = this.connectionBuilder_;
            if (a2Var != null) {
                return (Context.Device.Connection) a2Var.e();
            }
            Context.Device.Connection connection = this.connection_;
            return connection == null ? Context.Device.Connection.getDefaultInstance() : connection;
        }

        public Context.Device.Connection.Builder getConnectionBuilder() {
            onChanged();
            return (Context.Device.Connection.Builder) getConnectionFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public Context.Device.ConnectionOrBuilder getConnectionOrBuilder() {
            a2 a2Var = this.connectionBuilder_;
            if (a2Var != null) {
                return (Context.Device.ConnectionOrBuilder) a2Var.f();
            }
            Context.Device.Connection connection = this.connection_;
            return connection == null ? Context.Device.Connection.getDefaultInstance() : connection;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getCpuname() {
            Object obj = this.cpuname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cpuname_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getCpunameBytes() {
            Object obj = this.cpuname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cpuname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getCpuvendor() {
            Object obj = this.cpuvendor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cpuvendor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getCpuvendorBytes() {
            Object obj = this.cpuvendor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cpuvendor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getDarkmode() {
            return this.darkmode_;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getDevicename() {
            Object obj = this.devicename_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.devicename_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getDevicenameBytes() {
            Object obj = this.devicename_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.devicename_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getDiskspace() {
            return this.diskspace_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getDnd() {
            return this.dnd_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getFreemem() {
            return this.freemem_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getGpuname() {
            Object obj = this.gpuname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gpuname_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getGpunameBytes() {
            Object obj = this.gpuname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gpuname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getGpuvendor() {
            Object obj = this.gpuvendor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gpuvendor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getGpuvendorBytes() {
            Object obj = this.gpuvendor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gpuvendor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getHeadset() {
            return this.headset_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getHeadsetname() {
            Object obj = this.headsetname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.headsetname_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getHeadsetnameBytes() {
            Object obj = this.headsetname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.headsetname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getIfv() {
            Object obj = this.ifv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getIfvBytes() {
            Object obj = this.ifv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getInputlanguage(int i10) {
            return (String) this.inputlanguage_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getInputlanguageBytes(int i10) {
            return this.inputlanguage_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public int getInputlanguageCount() {
            return this.inputlanguage_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getJailbreak() {
            return this.jailbreak_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getLastbootup() {
            return this.lastbootup_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getRingmute() {
            return this.ringmute_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public float getScreenbright() {
            return this.screenbright_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getTime() {
            return this.time_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getTimezone() {
            Object obj = this.timezone_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.timezone_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getTimezoneBytes() {
            Object obj = this.timezone_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.timezone_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getTotaldisk() {
            return this.totaldisk_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getTotalmem() {
            return this.totalmem_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean hasAudioContext() {
            return (this.audioContextBuilder_ == null && this.audioContext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean hasConnection() {
            return (this.connectionBuilder_ == null && this.connection_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_fieldAccessorTable.d(Device.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAudioContext(Context.Device.AudioContext audioContext) {
            a2 a2Var = this.audioContextBuilder_;
            if (a2Var != null) {
                a2Var.g(audioContext);
                return this;
            }
            Context.Device.AudioContext audioContext2 = this.audioContext_;
            if (audioContext2 != null) {
                this.audioContext_ = Context.Device.AudioContext.newBuilder(audioContext2).mergeFrom(audioContext).buildPartial();
            } else {
                this.audioContext_ = audioContext;
            }
            onChanged();
            return this;
        }

        public Builder mergeConnection(Context.Device.Connection connection) {
            a2 a2Var = this.connectionBuilder_;
            if (a2Var != null) {
                a2Var.g(connection);
                return this;
            }
            Context.Device.Connection connection2 = this.connection_;
            if (connection2 != null) {
                this.connection_ = Context.Device.Connection.newBuilder(connection2).mergeFrom(connection).buildPartial();
            } else {
                this.connection_ = connection;
            }
            onChanged();
            return this;
        }

        public Builder setAccess(String str) {
            str.getClass();
            this.access_ = str;
            onChanged();
            return this;
        }

        public Builder setAccessBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.access_ = byteString;
            onChanged();
            return this;
        }

        public Builder setAirplane(boolean z10) {
            this.airplane_ = z10;
            onChanged();
            return this;
        }

        public Builder setApilevel(int i10) {
            this.apilevel_ = i10;
            onChanged();
            return this;
        }

        public Builder setAtts(int i10) {
            this.atts_ = i10;
            onChanged();
            return this;
        }

        public Builder setAudioContext(Context.Device.AudioContext audioContext) {
            a2 a2Var = this.audioContextBuilder_;
            if (a2Var != null) {
                a2Var.i(audioContext);
                return this;
            }
            audioContext.getClass();
            this.audioContext_ = audioContext;
            onChanged();
            return this;
        }

        public Builder setBatterylevel(float f10) {
            this.batterylevel_ = f10;
            onChanged();
            return this;
        }

        public Builder setBatterysaver(boolean z10) {
            this.batterysaver_ = z10;
            onChanged();
            return this;
        }

        public Builder setBmIfv(String str) {
            str.getClass();
            this.bmIfv_ = str;
            onChanged();
            return this;
        }

        public Builder setBmIfvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bmIfv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCharging(boolean z10) {
            this.charging_ = z10;
            onChanged();
            return this;
        }

        public Builder setConnection(Context.Device.Connection connection) {
            a2 a2Var = this.connectionBuilder_;
            if (a2Var != null) {
                a2Var.i(connection);
                return this;
            }
            connection.getClass();
            this.connection_ = connection;
            onChanged();
            return this;
        }

        public Builder setCpuname(String str) {
            str.getClass();
            this.cpuname_ = str;
            onChanged();
            return this;
        }

        public Builder setCpunameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.cpuname_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCpuvendor(String str) {
            str.getClass();
            this.cpuvendor_ = str;
            onChanged();
            return this;
        }

        public Builder setCpuvendorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.cpuvendor_ = byteString;
            onChanged();
            return this;
        }

        public Builder setDarkmode(boolean z10) {
            this.darkmode_ = z10;
            onChanged();
            return this;
        }

        public Builder setDevicename(String str) {
            str.getClass();
            this.devicename_ = str;
            onChanged();
            return this;
        }

        public Builder setDevicenameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.devicename_ = byteString;
            onChanged();
            return this;
        }

        public Builder setDiskspace(long j10) {
            this.diskspace_ = j10;
            onChanged();
            return this;
        }

        public Builder setDnd(boolean z10) {
            this.dnd_ = z10;
            onChanged();
            return this;
        }

        public Builder setFreemem(long j10) {
            this.freemem_ = j10;
            onChanged();
            return this;
        }

        public Builder setGpuname(String str) {
            str.getClass();
            this.gpuname_ = str;
            onChanged();
            return this;
        }

        public Builder setGpunameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.gpuname_ = byteString;
            onChanged();
            return this;
        }

        public Builder setGpuvendor(String str) {
            str.getClass();
            this.gpuvendor_ = str;
            onChanged();
            return this;
        }

        public Builder setGpuvendorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.gpuvendor_ = byteString;
            onChanged();
            return this;
        }

        public Builder setHeadset(boolean z10) {
            this.headset_ = z10;
            onChanged();
            return this;
        }

        public Builder setHeadsetname(String str) {
            str.getClass();
            this.headsetname_ = str;
            onChanged();
            return this;
        }

        public Builder setHeadsetnameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.headsetname_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIfv(String str) {
            str.getClass();
            this.ifv_ = str;
            onChanged();
            return this;
        }

        public Builder setIfvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.ifv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setInputlanguage(int i10, String str) {
            str.getClass();
            ensureInputlanguageIsMutable();
            this.inputlanguage_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setJailbreak(boolean z10) {
            this.jailbreak_ = z10;
            onChanged();
            return this;
        }

        public Builder setLastbootup(long j10) {
            this.lastbootup_ = j10;
            onChanged();
            return this;
        }

        public Builder setRingmute(boolean z10) {
            this.ringmute_ = z10;
            onChanged();
            return this;
        }

        public Builder setScreenbright(float f10) {
            this.screenbright_ = f10;
            onChanged();
            return this;
        }

        public Builder setTime(long j10) {
            this.time_ = j10;
            onChanged();
            return this;
        }

        public Builder setTimezone(String str) {
            str.getClass();
            this.timezone_ = str;
            onChanged();
            return this;
        }

        public Builder setTimezoneBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.timezone_ = byteString;
            onChanged();
            return this;
        }

        public Builder setTotaldisk(long j10) {
            this.totaldisk_ = j10;
            onChanged();
            return this;
        }

        public Builder setTotalmem(long j10) {
            this.totalmem_ = j10;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public t1 getInputlanguageList() {
            return this.inputlanguage_.getUnmodifiableView();
        }

        private Builder() {
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.inputlanguage_ = o0.f19269e;
            this.devicename_ = "";
            this.access_ = "";
            this.headsetname_ = "";
            this.cpuname_ = "";
            this.cpuvendor_ = "";
            this.gpuname_ = "";
            this.gpuvendor_ = "";
            this.timezone_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Device build() {
            Device deviceBuildPartial = buildPartial();
            if (deviceBuildPartial.isInitialized()) {
                return deviceBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Device buildPartial() {
            Device device = new Device(this);
            device.ifv_ = this.ifv_;
            device.bmIfv_ = this.bmIfv_;
            if ((this.bitField0_ & 1) != 0) {
                this.inputlanguage_ = this.inputlanguage_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            device.inputlanguage_ = this.inputlanguage_;
            device.diskspace_ = this.diskspace_;
            device.totaldisk_ = this.totaldisk_;
            device.ringmute_ = this.ringmute_;
            device.charging_ = this.charging_;
            device.headset_ = this.headset_;
            device.batterylevel_ = this.batterylevel_;
            device.batterysaver_ = this.batterysaver_;
            device.darkmode_ = this.darkmode_;
            device.airplane_ = this.airplane_;
            device.dnd_ = this.dnd_;
            device.devicename_ = this.devicename_;
            device.time_ = this.time_;
            device.screenbright_ = this.screenbright_;
            device.jailbreak_ = this.jailbreak_;
            device.lastbootup_ = this.lastbootup_;
            device.access_ = this.access_;
            device.headsetname_ = this.headsetname_;
            device.totalmem_ = this.totalmem_;
            device.atts_ = this.atts_;
            device.cpuname_ = this.cpuname_;
            device.cpuvendor_ = this.cpuvendor_;
            device.gpuname_ = this.gpuname_;
            device.gpuvendor_ = this.gpuvendor_;
            device.timezone_ = this.timezone_;
            device.freemem_ = this.freemem_;
            device.apilevel_ = this.apilevel_;
            a2 a2Var = this.connectionBuilder_;
            if (a2Var == null) {
                device.connection_ = this.connection_;
            } else {
                device.connection_ = (Context.Device.Connection) a2Var.a();
            }
            a2 a2Var2 = this.audioContextBuilder_;
            if (a2Var2 == null) {
                device.audioContext_ = this.audioContext_;
            } else {
                device.audioContext_ = (Context.Device.AudioContext) a2Var2.a();
            }
            onBuilt();
            return device;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Device getDefaultInstanceForType() {
            return Device.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(r2 r2Var) {
            return (Builder) super.setUnknownFields(r2Var);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(r2 r2Var) {
            return (Builder) super.mergeUnknownFields(r2Var);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.inputlanguage_ = o0.f19269e;
            this.bitField0_ &= -2;
            this.diskspace_ = 0L;
            this.totaldisk_ = 0L;
            this.ringmute_ = false;
            this.charging_ = false;
            this.headset_ = false;
            this.batterylevel_ = 0.0f;
            this.batterysaver_ = false;
            this.darkmode_ = false;
            this.airplane_ = false;
            this.dnd_ = false;
            this.devicename_ = "";
            this.time_ = 0L;
            this.screenbright_ = 0.0f;
            this.jailbreak_ = false;
            this.lastbootup_ = 0L;
            this.access_ = "";
            this.headsetname_ = "";
            this.totalmem_ = 0L;
            this.atts_ = 0;
            this.cpuname_ = "";
            this.cpuvendor_ = "";
            this.gpuname_ = "";
            this.gpuvendor_ = "";
            this.timezone_ = "";
            this.freemem_ = 0L;
            this.apilevel_ = 0;
            if (this.connectionBuilder_ == null) {
                this.connection_ = null;
            } else {
                this.connection_ = null;
                this.connectionBuilder_ = null;
            }
            if (this.audioContextBuilder_ == null) {
                this.audioContext_ = null;
                return this;
            }
            this.audioContext_ = null;
            this.audioContextBuilder_ = null;
            return this;
        }

        public Builder setAudioContext(Context.Device.AudioContext.Builder builder) {
            a2 a2Var = this.audioContextBuilder_;
            if (a2Var == null) {
                this.audioContext_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setConnection(Context.Device.Connection.Builder builder) {
            a2 a2Var = this.connectionBuilder_;
            if (a2Var == null) {
                this.connection_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Device) {
                return mergeFrom((Device) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Device device) {
            if (device == Device.getDefaultInstance()) {
                return this;
            }
            if (!device.getIfv().isEmpty()) {
                this.ifv_ = device.ifv_;
                onChanged();
            }
            if (!device.getBmIfv().isEmpty()) {
                this.bmIfv_ = device.bmIfv_;
                onChanged();
            }
            if (!device.inputlanguage_.isEmpty()) {
                if (this.inputlanguage_.isEmpty()) {
                    this.inputlanguage_ = device.inputlanguage_;
                    this.bitField0_ &= -2;
                } else {
                    ensureInputlanguageIsMutable();
                    this.inputlanguage_.addAll(device.inputlanguage_);
                }
                onChanged();
            }
            if (device.getDiskspace() != 0) {
                setDiskspace(device.getDiskspace());
            }
            if (device.getTotaldisk() != 0) {
                setTotaldisk(device.getTotaldisk());
            }
            if (device.getRingmute()) {
                setRingmute(device.getRingmute());
            }
            if (device.getCharging()) {
                setCharging(device.getCharging());
            }
            if (device.getHeadset()) {
                setHeadset(device.getHeadset());
            }
            if (device.getBatterylevel() != 0.0f) {
                setBatterylevel(device.getBatterylevel());
            }
            if (device.getBatterysaver()) {
                setBatterysaver(device.getBatterysaver());
            }
            if (device.getDarkmode()) {
                setDarkmode(device.getDarkmode());
            }
            if (device.getAirplane()) {
                setAirplane(device.getAirplane());
            }
            if (device.getDnd()) {
                setDnd(device.getDnd());
            }
            if (!device.getDevicename().isEmpty()) {
                this.devicename_ = device.devicename_;
                onChanged();
            }
            if (device.getTime() != 0) {
                setTime(device.getTime());
            }
            if (device.getScreenbright() != 0.0f) {
                setScreenbright(device.getScreenbright());
            }
            if (device.getJailbreak()) {
                setJailbreak(device.getJailbreak());
            }
            if (device.getLastbootup() != 0) {
                setLastbootup(device.getLastbootup());
            }
            if (!device.getAccess().isEmpty()) {
                this.access_ = device.access_;
                onChanged();
            }
            if (!device.getHeadsetname().isEmpty()) {
                this.headsetname_ = device.headsetname_;
                onChanged();
            }
            if (device.getTotalmem() != 0) {
                setTotalmem(device.getTotalmem());
            }
            if (device.getAtts() != 0) {
                setAtts(device.getAtts());
            }
            if (!device.getCpuname().isEmpty()) {
                this.cpuname_ = device.cpuname_;
                onChanged();
            }
            if (!device.getCpuvendor().isEmpty()) {
                this.cpuvendor_ = device.cpuvendor_;
                onChanged();
            }
            if (!device.getGpuname().isEmpty()) {
                this.gpuname_ = device.gpuname_;
                onChanged();
            }
            if (!device.getGpuvendor().isEmpty()) {
                this.gpuvendor_ = device.gpuvendor_;
                onChanged();
            }
            if (!device.getTimezone().isEmpty()) {
                this.timezone_ = device.timezone_;
                onChanged();
            }
            if (device.getFreemem() != 0) {
                setFreemem(device.getFreemem());
            }
            if (device.getApilevel() != 0) {
                setApilevel(device.getApilevel());
            }
            if (device.hasConnection()) {
                mergeConnection(device.getConnection());
            }
            if (device.hasAudioContext()) {
                mergeAudioContext(device.getAudioContext());
            }
            mergeUnknownFields(((h0) device).unknownFields);
            onChanged();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.inputlanguage_ = o0.f19269e;
            this.devicename_ = "";
            this.access_ = "";
            this.headsetname_ = "";
            this.cpuname_ = "";
            this.cpuvendor_ = "";
            this.gpuname_ = "";
            this.gpuvendor_ = "";
            this.timezone_ = "";
            maybeForceBuilderInitialization();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.Device.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Device.access$3600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Device r3 = (io.bidmachine.protobuf.sdk.Device) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                io.bidmachine.protobuf.sdk.Device r4 = (io.bidmachine.protobuf.sdk.Device) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Device.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Device$Builder");
        }
    }

    public static Device getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Device) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Device) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
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
        if (!getIfv().equals(device.getIfv()) || !getBmIfv().equals(device.getBmIfv()) || !getInputlanguageList().equals(device.getInputlanguageList()) || getDiskspace() != device.getDiskspace() || getTotaldisk() != device.getTotaldisk() || getRingmute() != device.getRingmute() || getCharging() != device.getCharging() || getHeadset() != device.getHeadset() || Float.floatToIntBits(getBatterylevel()) != Float.floatToIntBits(device.getBatterylevel()) || getBatterysaver() != device.getBatterysaver() || getDarkmode() != device.getDarkmode() || getAirplane() != device.getAirplane() || getDnd() != device.getDnd() || !getDevicename().equals(device.getDevicename()) || getTime() != device.getTime() || Float.floatToIntBits(getScreenbright()) != Float.floatToIntBits(device.getScreenbright()) || getJailbreak() != device.getJailbreak() || getLastbootup() != device.getLastbootup() || !getAccess().equals(device.getAccess()) || !getHeadsetname().equals(device.getHeadsetname()) || getTotalmem() != device.getTotalmem() || getAtts() != device.getAtts() || !getCpuname().equals(device.getCpuname()) || !getCpuvendor().equals(device.getCpuvendor()) || !getGpuname().equals(device.getGpuname()) || !getGpuvendor().equals(device.getGpuvendor()) || !getTimezone().equals(device.getTimezone()) || getFreemem() != device.getFreemem() || getApilevel() != device.getApilevel() || hasConnection() != device.hasConnection()) {
            return false;
        }
        if ((!hasConnection() || getConnection().equals(device.getConnection())) && hasAudioContext() == device.hasAudioContext()) {
            return (!hasAudioContext() || getAudioContext().equals(device.getAudioContext())) && this.unknownFields.equals(device.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getAccess() {
        Object obj = this.access_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.access_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getAccessBytes() {
        Object obj = this.access_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.access_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getAirplane() {
        return this.airplane_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public int getApilevel() {
        return this.apilevel_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public int getAtts() {
        return this.atts_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public Context.Device.AudioContext getAudioContext() {
        Context.Device.AudioContext audioContext = this.audioContext_;
        return audioContext == null ? Context.Device.AudioContext.getDefaultInstance() : audioContext;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public Context.Device.AudioContextOrBuilder getAudioContextOrBuilder() {
        return getAudioContext();
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public float getBatterylevel() {
        return this.batterylevel_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getBatterysaver() {
        return this.batterysaver_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getBmIfv() {
        Object obj = this.bmIfv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bmIfv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getBmIfvBytes() {
        Object obj = this.bmIfv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bmIfv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getCharging() {
        return this.charging_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public Context.Device.Connection getConnection() {
        Context.Device.Connection connection = this.connection_;
        return connection == null ? Context.Device.Connection.getDefaultInstance() : connection;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public Context.Device.ConnectionOrBuilder getConnectionOrBuilder() {
        return getConnection();
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getCpuname() {
        Object obj = this.cpuname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cpuname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getCpunameBytes() {
        Object obj = this.cpuname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cpuname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getCpuvendor() {
        Object obj = this.cpuvendor_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cpuvendor_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getCpuvendorBytes() {
        Object obj = this.cpuvendor_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cpuvendor_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getDarkmode() {
        return this.darkmode_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getDevicename() {
        Object obj = this.devicename_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.devicename_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getDevicenameBytes() {
        Object obj = this.devicename_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.devicename_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getDiskspace() {
        return this.diskspace_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getDnd() {
        return this.dnd_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getFreemem() {
        return this.freemem_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getGpuname() {
        Object obj = this.gpuname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.gpuname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getGpunameBytes() {
        Object obj = this.gpuname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.gpuname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getGpuvendor() {
        Object obj = this.gpuvendor_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.gpuvendor_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getGpuvendorBytes() {
        Object obj = this.gpuvendor_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.gpuvendor_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getHeadset() {
        return this.headset_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getHeadsetname() {
        Object obj = this.headsetname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.headsetname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getHeadsetnameBytes() {
        Object obj = this.headsetname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.headsetname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getIfv() {
        Object obj = this.ifv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getIfvBytes() {
        Object obj = this.ifv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getInputlanguage(int i10) {
        return (String) this.inputlanguage_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getInputlanguageBytes(int i10) {
        return this.inputlanguage_.getByteString(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public int getInputlanguageCount() {
        return this.inputlanguage_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getJailbreak() {
        return this.jailbreak_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getLastbootup() {
        return this.lastbootup_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getRingmute() {
        return this.ringmute_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public float getScreenbright() {
        return this.screenbright_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getIfvBytes().isEmpty() ? h0.computeStringSize(1, this.ifv_) : 0;
        if (!getBmIfvBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.bmIfv_);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i11 = 0; i11 < this.inputlanguage_.size(); i11++) {
            iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.inputlanguage_.getRaw(i11));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + getInputlanguageList().size();
        long j10 = this.diskspace_;
        if (j10 != 0) {
            size += n.a0(4, j10);
        }
        long j11 = this.totaldisk_;
        if (j11 != 0) {
            size += n.a0(5, j11);
        }
        boolean z10 = this.ringmute_;
        if (z10) {
            size += n.e(6, z10);
        }
        boolean z11 = this.charging_;
        if (z11) {
            size += n.e(7, z11);
        }
        boolean z12 = this.headset_;
        if (z12) {
            size += n.e(8, z12);
        }
        float f10 = this.batterylevel_;
        if (f10 != 0.0f) {
            size += n.r(9, f10);
        }
        boolean z13 = this.batterysaver_;
        if (z13) {
            size += n.e(10, z13);
        }
        boolean z14 = this.darkmode_;
        if (z14) {
            size += n.e(11, z14);
        }
        boolean z15 = this.airplane_;
        if (z15) {
            size += n.e(12, z15);
        }
        boolean z16 = this.dnd_;
        if (z16) {
            size += n.e(13, z16);
        }
        if (!getDevicenameBytes().isEmpty()) {
            size += h0.computeStringSize(14, this.devicename_);
        }
        long j12 = this.time_;
        if (j12 != 0) {
            size += n.a0(15, j12);
        }
        float f11 = this.screenbright_;
        if (f11 != 0.0f) {
            size += n.r(16, f11);
        }
        boolean z17 = this.jailbreak_;
        if (z17) {
            size += n.e(17, z17);
        }
        long j13 = this.lastbootup_;
        if (j13 != 0) {
            size += n.a0(18, j13);
        }
        if (!getAccessBytes().isEmpty()) {
            size += h0.computeStringSize(19, this.access_);
        }
        if (!getHeadsetnameBytes().isEmpty()) {
            size += h0.computeStringSize(20, this.headsetname_);
        }
        long j14 = this.totalmem_;
        if (j14 != 0) {
            size += n.a0(21, j14);
        }
        int i12 = this.atts_;
        if (i12 != 0) {
            size += n.Y(22, i12);
        }
        if (this.connection_ != null) {
            size += n.G(23, getConnection());
        }
        if (this.audioContext_ != null) {
            size += n.G(24, getAudioContext());
        }
        if (!getCpunameBytes().isEmpty()) {
            size += h0.computeStringSize(25, this.cpuname_);
        }
        if (!getCpuvendorBytes().isEmpty()) {
            size += h0.computeStringSize(26, this.cpuvendor_);
        }
        if (!getGpunameBytes().isEmpty()) {
            size += h0.computeStringSize(27, this.gpuname_);
        }
        if (!getGpuvendorBytes().isEmpty()) {
            size += h0.computeStringSize(28, this.gpuvendor_);
        }
        if (!getTimezoneBytes().isEmpty()) {
            size += h0.computeStringSize(29, this.timezone_);
        }
        long j15 = this.freemem_;
        if (j15 != 0) {
            size += n.a0(30, j15);
        }
        int i13 = this.apilevel_;
        if (i13 != 0) {
            size += n.Y(31, i13);
        }
        int serializedSize = size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getTime() {
        return this.time_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getTimezone() {
        Object obj = this.timezone_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.timezone_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getTimezoneBytes() {
        Object obj = this.timezone_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.timezone_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getTotaldisk() {
        return this.totaldisk_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getTotalmem() {
        return this.totalmem_;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean hasAudioContext() {
        return this.audioContext_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean hasConnection() {
        return this.connection_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getIfv().hashCode()) * 37) + 2) * 53) + getBmIfv().hashCode();
        if (getInputlanguageCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getInputlanguageList().hashCode();
        }
        int i11 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 37) + 4) * 53) + j0.i(getDiskspace())) * 37) + 5) * 53) + j0.i(getTotaldisk())) * 37) + 6) * 53) + j0.d(getRingmute())) * 37) + 7) * 53) + j0.d(getCharging())) * 37) + 8) * 53) + j0.d(getHeadset())) * 37) + 9) * 53) + Float.floatToIntBits(getBatterylevel())) * 37) + 10) * 53) + j0.d(getBatterysaver())) * 37) + 11) * 53) + j0.d(getDarkmode())) * 37) + 12) * 53) + j0.d(getAirplane())) * 37) + 13) * 53) + j0.d(getDnd())) * 37) + 14) * 53) + getDevicename().hashCode()) * 37) + 15) * 53) + j0.i(getTime())) * 37) + 16) * 53) + Float.floatToIntBits(getScreenbright())) * 37) + 17) * 53) + j0.d(getJailbreak())) * 37) + 18) * 53) + j0.i(getLastbootup())) * 37) + 19) * 53) + getAccess().hashCode()) * 37) + 20) * 53) + getHeadsetname().hashCode()) * 37) + 21) * 53) + j0.i(getTotalmem())) * 37) + 22) * 53) + getAtts()) * 37) + 25) * 53) + getCpuname().hashCode()) * 37) + 26) * 53) + getCpuvendor().hashCode()) * 37) + 27) * 53) + getGpuname().hashCode()) * 37) + 28) * 53) + getGpuvendor().hashCode()) * 37) + 29) * 53) + getTimezone().hashCode()) * 37) + 30) * 53) + j0.i(getFreemem())) * 37) + 31) * 53) + getApilevel();
        if (hasConnection()) {
            i11 = (((i11 * 37) + 23) * 53) + getConnection().hashCode();
        }
        if (hasAudioContext()) {
            i11 = (((i11 * 37) + 24) * 53) + getAudioContext().hashCode();
        }
        int iHashCode2 = (i11 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_fieldAccessorTable.d(Device.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new Device();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getIfvBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.bmIfv_);
        }
        for (int i10 = 0; i10 < this.inputlanguage_.size(); i10++) {
            h0.writeString(nVar, 3, this.inputlanguage_.getRaw(i10));
        }
        long j10 = this.diskspace_;
        if (j10 != 0) {
            nVar.Y0(4, j10);
        }
        long j11 = this.totaldisk_;
        if (j11 != 0) {
            nVar.Y0(5, j11);
        }
        boolean z10 = this.ringmute_;
        if (z10) {
            nVar.n0(6, z10);
        }
        boolean z11 = this.charging_;
        if (z11) {
            nVar.n0(7, z11);
        }
        boolean z12 = this.headset_;
        if (z12) {
            nVar.n0(8, z12);
        }
        float f10 = this.batterylevel_;
        if (f10 != 0.0f) {
            nVar.B0(9, f10);
        }
        boolean z13 = this.batterysaver_;
        if (z13) {
            nVar.n0(10, z13);
        }
        boolean z14 = this.darkmode_;
        if (z14) {
            nVar.n0(11, z14);
        }
        boolean z15 = this.airplane_;
        if (z15) {
            nVar.n0(12, z15);
        }
        boolean z16 = this.dnd_;
        if (z16) {
            nVar.n0(13, z16);
        }
        if (!getDevicenameBytes().isEmpty()) {
            h0.writeString(nVar, 14, this.devicename_);
        }
        long j12 = this.time_;
        if (j12 != 0) {
            nVar.Y0(15, j12);
        }
        float f11 = this.screenbright_;
        if (f11 != 0.0f) {
            nVar.B0(16, f11);
        }
        boolean z17 = this.jailbreak_;
        if (z17) {
            nVar.n0(17, z17);
        }
        long j13 = this.lastbootup_;
        if (j13 != 0) {
            nVar.Y0(18, j13);
        }
        if (!getAccessBytes().isEmpty()) {
            h0.writeString(nVar, 19, this.access_);
        }
        if (!getHeadsetnameBytes().isEmpty()) {
            h0.writeString(nVar, 20, this.headsetname_);
        }
        long j14 = this.totalmem_;
        if (j14 != 0) {
            nVar.Y0(21, j14);
        }
        int i11 = this.atts_;
        if (i11 != 0) {
            nVar.W0(22, i11);
        }
        if (this.connection_ != null) {
            nVar.J0(23, getConnection());
        }
        if (this.audioContext_ != null) {
            nVar.J0(24, getAudioContext());
        }
        if (!getCpunameBytes().isEmpty()) {
            h0.writeString(nVar, 25, this.cpuname_);
        }
        if (!getCpuvendorBytes().isEmpty()) {
            h0.writeString(nVar, 26, this.cpuvendor_);
        }
        if (!getGpunameBytes().isEmpty()) {
            h0.writeString(nVar, 27, this.gpuname_);
        }
        if (!getGpuvendorBytes().isEmpty()) {
            h0.writeString(nVar, 28, this.gpuvendor_);
        }
        if (!getTimezoneBytes().isEmpty()) {
            h0.writeString(nVar, 29, this.timezone_);
        }
        long j15 = this.freemem_;
        if (j15 != 0) {
            nVar.Y0(30, j15);
        }
        int i12 = this.apilevel_;
        if (i12 != 0) {
            nVar.W0(31, i12);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static Builder newBuilder(Device device) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(device);
    }

    public static Device parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Device) PARSER.parseFrom(byteBuffer, wVar);
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public t1 getInputlanguageList() {
        return this.inputlanguage_;
    }

    private Device(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Device parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Device) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Device parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Device) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Device getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Device parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Device) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Device() {
        this.memoizedIsInitialized = (byte) -1;
        this.ifv_ = "";
        this.bmIfv_ = "";
        this.inputlanguage_ = o0.f19269e;
        this.devicename_ = "";
        this.access_ = "";
        this.headsetname_ = "";
        this.cpuname_ = "";
        this.cpuvendor_ = "";
        this.gpuname_ = "";
        this.gpuvendor_ = "";
        this.timezone_ = "";
    }

    public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Device) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Device parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Device) PARSER.parseFrom(bArr, wVar);
    }

    public static Device parseFrom(InputStream inputStream) throws IOException {
        return (Device) h0.parseWithIOException(PARSER, inputStream);
    }

    public static Device parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Device) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Device parseFrom(l lVar) throws IOException {
        return (Device) h0.parseWithIOException(PARSER, lVar);
    }

    public static Device parseFrom(l lVar, w wVar) throws IOException {
        return (Device) h0.parseWithIOException(PARSER, lVar, wVar);
    }

    private Device(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    switch (iK) {
                        case 0:
                            z10 = true;
                            break;
                        case 10:
                            this.ifv_ = lVar.J();
                            break;
                        case 18:
                            this.bmIfv_ = lVar.J();
                            break;
                        case 26:
                            String strJ = lVar.J();
                            z11 = z11;
                            if (!z11) {
                                this.inputlanguage_ = new o0();
                                z11 = true;
                            }
                            this.inputlanguage_.add(strJ);
                            break;
                        case 32:
                            this.diskspace_ = lVar.M();
                            break;
                        case 40:
                            this.totaldisk_ = lVar.M();
                            break;
                        case 48:
                            this.ringmute_ = lVar.q();
                            break;
                        case 56:
                            this.charging_ = lVar.q();
                            break;
                        case 64:
                            this.headset_ = lVar.q();
                            break;
                        case 77:
                            this.batterylevel_ = lVar.w();
                            break;
                        case 80:
                            this.batterysaver_ = lVar.q();
                            break;
                        case 88:
                            this.darkmode_ = lVar.q();
                            break;
                        case 96:
                            this.airplane_ = lVar.q();
                            break;
                        case 104:
                            this.dnd_ = lVar.q();
                            break;
                        case 114:
                            this.devicename_ = lVar.J();
                            break;
                        case 120:
                            this.time_ = lVar.M();
                            break;
                        case OMSDK_JS_WRITE_FAILED_VALUE:
                            this.screenbright_ = lVar.w();
                            break;
                        case 136:
                            this.jailbreak_ = lVar.q();
                            break;
                        case 144:
                            this.lastbootup_ = lVar.M();
                            break;
                        case 154:
                            this.access_ = lVar.J();
                            break;
                        case 162:
                            this.headsetname_ = lVar.J();
                            break;
                        case 168:
                            this.totalmem_ = lVar.M();
                            break;
                        case 176:
                            this.atts_ = lVar.L();
                            break;
                        case 186:
                            Context.Device.Connection connection = this.connection_;
                            Context.Device.Connection.Builder builder = connection != null ? connection.toBuilder() : null;
                            Context.Device.Connection connection2 = (Context.Device.Connection) lVar.A(Context.Device.Connection.parser(), wVar);
                            this.connection_ = connection2;
                            if (builder != null) {
                                builder.mergeFrom(connection2);
                                this.connection_ = builder.buildPartial();
                            }
                            break;
                        case 194:
                            Context.Device.AudioContext audioContext = this.audioContext_;
                            Context.Device.AudioContext.Builder builder2 = audioContext != null ? audioContext.toBuilder() : null;
                            Context.Device.AudioContext audioContext2 = (Context.Device.AudioContext) lVar.A(Context.Device.AudioContext.parser(), wVar);
                            this.audioContext_ = audioContext2;
                            if (builder2 != null) {
                                builder2.mergeFrom(audioContext2);
                                this.audioContext_ = builder2.buildPartial();
                            }
                            break;
                        case 202:
                            this.cpuname_ = lVar.J();
                            break;
                        case 210:
                            this.cpuvendor_ = lVar.J();
                            break;
                        case MRAID_JS_DOES_NOT_EXIST_VALUE:
                            this.gpuname_ = lVar.J();
                            break;
                        case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                            this.gpuvendor_ = lVar.J();
                            break;
                        case 234:
                            this.timezone_ = lVar.J();
                            break;
                        case 240:
                            this.freemem_ = lVar.M();
                            break;
                        case 248:
                            this.apilevel_ = lVar.L();
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
                if (z11) {
                    this.inputlanguage_ = this.inputlanguage_.getUnmodifiableView();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.inputlanguage_ = this.inputlanguage_.getUnmodifiableView();
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
