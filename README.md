# Hot100-ACM

🔥 力扣（LeetCode）热题 100 的 ACM 格式 Java 题解合集

## 项目简介

本项目是力扣 **Hot 100** 题目的 Java 实现，全部采用 **ACM 模式**（即通过 `Scanner` 读取标准输入、`System.out` 输出结果），而非力扣平台上常见的核心方法模式。这使得每道题都可以直接在本地 IDE 或命令行中编译运行、自行构造测试用例。

## 项目结构

```
Hot100-ACM/
├── HOT100/
│   └── src/
│       ├── TOP10/          # 第 1-10 题
│       ├── TOP20/          # 第 11-20 题
│       ├── TOP30/          # 第 21-30 题
│       ├── TOP40/          # 第 31-40 题
│       ├── TOP50/          # 第 41-50 题
│       ├── TOP60/          # 第 51-60 题
│       ├── TOP70/          # 第 61-70 题
│       ├── TOP80/          # 第 71-80 题
│       ├── TOP90/          # 第 81-90 题
│       ├── TOP100/         # 第 91-100 题
│       └── AlternatePrint.java   # 多线程交替打印（附加练习）
├── hot100-acm.iml          # IntelliJ IDEA 模块配置
├── LICENSE                 # MIT 开源协议
└── README.md               # 项目说明
```

## 题目清单

### TOP10（数组 / 哈希 / 双指针 / 滑动窗口）

| 题号 | 文件名 | 题目 | 核心算法 |
|------|--------|------|----------|
| 1 | `LiangShuZhiHe.java` | 两数之和 | 哈希表 |
| 2 | `ZiMuYiWeiCi.java` | 字母异位词 | 哈希表 / 排序 |
| 3 | `ZuiChangLianXvZiXvLie.java` | 最长连续序列 | 哈希集合 |
| 4 | `YiDongLing.java` | 移动零 | 双指针 |
| 5 | `ChengShuiZuiDuoDeRongQI.java` | 盛最多水的容器 | 双指针 |
| 6 | `SanShuZhiHe.java` | 三数之和 | 排序 + 双指针 |
| 7 | `JieYueShui.java` | 接雨水 | 双指针 / 单调栈 |
| 8 | `ZuiChangWuChangFuZIChuan.java` | 最长无重复子串 | 滑动窗口 |
| 9 | `ZiFuChuanZhongZiMuYiWeiCi.java` | 字符串中字母异位词 | 滑动窗口 |
| 10 | `HeWeiK.java` | 和为 K 的子数组 | 前缀和 + 哈希表 |

### TOP20（数组 / 矩阵）

| 题号 | 文件名 | 题目 | 核心算法 |
|------|--------|------|----------|
| 11 | `HuaDongChuangKouMax.java` | 滑动窗口最大值 | 单调队列 |
| 12 | `ZuiXiaoFuGaiZiChua.java` | 最小覆盖子串 | 滑动窗口 |
| 13 | `ZuiDaZiShuZuHe.java` | 最大子数组和 | 动态规划 / 分治 |
| 14 | `LunZhuanShuZu.java` | 轮转数组 | 数组翻转 |
| 15 | `ChuZiShenYiWaiChengJi.java` | 除自身以外乘积 | 前缀积 |
| 16 | `QueShiDeDiYiGeZhengShu.java` | 缺失的第一个正数 | 原地哈希 |
| 17 | `HeBingQuJian1111DeepToString.java` | 合并区间 | 排序 |
| 18 | `JuZhanZhiLing.java` | 矩阵置零 | 原地标记 |
| 19 | `LuoXuanJuZhen.java` | 螺旋矩阵 | 模拟 |
| 20 | `XuanZhuanTuXiang.java` | 旋转图像 | 原地翻转 |

### TOP30（链表）

| 题号 | 文件名 | 题目 | 核心算法 |
|------|--------|------|----------|
| 21 | `SouSuoErWeiJuZhen2.java` | 搜索二维矩阵 II | Z 字形查找 |
| 22 | `XiangJiaoLianBiao.java` | 相交链表 | 双指针 |
| 23 | `FanZhuanLianBiao.java` | 反转链表 | 迭代 |
| 24 | `HuiWenLianBiao.java` | 回文链表 | 快慢指针 |
| 25 | `HuanXingLianBiao.java` | 环形链表 | 快慢指针 |
| 26 | `HuanXingLianBiao2.java` | 环形链表 II | 快慢指针 + 数学 |
| 27 | `HeBingLiangGeLianBiao.java` | 合并两个有序链表 | 递归 / 迭代 |
| 28 | `LiangShuXiangJia.java` | 两数相加 | 链表模拟 |
| 29 | `ShanChuLianBiaoDaoShuN.java` | 删除链表倒数第 N 个节点 | 双指针 |
| 30 | `LiangLiangJiaoHuan.java` | 两两交换链表节点 | 递归 / 迭代 |

### TOP40（链表 / 二叉树）

| 题号 | 文件名 | 题目 | 核心算法 |
|------|--------|------|----------|
| 31 | `KGeYiZuFanZhuan.java` | K 个一组翻转链表 | 递归 |
| 32 | `SuiJILianBiaoFuZhi.java` | 随机链表复制 | 哈希表 / 穿插 |
| 33 | `PaiXvLianBiao.java` | 排序链表 | 归并排序 |
| 34 | `HeBingKGeShengXv.java` | 合并 K 个升序链表 | 优先队列 / 分治 |
| 35 | `LRUHuanCun.java` | LRU 缓存 | 哈希表 + 双向链表 |
| 36 | `ErChaShuZhongXVBianLI.java` | 二叉树中序遍历 | DFS / 栈 |
| 37 | `ZuiDaShenDu.java` | 二叉树最大深度 | DFS / BFS |
| 38 | `FanZhuanErChaShu.java` | 翻转二叉树 | 递归 |
| 39 | `DuiChenErChaShu.java` | 对称二叉树 | 递归 |
| 40 | `ErChaShuZhiJing.java` | 二叉树直径 | DFS |

### TOP50（二叉树 / 图）

| 题号 | 文件名 | 题目 | 核心算法 |
|------|--------|------|----------|
| 41 | `ErChaShuCengXvBianLi.java` | 二叉树层序遍历 | BFS |
| 42 | `YouXvShuZuZhuanHuanWeiErChaSouSuoShu.java` | 有序数组转二叉搜索树 | 递归 |
| 43 | `YanZhengErChaSouSuoShu.java` | 验证二叉搜索树 | 中序遍历 |
| 44 | `ErChaShuDeZuoShiTu.java` | 二叉树左视图 | BFS / DFS |
| 45 | `ErChaShuZhanKaiWeiLianBiao.java` | 二叉树展开为链表 | 前序遍历 |
| 46 | `ErChaSouSuoShuDIKXiaoDeYuanSu.java` | BST 第 K 小的元素 | 中序遍历 |
| 47 | `CongQianXvZhongXvGouZhaoErChaShu.java` | 前序中序构造二叉树 | 递归 |
| 48 | `LuJIngZongHesan.java` | 路径总和 III | 前缀和 + DFS |
| 49 | `ErChaShuZuiJinGongGongZuXian.java` | 二叉树最近公共祖先 | DFS |
| 50 | `ErChaShuZhongZuiDaLuJingHe.java` | 二叉树最大路径和 | DFS |

### TOP60（回溯 / 贪心 / 图）

| 题号 | 文件名 | 题目 | 核心算法 |
|------|--------|------|----------|
| 51 | `DaoYuShuLiang.java` | 岛屿数量 | DFS / BFS |
| 52 | `FuLanDeJuZi.java` | 腐烂的橘子 | BFS |
| 53 | `KeChengBiao.java` | 课程表 | 拓扑排序 |
| 54 | `ShiXianTrie.java` | 实现 Trie | 前缀树 |
| 55 | `QuanPaiLei.java` | 全排列 | 回溯 |
| 56 | `ZiJi.java` | 子集 | 回溯 / 位运算 |
| 57 | `KuoHaoShengCheng.java` | 括号生成 | 回溯 |
| 58 | `DanCiSouSuo.java` | 单词搜索 | 回溯 / DFS |
| 59 | `DianHuaHaoMaDeZiMuZuHe.java` | 电话号码字母组合 | 回溯 |
| 60 | `ZuHeZhongHe.java` | 组合总和 | 回溯 |

### TOP70（二分查找 / 栈）

| 题号 | 文件名 | 题目 | 核心算法 |
|------|--------|------|----------|
| 61 | `FenGeHuiWenChuan.java` | 分割回文串 | 回溯 + DP |
| 62 | `NHuangHou.java` | N 皇后 | 回溯 |
| 63 | `SouSuoChaRuWeiZhi.java` | 搜索插入位置 | 二分查找 |
| 64 | `SouSuoErWeiJuZhen.java` | 搜索二维矩阵 | 二分查找 |
| 65 | `SouSuoXuanZhuanPaiXvShuZu.java` | 搜索旋转排序数组 | 二分查找 |
| 66 | `XunZhaoLiangGeZhengXvShuZuZhongWeiShu.java` | 两个有序数组中位数 | 二分查找 |
| 67 | `XvZhaoXuanZhuanPaiXvShuZuMIN.java` | 旋转排序数组最小值 | 二分查找 |
| 68 | `YouXiaoKuoHao.java` | 有效括号 | 栈 |
| 69 | `ZaiPaiXvShuZuZhongChaZhaoTOPONEHeLast.java` | 排序数组查找首位 | 二分查找 |
| 70 | `ZuiXiaoZhan.java` | 最小栈 | 辅助栈 |

### TOP80（动态规划 / 堆）

| 题号 | 文件名 | 题目 | 核心算法 |
|------|--------|------|----------|
| 71 | `HuaFenZiMuQuJian.java` | 划分字母区间 | 贪心 |
| 72 | `MaiMaiGuPiaoZuiJiaShiJi.java` | 买卖股票最佳时机 | 贪心 |
| 73 | `MeiRiWenDu.java` | 每日温度 | 单调栈 |
| 74 | `QianKGeGaoPinYuanSu.java` | 前 K 个高频元素 | 堆 / 桶排序 |
| 75 | `ShuJuLiuDeZhongWeiShu.java` | 数据流的中位数 | 双堆 |
| 76 | `ShuZUZhongDiKGeZuiDaYuanSu.java` | 数组第 K 个最大元素 | 快速选择 |
| 77 | `TiaoYueYouXi.java` | 跳跃游戏 | 贪心 |
| 78 | `TiaoYueYouXiEr.java` | 跳跃游戏 II | 贪心 |
| 79 | `ZhuZhuangTuZhongZuiDaDeJuZhen.java` | 柱状图最大矩形 | 单调栈 |
| 80 | `ZiFuChuanJieMa.java` | 字符串解码 | 栈 |

### TOP90（动态规划）

| 题号 | 文件名 | 题目 | 核心算法 |
|------|--------|------|----------|
| 81 | `ChengJiZuiDaZiShuZU.java` | 乘积最大子数组 | 动态规划 |
| 82 | `DaJiaJieShe.java` | 打家劫舍 | 动态规划 |
| 83 | `DanCiChaiFen.java` | 单词拆分 | 动态规划 |
| 84 | `FenGeDengHeZiJi.java` | 分割等和子集 | 0-1 背包 |
| 85 | `LingQianDuiHuan.java` | 零钱兑换 | 完全背包 |
| 86 | `PaLouTi.java` | 爬楼梯 | 动态规划 |
| 87 | `WanQuanPingFangShu.java` | 完全平方数 | 动态规划 |
| 88 | `YangHuiSanJiao.java` | 杨辉三角 | 动态规划 |
| 89 | `ZuiChangDIZhengZiXvLei.java` | 最长递增子序列 | 动态规划 + 二分 |
| 90 | `ZuiChangYouXiaoKuoHao.java` | 最长有效括号 | 动态规划 / 栈 |

### TOP100（杂项）

| 题号 | 文件名 | 题目 | 核心算法 |
|------|--------|------|----------|
| 91 | `BianJiJuLi.java` | 编辑距离 | 动态规划 |
| 92 | `BuTongLuJing.java` | 不同路径 | 动态规划 |
| 93 | `DuoShuYuanSu.java` | 多数元素 | 摩尔投票 |
| 94 | `XiaYiGePaiLei.java` | 下一个排列 | 双指针 |
| 95 | `XunZhaoChongFuShu.java` | 寻找重复数 | 快慢指针 |
| 96 | `YanSeFenLie.java` | 颜色分类 | 双指针 |
| 97 | `ZhiChuXianYiCiDeShuZi.java` | 只出现一次的数字 | 位运算 |
| 98 | `ZuiChangGongGongZiXvLie.java` | 最长公共子序列 | 动态规划 |
| 99 | `ZuiChangHuiWenZiChuan.java` | 最长回文子串 | 中心扩展 / DP |
| 100 | `ZuiXiaoLuJingHe.java` | 最小路径和 | 动态规划 |

---

### 附加练习

| 文件名 | 题目 | 核心算法 |
|--------|------|----------|
| `AlternatePrint.java` | 多线程交替打印 A1B2...Z26 | `ReentrantLock` + `Condition` |

## 使用方法

### 环境要求

- **JDK 8+**
- 推荐使用 IntelliJ IDEA（项目已包含 `.iml` 配置）

### 运行方式

**方式一：IntelliJ IDEA**

直接用 IDEA 打开项目，在任意题目的 `main` 方法处右键运行。

**方式二：命令行编译运行**

```bash
# 进入源码目录
cd HOT100/src

# 编译
javac TOP10/LiangShuZhiHe.java

# 运行（第一行输入数组元素以空格分隔，第二行输入 target）
java TOP10.LiangShuZhiHe
```

### ACM 格式说明

不同于力扣平台的 `Solution` 类方法提交模式，本项目所有题解采用 **ACM 竞赛风格**：

- 每个 `.java` 文件包含独立的 `main` 方法
- 使用 `Scanner` 从标准输入读取测试数据
- 使用 `System.out.println` 输出结果
- 无需依赖任何第三方库，开箱即用

例如「两数之和」的输入格式：

```
2 7 11 15
9
```

输出：

```
[0, 1]
```

## 算法知识点覆盖

本项目涵盖了 Hot 100 中几乎所有的核心算法与数据结构：

| 类别 | 涉及内容 |
|------|----------|
| **数据结构** | 数组、链表、栈、队列、哈希表、堆（优先队列）、二叉树、Trie（前缀树）、图 |
| **算法思想** | 双指针、滑动窗口、二分查找、分治、贪心、回溯、动态规划 |
| **链表技巧** | 反转链表、快慢指针、环形检测、归并排序、K 个一组翻转、LRU 缓存 |
| **二叉树** | 前/中/后序遍历、层序遍历、BST 验证、最近公共祖先、直径与最大路径 |
| **图论** | DFS 岛屿、BFS 腐烂橘子、拓扑排序（课程表） |
| **动态规划** | 背包问题、区间 DP、线性 DP、状态压缩、记忆化搜索 |
| **排序与搜索** | 快速选择、归并排序、桶排序、旋转数组二分 |
| **位运算** | 异或去重、摩尔投票 |

## 致谢

本项目题目来源：[LeetCode Hot 100](https://leetcode.cn/problem-list/2cktkvj/)

## 开源协议

本项目基于 [MIT License](LICENSE) 开源，欢迎 Star、Fork 和 PR。
