package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f83265a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f83266b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f83267c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f83268d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f83269e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f83270f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f83271g = "Report a Bug";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CharSequence f83272h = "Send Bug Report";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f83273i = "Cancel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f83274j = "Name";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f83275k = "Your Name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CharSequence f83276l = "Email";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CharSequence f83277m = "your.email@example.org";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f83278n = " (Required)";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f83279o = "Description";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f83280p = "What's the bug? What did you expect?";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f83281q = "Thank you for your report!";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f83282r;

    public interface a {
    }

    public b7(a aVar) {
        this.f83282r = aVar;
    }

    public boolean a() {
        return this.f83267c;
    }

    public boolean b() {
        return this.f83265a;
    }

    public boolean c() {
        return this.f83270f;
    }

    public boolean d() {
        return this.f83268d;
    }

    public boolean e() {
        return this.f83266b;
    }

    public boolean f() {
        return this.f83269e;
    }

    public void g(a aVar) {
        this.f83282r = aVar;
    }

    public void h(boolean z10) {
        this.f83267c = z10;
    }

    public void i(boolean z10) {
        this.f83265a = z10;
    }

    public void j(boolean z10) {
        this.f83270f = z10;
    }

    public void k(boolean z10) {
        this.f83268d = z10;
    }

    public void l(boolean z10) {
        this.f83266b = z10;
    }

    public void m(boolean z10) {
        this.f83269e = z10;
    }

    public String toString() {
        return "SentryFeedbackOptions{isNameRequired=" + this.f83265a + ", showName=" + this.f83266b + ", isEmailRequired=" + this.f83267c + ", showEmail=" + this.f83268d + ", useSentryUser=" + this.f83269e + ", showBranding=" + this.f83270f + ", formTitle='" + ((Object) this.f83271g) + "', submitButtonLabel='" + ((Object) this.f83272h) + "', cancelButtonLabel='" + ((Object) this.f83273i) + "', nameLabel='" + ((Object) this.f83274j) + "', namePlaceholder='" + ((Object) this.f83275k) + "', emailLabel='" + ((Object) this.f83276l) + "', emailPlaceholder='" + ((Object) this.f83277m) + "', isRequiredLabel='" + ((Object) this.f83278n) + "', messageLabel='" + ((Object) this.f83279o) + "', messagePlaceholder='" + ((Object) this.f83280p) + "'}";
    }
}
