class MotionTest {
    private IMotion motion;

    @Test
    void jumpTest() {
        motion=new Motion();
        assertTrue(motion.jump( 0.5,1.5));
    }

    @Test
    void runTest() {
        motion=new Motion();
        assertTrue(motion.run(100,200));
    }
}