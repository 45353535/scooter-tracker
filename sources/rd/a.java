package rd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements i {
    @Override // rd.i
    public Object a(String str, Object obj) {
        Object objC;
        return (str == null || (objC = c(str)) == null) ? obj : objC;
    }

    protected abstract Object b(Object obj);

    protected abstract Object c(String str);

    public Object d(Object obj, Object obj2) {
        Object objB;
        return (obj == null || (objB = b(obj)) == null) ? obj2 : objB;
    }
}
