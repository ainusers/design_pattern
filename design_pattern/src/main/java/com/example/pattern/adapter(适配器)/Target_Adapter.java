/**
 * @author: tianyong
 * @date: 2019/11/14 13:32
 * @desciption:适配器 (读卡器)
 */
public class Target_Adapter implements Target {


    // 适配者
    private Adapter adapter;


    // 构造赋值
    public Target_Adapter(Adapter adapter) {
        this.adapter = adapter;
    }

    /**
      * @author: tianyong
      * @date: 2019/11/14
      * @description:读卡器操作
    */
    @Override
    public void targetPrint() {
        // 读取内存卡信息操作
        adapter.read();
    }
}
