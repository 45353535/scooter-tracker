package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.TransportRuntimeComponent;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;

/* JADX INFO: loaded from: classes7.dex */
@DaggerGenerated
final class DaggerTransportRuntimeComponent {

    private static final class Builder implements TransportRuntimeComponent.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f24341a;

        private Builder() {
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public TransportRuntimeComponent build() {
            Preconditions.checkBuilderRequirement(this.f24341a, Context.class);
            return new TransportRuntimeComponentImpl(this.f24341a);
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public Builder setApplicationContext(Context context) {
            this.f24341a = (Context) Preconditions.checkNotNull(context);
            return this;
        }
    }

    private static final class TransportRuntimeComponentImpl extends TransportRuntimeComponent {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TransportRuntimeComponentImpl f24342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private kf.a f24343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private kf.a f24344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private kf.a f24345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private kf.a f24346f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private kf.a f24347g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private kf.a f24348h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private kf.a f24349i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private kf.a f24350j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private kf.a f24351k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private kf.a f24352l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private kf.a f24353m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private kf.a f24354n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private kf.a f24355o;

        private void o(Context context) {
            this.f24343c = DoubleCheck.provider(ExecutionModule_ExecutorFactory.create());
            Factory factoryCreate = InstanceFactory.create(context);
            this.f24344d = factoryCreate;
            CreationContextFactory_Factory creationContextFactory_FactoryCreate = CreationContextFactory_Factory.create(factoryCreate, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create());
            this.f24345e = creationContextFactory_FactoryCreate;
            this.f24346f = DoubleCheck.provider(MetadataBackendRegistry_Factory.create(this.f24344d, creationContextFactory_FactoryCreate));
            this.f24347g = SchemaManager_Factory.create(this.f24344d, EventStoreModule_DbNameFactory.create(), EventStoreModule_SchemaVersionFactory.create());
            this.f24348h = DoubleCheck.provider(EventStoreModule_PackageNameFactory.create(this.f24344d));
            this.f24349i = DoubleCheck.provider(SQLiteEventStore_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), EventStoreModule_StoreConfigFactory.create(), this.f24347g, this.f24348h));
            SchedulingConfigModule_ConfigFactory schedulingConfigModule_ConfigFactoryCreate = SchedulingConfigModule_ConfigFactory.create(TimeModule_EventClockFactory.create());
            this.f24350j = schedulingConfigModule_ConfigFactoryCreate;
            SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactoryCreate = SchedulingModule_WorkSchedulerFactory.create(this.f24344d, this.f24349i, schedulingConfigModule_ConfigFactoryCreate, TimeModule_UptimeClockFactory.create());
            this.f24351k = schedulingModule_WorkSchedulerFactoryCreate;
            kf.a aVar = this.f24343c;
            kf.a aVar2 = this.f24346f;
            kf.a aVar3 = this.f24349i;
            this.f24352l = DefaultScheduler_Factory.create(aVar, aVar2, schedulingModule_WorkSchedulerFactoryCreate, aVar3, aVar3);
            kf.a aVar4 = this.f24344d;
            kf.a aVar5 = this.f24346f;
            kf.a aVar6 = this.f24349i;
            this.f24353m = Uploader_Factory.create(aVar4, aVar5, aVar6, this.f24351k, this.f24343c, aVar6, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.f24349i);
            kf.a aVar7 = this.f24343c;
            kf.a aVar8 = this.f24349i;
            this.f24354n = WorkInitializer_Factory.create(aVar7, aVar8, this.f24351k, aVar8);
            this.f24355o = DoubleCheck.provider(TransportRuntime_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.f24352l, this.f24353m, this.f24354n));
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        EventStore m() {
            return (EventStore) this.f24349i.get();
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        TransportRuntime n() {
            return (TransportRuntime) this.f24355o.get();
        }

        private TransportRuntimeComponentImpl(Context context) {
            this.f24342b = this;
            o(context);
        }
    }

    public static TransportRuntimeComponent.Builder builder() {
        return new Builder();
    }
}
