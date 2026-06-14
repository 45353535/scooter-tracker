package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;

/* JADX INFO: loaded from: classes7.dex */
public class a2 implements AbstractMessage.BuilderParent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractMessage.BuilderParent f18780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractMessage.Builder f18781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractMessage f18782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18783d;

    public a2(AbstractMessage abstractMessage, AbstractMessage.BuilderParent builderParent, boolean z10) {
        this.f18782c = (AbstractMessage) j0.a(abstractMessage);
        this.f18780a = builderParent;
        this.f18783d = z10;
    }

    private void h() {
        AbstractMessage.BuilderParent builderParent;
        if (this.f18781b != null) {
            this.f18782c = null;
        }
        if (!this.f18783d || (builderParent = this.f18780a) == null) {
            return;
        }
        builderParent.markDirty();
        this.f18783d = false;
    }

    public AbstractMessage a() {
        this.f18783d = true;
        return e();
    }

    public a2 b() {
        AbstractMessage abstractMessage = this.f18782c;
        this.f18782c = (AbstractMessage) (abstractMessage != null ? abstractMessage.getDefaultInstanceForType() : this.f18781b.getDefaultInstanceForType());
        AbstractMessage.Builder builder = this.f18781b;
        if (builder != null) {
            builder.dispose();
            this.f18781b = null;
        }
        h();
        return this;
    }

    public void c() {
        this.f18780a = null;
    }

    public AbstractMessage.Builder d() {
        if (this.f18781b == null) {
            AbstractMessage.Builder builder = (AbstractMessage.Builder) this.f18782c.newBuilderForType(this);
            this.f18781b = builder;
            builder.mergeFrom((Message) this.f18782c);
            this.f18781b.markClean();
        }
        return this.f18781b;
    }

    public AbstractMessage e() {
        if (this.f18782c == null) {
            this.f18782c = (AbstractMessage) this.f18781b.buildPartial();
        }
        return this.f18782c;
    }

    public MessageOrBuilder f() {
        AbstractMessage.Builder builder = this.f18781b;
        return builder != null ? builder : this.f18782c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.explorestack.protobuf.a2 g(com.explorestack.protobuf.AbstractMessage r3) {
        /*
            r2 = this;
            com.explorestack.protobuf.AbstractMessage$Builder r0 = r2.f18781b
            if (r0 != 0) goto Lf
            com.explorestack.protobuf.AbstractMessage r0 = r2.f18782c
            com.explorestack.protobuf.Message r1 = r0.getDefaultInstanceForType()
            if (r0 != r1) goto Lf
            r2.f18782c = r3
            goto L16
        Lf:
            com.explorestack.protobuf.AbstractMessage$Builder r0 = r2.d()
            r0.mergeFrom(r3)
        L16:
            r2.h()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.a2.g(com.explorestack.protobuf.AbstractMessage):com.explorestack.protobuf.a2");
    }

    public a2 i(AbstractMessage abstractMessage) {
        this.f18782c = (AbstractMessage) j0.a(abstractMessage);
        AbstractMessage.Builder builder = this.f18781b;
        if (builder != null) {
            builder.dispose();
            this.f18781b = null;
        }
        h();
        return this;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
    public void markDirty() {
        h();
    }
}
