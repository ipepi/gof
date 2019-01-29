# gof

Javaのデザインパターンを学ぶために、GoFの２３このデザインパターンを勉強します。
勉強に当たり以下のURLのサイトを参考にさせていただきます。

<http://www.techscore.com/tech/DesignPattern/index.html/>

* Itelator
    * 構造化されたオブジェクトに順次アクセスさせる場合に適用させることで、変更範囲が少なくなるパターン
* Adapter
    * インターフェースに互換性の無いクラス同士を組み合わせるのに利用できるパターン
* TemplateMethod
    * スーパークラスでアルゴリズムのメソッドを定義して、サブクラスで具体的内容を実装するパターン
* FactoryMethod
    * TemplateMethodでインスタンスの生成をサブクラスに任せることで、柔軟な実装が可能となるパターン
* ProtoType
    * 複製メソッドを用意したパターン
* Builder
    * Directorで表現形式（手順書的なもの）、Builderで作成過程（どのように処理するか）を決定することで、同じ要求を異なる形式で表現できるパターン
