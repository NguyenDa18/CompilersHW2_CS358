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
public int getEofSym() { return 145; }
public int getNttSym() { return 146; }
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
public int numSymbols() { return 147;}
private static final int MIN_REDUCTION = 610;
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
1,541, // <start>
2,302, // ws*
3,600, // <program>
4,69, // <class decl>+
5,531, // <class decl>
6,419, // `class
105,99, // " "
106,583, // "#"
122,30, // {10}
131,421, // ws
  }
,
{ // state 1
  }
,
{ // state 2
2,33, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 3
24,MIN_REDUCTION+78, // `[
101,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 4
105,99, // " "
122,30, // {10}
131,48, // ws
146,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|211, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 6
24,MIN_REDUCTION+164, // `[
101,MIN_REDUCTION+164, // "["
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 8
2,85, // ws*
105,598, // " "
122,194, // {10}
131,243, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 9
0x80000000|328, // match move
0x80000000|177, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 10
0x80000000|391, // match move
0x80000000|565, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 11
0x80000000|1, // match move
0x80000000|550, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 13
0x80000000|91, // match move
0x80000000|426, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 14
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 15
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 16
24,MIN_REDUCTION+77, // `[
101,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 17
17,341, // `)
108,478, // ")"
  }
,
{ // state 18
0x80000000|1, // match move
0x80000000|405, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 19
0x80000000|275, // match move
0x80000000|336, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 20
0x80000000|1, // match move
0x80000000|546, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 21
0x80000000|1, // match move
0x80000000|282, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 22
0x80000000|272, // match move
0x80000000|6, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 23
32,104, // `else
106,108, // "#"
  }
,
{ // state 24
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 25
28,117, // `;
111,188, // ";"
  }
,
{ // state 26
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
128, // ID
288, // `{
-1, // <decl in class>*
92, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
412, // `void
458, // `(
-1, // `)
411, // <stmt>*
527, // <type>
382, // `int
157, // `boolean
40, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
31, // <stmt>
136, // <assign>
93, // `;
540, // <local var decl>
525, // `if
300, // <exp>
-1, // `else
142, // `for
323, // `while
523, // `break
-1, // `=
-1, // `++
590, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
171, // <exp8>
360, // <exp7>
185, // <exp6>
366, // <exp5>
279, // <exp4>
461, // <exp3>
224, // <exp2>
130, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
494, // `+
314, // `-
-1, // `*
-1, // `/
-1, // `%
252, // `!
441, // INTLIT
132, // STRINGLIT
353, // CHARLIT
-1, // `.
267, // `this
18, // `true
268, // `false
74, // `new
-1, // <empty bracket pair>**
413, // letter
435, // "a"
435, // "p"
435, // "s"
435, // "v"
435, // "c"
435, // "f"
435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
435, // "i"
435, // "l"
435, // "o"
435, // "r"
435, // "u"
435, // "x"
435, // "b"
435, // "e"
435, // "h"
435, // "n"
435, // "t"
435, // "w"
443, // letter128
347, // {199..218 231..250}
347, // {193..198 225..230}
-1, // digit
259, // {"1".."9"}
317, // "0"
410, // digit128
56, // {176..185}
-1, // any
-1, // "["
296, // "-"
-1, // "<"
-1, // "|"
-1, // " "
429, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
362, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
454, // "{"
-1, // "%"
491, // "("
103, // "+"
-1, // "."
-1, // "_"
-1, // "="
384, // "@"
-1, // {10}
369, // "}"
370, // "!"
331, // "'"
168, // '"'
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
{ // state 27
24,MIN_REDUCTION+165, // `[
101,MIN_REDUCTION+165, // "["
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 28
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 29
105,598, // " "
122,194, // {10}
131,118, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 30
146,MIN_REDUCTION+78, // $NT
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 31
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 32
2,58, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 33
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 34
0x80000000|1, // match move
0x80000000|36, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 35
0x80000000|1, // match move
0x80000000|235, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 36
24,MIN_REDUCTION+170, // `[
101,MIN_REDUCTION+170, // "["
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 37
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 38
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 39
78,326, // "f"
89,401, // "n"
90,81, // "t"
  }
,
{ // state 40
0x80000000|232, // match move
0x80000000|278, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 41
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 42
28,329, // `;
111,362, // ";"
  }
,
{ // state 43
8,363, // `{
114,454, // "{"
  }
,
{ // state 44
2,203, // ws*
  }
,
{ // state 45
0x80000000|82, // match move
0x80000000|469, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 46
24,MIN_REDUCTION+61, // `[
101,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 48
146,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 49
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 50
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 51
76,392, // "v"
80,534, // "i"
86,110, // "b"
89,294, // "n"
  }
,
{ // state 52
2,393, // ws*
24,MIN_REDUCTION+207, // `[
101,MIN_REDUCTION+207, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 53
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 54
0x80000000|484, // match move
0x80000000|481, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 55
7,495, // ID
16,458, // `(
22,5, // `null
27,227, // <assign>
31,300, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 56
0x80000000|283, // match move
0x80000000|202, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 57
24,MIN_REDUCTION+68, // `[
101,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 58
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 59
16,378, // `(
116,491, // "("
  }
,
{ // state 60
8,516, // `{
114,454, // "{"
  }
,
{ // state 61
24,MIN_REDUCTION+171, // `[
101,MIN_REDUCTION+171, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 62
24,MIN_REDUCTION+59, // `[
101,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 63
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 64
90,237, // "t"
  }
,
{ // state 65
24,504, // `[
66,264, // `.
101,32, // "["
118,2, // "."
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 66
0x80000000|338, // match move
0x80000000|500, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 67
2,15, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 68
2,38, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 69
5,576, // <class decl>
6,419, // `class
106,583, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 70
0x80000000|530, // match move
0x80000000|187, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 71
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 72
7,453, // ID
16,458, // `(
22,5, // `null
46,327, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 73
2,343, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 74
7,121, // ID
15,539, // `void
19,87, // <type>
20,174, // `int
21,255, // `boolean
22,595, // `null
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
106,51, // "#"
  }
,
{ // state 75
2,129, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 77
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 79
0x80000000|44, // match move
0x80000000|200, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 80
0x80000000|1, // match move
0x80000000|599, // no-match move
// T-test match for "=":
120,
  }
,
{ // state 81
83,518, // "r"
88,471, // "h"
  }
,
{ // state 82
2,409, // ws*
  }
,
{ // state 83
7,453, // ID
16,458, // `(
22,5, // `null
31,535, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 84
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 85
0x80000000|122, // match move
0x80000000|526, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 86
7,453, // ID
16,458, // `(
22,5, // `null
47,250, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 87
0x80000000|225, // match move
0x80000000|166, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 88
54,568, // `<
55,100, // `<=
56,72, // `>
103,394, // "<"
113,80, // ">"
121,292, // "@"
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 89
17,MIN_REDUCTION+143, // `)
25,MIN_REDUCTION+143, // `]
28,MIN_REDUCTION+143, // `;
51,MIN_REDUCTION+143, // `&&
52,MIN_REDUCTION+143, // `==
53,MIN_REDUCTION+143, // `!=
71,MIN_REDUCTION+143, // <empty bracket pair>**
105,371, // " "
108,MIN_REDUCTION+143, // ")"
109,MIN_REDUCTION+143, // "]"
111,MIN_REDUCTION+143, // ";"
121,MIN_REDUCTION+143, // "@"
122,249, // {10}
131,217, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 90
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 92
0x80000000|388, // match move
0x80000000|191, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 93
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 94
7,453, // ID
16,458, // `(
22,5, // `null
31,281, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 95
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 96
2,538, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 97
24,MIN_REDUCTION+103, // `[
101,MIN_REDUCTION+103, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 98
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 99
146,MIN_REDUCTION+77, // $NT
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 100
7,453, // ID
16,458, // `(
22,5, // `null
46,408, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 101
2,585, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 103
2,152, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 104
7,128, // ID
8,288, // `{
15,412, // `void
16,458, // `(
19,527, // <type>
20,382, // `int
21,157, // `boolean
22,40, // `null
26,423, // <stmt>
27,136, // <assign>
28,93, // `;
29,540, // <local var decl>
30,525, // `if
31,300, // <exp>
33,142, // `for
34,323, // `while
35,523, // `break
38,590, // `switch
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,429, // "#"
111,362, // ";"
114,454, // "{"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 105
24,MIN_REDUCTION+206, // `[
101,MIN_REDUCTION+206, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 106
0x80000000|569, // match move
0x80000000|344, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 107
2,147, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 108
87,457, // "e"
  }
,
{ // state 109
74,215, // "p"
  }
,
{ // state 110
82,447, // "o"
  }
,
{ // state 111
0x80000000|1, // match move
0x80000000|27, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 112
17,209, // `)
108,478, // ")"
  }
,
{ // state 113
24,MIN_REDUCTION+182, // `[
101,MIN_REDUCTION+182, // "["
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 114
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 115
0x80000000|1, // match move
0x80000000|61, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 116
2,4, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
146,MIN_REDUCTION+144, // $NT
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 117
0x80000000|520, // match move
0x80000000|424, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 118
0x80000000|47, // match move
0x80000000|579, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 119
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 121
0x80000000|607, // match move
0x80000000|561, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 122
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 123
0x80000000|368, // match move
0x80000000|165, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 124
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
128, // ID
288, // `{
-1, // <decl in class>*
462, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
412, // `void
458, // `(
-1, // `)
-1, // <stmt>*
527, // <type>
382, // `int
157, // `boolean
40, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
102, // <stmt>
136, // <assign>
93, // `;
540, // <local var decl>
525, // `if
300, // <exp>
-1, // `else
142, // `for
323, // `while
523, // `break
-1, // `=
-1, // `++
590, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
171, // <exp8>
360, // <exp7>
185, // <exp6>
366, // <exp5>
279, // <exp4>
461, // <exp3>
224, // <exp2>
130, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
494, // `+
314, // `-
-1, // `*
-1, // `/
-1, // `%
252, // `!
441, // INTLIT
132, // STRINGLIT
353, // CHARLIT
-1, // `.
267, // `this
18, // `true
268, // `false
74, // `new
-1, // <empty bracket pair>**
413, // letter
435, // "a"
435, // "p"
435, // "s"
435, // "v"
435, // "c"
435, // "f"
435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
435, // "i"
435, // "l"
435, // "o"
435, // "r"
435, // "u"
435, // "x"
435, // "b"
435, // "e"
435, // "h"
435, // "n"
435, // "t"
435, // "w"
443, // letter128
347, // {199..218 231..250}
347, // {193..198 225..230}
-1, // digit
259, // {"1".."9"}
317, // "0"
410, // digit128
56, // {176..185}
-1, // any
-1, // "["
296, // "-"
-1, // "<"
-1, // "|"
-1, // " "
429, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
362, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
454, // "{"
-1, // "%"
491, // "("
103, // "+"
-1, // "."
-1, // "_"
-1, // "="
384, // "@"
-1, // {10}
324, // "}"
370, // "!"
331, // "'"
168, // '"'
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
{ // state 125
146,MIN_REDUCTION+17, // $NT
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 126
17,301, // `)
108,478, // ")"
  }
,
{ // state 127
82,101, // "o"
  }
,
{ // state 128
0x80000000|607, // match move
0x80000000|332, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 130
0x80000000|1, // match move
0x80000000|131, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 131
24,504, // `[
66,264, // `.
101,32, // "["
118,2, // "."
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 132
0x80000000|1, // match move
0x80000000|46, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 133
104,589, // "|"
107,307, // "&"
120,67, // "="
124,75, // "!"
  }
,
{ // state 134
7,453, // ID
22,5, // `null
49,229, // <exp1>
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
106,39, // "#"
121,384, // "@"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 135
16,417, // `(
116,491, // "("
  }
,
{ // state 136
28,351, // `;
111,362, // ";"
  }
,
{ // state 137
0x80000000|78, // match move
0x80000000|154, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 138
28,433, // `;
111,362, // ";"
  }
,
{ // state 139
0x80000000|1, // match move
0x80000000|258, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 140
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 141
85,96, // "x"
  }
,
{ // state 142
16,230, // `(
116,491, // "("
  }
,
{ // state 143
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 144
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 145
0x80000000|1, // match move
0x80000000|485, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 146
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 147
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 149
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 150
2,14, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 151
2,35, // ws*
24,MIN_REDUCTION+176, // `[
101,MIN_REDUCTION+176, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 152
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 153
7,397, // ID
72,512, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,311, // letter128
93,179, // {199..218 231..250}
94,179, // {193..198 225..230}
  }
,
{ // state 154
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 155
17,43, // `)
108,478, // ")"
  }
,
{ // state 156
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 158
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 160
16,83, // `(
116,491, // "("
  }
,
{ // state 161
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 162
0x80000000|1, // match move
0x80000000|521, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 163
17,134, // `)
23,239, // <empty bracket pair>
24,330, // `[
101,32, // "["
108,478, // ")"
  }
,
{ // state 164
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 166
24,94, // `[
101,32, // "["
  }
,
{ // state 167
0x80000000|7, // match move
0x80000000|29, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 168
73,49, // "a"
74,49, // "p"
75,49, // "s"
76,49, // "v"
77,49, // "c"
78,49, // "f"
79,49, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,49, // "i"
81,49, // "l"
82,49, // "o"
83,49, // "r"
84,49, // "u"
85,49, // "x"
86,49, // "b"
87,49, // "e"
88,49, // "h"
89,49, // "n"
90,49, // "t"
91,49, // "w"
93,605, // {199..218 231..250}
94,605, // {193..198 225..230}
96,49, // {"1".."9"}
97,49, // "0"
99,605, // {176..185}
100,156, // any
101,49, // "["
102,49, // "-"
103,49, // "<"
104,49, // "|"
105,49, // " "
106,49, // "#"
107,49, // "&"
108,49, // ")"
109,49, // "]"
110,49, // "/"
111,49, // ";"
112,49, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
113,49, // ">"
114,49, // "{"
115,49, // "%"
116,49, // "("
117,49, // "+"
118,49, // "."
119,49, // "_"
120,49, // "="
121,49, // "@"
122,49, // {10}
123,49, // "}"
124,49, // "!"
125,49, // "'"
126,49, // '"'
127,49, // "*"
128,66, // any128
129,605, // {223}
130,605, // {128..175 186..192 219..222 224 251..255}
138,320, // any*
139,139, // $$3
  }
,
{ // state 169
0x80000000|446, // match move
0x80000000|218, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 170
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 171
50,547, // `||
121,558, // "@"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 172
0x80000000|428, // match move
0x80000000|482, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 173
24,MIN_REDUCTION+203, // `[
101,MIN_REDUCTION+203, // "["
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 174
0x80000000|313, // match move
0x80000000|220, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 175
24,504, // `[
66,264, // `.
101,32, // "["
118,2, // "."
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 176
2,234, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 177
71,573, // <empty bracket pair>**
144,10, // <empty bracket pair>*
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 178
7,453, // ID
16,458, // `(
22,5, // `null
31,155, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 179
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 180
36,316, // `=
120,201, // "="
  }
,
{ // state 181
87,308, // "e"
  }
,
{ // state 182
0x80000000|309, // match move
0x80000000|508, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 183
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 184
0x80000000|380, // match move
0x80000000|414, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 185
52,383, // `==
53,465, // `!=
121,133, // "@"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 186
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 187
2,13, // ws*
24,MIN_REDUCTION+106, // `[
101,MIN_REDUCTION+106, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 188
0x80000000|266, // match move
0x80000000|8, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 189
87,141, // "e"
  }
,
{ // state 190
24,MIN_REDUCTION+101, // `[
101,MIN_REDUCTION+101, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 191
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 193
103,68, // "<"
104,589, // "|"
107,307, // "&"
117,580, // "+"
120,67, // "="
124,75, // "!"
  }
,
{ // state 194
0x80000000|262, // match move
0x80000000|544, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 195
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 197
24,MIN_REDUCTION+99, // `[
101,MIN_REDUCTION+99, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 198
0x80000000|144, // match move
0x80000000|442, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 199
7,453, // ID
16,458, // `(
22,5, // `null
31,496, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 200
2,203, // ws*
24,MIN_REDUCTION+102, // `[
101,MIN_REDUCTION+102, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 201
2,487, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 202
24,MIN_REDUCTION+74, // `[
101,MIN_REDUCTION+74, // "["
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 203
0x80000000|1, // match move
0x80000000|190, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 204
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 205
52,383, // `==
53,465, // `!=
121,133, // "@"
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 206
0x80000000|464, // match move
0x80000000|271, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 207
2,552, // ws*
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 208
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 209
7,128, // ID
8,26, // `{
15,412, // `void
16,458, // `(
19,527, // <type>
20,382, // `int
21,157, // `boolean
22,40, // `null
26,182, // <stmt>
27,244, // <assign>
28,445, // `;
29,25, // <local var decl>
30,160, // `if
31,300, // <exp>
33,233, // `for
34,59, // `while
35,505, // `break
38,214, // `switch
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,429, // "#"
111,188, // ";"
114,454, // "{"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 210
104,589, // "|"
107,307, // "&"
  }
,
{ // state 211
24,MIN_REDUCTION+67, // `[
101,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 212
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 213
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 214
16,178, // `(
116,491, // "("
  }
,
{ // state 215
84,176, // "u"
  }
,
{ // state 216
24,MIN_REDUCTION+173, // `[
101,MIN_REDUCTION+173, // "["
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 217
0x80000000|257, // match move
0x80000000|480, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 218
2,261, // ws*
24,MIN_REDUCTION+144, // `[
36,MIN_REDUCTION+144, // `=
50,MIN_REDUCTION+144, // `||
51,MIN_REDUCTION+144, // `&&
52,MIN_REDUCTION+144, // `==
53,MIN_REDUCTION+144, // `!=
54,MIN_REDUCTION+144, // `<
55,MIN_REDUCTION+144, // `<=
56,MIN_REDUCTION+144, // `>
61,MIN_REDUCTION+144, // `%
103,MIN_REDUCTION+144, // "<"
105,371, // " "
113,MIN_REDUCTION+144, // ">"
115,MIN_REDUCTION+144, // "%"
120,MIN_REDUCTION+144, // "="
121,MIN_REDUCTION+144, // "@"
122,249, // {10}
131,591, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 219
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 223
2,420, // ws*
24,MIN_REDUCTION+104, // `[
101,MIN_REDUCTION+104, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 225
23,276, // <empty bracket pair>
24,270, // `[
101,32, // "["
  }
,
{ // state 226
0x80000000|1, // match move
0x80000000|57, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 227
17,319, // `)
108,478, // ")"
  }
,
{ // state 228
0x80000000|1, // match move
0x80000000|543, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 229
0x80000000|1, // match move
0x80000000|322, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 230
7,495, // ID
16,458, // `(
22,5, // `null
27,406, // <assign>
31,300, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 231
24,MIN_REDUCTION+167, // `[
101,MIN_REDUCTION+167, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 233
16,381, // `(
116,491, // "("
  }
,
{ // state 234
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 235
24,MIN_REDUCTION+175, // `[
101,MIN_REDUCTION+175, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 236
0x80000000|451, // match move
0x80000000|149, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 237
2,84, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 238
0x80000000|212, // match move
0x80000000|385, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 239
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 240
57,86, // `+
58,337, // `-
102,296, // "-"
117,103, // "+"
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 241
105,MIN_REDUCTION+77, // " "
122,MIN_REDUCTION+77, // {10}
131,MIN_REDUCTION+77, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 242
2,420, // ws*
  }
,
{ // state 243
0x80000000|63, // match move
0x80000000|293, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 244
28,19, // `;
111,188, // ";"
  }
,
{ // state 245
25,439, // `]
109,169, // "]"
  }
,
{ // state 246
17,566, // `)
108,478, // ")"
  }
,
{ // state 247
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 248
2,393, // ws*
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 249
0x80000000|564, // match move
0x80000000|3, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 250
59,274, // `*
60,479, // `/
61,488, // `%
110,150, // "/"
115,263, // "%"
127,509, // "*"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 251
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 252
7,453, // ID
22,5, // `null
49,260, // <exp1>
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
106,39, // "#"
121,384, // "@"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 253
2,552, // ws*
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 254
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 255
0x80000000|146, // match move
0x80000000|140, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 256
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 257
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 258
24,MIN_REDUCTION+174, // `[
101,MIN_REDUCTION+174, // "["
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 259
95,489, // digit
96,287, // {"1".."9"}
97,287, // "0"
98,415, // digit128
99,56, // {176..185}
134,438, // digit*
135,20, // $$1
  }
,
{ // state 260
0x80000000|1, // match move
0x80000000|175, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 261
0x80000000|356, // match move
0x80000000|89, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 262
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 263
2,213, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 264
7,21, // ID
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
  }
,
{ // state 265
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 266
2,85, // ws*
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 267
0x80000000|1, // match move
0x80000000|418, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 268
0x80000000|1, // match move
0x80000000|298, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 269
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 270
25,236, // `]
109,169, // "]"
  }
,
{ // state 271
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 272
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 273
24,MIN_REDUCTION+58, // `[
101,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 274
7,453, // ID
16,458, // `(
22,5, // `null
48,592, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 275
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 276
0x80000000|467, // match move
0x80000000|542, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 277
2,449, // ws*
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 278
7,MIN_REDUCTION+14, // ID
24,MIN_REDUCTION+67, // `[
73,MIN_REDUCTION+14, // "a"
74,MIN_REDUCTION+14, // "p"
75,MIN_REDUCTION+14, // "s"
76,MIN_REDUCTION+14, // "v"
77,MIN_REDUCTION+14, // "c"
78,MIN_REDUCTION+14, // "f"
79,MIN_REDUCTION+14, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,MIN_REDUCTION+14, // "i"
81,MIN_REDUCTION+14, // "l"
82,MIN_REDUCTION+14, // "o"
83,MIN_REDUCTION+14, // "r"
84,MIN_REDUCTION+14, // "u"
85,MIN_REDUCTION+14, // "x"
86,MIN_REDUCTION+14, // "b"
87,MIN_REDUCTION+14, // "e"
88,MIN_REDUCTION+14, // "h"
89,MIN_REDUCTION+14, // "n"
90,MIN_REDUCTION+14, // "t"
91,MIN_REDUCTION+14, // "w"
93,MIN_REDUCTION+14, // {199..218 231..250}
94,MIN_REDUCTION+14, // {193..198 225..230}
101,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 279
57,86, // `+
58,337, // `-
102,296, // "-"
117,103, // "+"
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 280
2,115, // ws*
24,MIN_REDUCTION+172, // `[
101,MIN_REDUCTION+172, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 281
25,9, // `]
109,169, // "]"
  }
,
{ // state 282
24,MIN_REDUCTION+63, // `[
101,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 283
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 284
24,MIN_REDUCTION+60, // `[
101,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 285
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 286
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 287
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 288
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
128, // ID
288, // `{
-1, // <decl in class>*
390, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
412, // `void
458, // `(
-1, // `)
124, // <stmt>*
527, // <type>
382, // `int
157, // `boolean
40, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
31, // <stmt>
136, // <assign>
93, // `;
540, // <local var decl>
525, // `if
300, // <exp>
-1, // `else
142, // `for
323, // `while
523, // `break
-1, // `=
-1, // `++
590, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
171, // <exp8>
360, // <exp7>
185, // <exp6>
366, // <exp5>
279, // <exp4>
461, // <exp3>
224, // <exp2>
130, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
494, // `+
314, // `-
-1, // `*
-1, // `/
-1, // `%
252, // `!
441, // INTLIT
132, // STRINGLIT
353, // CHARLIT
-1, // `.
267, // `this
18, // `true
268, // `false
74, // `new
-1, // <empty bracket pair>**
413, // letter
435, // "a"
435, // "p"
435, // "s"
435, // "v"
435, // "c"
435, // "f"
435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
435, // "i"
435, // "l"
435, // "o"
435, // "r"
435, // "u"
435, // "x"
435, // "b"
435, // "e"
435, // "h"
435, // "n"
435, // "t"
435, // "w"
443, // letter128
347, // {199..218 231..250}
347, // {193..198 225..230}
-1, // digit
259, // {"1".."9"}
317, // "0"
410, // digit128
56, // {176..185}
-1, // any
-1, // "["
296, // "-"
-1, // "<"
-1, // "|"
-1, // " "
429, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
362, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
454, // "{"
-1, // "%"
491, // "("
103, // "+"
-1, // "."
-1, // "_"
-1, // "="
384, // "@"
-1, // {10}
324, // "}"
370, // "!"
331, // "'"
168, // '"'
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
{ // state 289
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 290
7,128, // ID
8,26, // `{
15,412, // `void
16,458, // `(
19,527, // <type>
20,382, // `int
21,157, // `boolean
22,40, // `null
26,486, // <stmt>
27,244, // <assign>
28,445, // `;
29,25, // <local var decl>
30,160, // `if
31,300, // <exp>
33,233, // `for
34,59, // `while
35,505, // `break
38,214, // `switch
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,429, // "#"
111,188, // ";"
114,454, // "{"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 291
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 292
103,68, // "<"
104,589, // "|"
107,307, // "&"
120,67, // "="
124,75, // "!"
  }
,
{ // state 293
105,MIN_REDUCTION+203, // " "
122,MIN_REDUCTION+203, // {10}
131,MIN_REDUCTION+203, // ws
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 294
84,70, // "u"
  }
,
{ // state 295
2,361, // ws*
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 296
2,50, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 297
2,501, // ws*
24,MIN_REDUCTION+100, // `[
101,MIN_REDUCTION+100, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 298
24,MIN_REDUCTION+66, // `[
101,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 299
10,574, // `}
12,286, // <decl in class>
13,254, // <method decl>
14,483, // `public
106,109, // "#"
123,324, // "}"
  }
,
{ // state 300
36,318, // `=
120,201, // "="
  }
,
{ // state 301
7,128, // ID
8,288, // `{
15,412, // `void
16,458, // `(
19,527, // <type>
20,382, // `int
21,157, // `boolean
22,40, // `null
26,537, // <stmt>
27,136, // <assign>
28,93, // `;
29,540, // <local var decl>
30,525, // `if
31,300, // <exp>
33,142, // `for
34,323, // `while
35,523, // `break
38,590, // `switch
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,429, // "#"
111,362, // ";"
114,454, // "{"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 302
3,528, // <program>
4,69, // <class decl>+
5,531, // <class decl>
6,419, // `class
105,99, // " "
106,583, // "#"
122,30, // {10}
131,48, // ws
  }
,
{ // state 303
7,453, // ID
16,458, // `(
22,5, // `null
31,17, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 304
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 305
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 306
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 307
2,367, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 308
2,71, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 309
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 310
81,355, // "l"
  }
,
{ // state 311
2,183, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 312
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 313
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 314
7,453, // ID
22,5, // `null
49,452, // <exp1>
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
106,39, // "#"
121,384, // "@"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 315
59,274, // `*
60,479, // `/
61,488, // `%
110,150, // "/"
115,263, // "%"
127,509, // "*"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 316
7,453, // ID
16,458, // `(
22,5, // `null
31,608, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 317
73,375, // "a"
74,375, // "p"
75,375, // "s"
76,375, // "v"
77,375, // "c"
78,375, // "f"
79,375, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,375, // "i"
81,375, // "l"
82,375, // "o"
83,375, // "r"
84,375, // "u"
85,375, // "x"
86,375, // "b"
87,375, // "e"
88,375, // "h"
89,375, // "n"
90,375, // "t"
91,375, // "w"
94,437, // {193..198 225..230}
96,375, // {"1".."9"}
97,375, // "0"
99,437, // {176..185}
136,587, // hexDigit*
137,34, // $$2
142,519, // hexDigit
143,536, // hexDigit128
  }
,
{ // state 318
7,453, // ID
16,458, // `(
22,5, // `null
31,41, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 319
7,128, // ID
8,288, // `{
15,412, // `void
16,458, // `(
19,527, // <type>
20,382, // `int
21,157, // `boolean
22,40, // `null
26,28, // <stmt>
27,136, // <assign>
28,93, // `;
29,540, // <local var decl>
30,525, // `if
31,300, // <exp>
33,142, // `for
34,323, // `while
35,523, // `break
38,590, // `switch
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,429, // "#"
111,362, // ";"
114,454, // "{"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 320
73,49, // "a"
74,49, // "p"
75,49, // "s"
76,49, // "v"
77,49, // "c"
78,49, // "f"
79,49, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,49, // "i"
81,49, // "l"
82,49, // "o"
83,49, // "r"
84,49, // "u"
85,49, // "x"
86,49, // "b"
87,49, // "e"
88,49, // "h"
89,49, // "n"
90,49, // "t"
91,49, // "w"
93,605, // {199..218 231..250}
94,605, // {193..198 225..230}
96,49, // {"1".."9"}
97,49, // "0"
99,605, // {176..185}
100,312, // any
101,49, // "["
102,49, // "-"
103,49, // "<"
104,49, // "|"
105,49, // " "
106,49, // "#"
107,49, // "&"
108,49, // ")"
109,49, // "]"
110,49, // "/"
111,49, // ";"
112,49, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
113,49, // ">"
114,49, // "{"
115,49, // "%"
116,49, // "("
117,49, // "+"
118,49, // "."
119,49, // "_"
120,49, // "="
121,49, // "@"
122,49, // {10}
123,49, // "}"
124,49, // "!"
125,49, // "'"
126,49, // '"'
127,49, // "*"
128,66, // any128
129,605, // {223}
130,605, // {128..175 186..192 219..222 224 251..255}
139,597, // $$3
  }
,
{ // state 321
51,499, // `&&
121,210, // "@"
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 322
24,504, // `[
66,264, // `.
101,32, // "["
118,2, // "."
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 323
16,577, // `(
116,491, // "("
  }
,
{ // state 324
2,204, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 326
73,79, // "a"
  }
,
{ // state 327
57,86, // `+
58,337, // `-
102,296, // "-"
117,103, // "+"
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 328
23,206, // <empty bracket pair>
24,270, // `[
71,573, // <empty bracket pair>**
101,32, // "["
144,10, // <empty bracket pair>*
  }
,
{ // state 329
7,453, // ID
16,458, // `(
22,5, // `null
31,138, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 330
25,125, // `]
109,116, // "]"
  }
,
{ // state 331
73,106, // "a"
74,106, // "p"
75,106, // "s"
76,106, // "v"
77,106, // "c"
78,106, // "f"
79,106, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,106, // "i"
81,106, // "l"
82,106, // "o"
83,106, // "r"
84,106, // "u"
85,106, // "x"
86,106, // "b"
87,106, // "e"
88,106, // "h"
89,106, // "n"
90,106, // "t"
91,106, // "w"
96,106, // {"1".."9"}
97,106, // "0"
100,490, // any
101,106, // "["
102,106, // "-"
103,106, // "<"
104,106, // "|"
105,106, // " "
106,106, // "#"
107,106, // "&"
108,106, // ")"
109,106, // "]"
110,106, // "/"
111,106, // ";"
112,106, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
113,106, // ">"
114,106, // "{"
115,106, // "%"
116,106, // "("
117,106, // "+"
118,106, // "."
119,106, // "_"
120,106, // "="
121,106, // "@"
122,106, // {10}
123,106, // "}"
124,106, // "!"
125,106, // "'"
126,106, // '"'
127,106, // "*"
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
{ // state 332
7,MIN_REDUCTION+15, // ID
24,MIN_REDUCTION+58, // `[
37,584, // `++
73,MIN_REDUCTION+15, // "a"
74,MIN_REDUCTION+15, // "p"
75,MIN_REDUCTION+15, // "s"
76,MIN_REDUCTION+15, // "v"
77,MIN_REDUCTION+15, // "c"
78,MIN_REDUCTION+15, // "f"
79,MIN_REDUCTION+15, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,MIN_REDUCTION+15, // "i"
81,MIN_REDUCTION+15, // "l"
82,MIN_REDUCTION+15, // "o"
83,MIN_REDUCTION+15, // "r"
84,MIN_REDUCTION+15, // "u"
85,MIN_REDUCTION+15, // "x"
86,MIN_REDUCTION+15, // "b"
87,MIN_REDUCTION+15, // "e"
88,MIN_REDUCTION+15, // "h"
89,MIN_REDUCTION+15, // "n"
90,MIN_REDUCTION+15, // "t"
91,MIN_REDUCTION+15, // "w"
93,MIN_REDUCTION+15, // {199..218 231..250}
94,MIN_REDUCTION+15, // {193..198 225..230}
101,MIN_REDUCTION+58, // "["
121,193, // "@"
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 333
0x80000000|440, // match move
0x80000000|545, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 334
76,127, // "v"
  }
,
{ // state 335
2,361, // ws*
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 336
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 337
7,453, // ID
16,458, // `(
22,5, // `null
47,315, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 338
2,145, // ws*
  }
,
{ // state 339
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 340
2,603, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 341
8,529, // `{
114,454, // "{"
  }
,
{ // state 342
54,568, // `<
55,100, // `<=
56,72, // `>
103,394, // "<"
113,80, // ">"
121,292, // "@"
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 343
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 344
24,MIN_REDUCTION+75, // `[
101,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 345
0x80000000|570, // match move
0x80000000|37, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 346
106,108, // "#"
  }
,
{ // state 347
0x80000000|170, // match move
0x80000000|507, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 348
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 349
0x80000000|207, // match move
0x80000000|253, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 350
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 352
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 353
0x80000000|1, // match move
0x80000000|533, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 354
0x80000000|1, // match move
0x80000000|231, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 355
2,466, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 358
88,396, // "h"
  }
,
{ // state 359
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 360
51,499, // `&&
121,210, // "@"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 361
0x80000000|497, // match move
0x80000000|114, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 362
2,158, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 363
10,198, // `}
39,492, // <case>*
40,448, // <case>
41,560, // `case
106,474, // "#"
123,369, // "}"
  }
,
{ // state 364
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 365
2,54, // ws*
24,MIN_REDUCTION+162, // `[
101,MIN_REDUCTION+162, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 366
54,568, // `<
55,100, // `<=
56,72, // `>
103,394, // "<"
113,80, // ">"
121,292, // "@"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 367
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 368
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 369
0x80000000|586, // match move
0x80000000|503, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 370
2,514, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 371
0x80000000|557, // match move
0x80000000|16, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 372
9,498, // <decl in class>*
10,305, // `}
12,221, // <decl in class>
13,254, // <method decl>
14,483, // `public
106,109, // "#"
123,324, // "}"
  }
,
{ // state 373
10,95, // `}
40,475, // <case>
41,560, // `case
106,474, // "#"
123,324, // "}"
  }
,
{ // state 374
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 375
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 376
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 377
24,504, // `[
66,264, // `.
101,32, // "["
118,2, // "."
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 378
7,453, // ID
16,458, // `(
22,5, // `null
31,246, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 379
2,256, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 380
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 381
7,495, // ID
16,458, // `(
22,5, // `null
27,42, // <assign>
31,300, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 382
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 383
7,453, // ID
16,458, // `(
22,5, // `null
45,342, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 384
126,562, // '"'
  }
,
{ // state 385
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 386
0x80000000|269, // match move
0x80000000|113, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 387
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 388
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 389
2,354, // ws*
  }
,
{ // state 390
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 391
23,238, // <empty bracket pair>
24,270, // `[
101,32, // "["
  }
,
{ // state 392
82,349, // "o"
  }
,
{ // state 393
0x80000000|247, // match move
0x80000000|105, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 394
2,459, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 395
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 396
2,444, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 397
8,510, // `{
114,454, // "{"
  }
,
{ // state 398
0x80000000|295, // match move
0x80000000|335, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 399
2,11, // ws*
  }
,
{ // state 400
72,196, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,515, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
95,549, // digit
96,287, // {"1".."9"}
97,287, // "0"
98,184, // digit128
99,56, // {176..185}
119,12, // "_"
129,386, // {223}
133,172, // $$0
140,304, // idChar
141,522, // idChar128
  }
,
{ // state 401
84,70, // "u"
87,340, // "e"
  }
,
{ // state 402
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 403
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 404
73,79, // "a"
82,107, // "o"
  }
,
{ // state 405
24,MIN_REDUCTION+65, // `[
101,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 406
28,551, // `;
111,362, // ";"
  }
,
{ // state 407
24,MIN_REDUCTION+184, // `[
101,MIN_REDUCTION+184, // "["
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 408
57,86, // `+
58,337, // `-
102,296, // "-"
117,103, // "+"
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 409
0x80000000|1, // match move
0x80000000|567, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 410
0x80000000|389, // match move
0x80000000|606, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 411
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
128, // ID
288, // `{
-1, // <decl in class>*
572, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
412, // `void
458, // `(
-1, // `)
-1, // <stmt>*
527, // <type>
382, // `int
157, // `boolean
40, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
102, // <stmt>
136, // <assign>
93, // `;
540, // <local var decl>
525, // `if
300, // <exp>
-1, // `else
142, // `for
323, // `while
523, // `break
-1, // `=
-1, // `++
590, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
171, // <exp8>
360, // <exp7>
185, // <exp6>
366, // <exp5>
279, // <exp4>
461, // <exp3>
224, // <exp2>
130, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
494, // `+
314, // `-
-1, // `*
-1, // `/
-1, // `%
252, // `!
441, // INTLIT
132, // STRINGLIT
353, // CHARLIT
-1, // `.
267, // `this
18, // `true
268, // `false
74, // `new
-1, // <empty bracket pair>**
413, // letter
435, // "a"
435, // "p"
435, // "s"
435, // "v"
435, // "c"
435, // "f"
435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
435, // "i"
435, // "l"
435, // "o"
435, // "r"
435, // "u"
435, // "x"
435, // "b"
435, // "e"
435, // "h"
435, // "n"
435, // "t"
435, // "w"
443, // letter128
347, // {199..218 231..250}
347, // {193..198 225..230}
-1, // digit
259, // {"1".."9"}
317, // "0"
410, // digit128
56, // {176..185}
-1, // any
-1, // "["
296, // "-"
-1, // "<"
-1, // "|"
-1, // " "
429, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
362, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
454, // "{"
-1, // "%"
491, // "("
103, // "+"
-1, // "."
-1, // "_"
-1, // "="
384, // "@"
-1, // {10}
369, // "}"
370, // "!"
331, // "'"
168, // '"'
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
{ // state 412
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 413
72,196, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,515, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
95,549, // digit
96,287, // {"1".."9"}
97,287, // "0"
98,184, // digit128
99,56, // {176..185}
119,12, // "_"
129,386, // {223}
132,400, // idChar*
133,22, // $$0
140,524, // idChar
141,522, // idChar128
  }
,
{ // state 414
24,MIN_REDUCTION+181, // `[
101,MIN_REDUCTION+181, // "["
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 415
0x80000000|399, // match move
0x80000000|581, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 416
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 417
17,60, // `)
108,478, // ")"
  }
,
{ // state 418
24,MIN_REDUCTION+64, // `[
101,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 419
7,456, // ID
72,512, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,311, // letter128
93,179, // {199..218 231..250}
94,179, // {193..198 225..230}
  }
,
{ // state 420
0x80000000|1, // match move
0x80000000|97, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 421
146,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 422
2,54, // ws*
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 423
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 424
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 425
105,99, // " "
122,30, // {10}
131,48, // ws
146,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 426
24,MIN_REDUCTION+105, // `[
101,MIN_REDUCTION+105, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 427
72,196, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,222, // letter128
93,179, // {199..218 231..250}
94,179, // {193..198 225..230}
95,549, // digit
96,287, // {"1".."9"}
97,287, // "0"
98,120, // digit128
99,470, // {176..185}
119,12, // "_"
129,554, // {223}
133,90, // $$0
140,304, // idChar
141,473, // idChar128
  }
,
{ // state 428
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 429
75,601, // "s"
76,127, // "v"
78,404, // "f"
80,64, // "i"
86,593, // "b"
89,401, // "n"
90,81, // "t"
91,358, // "w"
117,73, // "+"
  }
,
{ // state 430
0x80000000|1, // match move
0x80000000|65, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 431
7,128, // ID
8,26, // `{
15,412, // `void
16,458, // `(
19,527, // <type>
20,382, // `int
21,157, // `boolean
22,40, // `null
26,333, // <stmt>
27,244, // <assign>
28,445, // `;
29,25, // <local var decl>
30,160, // `if
31,300, // <exp>
33,233, // `for
34,59, // `while
35,505, // `break
38,214, // `switch
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,429, // "#"
111,188, // ";"
114,454, // "{"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 432
28,148, // `;
111,362, // ";"
  }
,
{ // state 433
7,495, // ID
16,458, // `(
22,5, // `null
27,112, // <assign>
31,300, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 434
7,128, // ID
8,26, // `{
15,412, // `void
16,458, // `(
19,527, // <type>
20,382, // `int
21,157, // `boolean
22,40, // `null
26,602, // <stmt>
27,244, // <assign>
28,445, // `;
29,25, // <local var decl>
30,160, // `if
31,300, // <exp>
33,233, // `for
34,59, // `while
35,505, // `break
38,214, // `switch
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,429, // "#"
111,188, // ";"
114,454, // "{"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 435
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 436
82,477, // "o"
  }
,
{ // state 437
0x80000000|143, // match move
0x80000000|407, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 438
95,76, // digit
96,287, // {"1".."9"}
97,287, // "0"
98,415, // digit128
99,56, // {176..185}
135,111, // $$1
  }
,
{ // state 439
0x80000000|1, // match move
0x80000000|62, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 440
32,290, // `else
106,108, // "#"
  }
,
{ // state 441
0x80000000|1, // match move
0x80000000|284, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 442
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 443
0x80000000|422, // match move
0x80000000|365, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 444
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 445
0x80000000|251, // match move
0x80000000|387, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 446
2,261, // ws*
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 447
0x80000000|463, // match move
0x80000000|277, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 448
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 449
0x80000000|374, // match move
0x80000000|53, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 450
2,162, // ws*
  }
,
{ // state 451
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 452
0x80000000|1, // match move
0x80000000|377, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 453
0x80000000|1, // match move
0x80000000|273, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 454
2,291, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 455
7,135, // ID
72,512, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,311, // letter128
93,179, // {199..218 231..250}
94,179, // {193..198 225..230}
  }
,
{ // state 456
8,372, // `{
11,153, // `extends
106,189, // "#"
114,454, // "{"
  }
,
{ // state 457
81,493, // "l"
  }
,
{ // state 458
7,575, // ID
15,412, // `void
19,163, // <type>
20,382, // `int
21,157, // `boolean
22,306, // `null
72,512, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,311, // letter128
93,179, // {199..218 231..250}
94,179, // {193..198 225..230}
106,578, // "#"
  }
,
{ // state 459
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 460
24,330, // `[
101,32, // "["
  }
,
{ // state 461
59,274, // `*
60,479, // `/
61,488, // `%
110,150, // "/"
115,263, // "%"
127,509, // "*"
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 462
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 463
2,449, // ws*
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 464
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 465
7,453, // ID
16,458, // `(
22,5, // `null
45,88, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 466
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 467
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 468
17,226, // `)
108,45, // ")"
  }
,
{ // state 469
2,409, // ws*
24,MIN_REDUCTION+128, // `[
101,MIN_REDUCTION+128, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 470
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 471
0x80000000|582, // match move
0x80000000|297, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 472
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 473
2,604, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 474
77,181, // "c"
  }
,
{ // state 475
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 476
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 477
2,98, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 478
2,219, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 479
7,453, // ID
16,458, // `(
22,5, // `null
48,159, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 480
24,MIN_REDUCTION+202, // `[
101,MIN_REDUCTION+202, // "["
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 481
24,MIN_REDUCTION+161, // `[
101,MIN_REDUCTION+161, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 482
24,MIN_REDUCTION+163, // `[
101,MIN_REDUCTION+163, // "["
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 483
15,455, // `void
106,334, // "#"
  }
,
{ // state 484
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 485
24,MIN_REDUCTION+212, // `[
101,MIN_REDUCTION+212, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 486
0x80000000|376, // match move
0x80000000|325, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 487
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 488
7,453, // ID
16,458, // `(
22,5, // `null
48,195, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 489
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 490
0x80000000|517, // match move
0x80000000|151, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 491
2,265, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 492
10,123, // `}
40,475, // <case>
41,560, // `case
106,474, // "#"
123,369, // "}"
  }
,
{ // state 493
2,425, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
146,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 494
7,453, // ID
22,5, // `null
49,430, // <exp1>
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
106,39, // "#"
121,384, // "@"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 495
0x80000000|1, // match move
0x80000000|502, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 496
17,434, // `)
108,478, // ")"
  }
,
{ // state 497
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 498
10,339, // `}
12,286, // <decl in class>
13,254, // <method decl>
14,483, // `public
106,109, // "#"
123,324, // "}"
  }
,
{ // state 499
7,453, // ID
16,458, // `(
22,5, // `null
44,205, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 500
2,145, // ws*
24,MIN_REDUCTION+213, // `[
101,MIN_REDUCTION+213, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 501
0x80000000|1, // match move
0x80000000|197, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 502
24,MIN_REDUCTION+58, // `[
37,584, // `++
101,MIN_REDUCTION+58, // "["
121,193, // "@"
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 503
2,167, // ws*
105,598, // " "
122,194, // {10}
131,243, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 504
7,453, // ID
16,458, // `(
22,5, // `null
31,245, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 505
28,137, // `;
111,188, // ";"
  }
,
{ // state 506
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 507
24,MIN_REDUCTION+72, // `[
101,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 508
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 509
2,119, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 510
9,299, // <decl in class>*
10,357, // `}
12,221, // <decl in class>
13,254, // <method decl>
14,483, // `public
106,109, // "#"
123,324, // "}"
  }
,
{ // state 511
28,55, // `;
111,362, // ";"
  }
,
{ // state 512
72,196, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,222, // letter128
93,179, // {199..218 231..250}
94,179, // {193..198 225..230}
95,549, // digit
96,287, // {"1".."9"}
97,287, // "0"
98,120, // digit128
99,470, // {176..185}
119,12, // "_"
129,554, // {223}
132,427, // idChar*
133,416, // $$0
140,524, // idChar
141,473, // idChar128
  }
,
{ // state 513
84,532, // "u"
  }
,
{ // state 514
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 515
0x80000000|395, // match move
0x80000000|596, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 516
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
128, // ID
288, // `{
-1, // <decl in class>*
350, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
412, // `void
458, // `(
-1, // `)
594, // <stmt>*
527, // <type>
382, // `int
157, // `boolean
40, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
31, // <stmt>
136, // <assign>
93, // `;
540, // <local var decl>
525, // `if
300, // <exp>
-1, // `else
142, // `for
323, // `while
523, // `break
-1, // `=
-1, // `++
590, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
171, // <exp8>
360, // <exp7>
185, // <exp6>
366, // <exp5>
279, // <exp4>
461, // <exp3>
224, // <exp2>
130, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
494, // `+
314, // `-
-1, // `*
-1, // `/
-1, // `%
252, // `!
441, // INTLIT
132, // STRINGLIT
353, // CHARLIT
-1, // `.
267, // `this
18, // `true
268, // `false
74, // `new
-1, // <empty bracket pair>**
413, // letter
435, // "a"
435, // "p"
435, // "s"
435, // "v"
435, // "c"
435, // "f"
435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
435, // "i"
435, // "l"
435, // "o"
435, // "r"
435, // "u"
435, // "x"
435, // "b"
435, // "e"
435, // "h"
435, // "n"
435, // "t"
435, // "w"
443, // letter128
347, // {199..218 231..250}
347, // {193..198 225..230}
-1, // digit
259, // {"1".."9"}
317, // "0"
410, // digit128
56, // {176..185}
-1, // any
-1, // "["
296, // "-"
-1, // "<"
-1, // "|"
-1, // " "
429, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
362, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
454, // "{"
-1, // "%"
491, // "("
103, // "+"
-1, // "."
-1, // "_"
-1, // "="
384, // "@"
-1, // {10}
324, // "}"
370, // "!"
331, // "'"
168, // '"'
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
{ // state 517
2,35, // ws*
  }
,
{ // state 518
0x80000000|242, // match move
0x80000000|223, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 519
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 520
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 521
24,MIN_REDUCTION+210, // `[
101,MIN_REDUCTION+210, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 522
0x80000000|248, // match move
0x80000000|52, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 523
28,161, // `;
111,362, // ";"
  }
,
{ // state 524
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 525
16,199, // `(
116,491, // "("
  }
,
{ // state 526
105,598, // " "
122,194, // {10}
131,118, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 527
7,180, // ID
23,239, // <empty bracket pair>
24,330, // `[
72,512, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,311, // letter128
93,179, // {199..218 231..250}
94,179, // {193..198 225..230}
101,32, // "["
  }
,
{ // state 528
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 529
10,563, // `}
39,373, // <case>*
40,448, // <case>
41,560, // `case
106,474, // "#"
123,324, // "}"
  }
,
{ // state 530
2,13, // ws*
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 531
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 532
2,208, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 533
24,MIN_REDUCTION+62, // `[
101,MIN_REDUCTION+62, // "["
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 534
90,398, // "t"
  }
,
{ // state 535
17,431, // `)
108,478, // ")"
  }
,
{ // state 536
0x80000000|450, // match move
0x80000000|559, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 537
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 538
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 539
0x80000000|476, // match move
0x80000000|403, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 540
28,289, // `;
111,362, // ";"
  }
,
{ // state 541
145,MIN_REDUCTION+0, // $
  }
,
{ // state 542
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 543
24,MIN_REDUCTION+169, // `[
101,MIN_REDUCTION+169, // "["
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 544
105,MIN_REDUCTION+78, // " "
122,MIN_REDUCTION+78, // {10}
131,MIN_REDUCTION+78, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 545
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 546
24,MIN_REDUCTION+166, // `[
101,MIN_REDUCTION+166, // "["
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 547
7,453, // ID
16,458, // `(
22,5, // `null
43,321, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 548
117,580, // "+"
  }
,
{ // state 549
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 550
24,MIN_REDUCTION+208, // `[
101,MIN_REDUCTION+208, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 551
7,453, // ID
16,458, // `(
22,5, // `null
31,511, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 552
0x80000000|472, // match move
0x80000000|77, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 553
24,MIN_REDUCTION+69, // `[
101,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 554
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 555
2,186, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 556
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 557
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 558
104,589, // "|"
  }
,
{ // state 559
2,162, // ws*
24,MIN_REDUCTION+211, // `[
101,MIN_REDUCTION+211, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 560
7,453, // ID
16,458, // `(
22,5, // `null
31,432, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 561
16,468, // `(
116,491, // "("
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 562
0x80000000|588, // match move
0x80000000|280, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 563
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 564
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 565
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 566
7,128, // ID
8,26, // `{
15,412, // `void
16,458, // `(
19,527, // <type>
20,382, // `int
21,157, // `boolean
22,40, // `null
26,345, // <stmt>
27,244, // <assign>
28,445, // `;
29,25, // <local var decl>
30,160, // `if
31,300, // <exp>
33,233, // `for
34,59, // `while
35,505, // `break
38,214, // `switch
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,429, // "#"
111,188, // ";"
114,454, // "{"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 567
24,MIN_REDUCTION+127, // `[
101,MIN_REDUCTION+127, // "["
105,371, // " "
122,249, // {10}
131,217, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 568
7,453, // ID
16,458, // `(
22,5, // `null
46,240, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 569
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 570
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 571
24,MIN_REDUCTION+76, // `[
101,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 572
0x80000000|192, // match move
0x80000000|348, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 573
0x80000000|1, // match move
0x80000000|553, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 574
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 575
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 576
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 577
7,453, // ID
16,458, // `(
22,5, // `null
31,126, // <exp>
42,171, // <exp8>
43,360, // <exp7>
44,185, // <exp6>
45,366, // <exp5>
46,279, // <exp4>
47,461, // <exp3>
48,224, // <exp2>
49,130, // <exp1>
57,494, // `+
58,314, // `-
62,252, // `!
63,441, // INTLIT
64,132, // STRINGLIT
65,353, // CHARLIT
67,267, // `this
68,18, // `true
69,268, // `false
70,74, // `new
72,413, // letter
73,435, // "a"
74,435, // "p"
75,435, // "s"
76,435, // "v"
77,435, // "c"
78,435, // "f"
79,435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,435, // "i"
81,435, // "l"
82,435, // "o"
83,435, // "r"
84,435, // "u"
85,435, // "x"
86,435, // "b"
87,435, // "e"
88,435, // "h"
89,435, // "n"
90,435, // "t"
91,435, // "w"
92,443, // letter128
93,347, // {199..218 231..250}
94,347, // {193..198 225..230}
96,259, // {"1".."9"}
97,317, // "0"
98,410, // digit128
99,56, // {176..185}
102,296, // "-"
106,39, // "#"
116,491, // "("
117,103, // "+"
121,384, // "@"
124,370, // "!"
125,331, // "'"
126,168, // '"'
  }
,
{ // state 578
76,127, // "v"
80,64, // "i"
86,436, // "b"
89,513, // "n"
  }
,
{ // state 579
105,MIN_REDUCTION+202, // " "
122,MIN_REDUCTION+202, // {10}
131,MIN_REDUCTION+202, // ws
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 580
2,506, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 581
2,11, // ws*
24,MIN_REDUCTION+209, // `[
101,MIN_REDUCTION+209, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 582
2,501, // ws*
  }
,
{ // state 583
77,310, // "c"
  }
,
{ // state 584
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 585
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 586
2,167, // ws*
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 587
73,375, // "a"
74,375, // "p"
75,375, // "s"
76,375, // "v"
77,375, // "c"
78,375, // "f"
79,375, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
80,375, // "i"
81,375, // "l"
82,375, // "o"
83,375, // "r"
84,375, // "u"
85,375, // "x"
86,375, // "b"
87,375, // "e"
88,375, // "h"
89,375, // "n"
90,375, // "t"
91,375, // "w"
94,437, // {193..198 225..230}
96,375, // {"1".."9"}
97,375, // "0"
99,437, // {176..185}
137,228, // $$2
142,285, // hexDigit
143,536, // hexDigit128
  }
,
{ // state 588
2,115, // ws*
  }
,
{ // state 589
2,364, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 590
16,303, // `(
116,491, // "("
  }
,
{ // state 591
0x80000000|359, // match move
0x80000000|173, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 592
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 593
82,477, // "o"
83,379, // "r"
  }
,
{ // state 594
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
128, // ID
288, // `{
-1, // <decl in class>*
556, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
412, // `void
458, // `(
-1, // `)
-1, // <stmt>*
527, // <type>
382, // `int
157, // `boolean
40, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
102, // <stmt>
136, // <assign>
93, // `;
540, // <local var decl>
525, // `if
300, // <exp>
-1, // `else
142, // `for
323, // `while
523, // `break
-1, // `=
-1, // `++
590, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
171, // <exp8>
360, // <exp7>
185, // <exp6>
366, // <exp5>
279, // <exp4>
461, // <exp3>
224, // <exp2>
130, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
494, // `+
314, // `-
-1, // `*
-1, // `/
-1, // `%
252, // `!
441, // INTLIT
132, // STRINGLIT
353, // CHARLIT
-1, // `.
267, // `this
18, // `true
268, // `false
74, // `new
-1, // <empty bracket pair>**
413, // letter
435, // "a"
435, // "p"
435, // "s"
435, // "v"
435, // "c"
435, // "f"
435, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
435, // "i"
435, // "l"
435, // "o"
435, // "r"
435, // "u"
435, // "x"
435, // "b"
435, // "e"
435, // "h"
435, // "n"
435, // "t"
435, // "w"
443, // letter128
347, // {199..218 231..250}
347, // {193..198 225..230}
-1, // digit
259, // {"1".."9"}
317, // "0"
410, // digit128
56, // {176..185}
-1, // any
-1, // "["
296, // "-"
-1, // "<"
-1, // "|"
-1, // " "
429, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
362, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
454, // "{"
-1, // "%"
491, // "("
103, // "+"
-1, // "."
-1, // "_"
-1, // "="
384, // "@"
-1, // {10}
324, // "}"
370, // "!"
331, // "'"
168, // '"'
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
{ // state 595
0x80000000|232, // match move
0x80000000|24, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 596
24,MIN_REDUCTION+180, // `[
101,MIN_REDUCTION+180, // "["
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 597
0x80000000|1, // match move
0x80000000|216, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 598
0x80000000|164, // match move
0x80000000|241, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 599
2,352, // ws*
105,99, // " "
122,30, // {10}
131,421, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 600
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 601
91,555, // "w"
  }
,
{ // state 602
0x80000000|23, // match move
0x80000000|545, // no-match move
0x80000000|346, // NT-test-match state for `else
  }
,
{ // state 603
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 604
105,99, // " "
122,30, // {10}
131,48, // ws
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 605
0x80000000|402, // match move
0x80000000|571, // no-match move
0x80000000|460, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 606
2,354, // ws*
24,MIN_REDUCTION+168, // `[
101,MIN_REDUCTION+168, // "["
105,371, // " "
122,249, // {10}
131,591, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 607
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 608
MIN_REDUCTION+29, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[609][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
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
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(13<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(13<<16)+7,
// <type> ::= `int
(19<<16)+1,
// <type> ::= `boolean
(19<<16)+1,
// <type> ::= `void
(19<<16)+1,
// <type> ::= `null
(19<<16)+1,
// <type> ::= ID
(19<<16)+1,
// <type> ::= <type> <empty bracket pair>
(19<<16)+2,
// <empty bracket pair> ::= `[ `]
(23<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(26<<16)+3,
// <stmt> ::= `{ `}
(26<<16)+2,
// <stmt> ::= <assign> `;
(26<<16)+2,
// <stmt> ::= <local var decl> `;
(26<<16)+2,
// <stmt> ::= `if `( <exp> `) <stmt> !`else
(26<<16)+5,
// <stmt> ::= `if `( <exp> `) <stmt> `else <stmt>
(26<<16)+7,
// <stmt> ::= `for `( <assign> `; <exp> `; <assign> `) <stmt>
(26<<16)+9,
// <stmt> ::= `while `( <exp> `) <stmt>
(26<<16)+5,
// <stmt> ::= `break `;
(26<<16)+2,
// <assign> ::= <exp> `= <exp>
(27<<16)+3,
// <assign> ::= ID `++
(27<<16)+2,
// <local var decl> ::= <type> ID `= <exp>
(29<<16)+4,
// <stmt> ::= `;
(26<<16)+1,
// <stmt> ::= `switch `( <exp> `) `{ <case>* `}
(26<<16)+7,
// <stmt> ::= `switch `( <exp> `) `{ `}
(26<<16)+6,
// <case> ::= `case <exp> `;
(40<<16)+3,
// <exp> ::= <exp8>
(31<<16)+1,
// <exp8> ::= <exp7>
(42<<16)+1,
// <exp7> ::= <exp6>
(43<<16)+1,
// <exp6> ::= <exp5>
(44<<16)+1,
// <exp5> ::= <exp4>
(45<<16)+1,
// <exp4> ::= <exp3>
(46<<16)+1,
// <exp3> ::= <exp2>
(47<<16)+1,
// <exp2> ::= <exp1>
(48<<16)+1,
// <exp8> ::= <exp8> `|| <exp7>
(42<<16)+3,
// <exp7> ::= <exp7> `&& <exp6>
(43<<16)+3,
// <exp6> ::= <exp6> `== <exp5>
(44<<16)+3,
// <exp6> ::= <exp6> `!= <exp5>
(44<<16)+3,
// <exp5> ::= <exp5> `< <exp4>
(45<<16)+3,
// <exp5> ::= <exp5> `<= <exp4>
(45<<16)+3,
// <exp5> ::= <exp5> `> <exp4>
(45<<16)+3,
// <exp4> ::= <exp4> `+ <exp3>
(46<<16)+3,
// <exp4> ::= <exp4> `- <exp3>
(46<<16)+3,
// <exp3> ::= <exp3> `* <exp2>
(47<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(47<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(47<<16)+3,
// <exp2> ::= `( <type> `) <exp1>
(48<<16)+4,
// <exp2> ::= `+ <exp1>
(48<<16)+2,
// <exp2> ::= `- <exp1>
(48<<16)+2,
// <exp2> ::= `! <exp1>
(48<<16)+2,
// <exp1> ::= ID
(49<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(49<<16)+4,
// <exp1> ::= INTLIT
(49<<16)+1,
// <exp1> ::= STRINGLIT
(49<<16)+1,
// <exp1> ::= CHARLIT
(49<<16)+1,
// <exp1> ::= <exp1> `. ID
(49<<16)+3,
// <exp1> ::= `this
(49<<16)+1,
// <exp1> ::= `true
(49<<16)+1,
// <exp1> ::= `false
(49<<16)+1,
// <exp1> ::= `null
(49<<16)+1,
// <exp1> ::= `new ID `( `)
(49<<16)+4,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] <empty bracket pair>**
(49<<16)+6,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] !<empty bracket pair>
(49<<16)+5,
// letter ::= {"A".."Z" "a".."z"}
(72<<16)+1,
// letter128 ::= {193..218 225..250}
(92<<16)+1,
// digit ::= {"0".."9"}
(95<<16)+1,
// digit128 ::= {176..185}
(98<<16)+1,
// any ::= {0..127}
(100<<16)+1,
// any128 ::= {128..255}
(128<<16)+1,
// ws ::= " "
(131<<16)+1,
// ws ::= {10}
(131<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(21<<16)+4,
// `boolean ::= "#" "b" "o"
(21<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `extends ::= "#" "e" "x" ws*
(11<<16)+4,
// `extends ::= "#" "e" "x"
(11<<16)+3,
// `void ::= "#" "v" "o" ws*
(15<<16)+4,
// `void ::= "#" "v" "o"
(15<<16)+3,
// `int ::= "#" "i" "t" ws*
(20<<16)+4,
// `int ::= "#" "i" "t"
(20<<16)+3,
// `while ::= "#" "w" "h" ws*
(34<<16)+4,
// `while ::= "#" "w" "h"
(34<<16)+3,
// `if ::= "#" "+" ws*
(30<<16)+3,
// `if ::= "#" "+"
(30<<16)+2,
// `else ::= "#" "e" "l" ws*
(32<<16)+4,
// `else ::= "#" "e" "l"
(32<<16)+3,
// `for ::= "#" "f" "o" ws*
(33<<16)+4,
// `for ::= "#" "f" "o"
(33<<16)+3,
// `break ::= "#" "b" "r" ws*
(35<<16)+4,
// `break ::= "#" "b" "r"
(35<<16)+3,
// `this ::= "#" "t" "h" ws*
(67<<16)+4,
// `this ::= "#" "t" "h"
(67<<16)+3,
// `false ::= "#" "f" "a" ws*
(69<<16)+4,
// `false ::= "#" "f" "a"
(69<<16)+3,
// `true ::= "#" "t" "r" ws*
(68<<16)+4,
// `true ::= "#" "t" "r"
(68<<16)+3,
// `null ::= "#" "n" "u" ws*
(22<<16)+4,
// `null ::= "#" "n" "u"
(22<<16)+3,
// `new ::= "#" "n" "e" ws*
(70<<16)+4,
// `new ::= "#" "n" "e"
(70<<16)+3,
// `case ::= "#" "c" "e" ws*
(41<<16)+4,
// `case ::= "#" "c" "e"
(41<<16)+3,
// `public ::= "#" "p" "u" ws*
(14<<16)+4,
// `public ::= "#" "p" "u"
(14<<16)+3,
// `switch ::= "#" "s" "w" ws*
(38<<16)+4,
// `switch ::= "#" "s" "w"
(38<<16)+3,
// `! ::= "!" ws*
(62<<16)+2,
// `! ::= "!"
(62<<16)+1,
// `!= ::= "@" "!" ws*
(53<<16)+3,
// `!= ::= "@" "!"
(53<<16)+2,
// `% ::= "%" ws*
(61<<16)+2,
// `% ::= "%"
(61<<16)+1,
// `&& ::= "@" "&" ws*
(51<<16)+3,
// `&& ::= "@" "&"
(51<<16)+2,
// `* ::= "*" ws*
(59<<16)+2,
// `* ::= "*"
(59<<16)+1,
// `( ::= "(" ws*
(16<<16)+2,
// `( ::= "("
(16<<16)+1,
// `) ::= ")" ws*
(17<<16)+2,
// `) ::= ")"
(17<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(58<<16)+2,
// `- ::= "-"
(58<<16)+1,
// `+ ::= "+" ws*
(57<<16)+2,
// `+ ::= "+"
(57<<16)+1,
// `= ::= "=" ws*
(36<<16)+2,
// `= ::= "="
(36<<16)+1,
// `== ::= "@" "=" ws*
(52<<16)+3,
// `== ::= "@" "="
(52<<16)+2,
// `[ ::= "[" ws*
(24<<16)+2,
// `[ ::= "["
(24<<16)+1,
// `] ::= "]" ws*
(25<<16)+2,
// `] ::= "]"
(25<<16)+1,
// `|| ::= "@" "|" ws*
(50<<16)+3,
// `|| ::= "@" "|"
(50<<16)+2,
// `< ::= "<" ws*
(54<<16)+2,
// `< ::= "<"
(54<<16)+1,
// `<= ::= "@" "<" ws*
(55<<16)+3,
// `<= ::= "@" "<"
(55<<16)+2,
// `> ::= ">" !"=" ws*
(56<<16)+2,
// `> ::= ">" !"="
(56<<16)+1,
// `. ::= "." ws*
(66<<16)+2,
// `. ::= "."
(66<<16)+1,
// `; ::= ";" ws*
(28<<16)+2,
// `; ::= ";"
(28<<16)+1,
// `++ ::= "@" "+" ws*
(37<<16)+3,
// `++ ::= "@" "+"
(37<<16)+2,
// `/ ::= "/" ws*
(60<<16)+2,
// `/ ::= "/"
(60<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(63<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(63<<16)+2,
// INTLIT ::= digit128 ws*
(63<<16)+2,
// INTLIT ::= digit128
(63<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(63<<16)+3,
// INTLIT ::= "0" $$2
(63<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(64<<16)+3,
// STRINGLIT ::= "@" '"'
(64<<16)+2,
// STRINGLIT ::= '"' any* $$3
(64<<16)+3,
// STRINGLIT ::= '"' $$3
(64<<16)+2,
// CHARLIT ::= "'" any ws*
(65<<16)+3,
// CHARLIT ::= "'" any
(65<<16)+2,
// idChar ::= letter
(140<<16)+1,
// idChar ::= digit
(140<<16)+1,
// idChar ::= "_"
(140<<16)+1,
// idChar128 ::= letter128
(141<<16)+1,
// idChar128 ::= digit128
(141<<16)+1,
// idChar128 ::= {223}
(141<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(142<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(143<<16)+1,
// digit* ::= digit* digit
(134<<16)+2,
// digit* ::= digit
(134<<16)+1,
// any* ::= any* any
(138<<16)+2,
// any* ::= any
(138<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(136<<16)+2,
// hexDigit* ::= hexDigit
(136<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// <case>* ::= <case>* <case>
(39<<16)+2,
// <case>* ::= <case>
(39<<16)+1,
// idChar* ::= idChar* idChar
(132<<16)+2,
// idChar* ::= idChar
(132<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>
(71<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>
(144<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>
(144<<16)+1,
// $$0 ::= idChar128 ws*
(133<<16)+2,
// $$0 ::= idChar128
(133<<16)+1,
// $$1 ::= digit128 ws*
(135<<16)+2,
// $$1 ::= digit128
(135<<16)+1,
// $$2 ::= hexDigit128 ws*
(137<<16)+2,
// $$2 ::= hexDigit128
(137<<16)+1,
// $$3 ::= any128 ws*
(139<<16)+2,
// $$3 ::= any128
(139<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
112, // 0
112, // 1
112, // 2
112, // 3
112, // 4
112, // 5
112, // 6
112, // 7
112, // 8
112, // 9
122, // 10
112, // 11
112, // 12
112, // 13
112, // 14
112, // 15
112, // 16
112, // 17
112, // 18
112, // 19
112, // 20
112, // 21
112, // 22
112, // 23
112, // 24
112, // 25
112, // 26
112, // 27
112, // 28
112, // 29
112, // 30
112, // 31
105, // " "
124, // "!"
126, // '"'
106, // "#"
112, // "$"
115, // "%"
107, // "&"
125, // "'"
116, // "("
108, // ")"
127, // "*"
117, // "+"
112, // ","
102, // "-"
118, // "."
110, // "/"
97, // "0"
96, // "1"
96, // "2"
96, // "3"
96, // "4"
96, // "5"
96, // "6"
96, // "7"
96, // "8"
96, // "9"
112, // ":"
111, // ";"
103, // "<"
120, // "="
113, // ">"
112, // "?"
121, // "@"
79, // "A"
79, // "B"
79, // "C"
79, // "D"
79, // "E"
79, // "F"
79, // "G"
79, // "H"
79, // "I"
79, // "J"
79, // "K"
79, // "L"
79, // "M"
79, // "N"
79, // "O"
79, // "P"
79, // "Q"
79, // "R"
79, // "S"
79, // "T"
79, // "U"
79, // "V"
79, // "W"
79, // "X"
79, // "Y"
79, // "Z"
101, // "["
112, // "\"
109, // "]"
112, // "^"
119, // "_"
112, // "`"
73, // "a"
86, // "b"
77, // "c"
79, // "d"
87, // "e"
78, // "f"
79, // "g"
88, // "h"
80, // "i"
79, // "j"
79, // "k"
81, // "l"
79, // "m"
89, // "n"
82, // "o"
74, // "p"
79, // "q"
83, // "r"
75, // "s"
90, // "t"
84, // "u"
76, // "v"
91, // "w"
85, // "x"
79, // "y"
79, // "z"
114, // "{"
104, // "|"
123, // "}"
112, // "~"
112, // 127
130, // 128
130, // 129
130, // 130
130, // 131
130, // 132
130, // 133
130, // 134
130, // 135
130, // 136
130, // 137
130, // 138
130, // 139
130, // 140
130, // 141
130, // 142
130, // 143
130, // 144
130, // 145
130, // 146
130, // 147
130, // 148
130, // 149
130, // 150
130, // 151
130, // 152
130, // 153
130, // 154
130, // 155
130, // 156
130, // 157
130, // 158
130, // 159
130, // 160
130, // 161
130, // 162
130, // 163
130, // 164
130, // 165
130, // 166
130, // 167
130, // 168
130, // 169
130, // 170
130, // 171
130, // 172
130, // 173
130, // 174
130, // 175
99, // 176
99, // 177
99, // 178
99, // 179
99, // 180
99, // 181
99, // 182
99, // 183
99, // 184
99, // 185
130, // 186
130, // 187
130, // 188
130, // 189
130, // 190
130, // 191
130, // 192
94, // 193
94, // 194
94, // 195
94, // 196
94, // 197
94, // 198
93, // 199
93, // 200
93, // 201
93, // 202
93, // 203
93, // 204
93, // 205
93, // 206
93, // 207
93, // 208
93, // 209
93, // 210
93, // 211
93, // 212
93, // 213
93, // 214
93, // 215
93, // 216
93, // 217
93, // 218
130, // 219
130, // 220
130, // 221
130, // 222
129, // 223
130, // 224
94, // 225
94, // 226
94, // 227
94, // 228
94, // 229
94, // 230
93, // 231
93, // 232
93, // 233
93, // 234
93, // 235
93, // 236
93, // 237
93, // 238
93, // 239
93, // 240
93, // 241
93, // 242
93, // 243
93, // 244
93, // 245
93, // 246
93, // 247
93, // 248
93, // 249
93, // 250
130, // 251
130, // 252
130, // 253
130, // 254
130, // 255
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
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 9
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 10
"<type> ::= # `int", // 11
"<type> ::= # `boolean", // 12
"<type> ::= # `void", // 13
"<type> ::= # `null", // 14
"<type> ::= # ID", // 15
"<type> ::= # <type> <empty bracket pair>", // 16
"<empty bracket pair> ::= `[ `]", // 17
"<stmt> ::= # `{ <stmt>* `}", // 18
"<stmt> ::= # `{ <stmt>* `}", // 19
"<stmt> ::= <assign> `;", // 20
"<stmt> ::= <local var decl> `;", // 21
"<stmt> ::= # `if `( <exp> `) <stmt> # !`else", // 22
"<stmt> ::= # `if `( <exp> `) <stmt> # `else <stmt>", // 23
"<stmt> ::= # `for `( <assign> `; <exp> `; <assign> `) <stmt>", // 24
"<stmt> ::= # `while `( <exp> `) <stmt>", // 25
"<stmt> ::= # `break `;", // 26
"<assign> ::= <exp> # `= <exp>", // 27
"<assign> ::= # ID `++", // 28
"<local var decl> ::= <type> # ID `= <exp>", // 29
"<stmt> ::= # `;", // 30
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 31
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 32
"<case> ::= `case # <exp> `;", // 33
"<exp> ::= <exp8>", // 34
"<exp8> ::= <exp7>", // 35
"<exp7> ::= <exp6>", // 36
"<exp6> ::= <exp5>", // 37
"<exp5> ::= <exp4>", // 38
"<exp4> ::= <exp3>", // 39
"<exp3> ::= <exp2>", // 40
"<exp2> ::= <exp1>", // 41
"<exp8> ::= <exp8> # `|| <exp7>", // 42
"<exp7> ::= <exp7> # `&& <exp6>", // 43
"<exp6> ::= <exp6> # `== <exp5>", // 44
"<exp6> ::= <exp6> # `!= <exp5>", // 45
"<exp5> ::= <exp5> # `< <exp4>", // 46
"<exp5> ::= <exp5> # `<= <exp4>", // 47
"<exp5> ::= <exp5> # `> <exp4>", // 48
"<exp4> ::= <exp4> # `+ <exp3>", // 49
"<exp4> ::= <exp4> # `- <exp3>", // 50
"<exp3> ::= <exp3> # `* <exp2>", // 51
"<exp3> ::= <exp3> # `/ <exp2>", // 52
"<exp3> ::= <exp3> # `% <exp2>", // 53
"<exp2> ::= # `( <type> `) <exp1>", // 54
"<exp2> ::= # `+ <exp1>", // 55
"<exp2> ::= # `- <exp1>", // 56
"<exp2> ::= # `! <exp1>", // 57
"<exp1> ::= # ID", // 58
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 59
"<exp1> ::= # INTLIT", // 60
"<exp1> ::= # STRINGLIT", // 61
"<exp1> ::= # CHARLIT", // 62
"<exp1> ::= <exp1> `. # ID", // 63
"<exp1> ::= # `this", // 64
"<exp1> ::= # `true", // 65
"<exp1> ::= # `false", // 66
"<exp1> ::= # `null", // 67
"<exp1> ::= # `new # ID `( `)", // 68
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 69
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 70
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 71
"letter128 ::= {193..218 225..250}", // 72
"digit ::= {\"0\"..\"9\"}", // 73
"digit128 ::= {176..185}", // 74
"any ::= {0..127}", // 75
"any128 ::= {128..255}", // 76
"ws ::= \" \"", // 77
"ws ::= {10} registerNewline", // 78
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 79
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 80
"`class ::= \"#\" \"c\" \"l\" ws*", // 81
"`class ::= \"#\" \"c\" \"l\" ws*", // 82
"`extends ::= \"#\" \"e\" \"x\" ws*", // 83
"`extends ::= \"#\" \"e\" \"x\" ws*", // 84
"`void ::= \"#\" \"v\" \"o\" ws*", // 85
"`void ::= \"#\" \"v\" \"o\" ws*", // 86
"`int ::= \"#\" \"i\" \"t\" ws*", // 87
"`int ::= \"#\" \"i\" \"t\" ws*", // 88
"`while ::= \"#\" \"w\" \"h\" ws*", // 89
"`while ::= \"#\" \"w\" \"h\" ws*", // 90
"`if ::= \"#\" \"+\" ws*", // 91
"`if ::= \"#\" \"+\" ws*", // 92
"`else ::= \"#\" \"e\" \"l\" ws*", // 93
"`else ::= \"#\" \"e\" \"l\" ws*", // 94
"`for ::= \"#\" \"f\" \"o\" ws*", // 95
"`for ::= \"#\" \"f\" \"o\" ws*", // 96
"`break ::= \"#\" \"b\" \"r\" ws*", // 97
"`break ::= \"#\" \"b\" \"r\" ws*", // 98
"`this ::= \"#\" \"t\" \"h\" ws*", // 99
"`this ::= \"#\" \"t\" \"h\" ws*", // 100
"`false ::= \"#\" \"f\" \"a\" ws*", // 101
"`false ::= \"#\" \"f\" \"a\" ws*", // 102
"`true ::= \"#\" \"t\" \"r\" ws*", // 103
"`true ::= \"#\" \"t\" \"r\" ws*", // 104
"`null ::= \"#\" \"n\" \"u\" ws*", // 105
"`null ::= \"#\" \"n\" \"u\" ws*", // 106
"`new ::= \"#\" \"n\" \"e\" ws*", // 107
"`new ::= \"#\" \"n\" \"e\" ws*", // 108
"`case ::= \"#\" \"c\" \"e\" ws*", // 109
"`case ::= \"#\" \"c\" \"e\" ws*", // 110
"`public ::= \"#\" \"p\" \"u\" ws*", // 111
"`public ::= \"#\" \"p\" \"u\" ws*", // 112
"`switch ::= \"#\" \"s\" \"w\" ws*", // 113
"`switch ::= \"#\" \"s\" \"w\" ws*", // 114
"`! ::= \"!\" ws*", // 115
"`! ::= \"!\" ws*", // 116
"`!= ::= \"@\" \"!\" ws*", // 117
"`!= ::= \"@\" \"!\" ws*", // 118
"`% ::= \"%\" ws*", // 119
"`% ::= \"%\" ws*", // 120
"`&& ::= \"@\" \"&\" ws*", // 121
"`&& ::= \"@\" \"&\" ws*", // 122
"`* ::= \"*\" ws*", // 123
"`* ::= \"*\" ws*", // 124
"`( ::= \"(\" ws*", // 125
"`( ::= \"(\" ws*", // 126
"`) ::= \")\" ws*", // 127
"`) ::= \")\" ws*", // 128
"`{ ::= \"{\" ws*", // 129
"`{ ::= \"{\" ws*", // 130
"`} ::= \"}\" ws*", // 131
"`} ::= \"}\" ws*", // 132
"`- ::= \"-\" ws*", // 133
"`- ::= \"-\" ws*", // 134
"`+ ::= \"+\" ws*", // 135
"`+ ::= \"+\" ws*", // 136
"`= ::= \"=\" ws*", // 137
"`= ::= \"=\" ws*", // 138
"`== ::= \"@\" \"=\" ws*", // 139
"`== ::= \"@\" \"=\" ws*", // 140
"`[ ::= \"[\" ws*", // 141
"`[ ::= \"[\" ws*", // 142
"`] ::= \"]\" ws*", // 143
"`] ::= \"]\" ws*", // 144
"`|| ::= \"@\" \"|\" ws*", // 145
"`|| ::= \"@\" \"|\" ws*", // 146
"`< ::= \"<\" ws*", // 147
"`< ::= \"<\" ws*", // 148
"`<= ::= \"@\" \"<\" ws*", // 149
"`<= ::= \"@\" \"<\" ws*", // 150
"`> ::= \">\" !\"=\" ws*", // 151
"`> ::= \">\" !\"=\" ws*", // 152
"`. ::= \".\" ws*", // 153
"`. ::= \".\" ws*", // 154
"`; ::= \";\" ws*", // 155
"`; ::= \";\" ws*", // 156
"`++ ::= \"@\" \"+\" ws*", // 157
"`++ ::= \"@\" \"+\" ws*", // 158
"`/ ::= \"/\" ws*", // 159
"`/ ::= \"/\" ws*", // 160
"ID ::= letter128 ws*", // 161
"ID ::= letter128 ws*", // 162
"ID ::= letter idChar* idChar128 ws*", // 163
"ID ::= letter idChar* idChar128 ws*", // 164
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 165
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 166
"INTLIT ::= digit128 ws*", // 167
"INTLIT ::= digit128 ws*", // 168
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 169
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 170
"STRINGLIT ::= \"@\" \'\"\' ws*", // 171
"STRINGLIT ::= \"@\" \'\"\' ws*", // 172
"STRINGLIT ::= \'\"\' any* any128 ws*", // 173
"STRINGLIT ::= \'\"\' any* any128 ws*", // 174
"CHARLIT ::= \"\'\" any ws*", // 175
"CHARLIT ::= \"\'\" any ws*", // 176
"idChar ::= letter", // 177
"idChar ::= digit", // 178
"idChar ::= \"_\"", // 179
"idChar128 ::= letter128", // 180
"idChar128 ::= digit128", // 181
"idChar128 ::= {223}", // 182
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 183
"hexDigit128 ::= {176..185 193..198 225..230}", // 184
"digit* ::= digit* digit", // 185
"digit* ::= digit* digit", // 186
"any* ::= any* any", // 187
"any* ::= any* any", // 188
"<decl in class>* ::= <decl in class>* <decl in class>", // 189
"<decl in class>* ::= <decl in class>* <decl in class>", // 190
"hexDigit* ::= hexDigit* hexDigit", // 191
"hexDigit* ::= hexDigit* hexDigit", // 192
"<stmt>* ::= <stmt>* <stmt>", // 193
"<stmt>* ::= <stmt>* <stmt>", // 194
"<case>* ::= <case>* <case>", // 195
"<case>* ::= <case>* <case>", // 196
"idChar* ::= idChar* idChar", // 197
"idChar* ::= idChar* idChar", // 198
"<class decl>+ ::= <class decl>", // 199
"<class decl>+ ::= <class decl>+ <class decl>", // 200
"<empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>", // 201
"ws* ::= ws* ws", // 202
"ws* ::= ws* ws", // 203
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 204
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 205
"", // 206
"", // 207
"", // 208
"", // 209
"", // 210
"", // 211
"", // 212
"", // 213
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
    { // 9: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
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
    { // 10: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
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
    { // 11: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 12: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 13: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 14: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 15: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 16: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 17: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 18: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 19: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 20: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 21: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 22: <stmt> ::= [#] `if `( <exp> `) <stmt> !`else [#] @newIfBlock(int,Exp,Statement,int)=>Statement
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
    { // 23: <stmt> ::= [#] `if `( <exp> `) <stmt> [#] `else <stmt> @newIfElseBlock(int,Exp,Statement,int,Statement)=>Statement
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
    { // 24: <stmt> ::= [#] `for `( <assign> `; <exp> `; <assign> `) <stmt> @newForLoop(int,Statement,Exp,Statement,Statement)=>Statement
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
    { // 25: <stmt> ::= [#] `while `( <exp> `) <stmt> @newWhileBlock(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 26: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 27: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 28: <assign> ::= [#] ID `++ @assignPlusPlus(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 29: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 30: <stmt> ::= [#] `; @newEmptyStmt(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 31: <stmt> ::= [#] `switch `( <exp> `) `{ <case>* `} @newSwitch(int,Exp,List<Statement>)=>Statement
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
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 32: <stmt> ::= [#] `switch `( <exp> `) `{ [<case>*] `} @newSwitch(int,Exp,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 33: <case> ::= `case [#] <exp> `; @newCase(int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 34: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 36: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 40: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: <exp2> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: <exp8> ::= <exp8> [#] `|| <exp7> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 43: <exp7> ::= <exp7> [#] `&& <exp6> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 44: <exp6> ::= <exp6> [#] `== <exp5> @newDoubleEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 45: <exp6> ::= <exp6> [#] `!= <exp5> @newNotEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 46: <exp5> ::= <exp5> [#] `< <exp4> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 47: <exp5> ::= <exp5> [#] `<= <exp4> @newLessThanEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 48: <exp5> ::= <exp5> [#] `> <exp4> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 49: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 50: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 51: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 52: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 53: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 54: <exp2> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 55: <exp2> ::= [#] `+ <exp1> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 56: <exp2> ::= [#] `- <exp1> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 57: <exp2> ::= [#] `! <exp1> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 58: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 59: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 60: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 61: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 62: <exp1> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 63: <exp1> ::= <exp1> `. [#] ID @newInstVarAccess(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 64: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 65: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 66: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 67: <exp1> ::= [#] `null @newNullExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 68: <exp1> ::= [#] `new [#] ID `( `) @newObject(int,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 69: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] <empty bracket pair>** @newArray(Type,int,Exp,List<Object>)=>Exp
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
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 70: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] !<empty bracket pair> [<empty bracket pair>**] @newArray(Type,int,Exp,List<Object>)=>Exp
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 71: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 72: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 73: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 74: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 75: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 76: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 77: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: ws ::= {10} [registerNewline] @void
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 80: `boolean ::= "#" "b" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 81: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 82: `class ::= "#" "c" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 83: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 84: `extends ::= "#" "e" "x" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 85: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 86: `void ::= "#" "v" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 87: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 88: `int ::= "#" "i" "t" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 89: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 90: `while ::= "#" "w" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 91: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 92: `if ::= "#" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 93: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 94: `else ::= "#" "e" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 95: `for ::= "#" "f" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 96: `for ::= "#" "f" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 97: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 98: `break ::= "#" "b" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 99: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `this ::= "#" "t" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 101: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 102: `false ::= "#" "f" "a" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 103: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 104: `true ::= "#" "t" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 105: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 106: `null ::= "#" "n" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: `new ::= "#" "n" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 109: `case ::= "#" "c" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: `case ::= "#" "c" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 112: `public ::= "#" "p" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: `switch ::= "#" "s" "w" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 114: `switch ::= "#" "s" "w" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 115: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `! ::= "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 118: `!= ::= "@" "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 119: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `% ::= "%" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 122: `&& ::= "@" "&" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 123: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `* ::= "*" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `( ::= "(" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `) ::= ")" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `{ ::= "{" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `} ::= "}" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `- ::= "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `+ ::= "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `= ::= "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 140: `== ::= "@" "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 141: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `[ ::= "[" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `] ::= "]" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 146: `|| ::= "@" "|" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 147: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `< ::= "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 150: `<= ::= "@" "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 151: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `> ::= ">" !"=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `. ::= "." [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `; ::= ";" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 158: `++ ::= "@" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 159: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `/ ::= "/" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 162: ID ::= letter128 [ws*] @text
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 163: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 164: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 165: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 166: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 167: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 168: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 169: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 170: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 171: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 172: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 173: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 174: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 175: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 176: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 177: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 178: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 179: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 180: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 181: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 182: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 183: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 184: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 185: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 186: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 187: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 188: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 189: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 190: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 191: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 192: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 193: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 194: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 195: <case>* ::= <case>* <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 196: <case>* ::= [<case>*] <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 197: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 198: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 199: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 200: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 201: <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 202: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 203: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 204: <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 205: <empty bracket pair>* ::= [<empty bracket pair>*] <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 206: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 207: $$0 ::= idChar128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 208: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 209: $$1 ::= digit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 210: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 211: $$2 ::= hexDigit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 212: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 213: $$3 ::= any128 [ws*] @pass
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
      ((59<<5)|0x5)/*methodCall:59*/,
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
      Statement result = actionObject.newIfBlock(parm0,parm1,parm2,parm3);
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
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newWhileBlock(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignPlusPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 19: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newEmptyStmt(parm0);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Statement result = actionObject.newSwitch(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement result = actionObject.newCase(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDoubleEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 33: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 34: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 40: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 44: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNullExp(parm0);
      si.pushPb(result);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newObject(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 50: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      List<Object> parm3 = (List<Object>)si.popPb();
      Exp result = actionObject.newArray(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 51: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 52: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 53: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 54: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 55: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 56: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 57: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 58: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 59: {
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
"Statement newIfBlock(int,Exp,Statement,int)",
"Statement newIfElseBlock(int,Exp,Statement,int,Statement)",
"Statement newForLoop(int,Statement,Exp,Statement,Statement)",
"Statement newWhileBlock(int,Exp,Statement)",
"Statement newBreak(int)",
"Statement assign(Exp,int,Exp)",
"Statement assignPlusPlus(int,String)",
"Statement localVarDecl(Type,int,String,Exp)",
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
3,1,
1,1,
3,1,
2,1,
4,1,
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
