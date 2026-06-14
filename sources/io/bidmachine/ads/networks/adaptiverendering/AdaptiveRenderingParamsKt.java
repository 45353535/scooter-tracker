package io.bidmachine.ads.networks.adaptiverendering;

import id.c1;
import id.d0;
import id.e0;
import id.f1;
import id.u0;
import io.bidmachine.protobuf.rendering.Rendering;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/bidmachine/protobuf/rendering/Rendering$Orientation;", "Lid/u0;", "toOrientation", "(Lio/bidmachine/protobuf/rendering/Rendering$Orientation;)Lid/u0;", "Lio/bidmachine/protobuf/rendering/Rendering$CacheType;", "Lid/u;", "toCacheType", "(Lio/bidmachine/protobuf/rendering/Rendering$CacheType;)Lid/u;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$ViewComponentType;", "Lid/b;", "toAdElementType", "(Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$ViewComponentType;)Lid/b;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Layout$Constraint$Anchor;", "Lid/f1;", "toSideType", "(Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Layout$Constraint$Anchor;)Lid/f1;", "Lio/bidmachine/protobuf/rendering/Rendering$Image$ScaleType;", "Lid/c1;", "toScaleType", "(Lio/bidmachine/protobuf/rendering/Rendering$Image$ScaleType;)Lid/c1;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event$EventName;", "Lid/e0;", "toEventType", "(Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event$EventName;)Lid/e0;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event$Task$TaskName;", "Lid/d0;", "toEventTaskType", "(Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event$Task$TaskName;)Lid/d0;", "Lio/bidmachine/protobuf/rendering/Rendering$AdaptiveAnimation$Timing;", "", "getDurationMs", "(Lio/bidmachine/protobuf/rendering/Rendering$AdaptiveAnimation$Timing;)J", "bidmachine-android-sdk_bh_3_5_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingParamsKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;

        static {
            int[] iArr = new int[Rendering.Orientation.values().length];
            try {
                iArr[Rendering.Orientation.ORIENTATION_PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Rendering.Orientation.ORIENTATION_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Rendering.Orientation.ORIENTATION_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Rendering.Orientation.ORIENTATION_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Rendering.Orientation.UNRECOGNIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Rendering.CacheType.values().length];
            try {
                iArr2[Rendering.CacheType.CACHE_TYPE_FULL_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Rendering.CacheType.CACHE_TYPE_PARTIAL_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Rendering.CacheType.CACHE_TYPE_STREAM_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Rendering.CacheType.CACHE_TYPE_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Rendering.CacheType.UNRECOGNIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Rendering.Phase.ViewComponent.ViewComponentType.values().length];
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_MRAID.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_LABEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_COUNTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_PROGRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.values().length];
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[Rendering.Image.ScaleType.values().length];
            try {
                iArr5[Rendering.Image.ScaleType.SCALE_TYPE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[Rendering.Image.ScaleType.SCALE_TYPE_TO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[Rendering.Image.ScaleType.SCALE_TYPE_ASPECT_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[Rendering.Image.ScaleType.SCALE_TYPE_ASPECT_FIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[Rendering.Phase.Event.EventName.values().length];
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_IMPRESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_NAVIGATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_MUTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_UNMUTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_PAUSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_RESUME.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_SKIP.ordinal()] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLOSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_START.ordinal()] = 11;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_FIRST_QUARTILE.ordinal()] = 12;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_MIDPOINT.ordinal()] = 13;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_THIRD_QUARTILE.ordinal()] = 14;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_COMPLETE.ordinal()] = 15;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_USE_CUSTOM_CLOSE.ordinal()] = 16;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_SCHEDULED.ordinal()] = 17;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_EXPAND.ordinal()] = 18;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_COLLAPSE.ordinal()] = 19;
            } catch (NoSuchFieldError unused43) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[Rendering.Phase.Event.Task.TaskName.values().length];
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_MUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_UNMUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_TRACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SKIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_OPEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SHOW.ordinal()] = 8;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_HIDE.ordinal()] = 9;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_PROGRESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SCHEDULE.ordinal()] = 11;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_LOCK_VISIBILITY.ordinal()] = 12;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_UNLOCK_VISIBILITY.ordinal()] = 13;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_NOTIFY_OPEN.ordinal()] = 14;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SIMULATE_CLICK.ordinal()] = 15;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_PRIVACY_SHEET.ordinal()] = 16;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_REPEAT.ordinal()] = 17;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_TOGGLE_STATE_GROUPS.ordinal()] = 18;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_EXPAND.ordinal()] = 19;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_COLLAPSE.ordinal()] = 20;
            } catch (NoSuchFieldError unused63) {
            }
            $EnumSwitchMapping$6 = iArr7;
        }
    }

    public static final long getDurationMs(@NotNull Rendering.AdaptiveAnimation.Timing timing) {
        Intrinsics.checkNotNullParameter(timing, "<this>");
        return zf.a.e(timing.getDuration() * ((double) 1000));
    }

    @Nullable
    public static final id.b toAdElementType(@Nullable final Rendering.Phase.ViewComponent.ViewComponentType viewComponentType) {
        if (viewComponentType == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$2[viewComponentType.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.x
                    @Override // ce.b
                    public final Object get() {
                        return AdaptiveRenderingParamsKt.toAdElementType$lambda$4(viewComponentType);
                    }
                });
                break;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toAdElementType$lambda$4(Rendering.Phase.ViewComponent.ViewComponentType viewComponentType) {
        return "Unsupported ViewComponentType - " + viewComponentType.name();
    }

    @Nullable
    public static final id.u toCacheType(@Nullable final Rendering.CacheType cacheType) {
        if (cacheType == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$1[cacheType.ordinal()];
        if (i10 == 1) {
            return id.u.FullLoad;
        }
        if (i10 == 2) {
            return id.u.PartialLoad;
        }
        if (i10 == 3) {
            return id.u.StreamLoad;
        }
        if (i10 == 4 || i10 == 5) {
            io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.v
                @Override // ce.b
                public final Object get() {
                    return AdaptiveRenderingParamsKt.toCacheType$lambda$2(cacheType);
                }
            });
            return null;
        }
        io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.w
            @Override // ce.b
            public final Object get() {
                return AdaptiveRenderingParamsKt.toCacheType$lambda$3(cacheType);
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toCacheType$lambda$2(Rendering.CacheType cacheType) {
        return "Unsupported CacheType - " + cacheType.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toCacheType$lambda$3(Rendering.CacheType cacheType) {
        return "Unsupported CacheType - " + cacheType.name();
    }

    @Nullable
    public static final d0 toEventTaskType(@Nullable final Rendering.Phase.Event.Task.TaskName taskName) {
        if (taskName == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$6[taskName.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            default:
                io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.u
                    @Override // ce.b
                    public final Object get() {
                        return AdaptiveRenderingParamsKt.toEventTaskType$lambda$8(taskName);
                    }
                });
                break;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toEventTaskType$lambda$8(Rendering.Phase.Event.Task.TaskName taskName) {
        return "Unsupported TaskName - " + taskName.name();
    }

    @Nullable
    public static final e0 toEventType(@Nullable final Rendering.Phase.Event.EventName eventName) {
        if (eventName == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$5[eventName.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.y
                    @Override // ce.b
                    public final Object get() {
                        return AdaptiveRenderingParamsKt.toEventType$lambda$7(eventName);
                    }
                });
                break;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toEventType$lambda$7(Rendering.Phase.Event.EventName eventName) {
        return "Unsupported EventName - " + eventName.name();
    }

    @Nullable
    public static final u0 toOrientation(@Nullable final Rendering.Orientation orientation) {
        if (orientation == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i10 == 1) {
            return u0.Portrait;
        }
        if (i10 == 2) {
            return u0.Landscape;
        }
        if (i10 != 3) {
            if (i10 != 4 && i10 != 5) {
                io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.a0
                    @Override // ce.b
                    public final Object get() {
                        return AdaptiveRenderingParamsKt.toOrientation$lambda$1(orientation);
                    }
                });
                return null;
            }
            io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.z
                @Override // ce.b
                public final Object get() {
                    return AdaptiveRenderingParamsKt.toOrientation$lambda$0(orientation);
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toOrientation$lambda$0(Rendering.Orientation orientation) {
        return "Unsupported Orientation - " + orientation.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toOrientation$lambda$1(Rendering.Orientation orientation) {
        return "Unsupported Orientation - " + orientation.name();
    }

    @Nullable
    public static final c1 toScaleType(@Nullable final Rendering.Image.ScaleType scaleType) {
        if (scaleType == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$4[scaleType.ordinal()];
        if (i10 == 1) {
            return c1.None;
        }
        if (i10 == 2) {
            return c1.ToFill;
        }
        if (i10 == 3) {
            return c1.AspectFill;
        }
        if (i10 == 4) {
            return c1.AspectFit;
        }
        io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.s
            @Override // ce.b
            public final Object get() {
                return AdaptiveRenderingParamsKt.toScaleType$lambda$6(scaleType);
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toScaleType$lambda$6(Rendering.Image.ScaleType scaleType) {
        return "Unsupported ScaleType - " + scaleType.name();
    }

    @Nullable
    public static final f1 toSideType(@Nullable final Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor) {
        if (anchor == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$3[anchor.ordinal()];
        if (i10 == 1) {
            return f1.Left;
        }
        if (i10 == 2) {
            return f1.Right;
        }
        if (i10 == 3) {
            return f1.Top;
        }
        if (i10 == 4) {
            return f1.Bottom;
        }
        io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.t
            @Override // ce.b
            public final Object get() {
                return AdaptiveRenderingParamsKt.toSideType$lambda$5(anchor);
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toSideType$lambda$5(Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor) {
        return "Unsupported Anchor for SideType - " + anchor.name();
    }
}
