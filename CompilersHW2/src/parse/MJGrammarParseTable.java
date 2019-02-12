package
parse
;
import
java
.
util
.
ArrayList
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
import
syntaxtree
.
*
;
public class MJGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 147; }
public int getNttSym() { return 148; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<class decl>",
"`class",
"ID",
"`{",
"<decl in class>*",
"`}",
"`extends",
"<decl in class>",
"<method decl>",
"<inst var decl>",
"`public",
"`void",
"`(",
"`)",
"<stmt>*",
"<type>",
"`int",
"`boolean",
"`null",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"<local var decl>",
"`if",
"<exp>",
"`else",
"`for",
"`while",
"`break",
"`=",
"`++",
"`--",
"`switch",
"<case>*",
"<case>",
"`case",
"<exp8>",
"<exp7>",
"<exp6>",
"<exp5>",
"<exp4>",
"<exp3>",
"<exp2>",
"<exp1>",
"`||",
"`&&",
"`==",
"`!=",
"`<",
"`<=",
"`>",
"`+",
"`-",
"`*",
"`/",
"`%",
"`!",
"INTLIT",
"STRINGLIT",
"CHARLIT",
"`.",
"`this",
"`true",
"`false",
"`new",
"<empty bracket pair>**",
"letter",
"\"a\"",
"\"p\"",
"\"s\"",
"\"v\"",
"\"c\"",
"\"f\"",
"{\"A\"..\"Z\" \"d\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"y\"..\"z\"}",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"x\"",
"\"b\"",
"\"e\"",
"\"h\"",
"\"n\"",
"\"t\"",
"\"w\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"any",
"\"[\"",
"\"-\"",
"\"<\"",
"\"|\"",
"\" \"",
"\"#\"",
"\"&\"",
"\")\"",
"\"]\"",
"\"/\"",
"\";\"",
"{0..9 11..31 \"$\" \",\" \":\" \"?\" \"\\\" \"^\" \"`\" \"~\"..127}",
"\">\"",
"\"{\"",
"\"%\"",
"\"(\"",
"\"+\"",
"\".\"",
"\"_\"",
"\"=\"",
"\"@\"",
"10",
"\"}\"",
"\"!\"",
"\"\'\"",
"\'\"\'",
"\"*\"",
"any128",
"{223}",
"{128..175 186..192 219..222 224 251..255}",
"ws",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"any*",
"$$3",
"idChar",
"idChar128",
"hexDigit",
"hexDigit128",
"<empty bracket pair>*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 149;}
private static final int MIN_REDUCTION = 632;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+0;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
1,562, // <start>
2,317, // ws*
3,623, // <program>
4,72, // <class decl>+
5,552, // <class decl>
6,438, // `class
107,104, // " "
108,605, // "#"
124,31, // {10}
133,440, // ws
  }
,
{ // state 1
  }
,
{ // state 2
2,34, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 3
25,MIN_REDUCTION+84, // `[
103,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 4
107,104, // " "
124,31, // {10}
133,49, // ws
148,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|219, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 6
25,MIN_REDUCTION+172, // `[
103,MIN_REDUCTION+172, // "["
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 8
2,89, // ws*
107,621, // " "
124,203, // {10}
133,254, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 9
0x80000000|344, // match move
0x80000000|183, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 10
0x80000000|408, // match move
0x80000000|586, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 11
0x80000000|1, // match move
0x80000000|570, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
0x80000000|1, // match move
0x80000000|201, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 13
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 14
0x80000000|95, // match move
0x80000000|446, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 15
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 16
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 17
25,MIN_REDUCTION+83, // `[
103,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 18
18,356, // `)
110,500, // ")"
  }
,
{ // state 19
0x80000000|1, // match move
0x80000000|425, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 20
0x80000000|289, // match move
0x80000000|350, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 21
0x80000000|1, // match move
0x80000000|566, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 22
0x80000000|1, // match move
0x80000000|297, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 23
0x80000000|286, // match move
0x80000000|6, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 24
33,110, // `else
108,114, // "#"
  }
,
{ // state 25
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 26
29,123, // `;
113,196, // ";"
  }
,
{ // state 27
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
303, // `{
-1, // <decl in class>*
96, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
430, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
32, // <stmt>
143, // <assign>
98, // `;
561, // <local var decl>
245, // `if
315, // <exp>
-1, // `else
97, // `for
339, // `while
545, // `break
-1, // `=
236, // `++
556, // `--
612, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
379, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
387, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 28
25,MIN_REDUCTION+173, // `[
103,MIN_REDUCTION+173, // "["
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 29
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 30
107,621, // " "
124,203, // {10}
133,125, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 31
148,MIN_REDUCTION+84, // $NT
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 33
2,61, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 34
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 35
0x80000000|1, // match move
0x80000000|37, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 36
0x80000000|1, // match move
0x80000000|244, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 37
25,MIN_REDUCTION+178, // `[
103,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 38
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 39
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 40
80,342, // "f"
91,420, // "n"
92,86, // "t"
  }
,
{ // state 41
0x80000000|242, // match move
0x80000000|292, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 44
8,380, // `{
116,474, // "{"
  }
,
{ // state 45
2,211, // ws*
  }
,
{ // state 46
0x80000000|87, // match move
0x80000000|489, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 47
25,MIN_REDUCTION+67, // `[
103,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 48
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 49
148,MIN_REDUCTION+210, // $NT
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 50
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 51
17,490, // `(
118,514, // "("
  }
,
{ // state 52
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 53
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 54
78,409, // "v"
82,555, // "i"
88,115, // "b"
91,309, // "n"
  }
,
{ // state 55
2,410, // ws*
25,MIN_REDUCTION+215, // `[
103,MIN_REDUCTION+215, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 56
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 57
0x80000000|507, // match move
0x80000000|503, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 58
7,12, // ID
17,478, // `(
23,5, // `null
28,237, // <assign>
32,315, // <exp>
38,236, // `++
39,556, // `--
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,279, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 59
0x80000000|298, // match move
0x80000000|210, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 60
25,MIN_REDUCTION+74, // `[
103,MIN_REDUCTION+74, // "["
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 61
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 62
17,396, // `(
118,514, // "("
  }
,
{ // state 63
8,538, // `{
116,474, // "{"
  }
,
{ // state 64
25,MIN_REDUCTION+179, // `[
103,MIN_REDUCTION+179, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 65
25,MIN_REDUCTION+65, // `[
103,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 66
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 67
92,247, // "t"
  }
,
{ // state 68
25,524, // `[
68,277, // `.
103,33, // "["
120,2, // "."
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 69
0x80000000|353, // match move
0x80000000|521, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 70
2,16, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 71
2,39, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 72
5,598, // <class decl>
6,438, // `class
108,605, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 73
0x80000000|551, // match move
0x80000000|194, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 74
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 75
7,473, // ID
17,478, // `(
23,5, // `null
48,343, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 76
2,358, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 77
7,128, // ID
16,560, // `void
20,91, // <type>
21,180, // `int
22,267, // `boolean
23,618, // `null
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
108,54, // "#"
  }
,
{ // state 78
76,224, // "p"
78,135, // "v"
82,67, // "i"
88,455, // "b"
91,533, // "n"
  }
,
{ // state 79
2,136, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 81
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 83
0x80000000|45, // match move
0x80000000|208, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 84
0x80000000|1, // match move
0x80000000|622, // no-match move
// T-test match for "=":
122,
  }
,
{ // state 85
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 86
85,540, // "r"
90,492, // "h"
  }
,
{ // state 87
2,428, // ws*
  }
,
{ // state 88
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 89
0x80000000|130, // match move
0x80000000|547, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 90
7,473, // ID
17,478, // `(
23,5, // `null
49,262, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 91
0x80000000|234, // match move
0x80000000|172, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 92
56,589, // `<
57,105, // `<=
58,75, // `>
105,411, // "<"
115,84, // ">"
123,307, // "@"
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 93
18,MIN_REDUCTION+149, // `)
26,MIN_REDUCTION+149, // `]
29,MIN_REDUCTION+149, // `;
53,MIN_REDUCTION+149, // `&&
54,MIN_REDUCTION+149, // `==
55,MIN_REDUCTION+149, // `!=
73,MIN_REDUCTION+149, // <empty bracket pair>**
107,389, // " "
110,MIN_REDUCTION+149, // ")"
111,MIN_REDUCTION+149, // "]"
113,MIN_REDUCTION+149, // ";"
123,MIN_REDUCTION+149, // "@"
124,261, // {10}
133,226, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 95
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 96
0x80000000|405, // match move
0x80000000|199, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 97
17,443, // `(
118,514, // "("
  }
,
{ // state 98
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 99
7,473, // ID
17,478, // `(
23,5, // `null
32,296, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 100
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 101
2,559, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 102
25,MIN_REDUCTION+109, // `[
103,MIN_REDUCTION+109, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 103
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 104
148,MIN_REDUCTION+83, // $NT
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 105
7,473, // ID
17,478, // `(
23,5, // `null
48,427, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 106
7,MIN_REDUCTION+16, // ID
25,MIN_REDUCTION+64, // `[
38,606, // `++
39,497, // `--
75,MIN_REDUCTION+16, // "a"
76,MIN_REDUCTION+16, // "p"
77,MIN_REDUCTION+16, // "s"
78,MIN_REDUCTION+16, // "v"
79,MIN_REDUCTION+16, // "c"
80,MIN_REDUCTION+16, // "f"
81,MIN_REDUCTION+16, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,MIN_REDUCTION+16, // "i"
83,MIN_REDUCTION+16, // "l"
84,MIN_REDUCTION+16, // "o"
85,MIN_REDUCTION+16, // "r"
86,MIN_REDUCTION+16, // "u"
87,MIN_REDUCTION+16, // "x"
88,MIN_REDUCTION+16, // "b"
89,MIN_REDUCTION+16, // "e"
90,MIN_REDUCTION+16, // "h"
91,MIN_REDUCTION+16, // "n"
92,MIN_REDUCTION+16, // "t"
93,MIN_REDUCTION+16, // "w"
95,MIN_REDUCTION+16, // {199..218 231..250}
96,MIN_REDUCTION+16, // {193..198 225..230}
103,MIN_REDUCTION+64, // "["
123,124, // "@"
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 107
2,607, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 109
2,159, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 110
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
303, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
442, // <stmt>
143, // <assign>
98, // `;
561, // <local var decl>
245, // `if
315, // <exp>
-1, // `else
97, // `for
339, // `while
545, // `break
-1, // `=
236, // `++
556, // `--
612, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
379, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
-1, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 111
25,MIN_REDUCTION+214, // `[
103,MIN_REDUCTION+214, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 112
0x80000000|590, // match move
0x80000000|359, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 113
2,154, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 114
89,477, // "e"
  }
,
{ // state 115
84,466, // "o"
  }
,
{ // state 116
0x80000000|1, // match move
0x80000000|28, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 117
18,217, // `)
110,500, // ")"
  }
,
{ // state 118
25,MIN_REDUCTION+190, // `[
103,MIN_REDUCTION+190, // "["
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 119
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 120
0x80000000|1, // match move
0x80000000|64, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
2,4, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
148,MIN_REDUCTION+150, // $NT
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 122
0x80000000|629, // match move
0x80000000|106, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 123
0x80000000|542, // match move
0x80000000|444, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 124
104,592, // "-"
105,71, // "<"
106,611, // "|"
109,322, // "&"
119,601, // "+"
122,70, // "="
126,79, // "!"
  }
,
{ // state 125
0x80000000|48, // match move
0x80000000|602, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 126
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 127
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 128
0x80000000|629, // match move
0x80000000|581, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 130
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 131
0x80000000|386, // match move
0x80000000|171, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 132
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
303, // `{
-1, // <decl in class>*
482, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
108, // <stmt>
143, // <assign>
98, // `;
561, // <local var decl>
245, // `if
315, // <exp>
-1, // `else
97, // `for
339, // `while
545, // `break
-1, // `=
236, // `++
556, // `--
612, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
379, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
340, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 133
18,316, // `)
110,500, // ")"
  }
,
{ // state 134
148,MIN_REDUCTION+18, // $NT
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 135
84,107, // "o"
  }
,
{ // state 136
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 137
0x80000000|1, // match move
0x80000000|138, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 138
25,524, // `[
68,277, // `.
103,33, // "["
120,2, // "."
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 139
0x80000000|1, // match move
0x80000000|47, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 140
106,611, // "|"
109,322, // "&"
122,70, // "="
126,79, // "!"
  }
,
{ // state 141
7,473, // ID
23,5, // `null
51,240, // <exp1>
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
108,40, // "#"
123,401, // "@"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 142
17,436, // `(
118,514, // "("
  }
,
{ // state 143
29,367, // `;
113,379, // ";"
  }
,
{ // state 144
0x80000000|82, // match move
0x80000000|161, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 145
29,364, // `;
113,379, // ";"
  }
,
{ // state 146
29,453, // `;
113,379, // ";"
  }
,
{ // state 147
0x80000000|1, // match move
0x80000000|270, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 148
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 149
87,101, // "x"
  }
,
{ // state 150
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 152
0x80000000|1, // match move
0x80000000|508, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 153
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 154
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 157
2,15, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 158
2,36, // ws*
25,MIN_REDUCTION+184, // `[
103,MIN_REDUCTION+184, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 159
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 160
7,416, // ID
74,532, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,327, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
  }
,
{ // state 161
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 162
18,44, // `)
110,500, // ")"
  }
,
{ // state 163
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 165
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 168
0x80000000|1, // match move
0x80000000|543, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 169
18,141, // `)
24,249, // <empty bracket pair>
25,345, // `[
103,33, // "["
110,500, // ")"
  }
,
{ // state 170
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 171
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 172
25,99, // `[
103,33, // "["
  }
,
{ // state 173
0x80000000|7, // match move
0x80000000|30, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 174
75,52, // "a"
76,52, // "p"
77,52, // "s"
78,52, // "v"
79,52, // "c"
80,52, // "f"
81,52, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,52, // "i"
83,52, // "l"
84,52, // "o"
85,52, // "r"
86,52, // "u"
87,52, // "x"
88,52, // "b"
89,52, // "e"
90,52, // "h"
91,52, // "n"
92,52, // "t"
93,52, // "w"
95,627, // {199..218 231..250}
96,627, // {193..198 225..230}
98,52, // {"1".."9"}
99,52, // "0"
101,627, // {176..185}
102,163, // any
103,52, // "["
104,52, // "-"
105,52, // "<"
106,52, // "|"
107,52, // " "
108,52, // "#"
109,52, // "&"
110,52, // ")"
111,52, // "]"
112,52, // "/"
113,52, // ";"
114,52, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
115,52, // ">"
116,52, // "{"
117,52, // "%"
118,52, // "("
119,52, // "+"
120,52, // "."
121,52, // "_"
122,52, // "="
123,52, // "@"
124,52, // {10}
125,52, // "}"
126,52, // "!"
127,52, // "'"
128,52, // '"'
129,52, // "*"
130,69, // any128
131,627, // {223}
132,627, // {128..175 186..192 219..222 224 251..255}
140,336, // any*
141,147, // $$3
  }
,
{ // state 175
0x80000000|465, // match move
0x80000000|227, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 176
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 177
52,567, // `||
123,578, // "@"
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 178
0x80000000|448, // match move
0x80000000|504, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 179
25,MIN_REDUCTION+211, // `[
103,MIN_REDUCTION+211, // "["
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 180
0x80000000|329, // match move
0x80000000|229, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 181
25,524, // `[
68,277, // `.
103,33, // "["
120,2, // "."
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 182
2,243, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 183
73,595, // <empty bracket pair>**
146,10, // <empty bracket pair>*
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 184
7,473, // ID
17,478, // `(
23,5, // `null
32,162, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 185
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 186
37,332, // `=
122,209, // "="
  }
,
{ // state 187
89,323, // "e"
  }
,
{ // state 188
0x80000000|324, // match move
0x80000000|528, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 189
7,536, // ID
24,249, // <empty bracket pair>
25,345, // `[
74,532, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,327, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
103,33, // "["
  }
,
{ // state 190
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 191
0x80000000|398, // match move
0x80000000|433, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 192
54,400, // `==
55,485, // `!=
123,140, // "@"
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 193
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 194
2,14, // ws*
25,MIN_REDUCTION+112, // `[
103,MIN_REDUCTION+112, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 196
0x80000000|280, // match move
0x80000000|8, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 197
89,149, // "e"
  }
,
{ // state 198
25,MIN_REDUCTION+107, // `[
103,MIN_REDUCTION+107, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 199
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 201
25,MIN_REDUCTION+64, // `[
38,606, // `++
39,497, // `--
103,MIN_REDUCTION+64, // "["
123,124, // "@"
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 202
18,537, // `)
110,500, // ")"
  }
,
{ // state 203
0x80000000|274, // match move
0x80000000|565, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 204
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 205
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 206
25,MIN_REDUCTION+105, // `[
103,MIN_REDUCTION+105, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 207
0x80000000|151, // match move
0x80000000|461, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 208
2,211, // ws*
25,MIN_REDUCTION+108, // `[
103,MIN_REDUCTION+108, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 209
2,510, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 210
25,MIN_REDUCTION+80, // `[
103,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 211
0x80000000|1, // match move
0x80000000|198, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 212
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 213
54,400, // `==
55,485, // `!=
123,140, // "@"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 214
0x80000000|484, // match move
0x80000000|285, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 215
2,571, // ws*
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 216
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 217
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
27, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
188, // <stmt>
256, // <assign>
464, // `;
26, // <local var decl>
51, // `if
315, // <exp>
-1, // `else
250, // `for
62, // `while
525, // `break
-1, // `=
236, // `++
556, // `--
223, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
196, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
-1, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 218
106,611, // "|"
109,322, // "&"
  }
,
{ // state 219
25,MIN_REDUCTION+73, // `[
103,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 221
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 223
17,184, // `(
118,514, // "("
  }
,
{ // state 224
86,182, // "u"
  }
,
{ // state 225
25,MIN_REDUCTION+181, // `[
103,MIN_REDUCTION+181, // "["
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 226
0x80000000|269, // match move
0x80000000|502, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 227
2,273, // ws*
25,MIN_REDUCTION+150, // `[
37,MIN_REDUCTION+150, // `=
52,MIN_REDUCTION+150, // `||
53,MIN_REDUCTION+150, // `&&
54,MIN_REDUCTION+150, // `==
55,MIN_REDUCTION+150, // `!=
56,MIN_REDUCTION+150, // `<
57,MIN_REDUCTION+150, // `<=
58,MIN_REDUCTION+150, // `>
63,MIN_REDUCTION+150, // `%
105,MIN_REDUCTION+150, // "<"
107,389, // " "
115,MIN_REDUCTION+150, // ">"
117,MIN_REDUCTION+150, // "%"
122,MIN_REDUCTION+150, // "="
123,MIN_REDUCTION+150, // "@"
124,261, // {10}
133,613, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 228
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 232
2,439, // ws*
25,MIN_REDUCTION+110, // `[
103,MIN_REDUCTION+110, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 234
24,290, // <empty bracket pair>
25,284, // `[
103,33, // "["
  }
,
{ // state 235
0x80000000|1, // match move
0x80000000|60, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 236
7,421, // ID
74,532, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,327, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
  }
,
{ // state 237
18,335, // `)
110,500, // ")"
  }
,
{ // state 238
0x80000000|1, // match move
0x80000000|564, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 239
0x80000000|129, // match move
0x80000000|582, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 240
0x80000000|1, // match move
0x80000000|338, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 241
25,MIN_REDUCTION+175, // `[
103,MIN_REDUCTION+175, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 243
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 244
25,MIN_REDUCTION+183, // `[
103,MIN_REDUCTION+183, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 245
17,614, // `(
118,514, // "("
  }
,
{ // state 246
0x80000000|471, // match move
0x80000000|156, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 247
2,88, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 248
0x80000000|220, // match move
0x80000000|402, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 249
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 250
17,373, // `(
118,514, // "("
  }
,
{ // state 251
59,90, // `+
60,352, // `-
104,311, // "-"
119,109, // "+"
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 252
107,MIN_REDUCTION+83, // " "
124,MIN_REDUCTION+83, // {10}
133,MIN_REDUCTION+83, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 253
2,439, // ws*
  }
,
{ // state 254
0x80000000|66, // match move
0x80000000|308, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 255
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
27, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
413, // <stmt>
256, // <assign>
464, // `;
26, // <local var decl>
51, // `if
315, // <exp>
-1, // `else
250, // `for
62, // `while
525, // `break
-1, // `=
236, // `++
556, // `--
223, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
196, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
-1, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 256
29,20, // `;
113,196, // ";"
  }
,
{ // state 257
26,458, // `]
111,175, // "]"
  }
,
{ // state 258
18,587, // `)
110,500, // ")"
  }
,
{ // state 259
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 260
2,410, // ws*
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 261
0x80000000|585, // match move
0x80000000|3, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 262
61,288, // `*
62,501, // `/
63,511, // `%
112,157, // "/"
117,276, // "%"
129,529, // "*"
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 263
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 264
7,473, // ID
23,5, // `null
51,272, // <exp1>
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
108,40, // "#"
123,401, // "@"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 265
2,571, // ws*
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 266
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 267
0x80000000|153, // match move
0x80000000|148, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 268
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 269
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 270
25,MIN_REDUCTION+182, // `[
103,MIN_REDUCTION+182, // "["
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 271
97,512, // digit
98,302, // {"1".."9"}
99,302, // "0"
100,434, // digit128
101,59, // {176..185}
136,457, // digit*
137,21, // $$1
  }
,
{ // state 272
0x80000000|1, // match move
0x80000000|181, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 273
0x80000000|372, // match move
0x80000000|93, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 274
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 276
2,221, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 277
7,22, // ID
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
  }
,
{ // state 278
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 279
104,592, // "-"
119,601, // "+"
128,583, // '"'
  }
,
{ // state 280
2,89, // ws*
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 281
0x80000000|1, // match move
0x80000000|437, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 282
0x80000000|1, // match move
0x80000000|313, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 283
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 284
26,246, // `]
111,175, // "]"
  }
,
{ // state 285
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 286
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 287
25,MIN_REDUCTION+64, // `[
103,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 288
7,473, // ID
17,478, // `(
23,5, // `null
50,615, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 289
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 290
0x80000000|487, // match move
0x80000000|563, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 291
2,469, // ws*
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 292
7,MIN_REDUCTION+15, // ID
25,MIN_REDUCTION+73, // `[
75,MIN_REDUCTION+15, // "a"
76,MIN_REDUCTION+15, // "p"
77,MIN_REDUCTION+15, // "s"
78,MIN_REDUCTION+15, // "v"
79,MIN_REDUCTION+15, // "c"
80,MIN_REDUCTION+15, // "f"
81,MIN_REDUCTION+15, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,MIN_REDUCTION+15, // "i"
83,MIN_REDUCTION+15, // "l"
84,MIN_REDUCTION+15, // "o"
85,MIN_REDUCTION+15, // "r"
86,MIN_REDUCTION+15, // "u"
87,MIN_REDUCTION+15, // "x"
88,MIN_REDUCTION+15, // "b"
89,MIN_REDUCTION+15, // "e"
90,MIN_REDUCTION+15, // "h"
91,MIN_REDUCTION+15, // "n"
92,MIN_REDUCTION+15, // "t"
93,MIN_REDUCTION+15, // "w"
95,MIN_REDUCTION+15, // {199..218 231..250}
96,MIN_REDUCTION+15, // {193..198 225..230}
103,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 293
59,90, // `+
60,352, // `-
104,311, // "-"
119,109, // "+"
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 294
18,351, // `)
110,500, // ")"
  }
,
{ // state 295
2,120, // ws*
25,MIN_REDUCTION+180, // `[
103,MIN_REDUCTION+180, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 296
26,9, // `]
111,175, // "]"
  }
,
{ // state 297
25,MIN_REDUCTION+69, // `[
103,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 298
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 299
25,MIN_REDUCTION+66, // `[
103,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 300
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 301
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 302
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 303
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
303, // `{
-1, // <decl in class>*
407, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
132, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
32, // <stmt>
143, // <assign>
98, // `;
561, // <local var decl>
245, // `if
315, // <exp>
-1, // `else
97, // `for
339, // `while
545, // `break
-1, // `=
236, // `++
556, // `--
612, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
379, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
340, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 304
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 305
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
27, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
509, // <stmt>
256, // <assign>
464, // `;
26, // <local var decl>
51, // `if
315, // <exp>
-1, // `else
250, // `for
62, // `while
525, // `break
-1, // `=
236, // `++
556, // `--
223, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
196, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
-1, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 306
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 307
105,71, // "<"
106,611, // "|"
109,322, // "&"
122,70, // "="
126,79, // "!"
  }
,
{ // state 308
107,MIN_REDUCTION+211, // " "
124,MIN_REDUCTION+211, // {10}
133,MIN_REDUCTION+211, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 309
86,73, // "u"
  }
,
{ // state 310
2,378, // ws*
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 311
2,53, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 312
2,522, // ws*
25,MIN_REDUCTION+106, // `[
103,MIN_REDUCTION+106, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 313
25,MIN_REDUCTION+72, // `[
103,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 314
7,597, // ID
10,596, // `}
12,301, // <decl in class>
13,266, // <method decl>
14,275, // <inst var decl>
15,505, // `public
16,431, // `void
20,189, // <type>
21,399, // `int
22,164, // `boolean
23,321, // `null
74,532, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,327, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
108,78, // "#"
125,340, // "}"
  }
,
{ // state 315
37,334, // `=
122,209, // "="
  }
,
{ // state 316
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
303, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
558, // <stmt>
143, // <assign>
98, // `;
561, // <local var decl>
245, // `if
315, // <exp>
-1, // `else
97, // `for
339, // `while
545, // `break
-1, // `=
236, // `++
556, // `--
612, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
379, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
-1, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 317
3,549, // <program>
4,72, // <class decl>+
5,552, // <class decl>
6,438, // `class
107,104, // " "
108,605, // "#"
124,31, // {10}
133,49, // ws
  }
,
{ // state 318
7,473, // ID
17,478, // `(
23,5, // `null
32,18, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 319
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 320
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 321
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 322
2,385, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 323
2,74, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 324
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 325
83,371, // "l"
  }
,
{ // state 326
7,12, // ID
17,478, // `(
23,5, // `null
28,415, // <assign>
32,315, // <exp>
38,236, // `++
39,556, // `--
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,279, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 327
2,190, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 328
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 329
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 330
7,473, // ID
23,5, // `null
51,472, // <exp1>
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
108,40, // "#"
123,401, // "@"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 331
61,288, // `*
62,501, // `/
63,511, // `%
112,157, // "/"
117,276, // "%"
129,529, // "*"
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 332
7,473, // ID
17,478, // `(
23,5, // `null
32,630, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 333
75,393, // "a"
76,393, // "p"
77,393, // "s"
78,393, // "v"
79,393, // "c"
80,393, // "f"
81,393, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,393, // "i"
83,393, // "l"
84,393, // "o"
85,393, // "r"
86,393, // "u"
87,393, // "x"
88,393, // "b"
89,393, // "e"
90,393, // "h"
91,393, // "n"
92,393, // "t"
93,393, // "w"
96,456, // {193..198 225..230}
98,393, // {"1".."9"}
99,393, // "0"
101,456, // {176..185}
138,610, // hexDigit*
139,35, // $$2
144,541, // hexDigit
145,557, // hexDigit128
  }
,
{ // state 334
7,473, // ID
17,478, // `(
23,5, // `null
32,43, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 335
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
303, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
29, // <stmt>
143, // <assign>
98, // `;
561, // <local var decl>
245, // `if
315, // <exp>
-1, // `else
97, // `for
339, // `while
545, // `break
-1, // `=
236, // `++
556, // `--
612, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
379, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
-1, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 336
75,52, // "a"
76,52, // "p"
77,52, // "s"
78,52, // "v"
79,52, // "c"
80,52, // "f"
81,52, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,52, // "i"
83,52, // "l"
84,52, // "o"
85,52, // "r"
86,52, // "u"
87,52, // "x"
88,52, // "b"
89,52, // "e"
90,52, // "h"
91,52, // "n"
92,52, // "t"
93,52, // "w"
95,627, // {199..218 231..250}
96,627, // {193..198 225..230}
98,52, // {"1".."9"}
99,52, // "0"
101,627, // {176..185}
102,328, // any
103,52, // "["
104,52, // "-"
105,52, // "<"
106,52, // "|"
107,52, // " "
108,52, // "#"
109,52, // "&"
110,52, // ")"
111,52, // "]"
112,52, // "/"
113,52, // ";"
114,52, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
115,52, // ">"
116,52, // "{"
117,52, // "%"
118,52, // "("
119,52, // "+"
120,52, // "."
121,52, // "_"
122,52, // "="
123,52, // "@"
124,52, // {10}
125,52, // "}"
126,52, // "!"
127,52, // "'"
128,52, // '"'
129,52, // "*"
130,69, // any128
131,627, // {223}
132,627, // {128..175 186..192 219..222 224 251..255}
141,620, // $$3
  }
,
{ // state 337
53,520, // `&&
123,218, // "@"
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 338
25,524, // `[
68,277, // `.
103,33, // "["
120,2, // "."
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 339
17,599, // `(
118,514, // "("
  }
,
{ // state 340
2,212, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+138, // (default reduction)
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 341
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 342
75,83, // "a"
  }
,
{ // state 343
59,90, // `+
60,352, // `-
104,311, // "-"
119,109, // "+"
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 344
24,214, // <empty bracket pair>
25,284, // `[
73,595, // <empty bracket pair>**
103,33, // "["
146,10, // <empty bracket pair>*
  }
,
{ // state 345
26,134, // `]
111,121, // "]"
  }
,
{ // state 346
75,112, // "a"
76,112, // "p"
77,112, // "s"
78,112, // "v"
79,112, // "c"
80,112, // "f"
81,112, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,112, // "i"
83,112, // "l"
84,112, // "o"
85,112, // "r"
86,112, // "u"
87,112, // "x"
88,112, // "b"
89,112, // "e"
90,112, // "h"
91,112, // "n"
92,112, // "t"
93,112, // "w"
98,112, // {"1".."9"}
99,112, // "0"
102,513, // any
103,112, // "["
104,112, // "-"
105,112, // "<"
106,112, // "|"
107,112, // " "
108,112, // "#"
109,112, // "&"
110,112, // ")"
111,112, // "]"
112,112, // "/"
113,112, // ";"
114,112, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
115,112, // ">"
116,112, // "{"
117,112, // "%"
118,112, // "("
119,112, // "+"
120,112, // "."
121,112, // "_"
122,112, // "="
123,112, // "@"
124,112, // {10}
125,112, // "}"
126,112, // "!"
127,112, // "'"
128,112, // '"'
129,112, // "*"
  }
,
{ // state 347
29,467, // `;
113,379, // ";"
  }
,
{ // state 348
78,135, // "v"
  }
,
{ // state 349
2,378, // ws*
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 351
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
27, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
381, // <stmt>
256, // <assign>
464, // `;
26, // <local var decl>
51, // `if
315, // <exp>
-1, // `else
250, // `for
62, // `while
525, // `break
-1, // `=
236, // `++
556, // `--
223, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
196, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
-1, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 352
7,473, // ID
17,478, // `(
23,5, // `null
49,331, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 353
2,152, // ws*
  }
,
{ // state 354
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 355
2,625, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 356
8,550, // `{
116,474, // "{"
  }
,
{ // state 357
56,589, // `<
57,105, // `<=
58,75, // `>
105,411, // "<"
115,84, // ">"
123,307, // "@"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 358
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 359
25,MIN_REDUCTION+81, // `[
103,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 360
0x80000000|591, // match move
0x80000000|38, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 361
108,114, // "#"
  }
,
{ // state 362
0x80000000|176, // match move
0x80000000|527, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 363
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 364
7,473, // ID
17,478, // `(
23,5, // `null
29,326, // `;
32,531, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
113,379, // ";"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 365
0x80000000|215, // match move
0x80000000|265, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 366
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 368
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 369
0x80000000|1, // match move
0x80000000|554, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 370
0x80000000|1, // match move
0x80000000|241, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 371
2,486, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 372
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 373
7,12, // ID
17,478, // `(
23,5, // `null
28,347, // <assign>
32,315, // <exp>
38,236, // `++
39,556, // `--
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,279, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 374
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 375
90,414, // "h"
  }
,
{ // state 376
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 377
53,520, // `&&
123,218, // "@"
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 378
0x80000000|518, // match move
0x80000000|119, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 379
2,165, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 380
10,207, // `}
41,515, // <case>*
42,468, // <case>
43,580, // `case
108,495, // "#"
125,387, // "}"
  }
,
{ // state 381
0x80000000|24, // match move
0x80000000|85, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 382
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 383
2,57, // ws*
25,MIN_REDUCTION+170, // `[
103,MIN_REDUCTION+170, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 384
56,589, // `<
57,105, // `<=
58,75, // `>
105,411, // "<"
115,84, // ">"
123,307, // "@"
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 385
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 386
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 387
0x80000000|608, // match move
0x80000000|523, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 388
2,534, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 389
0x80000000|577, // match move
0x80000000|17, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 390
7,597, // ID
9,519, // <decl in class>*
10,320, // `}
12,230, // <decl in class>
13,266, // <method decl>
14,275, // <inst var decl>
15,505, // `public
16,431, // `void
20,189, // <type>
21,399, // `int
22,164, // `boolean
23,321, // `null
74,532, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,327, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
108,78, // "#"
125,340, // "}"
  }
,
{ // state 391
10,100, // `}
42,496, // <case>
43,580, // `case
108,495, // "#"
125,340, // "}"
  }
,
{ // state 392
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 393
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 394
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 395
25,524, // `[
68,277, // `.
103,33, // "["
120,2, // "."
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 396
7,473, // ID
17,478, // `(
23,5, // `null
32,258, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 397
2,268, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 398
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 399
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 400
7,473, // ID
17,478, // `(
23,5, // `null
47,357, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 401
128,583, // '"'
  }
,
{ // state 402
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 403
0x80000000|283, // match move
0x80000000|118, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 404
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 405
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 406
2,370, // ws*
  }
,
{ // state 407
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 408
24,248, // <empty bracket pair>
25,284, // `[
103,33, // "["
  }
,
{ // state 409
84,365, // "o"
  }
,
{ // state 410
0x80000000|259, // match move
0x80000000|111, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 411
2,479, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 412
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 413
0x80000000|459, // match move
0x80000000|85, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 414
2,463, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 415
18,569, // `)
110,500, // ")"
  }
,
{ // state 416
8,530, // `{
116,474, // "{"
  }
,
{ // state 417
0x80000000|310, // match move
0x80000000|349, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 418
2,11, // ws*
  }
,
{ // state 419
74,205, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,535, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
97,568, // digit
98,302, // {"1".."9"}
99,302, // "0"
100,191, // digit128
101,59, // {176..185}
121,13, // "_"
131,403, // {223}
135,178, // $$0
142,319, // idChar
143,544, // idChar128
  }
,
{ // state 420
86,73, // "u"
89,355, // "e"
  }
,
{ // state 421
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 422
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 423
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 424
75,83, // "a"
84,113, // "o"
  }
,
{ // state 425
25,MIN_REDUCTION+71, // `[
103,MIN_REDUCTION+71, // "["
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 426
25,MIN_REDUCTION+192, // `[
103,MIN_REDUCTION+192, // "["
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 427
59,90, // `+
60,352, // `-
104,311, // "-"
119,109, // "+"
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 428
0x80000000|1, // match move
0x80000000|588, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 429
0x80000000|406, // match move
0x80000000|628, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 430
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
303, // `{
-1, // <decl in class>*
594, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
108, // <stmt>
143, // <assign>
98, // `;
561, // <local var decl>
245, // `if
315, // <exp>
-1, // `else
97, // `for
339, // `while
545, // `break
-1, // `=
236, // `++
556, // `--
612, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
379, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
387, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 431
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 432
74,205, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,535, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
97,568, // digit
98,302, // {"1".."9"}
99,302, // "0"
100,191, // digit128
101,59, // {176..185}
121,13, // "_"
131,403, // {223}
134,419, // idChar*
135,23, // $$0
142,546, // idChar
143,544, // idChar128
  }
,
{ // state 433
25,MIN_REDUCTION+189, // `[
103,MIN_REDUCTION+189, // "["
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 434
0x80000000|418, // match move
0x80000000|603, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 435
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 436
18,63, // `)
110,500, // ")"
  }
,
{ // state 437
25,MIN_REDUCTION+70, // `[
103,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 438
7,476, // ID
74,532, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,327, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
  }
,
{ // state 439
0x80000000|1, // match move
0x80000000|102, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 440
148,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 441
2,57, // ws*
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 442
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 443
7,12, // ID
17,478, // `(
23,5, // `null
28,145, // <assign>
32,315, // <exp>
38,236, // `++
39,556, // `--
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,279, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 444
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 445
107,104, // " "
124,31, // {10}
133,49, // ws
148,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 446
25,MIN_REDUCTION+111, // `[
103,MIN_REDUCTION+111, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 447
74,205, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,231, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
97,568, // digit
98,302, // {"1".."9"}
99,302, // "0"
100,127, // digit128
101,491, // {176..185}
121,13, // "_"
131,573, // {223}
135,94, // $$0
142,319, // idChar
143,494, // idChar128
  }
,
{ // state 448
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 449
77,624, // "s"
78,135, // "v"
80,424, // "f"
82,67, // "i"
88,616, // "b"
91,420, // "n"
92,86, // "t"
93,375, // "w"
119,76, // "+"
  }
,
{ // state 450
0x80000000|1, // match move
0x80000000|68, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 451
29,155, // `;
113,379, // ";"
  }
,
{ // state 452
18,255, // `)
110,500, // ")"
  }
,
{ // state 453
7,12, // ID
17,478, // `(
23,5, // `null
28,117, // <assign>
32,315, // <exp>
38,236, // `++
39,556, // `--
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,279, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 454
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 455
84,499, // "o"
  }
,
{ // state 456
0x80000000|150, // match move
0x80000000|426, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 457
97,80, // digit
98,302, // {"1".."9"}
99,302, // "0"
100,434, // digit128
101,59, // {176..185}
137,116, // $$1
  }
,
{ // state 458
0x80000000|1, // match move
0x80000000|65, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 459
33,305, // `else
108,114, // "#"
  }
,
{ // state 460
0x80000000|1, // match move
0x80000000|299, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 461
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 462
0x80000000|441, // match move
0x80000000|383, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 463
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 464
0x80000000|263, // match move
0x80000000|404, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 465
2,273, // ws*
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 466
0x80000000|483, // match move
0x80000000|291, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 467
7,473, // ID
17,478, // `(
23,5, // `null
29,575, // `;
32,146, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
113,379, // ";"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 468
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 469
0x80000000|392, // match move
0x80000000|56, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 470
2,168, // ws*
  }
,
{ // state 471
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 472
0x80000000|1, // match move
0x80000000|395, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 473
0x80000000|1, // match move
0x80000000|287, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 474
2,306, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 475
7,142, // ID
74,532, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,327, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
  }
,
{ // state 476
8,390, // `{
11,160, // `extends
108,197, // "#"
116,474, // "{"
  }
,
{ // state 477
83,516, // "l"
  }
,
{ // state 478
7,597, // ID
16,431, // `void
20,169, // <type>
21,399, // `int
22,164, // `boolean
23,321, // `null
74,532, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,327, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
108,600, // "#"
  }
,
{ // state 479
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 480
25,345, // `[
103,33, // "["
  }
,
{ // state 481
61,288, // `*
62,501, // `/
63,511, // `%
112,157, // "/"
117,276, // "%"
129,529, // "*"
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 482
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 483
2,469, // ws*
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 484
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 485
7,473, // ID
17,478, // `(
23,5, // `null
47,92, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 486
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 487
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 488
18,235, // `)
110,46, // ")"
  }
,
{ // state 489
2,428, // ws*
25,MIN_REDUCTION+134, // `[
103,MIN_REDUCTION+134, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 490
7,473, // ID
17,478, // `(
23,5, // `null
32,452, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 491
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 492
0x80000000|604, // match move
0x80000000|312, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 493
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 494
2,626, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 495
79,187, // "c"
  }
,
{ // state 496
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 497
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 498
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 499
2,103, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 500
2,228, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 501
7,473, // ID
17,478, // `(
23,5, // `null
50,166, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 502
25,MIN_REDUCTION+210, // `[
103,MIN_REDUCTION+210, // "["
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 503
25,MIN_REDUCTION+169, // `[
103,MIN_REDUCTION+169, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 504
25,MIN_REDUCTION+171, // `[
103,MIN_REDUCTION+171, // "["
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 505
16,475, // `void
108,348, // "#"
  }
,
{ // state 506
104,592, // "-"
119,601, // "+"
  }
,
{ // state 507
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 508
25,MIN_REDUCTION+220, // `[
103,MIN_REDUCTION+220, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 509
0x80000000|394, // match move
0x80000000|341, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 510
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 511
7,473, // ID
17,478, // `(
23,5, // `null
50,204, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 512
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 513
0x80000000|539, // match move
0x80000000|158, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 514
2,278, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 515
10,131, // `}
42,496, // <case>
43,580, // `case
108,495, // "#"
125,387, // "}"
  }
,
{ // state 516
2,445, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
148,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 517
7,473, // ID
23,5, // `null
51,450, // <exp1>
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
108,40, // "#"
123,401, // "@"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 518
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 519
7,597, // ID
10,354, // `}
12,301, // <decl in class>
13,266, // <method decl>
14,275, // <inst var decl>
15,505, // `public
16,431, // `void
20,189, // <type>
21,399, // `int
22,164, // `boolean
23,321, // `null
74,532, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,327, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
108,78, // "#"
125,340, // "}"
  }
,
{ // state 520
7,473, // ID
17,478, // `(
23,5, // `null
46,213, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 521
2,152, // ws*
25,MIN_REDUCTION+221, // `[
103,MIN_REDUCTION+221, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 522
0x80000000|1, // match move
0x80000000|206, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 523
2,173, // ws*
107,621, // " "
124,203, // {10}
133,254, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 524
7,473, // ID
17,478, // `(
23,5, // `null
32,257, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 525
29,144, // `;
113,196, // ";"
  }
,
{ // state 526
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 527
25,MIN_REDUCTION+78, // `[
103,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 528
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 529
2,126, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 530
7,597, // ID
9,314, // <decl in class>*
10,374, // `}
12,230, // <decl in class>
13,266, // <method decl>
14,275, // <inst var decl>
15,505, // `public
16,431, // `void
20,189, // <type>
21,399, // `int
22,164, // `boolean
23,321, // `null
74,532, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,327, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
108,78, // "#"
125,340, // "}"
  }
,
{ // state 531
29,58, // `;
113,379, // ";"
  }
,
{ // state 532
74,205, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,231, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
97,568, // digit
98,302, // {"1".."9"}
99,302, // "0"
100,127, // digit128
101,491, // {176..185}
121,13, // "_"
131,573, // {223}
134,447, // idChar*
135,435, // $$0
142,546, // idChar
143,494, // idChar128
  }
,
{ // state 533
86,553, // "u"
  }
,
{ // state 534
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 535
0x80000000|412, // match move
0x80000000|619, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 536
29,195, // `;
113,379, // ";"
  }
,
{ // state 537
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
27, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
239, // <stmt>
256, // <assign>
464, // `;
26, // <local var decl>
51, // `if
315, // <exp>
-1, // `else
250, // `for
62, // `while
525, // `break
-1, // `=
236, // `++
556, // `--
223, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
196, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
-1, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 538
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
303, // `{
-1, // <decl in class>*
366, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
617, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
32, // <stmt>
143, // <assign>
98, // `;
561, // <local var decl>
245, // `if
315, // <exp>
-1, // `else
97, // `for
339, // `while
545, // `break
-1, // `=
236, // `++
556, // `--
612, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
379, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
340, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 539
2,36, // ws*
  }
,
{ // state 540
0x80000000|253, // match move
0x80000000|232, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 541
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 542
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 543
25,MIN_REDUCTION+218, // `[
103,MIN_REDUCTION+218, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 544
0x80000000|260, // match move
0x80000000|55, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 545
29,167, // `;
113,379, // ";"
  }
,
{ // state 546
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 547
107,621, // " "
124,203, // {10}
133,125, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 548
7,186, // ID
24,249, // <empty bracket pair>
25,345, // `[
74,532, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,327, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
103,33, // "["
  }
,
{ // state 549
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 550
10,584, // `}
41,391, // <case>*
42,468, // <case>
43,580, // `case
108,495, // "#"
125,340, // "}"
  }
,
{ // state 551
2,14, // ws*
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 552
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 553
2,216, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 554
25,MIN_REDUCTION+68, // `[
103,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 555
92,417, // "t"
  }
,
{ // state 556
7,222, // ID
74,532, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,327, // letter128
95,185, // {199..218 231..250}
96,185, // {193..198 225..230}
  }
,
{ // state 557
0x80000000|470, // match move
0x80000000|579, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 558
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 559
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 560
0x80000000|498, // match move
0x80000000|423, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 561
29,304, // `;
113,379, // ";"
  }
,
{ // state 562
147,MIN_REDUCTION+0, // $
  }
,
{ // state 563
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 564
25,MIN_REDUCTION+177, // `[
103,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 565
107,MIN_REDUCTION+84, // " "
124,MIN_REDUCTION+84, // {10}
133,MIN_REDUCTION+84, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 566
25,MIN_REDUCTION+174, // `[
103,MIN_REDUCTION+174, // "["
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 567
7,473, // ID
17,478, // `(
23,5, // `null
45,337, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 568
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 569
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
303, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
42, // <stmt>
143, // <assign>
98, // `;
561, // <local var decl>
245, // `if
315, // <exp>
-1, // `else
97, // `for
339, // `while
545, // `break
-1, // `=
236, // `++
556, // `--
612, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
379, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
-1, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 570
25,MIN_REDUCTION+216, // `[
103,MIN_REDUCTION+216, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 571
0x80000000|493, // match move
0x80000000|81, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 572
25,MIN_REDUCTION+75, // `[
103,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 573
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 574
2,193, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 575
7,12, // ID
17,478, // `(
23,5, // `null
28,202, // <assign>
32,315, // <exp>
38,236, // `++
39,556, // `--
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,279, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 576
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 577
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 578
106,611, // "|"
  }
,
{ // state 579
2,168, // ws*
25,MIN_REDUCTION+219, // `[
103,MIN_REDUCTION+219, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 580
7,473, // ID
17,478, // `(
23,5, // `null
32,451, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 581
17,488, // `(
118,514, // "("
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 582
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 583
0x80000000|609, // match move
0x80000000|295, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 584
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 585
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 586
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 587
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
27, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
360, // <stmt>
256, // <assign>
464, // `;
26, // <local var decl>
51, // `if
315, // <exp>
-1, // `else
250, // `for
62, // `while
525, // `break
-1, // `=
236, // `++
556, // `--
223, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
196, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
-1, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 588
25,MIN_REDUCTION+133, // `[
103,MIN_REDUCTION+133, // "["
107,389, // " "
124,261, // {10}
133,226, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 589
7,473, // ID
17,478, // `(
23,5, // `null
48,251, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 590
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 591
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 592
2,50, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 593
25,MIN_REDUCTION+82, // `[
103,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 594
0x80000000|200, // match move
0x80000000|363, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 595
0x80000000|1, // match move
0x80000000|572, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 596
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 597
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 599
7,473, // ID
17,478, // `(
23,5, // `null
32,133, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 600
78,135, // "v"
82,67, // "i"
88,455, // "b"
91,533, // "n"
  }
,
{ // state 601
2,526, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 602
107,MIN_REDUCTION+210, // " "
124,MIN_REDUCTION+210, // {10}
133,MIN_REDUCTION+210, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 603
2,11, // ws*
25,MIN_REDUCTION+217, // `[
103,MIN_REDUCTION+217, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 604
2,522, // ws*
  }
,
{ // state 605
79,325, // "c"
  }
,
{ // state 606
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 607
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 608
2,173, // ws*
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 609
2,120, // ws*
  }
,
{ // state 610
75,393, // "a"
76,393, // "p"
77,393, // "s"
78,393, // "v"
79,393, // "c"
80,393, // "f"
81,393, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,393, // "i"
83,393, // "l"
84,393, // "o"
85,393, // "r"
86,393, // "u"
87,393, // "x"
88,393, // "b"
89,393, // "e"
90,393, // "h"
91,393, // "n"
92,393, // "t"
93,393, // "w"
96,456, // {193..198 225..230}
98,393, // {"1".."9"}
99,393, // "0"
101,456, // {176..185}
139,238, // $$2
144,300, // hexDigit
145,557, // hexDigit128
  }
,
{ // state 611
2,382, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+152, // (default reduction)
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 612
17,318, // `(
118,514, // "("
  }
,
{ // state 613
0x80000000|376, // match move
0x80000000|179, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 614
7,473, // ID
17,478, // `(
23,5, // `null
32,294, // <exp>
44,177, // <exp8>
45,377, // <exp7>
46,192, // <exp6>
47,384, // <exp5>
48,293, // <exp4>
49,481, // <exp3>
50,233, // <exp2>
51,137, // <exp1>
59,517, // `+
60,330, // `-
64,264, // `!
65,460, // INTLIT
66,139, // STRINGLIT
67,369, // CHARLIT
69,281, // `this
70,19, // `true
71,282, // `false
72,77, // `new
74,432, // letter
75,454, // "a"
76,454, // "p"
77,454, // "s"
78,454, // "v"
79,454, // "c"
80,454, // "f"
81,454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
82,454, // "i"
83,454, // "l"
84,454, // "o"
85,454, // "r"
86,454, // "u"
87,454, // "x"
88,454, // "b"
89,454, // "e"
90,454, // "h"
91,454, // "n"
92,454, // "t"
93,454, // "w"
94,462, // letter128
95,362, // {199..218 231..250}
96,362, // {193..198 225..230}
98,271, // {"1".."9"}
99,333, // "0"
100,429, // digit128
101,59, // {176..185}
104,311, // "-"
108,40, // "#"
118,514, // "("
119,109, // "+"
123,401, // "@"
126,388, // "!"
127,346, // "'"
128,174, // '"'
  }
,
{ // state 615
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 616
84,499, // "o"
85,397, // "r"
  }
,
{ // state 617
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
122, // ID
303, // `{
-1, // <decl in class>*
576, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
431, // `void
478, // `(
-1, // `)
-1, // <stmt>*
548, // <type>
399, // `int
164, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
108, // <stmt>
143, // <assign>
98, // `;
561, // <local var decl>
245, // `if
315, // <exp>
-1, // `else
97, // `for
339, // `while
545, // `break
-1, // `=
236, // `++
556, // `--
612, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
177, // <exp8>
377, // <exp7>
192, // <exp6>
384, // <exp5>
293, // <exp4>
481, // <exp3>
233, // <exp2>
137, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
517, // `+
330, // `-
-1, // `*
-1, // `/
-1, // `%
264, // `!
460, // INTLIT
139, // STRINGLIT
369, // CHARLIT
-1, // `.
281, // `this
19, // `true
282, // `false
77, // `new
-1, // <empty bracket pair>**
432, // letter
454, // "a"
454, // "p"
454, // "s"
454, // "v"
454, // "c"
454, // "f"
454, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
454, // "i"
454, // "l"
454, // "o"
454, // "r"
454, // "u"
454, // "x"
454, // "b"
454, // "e"
454, // "h"
454, // "n"
454, // "t"
454, // "w"
462, // letter128
362, // {199..218 231..250}
362, // {193..198 225..230}
-1, // digit
271, // {"1".."9"}
333, // "0"
429, // digit128
59, // {176..185}
-1, // any
-1, // "["
311, // "-"
-1, // "<"
-1, // "|"
-1, // " "
449, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
379, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
474, // "{"
-1, // "%"
514, // "("
109, // "+"
-1, // "."
-1, // "_"
-1, // "="
279, // "@"
-1, // {10}
340, // "}"
388, // "!"
346, // "'"
174, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // <empty bracket pair>*
-1, // $
-1, // $NT
  }
,
{ // state 618
0x80000000|242, // match move
0x80000000|25, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 619
25,MIN_REDUCTION+188, // `[
103,MIN_REDUCTION+188, // "["
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 620
0x80000000|1, // match move
0x80000000|225, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 621
0x80000000|170, // match move
0x80000000|252, // no-match move
0x80000000|361, // NT-test-match state for `else
  }
,
{ // state 622
2,368, // ws*
107,104, // " "
124,31, // {10}
133,440, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 623
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 624
93,574, // "w"
  }
,
{ // state 625
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 626
107,104, // " "
124,31, // {10}
133,49, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 627
0x80000000|422, // match move
0x80000000|593, // no-match move
0x80000000|480, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 628
2,370, // ws*
25,MIN_REDUCTION+176, // `[
103,MIN_REDUCTION+176, // "["
107,389, // " "
124,261, // {10}
133,613, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 629
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 630
MIN_REDUCTION+34, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[631][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= <start>
(0<<16)+1,
// <start> ::= ws* <program>
(1<<16)+2,
// <start> ::= <program>
(1<<16)+1,
// <program> ::= <class decl>+
(3<<16)+1,
// <class decl> ::= `class ID `{ <decl in class>* `}
(5<<16)+5,
// <class decl> ::= `class ID `{ `}
(5<<16)+4,
// <class decl> ::= `class ID `extends ID `{ <decl in class>* `}
(5<<16)+7,
// <class decl> ::= `class ID `extends ID `{ `}
(5<<16)+6,
// <decl in class> ::= <method decl>
(12<<16)+1,
// <decl in class> ::= <inst var decl>
(12<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(13<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(13<<16)+7,
// <type> ::= `int
(20<<16)+1,
// <type> ::= `boolean
(20<<16)+1,
// <type> ::= `void
(20<<16)+1,
// <type> ::= `null
(20<<16)+1,
// <type> ::= ID
(20<<16)+1,
// <type> ::= <type> <empty bracket pair>
(20<<16)+2,
// <empty bracket pair> ::= `[ `]
(24<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(27<<16)+3,
// <stmt> ::= `{ `}
(27<<16)+2,
// <stmt> ::= <assign> `;
(27<<16)+2,
// <stmt> ::= <local var decl> `;
(27<<16)+2,
// <stmt> ::= `if `( <exp> `) <stmt> !`else
(27<<16)+5,
// <stmt> ::= `if `( <exp> `) <stmt> `else <stmt>
(27<<16)+7,
// <stmt> ::= `for `( <assign> `; <exp> `; <assign> `) <stmt>
(27<<16)+9,
// <stmt> ::= `for `( <assign> `; `; <assign> `) <stmt>
(27<<16)+8,
// <stmt> ::= `while `( <exp> `) <stmt>
(27<<16)+5,
// <stmt> ::= `break `;
(27<<16)+2,
// <assign> ::= <exp> `= <exp>
(28<<16)+3,
// <assign> ::= ID `++
(28<<16)+2,
// <assign> ::= `++ ID
(28<<16)+2,
// <assign> ::= ID `--
(28<<16)+2,
// <assign> ::= `-- ID
(28<<16)+2,
// <local var decl> ::= <type> ID `= <exp>
(30<<16)+4,
// <inst var decl> ::= <type> ID `;
(14<<16)+3,
// <stmt> ::= `;
(27<<16)+1,
// <stmt> ::= `switch `( <exp> `) `{ <case>* `}
(27<<16)+7,
// <stmt> ::= `switch `( <exp> `) `{ `}
(27<<16)+6,
// <case> ::= `case <exp> `;
(42<<16)+3,
// <exp> ::= <exp8>
(32<<16)+1,
// <exp8> ::= <exp7>
(44<<16)+1,
// <exp7> ::= <exp6>
(45<<16)+1,
// <exp6> ::= <exp5>
(46<<16)+1,
// <exp5> ::= <exp4>
(47<<16)+1,
// <exp4> ::= <exp3>
(48<<16)+1,
// <exp3> ::= <exp2>
(49<<16)+1,
// <exp2> ::= <exp1>
(50<<16)+1,
// <exp8> ::= <exp8> `|| <exp7>
(44<<16)+3,
// <exp7> ::= <exp7> `&& <exp6>
(45<<16)+3,
// <exp6> ::= <exp6> `== <exp5>
(46<<16)+3,
// <exp6> ::= <exp6> `!= <exp5>
(46<<16)+3,
// <exp5> ::= <exp5> `< <exp4>
(47<<16)+3,
// <exp5> ::= <exp5> `<= <exp4>
(47<<16)+3,
// <exp5> ::= <exp5> `> <exp4>
(47<<16)+3,
// <exp4> ::= <exp4> `+ <exp3>
(48<<16)+3,
// <exp4> ::= <exp4> `- <exp3>
(48<<16)+3,
// <exp3> ::= <exp3> `* <exp2>
(49<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(49<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(49<<16)+3,
// <exp2> ::= `( <type> `) <exp1>
(50<<16)+4,
// <exp2> ::= `+ <exp1>
(50<<16)+2,
// <exp2> ::= `- <exp1>
(50<<16)+2,
// <exp2> ::= `! <exp1>
(50<<16)+2,
// <exp1> ::= ID
(51<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(51<<16)+4,
// <exp1> ::= INTLIT
(51<<16)+1,
// <exp1> ::= STRINGLIT
(51<<16)+1,
// <exp1> ::= CHARLIT
(51<<16)+1,
// <exp1> ::= <exp1> `. ID
(51<<16)+3,
// <exp1> ::= `this
(51<<16)+1,
// <exp1> ::= `true
(51<<16)+1,
// <exp1> ::= `false
(51<<16)+1,
// <exp1> ::= `null
(51<<16)+1,
// <exp1> ::= `new ID `( `)
(51<<16)+4,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] <empty bracket pair>**
(51<<16)+6,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] !<empty bracket pair>
(51<<16)+5,
// letter ::= {"A".."Z" "a".."z"}
(74<<16)+1,
// letter128 ::= {193..218 225..250}
(94<<16)+1,
// digit ::= {"0".."9"}
(97<<16)+1,
// digit128 ::= {176..185}
(100<<16)+1,
// any ::= {0..127}
(102<<16)+1,
// any128 ::= {128..255}
(130<<16)+1,
// ws ::= " "
(133<<16)+1,
// ws ::= {10}
(133<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(22<<16)+4,
// `boolean ::= "#" "b" "o"
(22<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `extends ::= "#" "e" "x" ws*
(11<<16)+4,
// `extends ::= "#" "e" "x"
(11<<16)+3,
// `void ::= "#" "v" "o" ws*
(16<<16)+4,
// `void ::= "#" "v" "o"
(16<<16)+3,
// `int ::= "#" "i" "t" ws*
(21<<16)+4,
// `int ::= "#" "i" "t"
(21<<16)+3,
// `while ::= "#" "w" "h" ws*
(35<<16)+4,
// `while ::= "#" "w" "h"
(35<<16)+3,
// `if ::= "#" "+" ws*
(31<<16)+3,
// `if ::= "#" "+"
(31<<16)+2,
// `else ::= "#" "e" "l" ws*
(33<<16)+4,
// `else ::= "#" "e" "l"
(33<<16)+3,
// `for ::= "#" "f" "o" ws*
(34<<16)+4,
// `for ::= "#" "f" "o"
(34<<16)+3,
// `break ::= "#" "b" "r" ws*
(36<<16)+4,
// `break ::= "#" "b" "r"
(36<<16)+3,
// `this ::= "#" "t" "h" ws*
(69<<16)+4,
// `this ::= "#" "t" "h"
(69<<16)+3,
// `false ::= "#" "f" "a" ws*
(71<<16)+4,
// `false ::= "#" "f" "a"
(71<<16)+3,
// `true ::= "#" "t" "r" ws*
(70<<16)+4,
// `true ::= "#" "t" "r"
(70<<16)+3,
// `null ::= "#" "n" "u" ws*
(23<<16)+4,
// `null ::= "#" "n" "u"
(23<<16)+3,
// `new ::= "#" "n" "e" ws*
(72<<16)+4,
// `new ::= "#" "n" "e"
(72<<16)+3,
// `case ::= "#" "c" "e" ws*
(43<<16)+4,
// `case ::= "#" "c" "e"
(43<<16)+3,
// `public ::= "#" "p" "u" ws*
(15<<16)+4,
// `public ::= "#" "p" "u"
(15<<16)+3,
// `switch ::= "#" "s" "w" ws*
(40<<16)+4,
// `switch ::= "#" "s" "w"
(40<<16)+3,
// `! ::= "!" ws*
(64<<16)+2,
// `! ::= "!"
(64<<16)+1,
// `!= ::= "@" "!" ws*
(55<<16)+3,
// `!= ::= "@" "!"
(55<<16)+2,
// `% ::= "%" ws*
(63<<16)+2,
// `% ::= "%"
(63<<16)+1,
// `&& ::= "@" "&" ws*
(53<<16)+3,
// `&& ::= "@" "&"
(53<<16)+2,
// `* ::= "*" ws*
(61<<16)+2,
// `* ::= "*"
(61<<16)+1,
// `( ::= "(" ws*
(17<<16)+2,
// `( ::= "("
(17<<16)+1,
// `) ::= ")" ws*
(18<<16)+2,
// `) ::= ")"
(18<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(60<<16)+2,
// `- ::= "-"
(60<<16)+1,
// `+ ::= "+" ws*
(59<<16)+2,
// `+ ::= "+"
(59<<16)+1,
// `= ::= "=" ws*
(37<<16)+2,
// `= ::= "="
(37<<16)+1,
// `== ::= "@" "=" ws*
(54<<16)+3,
// `== ::= "@" "="
(54<<16)+2,
// `[ ::= "[" ws*
(25<<16)+2,
// `[ ::= "["
(25<<16)+1,
// `] ::= "]" ws*
(26<<16)+2,
// `] ::= "]"
(26<<16)+1,
// `|| ::= "@" "|" ws*
(52<<16)+3,
// `|| ::= "@" "|"
(52<<16)+2,
// `< ::= "<" ws*
(56<<16)+2,
// `< ::= "<"
(56<<16)+1,
// `<= ::= "@" "<" ws*
(57<<16)+3,
// `<= ::= "@" "<"
(57<<16)+2,
// `> ::= ">" !"=" ws*
(58<<16)+2,
// `> ::= ">" !"="
(58<<16)+1,
// `. ::= "." ws*
(68<<16)+2,
// `. ::= "."
(68<<16)+1,
// `; ::= ";" ws*
(29<<16)+2,
// `; ::= ";"
(29<<16)+1,
// `++ ::= "@" "+" ws*
(38<<16)+3,
// `++ ::= "@" "+"
(38<<16)+2,
// `-- ::= "@" "-" ws*
(39<<16)+3,
// `-- ::= "@" "-"
(39<<16)+2,
// `/ ::= "/" ws*
(62<<16)+2,
// `/ ::= "/"
(62<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(65<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(65<<16)+2,
// INTLIT ::= digit128 ws*
(65<<16)+2,
// INTLIT ::= digit128
(65<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(65<<16)+3,
// INTLIT ::= "0" $$2
(65<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(66<<16)+3,
// STRINGLIT ::= "@" '"'
(66<<16)+2,
// STRINGLIT ::= '"' any* $$3
(66<<16)+3,
// STRINGLIT ::= '"' $$3
(66<<16)+2,
// CHARLIT ::= "'" any ws*
(67<<16)+3,
// CHARLIT ::= "'" any
(67<<16)+2,
// idChar ::= letter
(142<<16)+1,
// idChar ::= digit
(142<<16)+1,
// idChar ::= "_"
(142<<16)+1,
// idChar128 ::= letter128
(143<<16)+1,
// idChar128 ::= digit128
(143<<16)+1,
// idChar128 ::= {223}
(143<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(144<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(145<<16)+1,
// digit* ::= digit* digit
(136<<16)+2,
// digit* ::= digit
(136<<16)+1,
// any* ::= any* any
(140<<16)+2,
// any* ::= any
(140<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(138<<16)+2,
// hexDigit* ::= hexDigit
(138<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(19<<16)+2,
// <stmt>* ::= <stmt>
(19<<16)+1,
// <case>* ::= <case>* <case>
(41<<16)+2,
// <case>* ::= <case>
(41<<16)+1,
// idChar* ::= idChar* idChar
(134<<16)+2,
// idChar* ::= idChar
(134<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>
(73<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>
(146<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>
(146<<16)+1,
// $$0 ::= idChar128 ws*
(135<<16)+2,
// $$0 ::= idChar128
(135<<16)+1,
// $$1 ::= digit128 ws*
(137<<16)+2,
// $$1 ::= digit128
(137<<16)+1,
// $$2 ::= hexDigit128 ws*
(139<<16)+2,
// $$2 ::= hexDigit128
(139<<16)+1,
// $$3 ::= any128 ws*
(141<<16)+2,
// $$3 ::= any128
(141<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
114, // 0
114, // 1
114, // 2
114, // 3
114, // 4
114, // 5
114, // 6
114, // 7
114, // 8
114, // 9
124, // 10
114, // 11
114, // 12
114, // 13
114, // 14
114, // 15
114, // 16
114, // 17
114, // 18
114, // 19
114, // 20
114, // 21
114, // 22
114, // 23
114, // 24
114, // 25
114, // 26
114, // 27
114, // 28
114, // 29
114, // 30
114, // 31
107, // " "
126, // "!"
128, // '"'
108, // "#"
114, // "$"
117, // "%"
109, // "&"
127, // "'"
118, // "("
110, // ")"
129, // "*"
119, // "+"
114, // ","
104, // "-"
120, // "."
112, // "/"
99, // "0"
98, // "1"
98, // "2"
98, // "3"
98, // "4"
98, // "5"
98, // "6"
98, // "7"
98, // "8"
98, // "9"
114, // ":"
113, // ";"
105, // "<"
122, // "="
115, // ">"
114, // "?"
123, // "@"
81, // "A"
81, // "B"
81, // "C"
81, // "D"
81, // "E"
81, // "F"
81, // "G"
81, // "H"
81, // "I"
81, // "J"
81, // "K"
81, // "L"
81, // "M"
81, // "N"
81, // "O"
81, // "P"
81, // "Q"
81, // "R"
81, // "S"
81, // "T"
81, // "U"
81, // "V"
81, // "W"
81, // "X"
81, // "Y"
81, // "Z"
103, // "["
114, // "\"
111, // "]"
114, // "^"
121, // "_"
114, // "`"
75, // "a"
88, // "b"
79, // "c"
81, // "d"
89, // "e"
80, // "f"
81, // "g"
90, // "h"
82, // "i"
81, // "j"
81, // "k"
83, // "l"
81, // "m"
91, // "n"
84, // "o"
76, // "p"
81, // "q"
85, // "r"
77, // "s"
92, // "t"
86, // "u"
78, // "v"
93, // "w"
87, // "x"
81, // "y"
81, // "z"
116, // "{"
106, // "|"
125, // "}"
114, // "~"
114, // 127
132, // 128
132, // 129
132, // 130
132, // 131
132, // 132
132, // 133
132, // 134
132, // 135
132, // 136
132, // 137
132, // 138
132, // 139
132, // 140
132, // 141
132, // 142
132, // 143
132, // 144
132, // 145
132, // 146
132, // 147
132, // 148
132, // 149
132, // 150
132, // 151
132, // 152
132, // 153
132, // 154
132, // 155
132, // 156
132, // 157
132, // 158
132, // 159
132, // 160
132, // 161
132, // 162
132, // 163
132, // 164
132, // 165
132, // 166
132, // 167
132, // 168
132, // 169
132, // 170
132, // 171
132, // 172
132, // 173
132, // 174
132, // 175
101, // 176
101, // 177
101, // 178
101, // 179
101, // 180
101, // 181
101, // 182
101, // 183
101, // 184
101, // 185
132, // 186
132, // 187
132, // 188
132, // 189
132, // 190
132, // 191
132, // 192
96, // 193
96, // 194
96, // 195
96, // 196
96, // 197
96, // 198
95, // 199
95, // 200
95, // 201
95, // 202
95, // 203
95, // 204
95, // 205
95, // 206
95, // 207
95, // 208
95, // 209
95, // 210
95, // 211
95, // 212
95, // 213
95, // 214
95, // 215
95, // 216
95, // 217
95, // 218
132, // 219
132, // 220
132, // 221
132, // 222
131, // 223
132, // 224
96, // 225
96, // 226
96, // 227
96, // 228
96, // 229
96, // 230
95, // 231
95, // 232
95, // 233
95, // 234
95, // 235
95, // 236
95, // 237
95, // 238
95, // 239
95, // 240
95, // 241
95, // 242
95, // 243
95, // 244
95, // 245
95, // 246
95, // 247
95, // 248
95, // 249
95, // 250
132, // 251
132, // 252
132, // 253
132, // 254
132, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"<start> ::= ws* <program>", // 1
"<start> ::= ws* <program>", // 2
"<program> ::= # <class decl>+", // 3
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 4
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 5
"<class decl> ::= `class # ID `extends ID `{ <decl in class>* `}", // 6
"<class decl> ::= `class # ID `extends ID `{ <decl in class>* `}", // 7
"<decl in class> ::= <method decl>", // 8
"<decl in class> ::= <inst var decl>", // 9
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 10
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 11
"<type> ::= # `int", // 12
"<type> ::= # `boolean", // 13
"<type> ::= # `void", // 14
"<type> ::= # `null", // 15
"<type> ::= # ID", // 16
"<type> ::= # <type> <empty bracket pair>", // 17
"<empty bracket pair> ::= `[ `]", // 18
"<stmt> ::= # `{ <stmt>* `}", // 19
"<stmt> ::= # `{ <stmt>* `}", // 20
"<stmt> ::= <assign> `;", // 21
"<stmt> ::= <local var decl> `;", // 22
"<stmt> ::= # `if `( <exp> `) <stmt> # !`else", // 23
"<stmt> ::= # `if `( <exp> `) <stmt> # `else <stmt>", // 24
"<stmt> ::= # `for `( <assign> `; <exp> `; <assign> `) <stmt>", // 25
"<stmt> ::= # `for `( <assign> `; `; <assign> `) <stmt>", // 26
"<stmt> ::= # `while `( <exp> `) <stmt>", // 27
"<stmt> ::= # `break `;", // 28
"<assign> ::= <exp> # `= <exp>", // 29
"<assign> ::= # ID `++", // 30
"<assign> ::= # `++ ID", // 31
"<assign> ::= # ID `--", // 32
"<assign> ::= # `-- ID", // 33
"<local var decl> ::= <type> # ID `= <exp>", // 34
"<inst var decl> ::= <type> # ID `;", // 35
"<stmt> ::= # `;", // 36
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 37
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 38
"<case> ::= `case # <exp> `;", // 39
"<exp> ::= <exp8>", // 40
"<exp8> ::= <exp7>", // 41
"<exp7> ::= <exp6>", // 42
"<exp6> ::= <exp5>", // 43
"<exp5> ::= <exp4>", // 44
"<exp4> ::= <exp3>", // 45
"<exp3> ::= <exp2>", // 46
"<exp2> ::= <exp1>", // 47
"<exp8> ::= <exp8> # `|| <exp7>", // 48
"<exp7> ::= <exp7> # `&& <exp6>", // 49
"<exp6> ::= <exp6> # `== <exp5>", // 50
"<exp6> ::= <exp6> # `!= <exp5>", // 51
"<exp5> ::= <exp5> # `< <exp4>", // 52
"<exp5> ::= <exp5> # `<= <exp4>", // 53
"<exp5> ::= <exp5> # `> <exp4>", // 54
"<exp4> ::= <exp4> # `+ <exp3>", // 55
"<exp4> ::= <exp4> # `- <exp3>", // 56
"<exp3> ::= <exp3> # `* <exp2>", // 57
"<exp3> ::= <exp3> # `/ <exp2>", // 58
"<exp3> ::= <exp3> # `% <exp2>", // 59
"<exp2> ::= # `( <type> `) <exp1>", // 60
"<exp2> ::= # `+ <exp1>", // 61
"<exp2> ::= # `- <exp1>", // 62
"<exp2> ::= # `! <exp1>", // 63
"<exp1> ::= # ID", // 64
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 65
"<exp1> ::= # INTLIT", // 66
"<exp1> ::= # STRINGLIT", // 67
"<exp1> ::= # CHARLIT", // 68
"<exp1> ::= <exp1> `. # ID", // 69
"<exp1> ::= # `this", // 70
"<exp1> ::= # `true", // 71
"<exp1> ::= # `false", // 72
"<exp1> ::= # `null", // 73
"<exp1> ::= # `new # ID `( `)", // 74
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 75
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 76
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 77
"letter128 ::= {193..218 225..250}", // 78
"digit ::= {\"0\"..\"9\"}", // 79
"digit128 ::= {176..185}", // 80
"any ::= {0..127}", // 81
"any128 ::= {128..255}", // 82
"ws ::= \" \"", // 83
"ws ::= {10} registerNewline", // 84
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 85
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 86
"`class ::= \"#\" \"c\" \"l\" ws*", // 87
"`class ::= \"#\" \"c\" \"l\" ws*", // 88
"`extends ::= \"#\" \"e\" \"x\" ws*", // 89
"`extends ::= \"#\" \"e\" \"x\" ws*", // 90
"`void ::= \"#\" \"v\" \"o\" ws*", // 91
"`void ::= \"#\" \"v\" \"o\" ws*", // 92
"`int ::= \"#\" \"i\" \"t\" ws*", // 93
"`int ::= \"#\" \"i\" \"t\" ws*", // 94
"`while ::= \"#\" \"w\" \"h\" ws*", // 95
"`while ::= \"#\" \"w\" \"h\" ws*", // 96
"`if ::= \"#\" \"+\" ws*", // 97
"`if ::= \"#\" \"+\" ws*", // 98
"`else ::= \"#\" \"e\" \"l\" ws*", // 99
"`else ::= \"#\" \"e\" \"l\" ws*", // 100
"`for ::= \"#\" \"f\" \"o\" ws*", // 101
"`for ::= \"#\" \"f\" \"o\" ws*", // 102
"`break ::= \"#\" \"b\" \"r\" ws*", // 103
"`break ::= \"#\" \"b\" \"r\" ws*", // 104
"`this ::= \"#\" \"t\" \"h\" ws*", // 105
"`this ::= \"#\" \"t\" \"h\" ws*", // 106
"`false ::= \"#\" \"f\" \"a\" ws*", // 107
"`false ::= \"#\" \"f\" \"a\" ws*", // 108
"`true ::= \"#\" \"t\" \"r\" ws*", // 109
"`true ::= \"#\" \"t\" \"r\" ws*", // 110
"`null ::= \"#\" \"n\" \"u\" ws*", // 111
"`null ::= \"#\" \"n\" \"u\" ws*", // 112
"`new ::= \"#\" \"n\" \"e\" ws*", // 113
"`new ::= \"#\" \"n\" \"e\" ws*", // 114
"`case ::= \"#\" \"c\" \"e\" ws*", // 115
"`case ::= \"#\" \"c\" \"e\" ws*", // 116
"`public ::= \"#\" \"p\" \"u\" ws*", // 117
"`public ::= \"#\" \"p\" \"u\" ws*", // 118
"`switch ::= \"#\" \"s\" \"w\" ws*", // 119
"`switch ::= \"#\" \"s\" \"w\" ws*", // 120
"`! ::= \"!\" ws*", // 121
"`! ::= \"!\" ws*", // 122
"`!= ::= \"@\" \"!\" ws*", // 123
"`!= ::= \"@\" \"!\" ws*", // 124
"`% ::= \"%\" ws*", // 125
"`% ::= \"%\" ws*", // 126
"`&& ::= \"@\" \"&\" ws*", // 127
"`&& ::= \"@\" \"&\" ws*", // 128
"`* ::= \"*\" ws*", // 129
"`* ::= \"*\" ws*", // 130
"`( ::= \"(\" ws*", // 131
"`( ::= \"(\" ws*", // 132
"`) ::= \")\" ws*", // 133
"`) ::= \")\" ws*", // 134
"`{ ::= \"{\" ws*", // 135
"`{ ::= \"{\" ws*", // 136
"`} ::= \"}\" ws*", // 137
"`} ::= \"}\" ws*", // 138
"`- ::= \"-\" ws*", // 139
"`- ::= \"-\" ws*", // 140
"`+ ::= \"+\" ws*", // 141
"`+ ::= \"+\" ws*", // 142
"`= ::= \"=\" ws*", // 143
"`= ::= \"=\" ws*", // 144
"`== ::= \"@\" \"=\" ws*", // 145
"`== ::= \"@\" \"=\" ws*", // 146
"`[ ::= \"[\" ws*", // 147
"`[ ::= \"[\" ws*", // 148
"`] ::= \"]\" ws*", // 149
"`] ::= \"]\" ws*", // 150
"`|| ::= \"@\" \"|\" ws*", // 151
"`|| ::= \"@\" \"|\" ws*", // 152
"`< ::= \"<\" ws*", // 153
"`< ::= \"<\" ws*", // 154
"`<= ::= \"@\" \"<\" ws*", // 155
"`<= ::= \"@\" \"<\" ws*", // 156
"`> ::= \">\" !\"=\" ws*", // 157
"`> ::= \">\" !\"=\" ws*", // 158
"`. ::= \".\" ws*", // 159
"`. ::= \".\" ws*", // 160
"`; ::= \";\" ws*", // 161
"`; ::= \";\" ws*", // 162
"`++ ::= \"@\" \"+\" ws*", // 163
"`++ ::= \"@\" \"+\" ws*", // 164
"`-- ::= \"@\" \"-\" ws*", // 165
"`-- ::= \"@\" \"-\" ws*", // 166
"`/ ::= \"/\" ws*", // 167
"`/ ::= \"/\" ws*", // 168
"ID ::= letter128 ws*", // 169
"ID ::= letter128 ws*", // 170
"ID ::= letter idChar* idChar128 ws*", // 171
"ID ::= letter idChar* idChar128 ws*", // 172
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 173
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 174
"INTLIT ::= digit128 ws*", // 175
"INTLIT ::= digit128 ws*", // 176
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 177
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 178
"STRINGLIT ::= \"@\" \'\"\' ws*", // 179
"STRINGLIT ::= \"@\" \'\"\' ws*", // 180
"STRINGLIT ::= \'\"\' any* any128 ws*", // 181
"STRINGLIT ::= \'\"\' any* any128 ws*", // 182
"CHARLIT ::= \"\'\" any ws*", // 183
"CHARLIT ::= \"\'\" any ws*", // 184
"idChar ::= letter", // 185
"idChar ::= digit", // 186
"idChar ::= \"_\"", // 187
"idChar128 ::= letter128", // 188
"idChar128 ::= digit128", // 189
"idChar128 ::= {223}", // 190
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 191
"hexDigit128 ::= {176..185 193..198 225..230}", // 192
"digit* ::= digit* digit", // 193
"digit* ::= digit* digit", // 194
"any* ::= any* any", // 195
"any* ::= any* any", // 196
"<decl in class>* ::= <decl in class>* <decl in class>", // 197
"<decl in class>* ::= <decl in class>* <decl in class>", // 198
"hexDigit* ::= hexDigit* hexDigit", // 199
"hexDigit* ::= hexDigit* hexDigit", // 200
"<stmt>* ::= <stmt>* <stmt>", // 201
"<stmt>* ::= <stmt>* <stmt>", // 202
"<case>* ::= <case>* <case>", // 203
"<case>* ::= <case>* <case>", // 204
"idChar* ::= idChar* idChar", // 205
"idChar* ::= idChar* idChar", // 206
"<class decl>+ ::= <class decl>", // 207
"<class decl>+ ::= <class decl>+ <class decl>", // 208
"<empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>", // 209
"ws* ::= ws* ws", // 210
"ws* ::= ws* ws", // 211
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 212
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 213
"", // 214
"", // 215
"", // 216
"", // 217
"", // 218
"", // 219
"", // 220
"", // 221
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= <start> @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: <start> ::= ws* <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 2: <start> ::= [ws*] <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <class decl> ::= `class [#] ID `extends ID `{ <decl in class>* `} @createdExtendsClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 7: <class decl> ::= `class [#] ID `extends ID `{ [<decl in class>*] `} @createdExtendsClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 9: <decl in class> ::= <inst var decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 10: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 12: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 13: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 14: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 15: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 16: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 17: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 18: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 19: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 20: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 21: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 22: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 23: <stmt> ::= [#] `if `( <exp> `) <stmt> !`else [#] @newIfOnlyBlock(int,Exp,Statement,int)=>Statement
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 24: <stmt> ::= [#] `if `( <exp> `) <stmt> [#] `else <stmt> @newIfElseBlock(int,Exp,Statement,int,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 25: <stmt> ::= [#] `for `( <assign> `; <exp> `; <assign> `) <stmt> @newForLoop(int,Statement,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 26: <stmt> ::= [#] `for `( <assign> `; `; <assign> `) <stmt> @newTrueForLoop(int,Statement,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 27: <stmt> ::= [#] `while `( <exp> `) <stmt> @newWhileBlock(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 28: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 29: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 30: <assign> ::= [#] ID `++ @assignPlusPlus(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 31: <assign> ::= [#] `++ ID @assignPlusPlusLeft(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 32: <assign> ::= [#] ID `-- @assignMinusMinus(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 33: <assign> ::= [#] `-- ID @assignMinusMinusLeft(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 34: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 35: <inst var decl> ::= <type> [#] ID `; @instanceVarDecl(Type,int,String)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 36: <stmt> ::= [#] `; @newEmptyStmt(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 37: <stmt> ::= [#] `switch `( <exp> `) `{ <case>* `} @newSwitch(int,Exp,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 38: <stmt> ::= [#] `switch `( <exp> `) `{ [<case>*] `} @newSwitch(int,Exp,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 39: <case> ::= `case [#] <exp> `; @newCase(int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 40: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 43: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 44: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 45: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 46: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 47: <exp2> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 48: <exp8> ::= <exp8> [#] `|| <exp7> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 49: <exp7> ::= <exp7> [#] `&& <exp6> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 50: <exp6> ::= <exp6> [#] `== <exp5> @newDoubleEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 51: <exp6> ::= <exp6> [#] `!= <exp5> @newNotEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 52: <exp5> ::= <exp5> [#] `< <exp4> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 53: <exp5> ::= <exp5> [#] `<= <exp4> @newLessThanEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 54: <exp5> ::= <exp5> [#] `> <exp4> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 55: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 56: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 57: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 58: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 59: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 60: <exp2> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 61: <exp2> ::= [#] `+ <exp1> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 62: <exp2> ::= [#] `- <exp1> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 63: <exp2> ::= [#] `! <exp1> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 64: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 65: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 66: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 67: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 68: <exp1> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 69: <exp1> ::= <exp1> `. [#] ID @newInstVarAccess(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 70: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 71: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 72: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 73: <exp1> ::= [#] `null @newNullExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 74: <exp1> ::= [#] `new [#] ID `( `) @newObject(int,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 75: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] <empty bracket pair>** @newArray(Type,int,Exp,List<Object>)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 76: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] !<empty bracket pair> [<empty bracket pair>**] @newArray(Type,int,Exp,List<Object>)=>Exp
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 77: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 78: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 79: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 80: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 81: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 82: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 83: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: ws ::= {10} [registerNewline] @void
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 86: `boolean ::= "#" "b" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 87: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 88: `class ::= "#" "c" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 89: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 90: `extends ::= "#" "e" "x" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 91: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 92: `void ::= "#" "v" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 93: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 94: `int ::= "#" "i" "t" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 95: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 96: `while ::= "#" "w" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 97: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 98: `if ::= "#" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 99: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `else ::= "#" "e" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 101: `for ::= "#" "f" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 102: `for ::= "#" "f" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 103: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 104: `break ::= "#" "b" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 105: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 106: `this ::= "#" "t" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: `false ::= "#" "f" "a" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 109: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: `true ::= "#" "t" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 112: `null ::= "#" "n" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 114: `new ::= "#" "n" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 115: `case ::= "#" "c" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `case ::= "#" "c" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: `public ::= "#" "p" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: `switch ::= "#" "s" "w" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: `switch ::= "#" "s" "w" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 121: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `! ::= "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 124: `!= ::= "@" "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 125: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `% ::= "%" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 128: `&& ::= "@" "&" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 129: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `* ::= "*" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `( ::= "(" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `) ::= ")" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `{ ::= "{" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `} ::= "}" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `- ::= "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `+ ::= "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `= ::= "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 146: `== ::= "@" "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 147: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `[ ::= "[" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `] ::= "]" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 152: `|| ::= "@" "|" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 153: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `< ::= "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 156: `<= ::= "@" "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 157: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `> ::= ">" !"=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `. ::= "." [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `; ::= ";" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 164: `++ ::= "@" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 165: `-- ::= "@" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 166: `-- ::= "@" "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 167: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `/ ::= "/" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 170: ID ::= letter128 [ws*] @text
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 171: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 172: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 173: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 174: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 175: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 176: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 177: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 178: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 179: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 180: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 181: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 182: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 183: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 184: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 185: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 186: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 187: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 188: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 189: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 190: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 191: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 192: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 193: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 194: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 195: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 196: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 197: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 198: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 199: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 200: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 201: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 202: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 203: <case>* ::= <case>* <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 204: <case>* ::= [<case>*] <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 205: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 206: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 207: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 208: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 209: <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 210: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 211: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 212: <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 213: <empty bracket pair>* ::= [<empty bracket pair>*] <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 214: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 215: $$0 ::= idChar128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 216: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 217: $$1 ::= digit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 218: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 219: $$2 ::= hexDigit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 220: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 221: $$3 ::= any128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "<case>* ::=", // <case>*
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "<empty bracket pair>* ::=", // <empty bracket pair>*
    "any* ::=", // any*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "<empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>", // <empty bracket pair>**
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // <case>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <empty bracket pair>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // any*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <decl in class>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // ws*
    },
    { // <empty bracket pair>**
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      Program parm0 = (Program)si.popPb();
      actionObject.topLevel(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      List<ClassDecl> parm1 = (List<ClassDecl>)si.popPb();
      Program result = actionObject.createProgram(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Decl> parm2 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createClassDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      String parm2 = (String)si.popPb();
      List<Decl> parm3 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createdExtendsClassDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.voidType(parm0);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.nullType(parm0);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      int parm3 = (Integer)si.popPb();
      Statement result = actionObject.newIfOnlyBlock(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      int parm3 = (Integer)si.popPb();
      Statement parm4 = (Statement)si.popPb();
      Statement result = actionObject.newIfElseBlock(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Statement parm1 = (Statement)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement parm4 = (Statement)si.popPb();
      Statement result = actionObject.newForLoop(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      Statement parm1 = (Statement)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement result = actionObject.newTrueForLoop(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newWhileBlock(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignPlusPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignPlusPlusLeft(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignMinusMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignMinusMinusLeft(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 23: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 24: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Decl result = actionObject.instanceVarDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newEmptyStmt(parm0);
      si.pushPb(result);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Statement result = actionObject.newSwitch(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement result = actionObject.newCase(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 28: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDoubleEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 33: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 34: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 35: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 36: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 37: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 38: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 39: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 45: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 49: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNullExp(parm0);
      si.pushPb(result);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newObject(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 55: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      List<Object> parm3 = (List<Object>)si.popPb();
      Exp result = actionObject.newArray(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 56: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 57: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 58: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 59: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 60: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 61: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 62: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 63: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createClassDecl(int,String,List<Decl>)",
"ClassDecl createdExtendsClassDecl(int,String,String,List<Decl>)",
"Decl createMethodDeclVoid(int,String,List<Statement>)",
"Type intType(int)",
"Type booleanType(int)",
"Type voidType(int)",
"Type nullType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBlock(int,List<Statement>)",
"Statement newIfOnlyBlock(int,Exp,Statement,int)",
"Statement newIfElseBlock(int,Exp,Statement,int,Statement)",
"Statement newForLoop(int,Statement,Exp,Statement,Statement)",
"Statement newTrueForLoop(int,Statement,Statement,Statement)",
"Statement newWhileBlock(int,Exp,Statement)",
"Statement newBreak(int)",
"Statement assign(Exp,int,Exp)",
"Statement assignPlusPlus(int,String)",
"Statement assignPlusPlusLeft(int,String)",
"Statement assignMinusMinus(int,String)",
"Statement assignMinusMinusLeft(int,String)",
"Statement localVarDecl(Type,int,String,Exp)",
"Decl instanceVarDecl(Type,int,String)",
"Statement newEmptyStmt(int)",
"Statement newSwitch(int,Exp,List<Statement>)",
"Statement newCase(int,Exp)",
"Exp newOr(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newDoubleEqualTo(Exp,int,Exp)",
"Exp newNotEqualTo(Exp,int,Exp)",
"Exp newLessThan(Exp,int,Exp)",
"Exp newLessThanEqualTo(Exp,int,Exp)",
"Exp newGreaterThan(Exp,int,Exp)",
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newRemainder(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryPlus(int,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newUnaryNot(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"Exp newStringLiteral(int,String)",
"Exp newCharLiteral(int,int)",
"Exp newInstVarAccess(Exp,int,String)",
"Exp newThis(int)",
"Exp newTrue(int)",
"Exp newFalse(int)",
"Exp newNullExp(int)",
"Exp newObject(int,int,String)",
"Exp newArray(Type,int,Exp,List<Object>)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"String emptyString(char,char)",
"String string(char,List<Character>,char)",
"int charVal(char,char)",
"char underscore(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
2,1,
3,1,
4,1,
3,1,
1,1,
1,1,
1,1,
1,1,
2,1,
3,1,
2,1,
4,1,
5,1,
5,1,
4,1,
3,1,
1,1,
3,1,
2,1,
2,1,
2,1,
2,1,
4,1,
3,1,
1,1,
3,1,
2,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
2,1,
2,1,
2,1,
2,1,
3,1,
2,1,
2,1,
2,1,
3,1,
1,1,
1,1,
1,1,
1,1,
3,1,
4,1,
1,1,
3,1,
1,1,
3,1,
2,1,
3,1,
2,1,
1,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.Vector<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
