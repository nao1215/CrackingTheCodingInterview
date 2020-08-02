# Cracking The Coding Interview

本レポジトリは、Cracking the Coding Interview: 189 Programming Questions and Solutions（邦題：世界で闘うプログラミング力を鍛える本 コーディング面接 189 問とその解法）の回答コード（自作）を残しています。
Cracking the Coding Interview は、トップ IT 企業に就職するための「アルゴリズム・コーディング力・設計力」を養うための問題集です。

問題文は、本レポジトリに含まれていないため、前述の書籍にて確認してください。<br>
問題番号ごとに本レポジトリにディレクトリ（例：1.1）が作成してあり、その中には Gradle で作成したプロジェクトと回答コードが存在します。<br>
「回答に対する私の考え」や「Big-O 記法による計算量」は、ソースコード中のコメントに記載してあります。

'''
[ディレクトリ構成]
Root Directory<br>
├── 1.1 　　　※ 問題番号<br>
│ ├── build.gradle<br>
│ ├── gradle<br>
│ ├── gradlew<br>
│ ├── gradlew.bat<br>
│ ├── settings.gradle<br>
│ └── src 　　※ 問題の回答とテストコードがあるディレクトリ<br>
├── 1.2<br>
：<br>
├── LICENSE<br>
└── README.md<br>
'''

# 開発環境・使用言語

| 項目                      | 説明                                 |
| ------------------------- | ------------------------------------ |
| OS                        | Debian GNU/Linux 10 (buster) x86_64  |
| Linux Kernel              | 4.19.67                              |
| CPU                       | AMD Ryzen 7 3800X 8- (16) @ 3.900GHz |
| Memory                    | 64GB                                 |
| 使用言語                  | Java（openjdk 11.0.8 2020-07-14）    |
| ビルドシステム            | Gradle(Version 6.5.1)                |
| Unit テストフレームワーク | JUnit（Version 4.13）                |

- Gradle のインストールは、Debian パッケージマネージャ（apt）経由では相当古い Version しか取得できないため、公式サイト（https://gradle.org/releases/） から取得した方が好ましいです。

- Java のインストールは、SDKMAN（https://sdkman.io/） がオススメです。Java Version の切り替えが簡単にできます。

- 開発には Visual Studio Code を用いたため、IDE（例：IntelliJ、eclipse）でのビルドは未確認です。

# 回答コードの実行方法

問題 1.1 を例にして、以下に実行方法を示します。

```
(注釈)：「コード取得」および「問題1.1用プロジェクトへ移動」
$ git clone https://github.com/nao1215/CrackingTheCodingInterview.git
$ cd CrackingTheCodingInterview/1.1

(注釈)：回答コードを実行
$ gradle run

(注釈)：回答コード向けのユニットテストを実行
$ gradle test
```

# LICENSE

[MIT License](https://github.com/nao1215/CrackingTheCodingInterview/blob/master/LICENSE)
