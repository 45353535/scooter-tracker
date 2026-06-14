package io.bidmachine;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Size;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.sdk.Device;
import j$.util.Objects;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f82018a;

    public x3(y2 y2Var) {
        this.f82018a = y2Var;
    }

    private Device.Builder c(Context context, zb.d dVar) {
        try {
            Device.Builder builderNewBuilder = Device.newBuilder();
            e(context, builderNewBuilder, dVar);
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private Context.Device.Builder d(android.content.Context context, TargetingParams targetingParams, TargetingParams targetingParams2, zb.d dVar, ConnectionType connectionType) {
        try {
            Context.Device.Builder builderNewBuilder = Context.Device.newBuilder();
            f(context, builderNewBuilder, targetingParams, targetingParams2, dVar, connectionType);
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void e(android.content.Context context, final Device.Builder builder, zb.d dVar) throws Throwable {
        j2 j2VarE = j2.e();
        String strJ = j2VarE.j();
        Objects.requireNonNull(builder);
        io.bidmachine.core.h.E(strJ, new Executable() { // from class: io.bidmachine.t3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setIfv((String) obj);
            }
        });
        builder.setBmIfv(j2VarE.G(context));
        Set setE = ae.c.e(context);
        if (!setE.isEmpty()) {
            builder.addAllInputlanguage(setE);
        }
        io.bidmachine.core.h.F(ae.c.s(context), new Executable() { // from class: io.bidmachine.e3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setCharging(((Boolean) obj).booleanValue());
            }
        });
        io.bidmachine.core.h.F(ae.b.d(context), new Executable() { // from class: io.bidmachine.f3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setHeadset(((Boolean) obj).booleanValue());
            }
        });
        Double dA = ae.c.a(context);
        if (dA != null) {
            builder.setBatterylevel(dA.floatValue());
        }
        io.bidmachine.core.h.F(ae.c.r(context), new Executable() { // from class: io.bidmachine.g3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setBatterysaver(((Boolean) obj).booleanValue());
            }
        });
        builder.setDarkmode(ae.c.t(context));
        io.bidmachine.core.h.F(ae.c.q(context), new Executable() { // from class: io.bidmachine.h3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setAirplane(((Boolean) obj).booleanValue());
            }
        });
        io.bidmachine.core.h.F(ae.c.u(context), new Executable() { // from class: io.bidmachine.i3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setDnd(((Boolean) obj).booleanValue());
            }
        });
        if (dVar.c()) {
            io.bidmachine.core.h.E(ae.c.c(context), new Executable() { // from class: io.bidmachine.j3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setDevicename((String) obj);
                }
            });
            this.f82018a.b(context, builder, ae.c.b(context));
        }
        Double dK = ae.c.k(context);
        if (dK != null) {
            builder.setScreenbright(dK.floatValue());
        }
        builder.setLastbootup(SystemClock.elapsedRealtime());
        Set setC = ae.b.c(context);
        if (setC != null && !setC.isEmpty()) {
            io.bidmachine.core.h.F((String) setC.iterator().next(), new Executable() { // from class: io.bidmachine.k3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setHeadsetname((String) obj);
                }
            });
        }
        builder.setApilevel(Build.VERSION.SDK_INT);
        builder.setTime(io.bidmachine.core.c.a());
        io.bidmachine.core.h.E(io.bidmachine.core.c.b(), new Executable() { // from class: io.bidmachine.m3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setTimezone((String) obj);
            }
        });
        DeviceInfo deviceInfoObtain = DeviceInfo.obtain(context);
        if (deviceInfoObtain.getAvailableDiskSpaceInMB() != null) {
            builder.setDiskspace(r0.intValue());
        }
        if (deviceInfoObtain.getTotalDiskSpaceInMB() != null) {
            builder.setTotaldisk(r0.intValue());
        }
        builder.setJailbreak(deviceInfoObtain.isDeviceRooted());
        io.bidmachine.core.h.F(deviceInfoObtain.getAudio().c(context), new Executable() { // from class: io.bidmachine.n3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setRingmute(((Boolean) obj).booleanValue());
            }
        });
        Float fB = deviceInfoObtain.getAudio().b(context);
        if (fB != null) {
            builder.setAudioContext(Context.Device.AudioContext.newBuilder().setVolumelevel(fB.floatValue()).build());
        }
        deviceInfoObtain.updateHwInfo(context);
        io.bidmachine.core.h.F(deviceInfoObtain.getRam().c(), new Executable() { // from class: io.bidmachine.u3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setTotalmem(((Long) obj).longValue());
            }
        });
        io.bidmachine.core.h.F(deviceInfoObtain.getRam().b(), new Executable() { // from class: io.bidmachine.v3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setFreemem(((Long) obj).longValue());
            }
        });
        io.bidmachine.core.h.E(deviceInfoObtain.getCpu().c(), new Executable() { // from class: io.bidmachine.w3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setCpuname((String) obj);
            }
        });
        io.bidmachine.core.h.E(deviceInfoObtain.getCpu().d(), new Executable() { // from class: io.bidmachine.b3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setCpuvendor((String) obj);
            }
        });
        io.bidmachine.core.h.E(deviceInfoObtain.getGpu().f(), new Executable() { // from class: io.bidmachine.c3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setGpuname((String) obj);
            }
        });
        io.bidmachine.core.h.E(deviceInfoObtain.getGpu().g(), new Executable() { // from class: io.bidmachine.d3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setGpuvendor((String) obj);
            }
        });
    }

    private void f(android.content.Context context, final Context.Device.Builder builder, TargetingParams targetingParams, TargetingParams targetingParams2, zb.d dVar, ConnectionType connectionType) {
        DeviceInfo deviceInfoObtain = DeviceInfo.obtain(context);
        builder.setType(deviceInfoObtain.isTablet ? DeviceType.DEVICE_TYPE_TABLET : DeviceType.DEVICE_TYPE_PHONE_DEVICE);
        builder.setOs(OS.OS_ANDROID);
        builder.setOsv(ae.c.h());
        builder.setPxratio(deviceInfoObtain.screenDensity);
        builder.setPpi(deviceInfoObtain.screenDpi);
        Size sizeB = io.bidmachine.core.h.B(context);
        builder.setW(sizeB.getWidth());
        builder.setH(sizeB.getHeight());
        builder.setIfa(AdvertisingDataManager.a(context, !dVar.e()));
        builder.setLmt(AdvertisingDataManager.b());
        if (dVar.c()) {
            if (connectionType == null) {
                connectionType = ae.c.b(context);
            }
            builder.setContype(connectionType);
            builder.setMake(ae.c.f());
            io.bidmachine.core.h.E(UserAgentManager.getUserAgent(context), new Executable() { // from class: io.bidmachine.a3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setUa((String) obj);
                }
            });
            io.bidmachine.core.h.F(deviceInfoObtain.model, new Executable() { // from class: io.bidmachine.l3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setModel((String) obj);
                }
            });
            io.bidmachine.core.h.F(deviceInfoObtain.getHWV(), new Executable() { // from class: io.bidmachine.p3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setHwv((String) obj);
                }
            });
            io.bidmachine.core.h.E(Locale.getDefault().getLanguage(), new Executable() { // from class: io.bidmachine.q3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setLang((String) obj);
                }
            });
            io.bidmachine.core.h.E(deviceInfoObtain.phoneMCCMNC, new Executable() { // from class: io.bidmachine.r3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setMccmnc((String) obj);
                }
            });
            io.bidmachine.core.h.E(deviceInfoObtain.phoneCarrier, new Executable() { // from class: io.bidmachine.s3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setCarrier((String) obj);
                }
            });
            this.f82018a.a(context, builder, connectionType);
        }
        if (dVar.f()) {
            builder.setGeo(ae.f.c(context, targetingParams.getDeviceLocation(), targetingParams2.getDeviceLocation(), true));
        }
    }

    void a(android.content.Context context, Context.Builder builder, TargetingParams targetingParams, TargetingParams targetingParams2, zb.d dVar, ConnectionType connectionType) {
        Context.Device.Builder builderD = d(context, targetingParams, targetingParams2, dVar, connectionType);
        if (builderD != null) {
            Device.Builder builderC = c(context, dVar);
            if (builderC != null) {
                builderD.addExtProto(Any.pack(builderC.build()));
            }
            builder.setDevice(builderD);
        }
    }

    void b(android.content.Context context, final RequestTokenPayload.Builder builder, zb.d dVar) {
        Device.Builder builderC = c(context, dVar);
        Objects.requireNonNull(builder);
        io.bidmachine.core.h.F(builderC, new Executable() { // from class: io.bidmachine.o3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setDeviceData((Device.Builder) obj);
            }
        });
    }
}
