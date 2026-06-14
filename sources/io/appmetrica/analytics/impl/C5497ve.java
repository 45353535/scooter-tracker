package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.work.WorkInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5497ve implements InterfaceC5139h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5572ye f78448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5386r3 f78449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5593za f78450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Of f78451d;

    public C5497ve() {
        this(new C5572ye(), new C5386r3(), new C5593za(100), new Of());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(@NonNull C5472ue c5472ue) {
        Ii iiFromModel;
        int i10 = 0;
        char c10 = 1;
        A8 a82 = new A8();
        a82.f75510a = c5472ue.f78384a;
        a82.f75515f = new C5342p8();
        C5522we c5522we = c5472ue.f78385b;
        C5292n8 c5292n8 = new C5292n8();
        c5292n8.f77812a = StringUtils.getUTF8Bytes(c5522we.f78505a);
        On onA = this.f78450c.a(c5522we.f78506b);
        c5292n8.f77813b = StringUtils.getUTF8Bytes((String) onA.f76209a);
        c5292n8.f77816e = c5522we.f78507c.size();
        Map<String, String> map = c5522we.f78508d;
        if (map != null) {
            iiFromModel = this.f78448a.fromModel(map);
            c5292n8.f77814c = (C5391r8) iiFromModel.f75947a;
        } else {
            iiFromModel = null;
        }
        a82.f75515f.f77971a = c5292n8;
        C5160i3 c5160i3 = new C5160i3(C5160i3.b(onA, iiFromModel));
        List list = c5522we.f78507c;
        ArrayList arrayList = new ArrayList();
        this.f78451d.getClass();
        int iComputeInt32Size = a82.f75510a != new A8().f75510a ? CodedOutputByteBufferNano.computeInt32Size(1, a82.f75510a) : 0;
        C5591z8 c5591z8 = a82.f75511b;
        if (c5591z8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c5591z8);
        }
        C5541x8 c5541x8 = a82.f75512c;
        if (c5541x8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c5541x8);
        }
        C5566y8 c5566y8 = a82.f75513d;
        int i11 = 4;
        if (c5566y8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c5566y8);
        }
        C5190j8 c5190j8 = a82.f75514e;
        if (c5190j8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c5190j8);
        }
        C5342p8 c5342p8 = a82.f75515f;
        if (c5342p8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c5342p8);
        }
        ArrayList arrayList2 = new ArrayList();
        A8 a83 = new A8();
        a83.f75510a = a82.f75510a;
        C5342p8 c5342p82 = new C5342p8();
        a83.f75515f = c5342p82;
        c5342p82.f77971a = new C5292n8();
        C5292n8 c5292n82 = a83.f75515f.f77971a;
        C5292n8 c5292n83 = a82.f75515f.f77971a;
        c5292n82.f77813b = c5292n83.f77813b;
        c5292n82.f77812a = c5292n83.f77812a;
        c5292n82.f77816e = c5292n83.f77816e;
        c5292n82.f77814c = c5292n83.f77814c;
        int i12 = 0;
        C5160i3 c5160i32 = c5160i3;
        int i13 = iComputeInt32Size;
        while (i12 < list.size()) {
            C5411s3 c5411s3 = (C5411s3) list.get(i12);
            int i14 = i10;
            C5317o8 c5317o8 = new C5317o8();
            c5317o8.f77884a = i12;
            char c11 = c10;
            Ii iiFromModel2 = this.f78449b.fromModel(c5411s3);
            c5317o8.f77885b = (C5216k8) iiFromModel2.f75947a;
            iiFromModel2.f75948b.getBytesTruncated();
            Ii ii = new Ii(c5317o8, iiFromModel2);
            Of of2 = this.f78451d;
            C5317o8 c5317o82 = (C5317o8) ii.f75947a;
            of2.getClass();
            int iComputeTagSize = CodedOutputByteBufferNano.computeTagSize(i11);
            int iComputeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c5317o82);
            int iComputeRawVarint32Size = iComputeTagSize + iComputeMessageSizeNoTag + ((iComputeMessageSizeNoTag & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0 ? i14 : CodedOutputByteBufferNano.computeRawVarint32Size(iComputeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i13 + iComputeRawVarint32Size > 204800) {
                a83.f75515f.f77971a.f77815d = (C5317o8[]) arrayList2.toArray(new C5317o8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Ii(a83, c5160i32));
                A8 a84 = new A8();
                a84.f75510a = a82.f75510a;
                C5342p8 c5342p83 = new C5342p8();
                a84.f75515f = c5342p83;
                c5342p83.f77971a = new C5292n8();
                C5292n8 c5292n84 = a84.f75515f.f77971a;
                C5292n8 c5292n85 = a82.f75515f.f77971a;
                c5292n84.f77813b = c5292n85.f77813b;
                c5292n84.f77812a = c5292n85.f77812a;
                c5292n84.f77816e = c5292n85.f77816e;
                c5292n84.f77814c = c5292n85.f77814c;
                c5160i32 = c5160i3;
                i13 = iComputeInt32Size;
                a83 = a84;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C5317o8) ii.f75947a);
            InterfaceC5185j3 interfaceC5185j3 = ii.f75948b;
            InterfaceC5185j3[] interfaceC5185j3Arr = new InterfaceC5185j3[2];
            interfaceC5185j3Arr[i14] = c5160i32;
            interfaceC5185j3Arr[c11] = interfaceC5185j3;
            c5160i32 = new C5160i3(C5160i3.b(interfaceC5185j3Arr));
            i13 += iComputeRawVarint32Size;
            i12++;
            i10 = i14;
            c10 = c11;
            i11 = 4;
        }
        a83.f75515f.f77971a.f77815d = (C5317o8[]) arrayList2.toArray(new C5317o8[arrayList2.size()]);
        arrayList.add(new Ii(a83, c5160i32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5497ve(C5572ye c5572ye, C5386r3 c5386r3, C5593za c5593za, Of of2) {
        this.f78448a = c5572ye;
        this.f78449b = c5386r3;
        this.f78450c = c5593za;
        this.f78451d = of2;
    }

    @NonNull
    public final C5472ue a(@NonNull List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
