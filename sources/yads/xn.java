package yads;

/* JADX INFO: loaded from: classes4.dex */
public class xn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u92 f117908a;

    public xn(su1 su1Var) {
        this.f117908a = su1Var;
        su1Var.setId(2);
    }

    public void a(String str) {
        u92 u92Var = this.f117908a;
        u92Var.loadDataWithBaseURL("https://yandex.ru", u92Var.a(str), "text/html", "UTF-8", null);
    }
}
