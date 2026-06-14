package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CrashlyticsReport.Session.Event.Application.Execution f32506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f32508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f32509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CrashlyticsReport.Session.Event.Application.ProcessDetails f32510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f32511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f32512g;

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CrashlyticsReport.Session.Event.Application.Execution f32513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f32514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f32515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f32516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CrashlyticsReport.Session.Event.Application.ProcessDetails f32517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f32518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f32519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f32520h;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application build() {
            CrashlyticsReport.Session.Event.Application.Execution execution;
            if (this.f32520h == 1 && (execution = this.f32513a) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(execution, this.f32514b, this.f32515c, this.f32516d, this.f32517e, this.f32518f, this.f32519g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32513a == null) {
                sb2.append(" execution");
            }
            if ((1 & this.f32520h) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setAppProcessDetails(@Nullable List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list) {
            this.f32518f = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setBackground(@Nullable Boolean bool) {
            this.f32516d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setCurrentProcessDetails(@Nullable CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails) {
            this.f32517e = processDetails;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(List<CrashlyticsReport.CustomAttribute> list) {
            this.f32514b = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setExecution(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution == null) {
                throw new NullPointerException("Null execution");
            }
            this.f32513a = execution;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(List<CrashlyticsReport.CustomAttribute> list) {
            this.f32515c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i10) {
            this.f32519g = i10;
            this.f32520h = (byte) (this.f32520h | 1);
            return this;
        }

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event.Application application) {
            this.f32513a = application.getExecution();
            this.f32514b = application.getCustomAttributes();
            this.f32515c = application.getInternalKeys();
            this.f32516d = application.getBackground();
            this.f32517e = application.getCurrentProcessDetails();
            this.f32518f = application.getAppProcessDetails();
            this.f32519g = application.getUiOrientation();
            this.f32520h = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application) {
            CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
            if (this.f32506a.equals(application.getExecution()) && ((list = this.f32507b) != null ? list.equals(application.getCustomAttributes()) : application.getCustomAttributes() == null) && ((list2 = this.f32508c) != null ? list2.equals(application.getInternalKeys()) : application.getInternalKeys() == null) && ((bool = this.f32509d) != null ? bool.equals(application.getBackground()) : application.getBackground() == null) && ((processDetails = this.f32510e) != null ? processDetails.equals(application.getCurrentProcessDetails()) : application.getCurrentProcessDetails() == null) && ((list3 = this.f32511f) != null ? list3.equals(application.getAppProcessDetails()) : application.getAppProcessDetails() == null) && this.f32512g == application.getUiOrientation()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public List<CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails() {
        return this.f32511f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public Boolean getBackground() {
        return this.f32509d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails() {
        return this.f32510e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public List<CrashlyticsReport.CustomAttribute> getCustomAttributes() {
        return this.f32507b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @NonNull
    public CrashlyticsReport.Session.Event.Application.Execution getExecution() {
        return this.f32506a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public List<CrashlyticsReport.CustomAttribute> getInternalKeys() {
        return this.f32508c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public int getUiOrientation() {
        return this.f32512g;
    }

    public int hashCode() {
        int iHashCode = (this.f32506a.hashCode() ^ 1000003) * 1000003;
        List list = this.f32507b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f32508c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f32509d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.f32510e;
        int iHashCode5 = (iHashCode4 ^ (processDetails == null ? 0 : processDetails.hashCode())) * 1000003;
        List list3 = this.f32511f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f32512g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "Application{execution=" + this.f32506a + ", customAttributes=" + this.f32507b + ", internalKeys=" + this.f32508c + ", background=" + this.f32509d + ", currentProcessDetails=" + this.f32510e + ", appProcessDetails=" + this.f32511f + ", uiOrientation=" + this.f32512g + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution, List list, List list2, Boolean bool, CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, List list3, int i10) {
        this.f32506a = execution;
        this.f32507b = list;
        this.f32508c = list2;
        this.f32509d = bool;
        this.f32510e = processDetails;
        this.f32511f = list3;
        this.f32512g = i10;
    }
}
