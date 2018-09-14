package yj.mine;

import java.io.IOException;
import java.util.Arrays;
/* -XX:-UseCompressedOops */
public class UnsafeTest {

    public volatile int a;
    public volatile long b;
    public volatile Integer c;
    public volatile Long d;
    public volatile String e;
    public volatile String[] w;
    public volatile int[] x;
    public volatile String f;

    private static final long la;
    private static final long lb;
    private static final long lc;
    private static final long ld;
    private static final long le;
    public static final sun.misc.Unsafe U;

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("UnsafeTest{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", c=").append(c);
        sb.append(", d=").append(d);
        sb.append(", e='").append(e).append('\'');
        sb.append(", w=").append(Arrays.toString(w));
        sb.append(", x=").append(Arrays.toString(x));
        sb.append(", f='").append(f).append('\'');
        sb.append('}');
        return sb.toString();
    }

    static {
        Class<?> k = UnsafeTest.class;
        try {
            U = getUnsafe();
            la = (U.objectFieldOffset(k.getDeclaredField("a")));
            lb = (U.objectFieldOffset(k.getDeclaredField("b")));
            lc = (U.objectFieldOffset(k.getDeclaredField("c")));
            ld = (U.objectFieldOffset(k.getDeclaredField("d")));
            le = (U.objectFieldOffset(k.getDeclaredField("e")));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    private static sun.misc.Unsafe getUnsafe() {
        try {
            return sun.misc.Unsafe.getUnsafe();
        } catch (SecurityException tryReflectionInstead) {
        }
        try {
            return java.security.AccessController.doPrivileged(
                    new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
                        public sun.misc.Unsafe run() throws Exception {
                            Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
                            for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                                f.setAccessible(true);
                                Object x = f.get(null);
                                if (k.isInstance(x))
                                    return k.cast(x);
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
        } catch (java.security.PrivilegedActionException e) {
            throw new RuntimeException("Could not initialize intrinsics", e.getCause());
        }
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IOException,
            InterruptedException {
        Class<?> k = UnsafeTest.class;
        print(k);

        UnsafeTest t = new UnsafeTest();
        t.a = 0;
        t.b = 1L;
        t.c = 2;
        t.d = 3L;
        t.e = "";

        t.U.compareAndSwapInt(t, la, t.a, t.a + 3);
        t.U.compareAndSwapObject(t, le, t.e, "hello!");



        System.out.println(t);

        testArray();
    }

    public static void testArray() throws NoSuchFieldException {
         class B {
            int a;
            int b;
        }
         class C {
             B[] as = new B[3];
            int ba;


            C() {
                for (int i = 0; i < as.length; i++) {
                    as[i] = new B();
                }
            }
        }


        C c = new C();
        long ls = U.objectFieldOffset(C.class.getDeclaredField("as"));
        long le = U.objectFieldOffset(C.class.getDeclaredField("ba"));

        System.out.println(ls);
        System.out.println(le);
        System.out.println(c);
    }

    private static void print(Class<?> k) throws NoSuchFieldException, IOException, InterruptedException {
        System.out.println(U.objectFieldOffset(k.getDeclaredField("a")));
        System.out.println(U.objectFieldOffset(k.getDeclaredField("b")));
        System.out.println(U.objectFieldOffset(k.getDeclaredField("c")));
        System.out.println(U.objectFieldOffset(k.getDeclaredField("d")));
        System.out.println(U.objectFieldOffset(k.getDeclaredField("e")));
        System.out.println(U.objectFieldOffset(k.getDeclaredField("w")));
        System.out.println(U.objectFieldOffset(k.getDeclaredField("x")));
        System.out.println(U.objectFieldOffset(k.getDeclaredField("f")));


    }
}

