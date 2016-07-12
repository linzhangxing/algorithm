/**
 * 学习 图
 *
 *
 * 图G由两个集合V和E组成，记为：G=(V，E)，其中：V是顶点的有穷非空集合，E是V中顶点偶对(称为边)的有穷集。
 * 通常，也将图G的顶点集和边集分别记为V(G)和E(G)。E(G)可以是空集。若E(G)为空，则图G只有顶点而没有边。
 * 图有两种存储结构：邻接矩阵和邻接表。
 * 邻接矩阵：用邻接矩阵表示顶点间的相邻关系， 用一个顺序表来存储顶点信息。
 * 邻接表：类似于树的孩子链表表示法。对于图G中的每个顶点vi，该方法把所有邻接于vi的顶点vj链成一个带头结点的单链表，这个单链表就称为顶点vi的邻接表(Adjacency List)。
 *
 *
 *
 * http://blog.jobbole.com/79314/
 *
 * http://blog.csdn.net/laozhaokun/article/details/20901511
 */
package graph;