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
public int getEofSym() { return 154; }
public int getNttSym() { return 155; }
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
"<formalList>",
"<stmt>*",
"<type>",
"<returnStmt>",
"`return",
"<exp>",
"`;",
"`(",
"<listElement>*",
"`)",
"<listElement>",
"`,",
"`int",
"`boolean",
"`null",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"<local var decl>",
"`if",
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
"\",\"",
"\"]\"",
"\"/\"",
"\";\"",
"\">\"",
"\"{\"",
"{0..9 11..31 \"$\" \":\" \"?\" \"\\\" \"^\" \"`\" \"~\"..127}",
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
public int numSymbols() { return 156;}
private static final int MIN_REDUCTION = 681;
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
1,604, // <start>
2,327, // ws*
3,672, // <program>
4,74, // <class decl>+
5,592, // <class decl>
6,462, // `class
113,106, // " "
114,654, // "#"
131,32, // {10}
140,464, // ws
  }
,
{ // state 1
  }
,
{ // state 2
2,36, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 3
33,MIN_REDUCTION+91, // `[
109,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 4
113,106, // " "
131,32, // {10}
140,49, // ws
155,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|225, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 6
33,MIN_REDUCTION+183, // `[
109,MIN_REDUCTION+183, // "["
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 8
2,92, // ws*
113,670, // " "
131,206, // {10}
140,257, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 9
0x80000000|429, // match move
0x80000000|629, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 10
114,359, // "#"
  }
,
{ // state 11
0x80000000|1, // match move
0x80000000|613, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
0x80000000|1, // match move
0x80000000|201, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 13
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 14
0x80000000|98, // match move
0x80000000|472, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 15
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 16
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 17
33,MIN_REDUCTION+90, // `[
109,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 18
8,208, // `{
122,503, // "{"
  }
,
{ // state 19
0x80000000|1, // match move
0x80000000|449, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 20
0x80000000|294, // match move
0x80000000|361, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 21
0x80000000|1, // match move
0x80000000|302, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 22
0x80000000|289, // match move
0x80000000|6, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 23
39,113, // `else
114,118, // "#"
  }
,
{ // state 24
24,119, // `(
125,549, // "("
  }
,
{ // state 25
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 26
23,129, // `;
120,196, // ";"
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
128, // ID
311, // `{
-1, // <decl in class>*
99, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
456, // `void
-1, // <formalList>
455, // <stmt>*
589, // <type>
-1, // <returnStmt>
-1, // `return
325, // <exp>
101, // `;
507, // `(
-1, // <listElement>*
-1, // `)
-1, // <listElement>
-1, // `,
417, // `int
166, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
33, // <stmt>
149, // <assign>
602, // <local var decl>
248, // `if
-1, // `else
100, // `for
350, // `while
585, // `break
-1, // `=
240, // `++
597, // `--
259, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
178, // <exp8>
391, // <exp7>
191, // <exp6>
400, // <exp5>
298, // <exp4>
510, // <exp3>
237, // <exp2>
144, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
554, // `+
340, // `-
-1, // `*
-1, // `/
-1, // `%
268, // `!
489, // INTLIT
146, // STRINGLIT
383, // CHARLIT
-1, // `.
284, // `this
19, // `true
285, // `false
532, // `new
-1, // <empty bracket pair>**
457, // letter
483, // "a"
483, // "p"
483, // "s"
483, // "v"
483, // "c"
483, // "f"
483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
483, // "i"
483, // "l"
483, // "o"
483, // "r"
483, // "u"
483, // "x"
483, // "b"
483, // "e"
483, // "h"
483, // "n"
483, // "t"
483, // "w"
490, // letter128
376, // {199..218 231..250}
376, // {193..198 225..230}
-1, // digit
90, // {"1".."9"}
466, // "0"
454, // digit128
59, // {176..185}
-1, // any
-1, // "["
320, // "-"
-1, // "<"
-1, // "|"
-1, // " "
475, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
394, // ";"
-1, // ">"
503, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
549, // "("
112, // "+"
-1, // "."
-1, // "_"
-1, // "="
282, // "@"
-1, // {10}
404, // "}"
405, // "!"
357, // "'"
204, // '"'
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
33,MIN_REDUCTION+184, // `[
109,MIN_REDUCTION+184, // "["
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 29
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 30
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 31
113,670, // " "
131,206, // {10}
140,131, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 32
155,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 33
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 34
2,61, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 35
0x80000000|666, // match move
0x80000000|288, // no-match move
0x80000000|10, // NT-test-match state for `void
  }
,
{ // state 36
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 37
0x80000000|1, // match move
0x80000000|247, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 39
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 40
86,353, // "f"
97,443, // "n"
98,88, // "t"
  }
,
{ // state 41
0x80000000|246, // match move
0x80000000|297, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 44
2,217, // ws*
  }
,
{ // state 45
0x80000000|89, // match move
0x80000000|518, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 46
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 47
33,MIN_REDUCTION+74, // `[
109,MIN_REDUCTION+74, // "["
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 48
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 49
155,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 50
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 51
24,520, // `(
125,549, // "("
  }
,
{ // state 52
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 53
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 54
84,430, // "v"
88,596, // "i"
94,120, // "b"
97,317, // "n"
  }
,
{ // state 55
2,431, // ws*
33,MIN_REDUCTION+228, // `[
109,MIN_REDUCTION+228, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 56
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 57
0x80000000|543, // match move
0x80000000|538, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 58
7,12, // ID
22,325, // <exp>
24,507, // `(
31,5, // `null
36,241, // <assign>
44,240, // `++
45,597, // `--
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 59
0x80000000|304, // match move
0x80000000|216, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 60
33,MIN_REDUCTION+81, // `[
109,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 61
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 62
24,413, // `(
125,549, // "("
  }
,
{ // state 63
33,MIN_REDUCTION+190, // `[
109,MIN_REDUCTION+190, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 64
33,MIN_REDUCTION+72, // `[
109,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 65
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 66
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 67
34,300, // `]
118,176, // "]"
  }
,
{ // state 68
98,250, // "t"
  }
,
{ // state 69
33,562, // `[
74,280, // `.
109,34, // "["
127,2, // "."
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 70
0x80000000|364, // match move
0x80000000|558, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 71
2,16, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 72
2,125, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 73
2,39, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 74
5,644, // <class decl>
6,462, // `class
114,654, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 75
0x80000000|591, // match move
0x80000000|194, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 76
0x80000000|468, // match move
0x80000000|399, // no-match move
0x80000000|10, // NT-test-match state for `void
  }
,
{ // state 77
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 78
7,502, // ID
24,507, // `(
31,5, // `null
54,354, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 79
2,369, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 80
2,143, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 81
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 82
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 83
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 84
0x80000000|44, // match move
0x80000000|212, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 85
0x80000000|1, // match move
0x80000000|671, // no-match move
// T-test match for "=":
129,
  }
,
{ // state 86
0x80000000|238, // match move
0x80000000|424, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 87
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 88
91,579, // "r"
96,521, // "h"
  }
,
{ // state 89
2,453, // ws*
  }
,
{ // state 90
103,578, // digit
104,309, // {"1".."9"}
105,309, // "0"
106,459, // digit128
107,59, // {176..185}
143,486, // digit*
144,97, // $$1
  }
,
{ // state 91
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 92
0x80000000|137, // match move
0x80000000|588, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 93
7,502, // ID
24,507, // `(
31,5, // `null
55,266, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 94
62,633, // `<
63,107, // `<=
64,78, // `>
111,432, // "<"
121,85, // ">"
130,315, // "@"
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 95
26,MIN_REDUCTION+158, // `)
34,MIN_REDUCTION+158, // `]
59,MIN_REDUCTION+158, // `&&
60,MIN_REDUCTION+158, // `==
61,MIN_REDUCTION+158, // `!=
79,MIN_REDUCTION+158, // <empty bracket pair>**
113,406, // " "
116,MIN_REDUCTION+158, // ")"
118,MIN_REDUCTION+158, // "]"
130,MIN_REDUCTION+158, // "@"
131,265, // {10}
140,230, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 96
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|567, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 99
0x80000000|425, // match move
0x80000000|199, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 100
24,469, // `(
125,549, // "("
  }
,
{ // state 101
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 103
2,600, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 104
33,MIN_REDUCTION+116, // `[
109,MIN_REDUCTION+116, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 105
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 106
155,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 107
7,502, // ID
24,507, // `(
31,5, // `null
54,452, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 108
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 109
7,MIN_REDUCTION+23, // ID
33,MIN_REDUCTION+71, // `[
44,655, // `++
45,529, // `--
81,MIN_REDUCTION+23, // "a"
82,MIN_REDUCTION+23, // "p"
83,MIN_REDUCTION+23, // "s"
84,MIN_REDUCTION+23, // "v"
85,MIN_REDUCTION+23, // "c"
86,MIN_REDUCTION+23, // "f"
87,MIN_REDUCTION+23, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,MIN_REDUCTION+23, // "i"
89,MIN_REDUCTION+23, // "l"
90,MIN_REDUCTION+23, // "o"
91,MIN_REDUCTION+23, // "r"
92,MIN_REDUCTION+23, // "u"
93,MIN_REDUCTION+23, // "x"
94,MIN_REDUCTION+23, // "b"
95,MIN_REDUCTION+23, // "e"
96,MIN_REDUCTION+23, // "h"
97,MIN_REDUCTION+23, // "n"
98,MIN_REDUCTION+23, // "t"
99,MIN_REDUCTION+23, // "w"
101,MIN_REDUCTION+23, // {199..218 231..250}
102,MIN_REDUCTION+23, // {193..198 225..230}
109,MIN_REDUCTION+71, // "["
130,130, // "@"
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 110
2,656, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
155,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 112
2,163, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 113
7,128, // ID
8,311, // `{
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,101, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,467, // <stmt>
36,149, // <assign>
37,602, // <local var decl>
38,248, // `if
40,100, // `for
41,350, // `while
42,585, // `break
44,240, // `++
45,597, // `--
46,259, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,394, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 114
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 115
33,MIN_REDUCTION+227, // `[
109,MIN_REDUCTION+227, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 116
0x80000000|634, // match move
0x80000000|370, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 117
2,158, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 118
95,506, // "e"
  }
,
{ // state 119
7,502, // ID
22,202, // <exp>
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 120
90,495, // "o"
  }
,
{ // state 121
0x80000000|1, // match move
0x80000000|28, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 122
26,223, // `)
116,535, // ")"
  }
,
{ // state 123
33,MIN_REDUCTION+201, // `[
109,MIN_REDUCTION+201, // "["
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 124
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 125
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 126
0x80000000|1, // match move
0x80000000|63, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 127
2,4, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
155,MIN_REDUCTION+159, // $NT
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 128
0x80000000|678, // match move
0x80000000|109, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
0x80000000|581, // match move
0x80000000|470, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 130
110,636, // "-"
111,73, // "<"
112,660, // "|"
115,331, // "&"
126,650, // "+"
129,71, // "="
133,80, // "!"
  }
,
{ // state 131
0x80000000|48, // match move
0x80000000|651, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 132
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 134
0x80000000|678, // match move
0x80000000|625, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 135
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 136
0x80000000|65, // match move
0x80000000|523, // no-match move
0x80000000|10, // NT-test-match state for `void
  }
,
{ // state 137
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 138
0x80000000|402, // match move
0x80000000|174, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 139
7,128, // ID
8,311, // `{
10,511, // `}
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,101, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,111, // <stmt>
36,149, // <assign>
37,602, // <local var decl>
38,248, // `if
40,100, // `for
41,350, // `while
42,585, // `break
44,240, // `++
45,597, // `--
46,259, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,394, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
132,351, // "}"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 140
26,326, // `)
116,535, // ")"
  }
,
{ // state 141
155,MIN_REDUCTION+25, // $NT
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 142
90,110, // "o"
  }
,
{ // state 143
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 144
0x80000000|1, // match move
0x80000000|145, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 145
33,562, // `[
74,280, // `.
109,34, // "["
127,2, // "."
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 146
0x80000000|1, // match move
0x80000000|47, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 147
112,660, // "|"
115,331, // "&"
129,71, // "="
133,80, // "!"
  }
,
{ // state 148
7,502, // ID
31,5, // `null
57,244, // <exp1>
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
114,40, // "#"
130,419, // "@"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 149
23,381, // `;
120,394, // ";"
  }
,
{ // state 150
0x80000000|83, // match move
0x80000000|165, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 151
23,378, // `;
120,394, // ";"
  }
,
{ // state 152
23,481, // `;
120,394, // ";"
  }
,
{ // state 153
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 154
93,103, // "x"
  }
,
{ // state 155
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 156
0x80000000|1, // match move
0x80000000|544, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 157
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 158
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 161
2,15, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 162
2,37, // ws*
33,MIN_REDUCTION+195, // `[
109,MIN_REDUCTION+195, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 163
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 164
7,437, // ID
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
  }
,
{ // state 165
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 167
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 169
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 171
0x80000000|1, // match move
0x80000000|582, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 172
26,148, // `)
32,252, // <empty bracket pair>
33,356, // `[
109,34, // "["
116,535, // ")"
  }
,
{ // state 173
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 174
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 175
0x80000000|7, // match move
0x80000000|31, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 176
0x80000000|494, // match move
0x80000000|231, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 177
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 178
58,610, // `||
130,622, // "@"
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 179
0x80000000|473, // match move
0x80000000|541, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 180
33,MIN_REDUCTION+224, // `[
109,MIN_REDUCTION+224, // "["
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 181
0x80000000|338, // match move
0x80000000|233, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 182
33,562, // `[
74,280, // `.
109,34, // "["
127,2, // "."
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 184
43,343, // `=
129,214, // "="
  }
,
{ // state 185
95,332, // "e"
  }
,
{ // state 186
0x80000000|333, // match move
0x80000000|566, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 187
7,575, // ID
32,252, // <empty bracket pair>
33,356, // `[
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
109,34, // "["
  }
,
{ // state 188
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 189
0x80000000|416, // match move
0x80000000|458, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 190
113,MIN_REDUCTION+224, // " "
131,MIN_REDUCTION+224, // {10}
140,MIN_REDUCTION+224, // ws
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 191
60,418, // `==
61,513, // `!=
130,147, // "@"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 192
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 193
8,607, // `{
122,503, // "{"
  }
,
{ // state 194
2,14, // ws*
33,MIN_REDUCTION+119, // `[
109,MIN_REDUCTION+119, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 196
0x80000000|283, // match move
0x80000000|8, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 197
95,154, // "e"
  }
,
{ // state 198
33,MIN_REDUCTION+114, // `[
109,MIN_REDUCTION+114, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 199
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 201
33,MIN_REDUCTION+71, // `[
44,655, // `++
45,529, // `--
109,MIN_REDUCTION+71, // "["
130,130, // "@"
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 202
26,193, // `)
116,535, // ")"
  }
,
{ // state 203
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 204
81,52, // "a"
82,52, // "p"
83,52, // "s"
84,52, // "v"
85,52, // "c"
86,52, // "f"
87,52, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,52, // "i"
89,52, // "l"
90,52, // "o"
91,52, // "r"
92,52, // "u"
93,52, // "x"
94,52, // "b"
95,52, // "e"
96,52, // "h"
97,52, // "n"
98,52, // "t"
99,52, // "w"
101,675, // {199..218 231..250}
102,675, // {193..198 225..230}
104,52, // {"1".."9"}
105,52, // "0"
107,675, // {176..185}
108,114, // any
109,52, // "["
110,52, // "-"
111,52, // "<"
112,52, // "|"
113,52, // " "
114,52, // "#"
115,52, // "&"
116,52, // ")"
117,52, // ","
118,52, // "]"
119,52, // "/"
120,52, // ";"
121,52, // ">"
122,52, // "{"
123,52, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
124,52, // "%"
125,52, // "("
126,52, // "+"
127,52, // "."
128,52, // "_"
129,52, // "="
130,52, // "@"
131,52, // {10}
132,52, // "}"
133,52, // "!"
134,52, // "'"
135,52, // '"'
136,52, // "*"
137,70, // any128
138,675, // {223}
139,675, // {128..175 186..192 219..222 224 251..255}
147,347, // any*
148,403, // $$3
  }
,
{ // state 205
26,577, // `)
116,535, // ")"
  }
,
{ // state 206
0x80000000|277, // match move
0x80000000|609, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 207
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 208
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
128, // ID
311, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
456, // `void
-1, // <formalList>
583, // <stmt>*
589, // <type>
587, // <returnStmt>
477, // `return
325, // <exp>
101, // `;
507, // `(
-1, // <listElement>*
-1, // `)
-1, // <listElement>
-1, // `,
417, // `int
166, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
33, // <stmt>
149, // <assign>
602, // <local var decl>
248, // `if
-1, // `else
100, // `for
350, // `while
585, // `break
-1, // `=
240, // `++
597, // `--
259, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
178, // <exp8>
391, // <exp7>
191, // <exp6>
400, // <exp5>
298, // <exp4>
510, // <exp3>
237, // <exp2>
144, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
554, // `+
340, // `-
-1, // `*
-1, // `/
-1, // `%
268, // `!
489, // INTLIT
146, // STRINGLIT
383, // CHARLIT
-1, // `.
284, // `this
19, // `true
285, // `false
532, // `new
-1, // <empty bracket pair>**
457, // letter
483, // "a"
483, // "p"
483, // "s"
483, // "v"
483, // "c"
483, // "f"
483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
483, // "i"
483, // "l"
483, // "o"
483, // "r"
483, // "u"
483, // "x"
483, // "b"
483, // "e"
483, // "h"
483, // "n"
483, // "t"
483, // "w"
490, // letter128
376, // {199..218 231..250}
376, // {193..198 225..230}
-1, // digit
90, // {"1".."9"}
466, // "0"
454, // digit128
59, // {176..185}
-1, // any
-1, // "["
320, // "-"
-1, // "<"
-1, // "|"
-1, // " "
641, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
394, // ";"
-1, // ">"
503, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
549, // "("
112, // "+"
-1, // "."
-1, // "_"
-1, // "="
282, // "@"
-1, // {10}
-1, // "}"
405, // "!"
357, // "'"
204, // '"'
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
{ // state 209
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 210
7,593, // ID
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
  }
,
{ // state 211
33,MIN_REDUCTION+112, // `[
109,MIN_REDUCTION+112, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 212
2,217, // ws*
33,MIN_REDUCTION+115, // `[
109,MIN_REDUCTION+115, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 213
2,35, // ws*
113,647, // " "
131,375, // {10}
140,440, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 214
2,546, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 215
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 216
33,MIN_REDUCTION+87, // `[
109,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 217
0x80000000|1, // match move
0x80000000|198, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 218
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 219
60,418, // `==
61,513, // `!=
130,147, // "@"
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 221
2,616, // ws*
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 222
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 223
7,128, // ID
8,27, // `{
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,493, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,186, // <stmt>
36,260, // <assign>
37,26, // <local var decl>
38,51, // `if
40,253, // `for
41,62, // `while
42,563, // `break
44,240, // `++
45,597, // `--
46,24, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,196, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 224
112,660, // "|"
115,331, // "&"
  }
,
{ // state 225
33,MIN_REDUCTION+80, // `[
109,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 227
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 228
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 229
33,MIN_REDUCTION+192, // `[
109,MIN_REDUCTION+192, // "["
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 230
0x80000000|273, // match move
0x80000000|537, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 231
2,275, // ws*
26,MIN_REDUCTION+159, // `)
34,MIN_REDUCTION+159, // `]
65,MIN_REDUCTION+159, // `+
66,MIN_REDUCTION+159, // `-
67,MIN_REDUCTION+159, // `*
68,MIN_REDUCTION+159, // `/
74,MIN_REDUCTION+159, // `.
79,MIN_REDUCTION+159, // <empty bracket pair>**
109,MIN_REDUCTION+159, // "["
110,MIN_REDUCTION+159, // "-"
113,406, // " "
116,MIN_REDUCTION+159, // ")"
118,MIN_REDUCTION+159, // "]"
119,MIN_REDUCTION+159, // "/"
126,MIN_REDUCTION+159, // "+"
127,MIN_REDUCTION+159, // "."
131,265, // {10}
136,MIN_REDUCTION+159, // "*"
140,661, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 232
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 234
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 236
2,463, // ws*
33,MIN_REDUCTION+117, // `[
109,MIN_REDUCTION+117, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 238
32,295, // <empty bracket pair>
33,287, // `[
109,34, // "["
  }
,
{ // state 239
0x80000000|1, // match move
0x80000000|60, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 240
7,444, // ID
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
  }
,
{ // state 241
26,345, // `)
116,535, // ")"
  }
,
{ // state 242
0x80000000|1, // match move
0x80000000|608, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 243
0x80000000|135, // match move
0x80000000|626, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 244
0x80000000|1, // match move
0x80000000|349, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 245
33,MIN_REDUCTION+186, // `[
109,MIN_REDUCTION+186, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 247
33,MIN_REDUCTION+194, // `[
109,MIN_REDUCTION+194, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 248
24,662, // `(
125,549, // "("
  }
,
{ // state 249
0x80000000|500, // match move
0x80000000|160, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 250
2,91, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 251
0x80000000|226, // match move
0x80000000|420, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 252
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 253
24,387, // `(
125,549, // "("
  }
,
{ // state 254
65,93, // `+
66,363, // `-
110,320, // "-"
126,112, // "+"
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 255
113,MIN_REDUCTION+90, // " "
131,MIN_REDUCTION+90, // {10}
140,MIN_REDUCTION+90, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 256
2,463, // ws*
  }
,
{ // state 257
0x80000000|66, // match move
0x80000000|316, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 258
7,128, // ID
8,27, // `{
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,493, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,434, // <stmt>
36,260, // <assign>
37,26, // <local var decl>
38,51, // `if
40,253, // `for
41,62, // `while
42,563, // `break
44,240, // `++
45,597, // `--
46,24, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,196, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 259
24,631, // `(
125,549, // "("
  }
,
{ // state 260
23,20, // `;
120,196, // ";"
  }
,
{ // state 261
34,487, // `]
118,176, // "]"
  }
,
{ // state 262
26,630, // `)
116,535, // ")"
  }
,
{ // state 263
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 264
2,431, // ws*
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 265
0x80000000|628, // match move
0x80000000|3, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 266
67,291, // `*
68,536, // `/
69,547, // `%
119,161, // "/"
124,279, // "%"
136,568, // "*"
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 268
7,502, // ID
31,5, // `null
57,274, // <exp1>
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
114,40, // "#"
130,419, // "@"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 269
2,616, // ws*
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 270
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 271
0x80000000|157, // match move
0x80000000|153, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 272
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 273
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 274
0x80000000|1, // match move
0x80000000|182, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 275
0x80000000|386, // match move
0x80000000|95, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 276
26,550, // `)
27,371, // <listElement>
28,318, // `,
116,535, // ")"
117,72, // ","
  }
,
{ // state 277
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 278
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 279
2,227, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 280
7,21, // ID
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
  }
,
{ // state 281
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 282
110,636, // "-"
126,650, // "+"
135,627, // '"'
  }
,
{ // state 283
2,92, // ws*
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 284
0x80000000|1, // match move
0x80000000|461, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 285
0x80000000|1, // match move
0x80000000|322, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 286
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 287
34,249, // `]
118,176, // "]"
  }
,
{ // state 288
113,647, // " "
131,375, // {10}
140,136, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 289
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 290
33,MIN_REDUCTION+71, // `[
109,MIN_REDUCTION+71, // "["
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 291
7,502, // ID
24,507, // `(
31,5, // `null
56,664, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 292
23,663, // `;
120,394, // ";"
  }
,
{ // state 293
113,MIN_REDUCTION+90, // " "
131,MIN_REDUCTION+90, // {10}
140,MIN_REDUCTION+90, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 294
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 295
0x80000000|516, // match move
0x80000000|605, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 296
2,498, // ws*
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 297
7,MIN_REDUCTION+22, // ID
33,MIN_REDUCTION+80, // `[
81,MIN_REDUCTION+22, // "a"
82,MIN_REDUCTION+22, // "p"
83,MIN_REDUCTION+22, // "s"
84,MIN_REDUCTION+22, // "v"
85,MIN_REDUCTION+22, // "c"
86,MIN_REDUCTION+22, // "f"
87,MIN_REDUCTION+22, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,MIN_REDUCTION+22, // "i"
89,MIN_REDUCTION+22, // "l"
90,MIN_REDUCTION+22, // "o"
91,MIN_REDUCTION+22, // "r"
92,MIN_REDUCTION+22, // "u"
93,MIN_REDUCTION+22, // "x"
94,MIN_REDUCTION+22, // "b"
95,MIN_REDUCTION+22, // "e"
96,MIN_REDUCTION+22, // "h"
97,MIN_REDUCTION+22, // "n"
98,MIN_REDUCTION+22, // "t"
99,MIN_REDUCTION+22, // "w"
101,MIN_REDUCTION+22, // {199..218 231..250}
102,MIN_REDUCTION+22, // {193..198 225..230}
109,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 298
65,93, // `+
66,363, // `-
110,320, // "-"
126,112, // "+"
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 299
26,362, // `)
116,535, // ")"
  }
,
{ // state 300
0x80000000|355, // match move
0x80000000|346, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 301
2,126, // ws*
33,MIN_REDUCTION+191, // `[
109,MIN_REDUCTION+191, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 302
33,MIN_REDUCTION+76, // `[
109,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 303
113,MIN_REDUCTION+91, // " "
131,MIN_REDUCTION+91, // {10}
140,MIN_REDUCTION+91, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 304
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 305
26,515, // `)
116,535, // ")"
  }
,
{ // state 306
33,MIN_REDUCTION+73, // `[
109,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 308
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 309
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 310
8,539, // `{
122,503, // "{"
  }
,
{ // state 311
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
128, // ID
311, // `{
-1, // <decl in class>*
427, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
456, // `void
-1, // <formalList>
139, // <stmt>*
589, // <type>
-1, // <returnStmt>
-1, // `return
325, // <exp>
101, // `;
507, // `(
-1, // <listElement>*
-1, // `)
-1, // <listElement>
-1, // `,
417, // `int
166, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
33, // <stmt>
149, // <assign>
602, // <local var decl>
248, // `if
-1, // `else
100, // `for
350, // `while
585, // `break
-1, // `=
240, // `++
597, // `--
259, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
178, // <exp8>
391, // <exp7>
191, // <exp6>
400, // <exp5>
298, // <exp4>
510, // <exp3>
237, // <exp2>
144, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
554, // `+
340, // `-
-1, // `*
-1, // `/
-1, // `%
268, // `!
489, // INTLIT
146, // STRINGLIT
383, // CHARLIT
-1, // `.
284, // `this
19, // `true
285, // `false
532, // `new
-1, // <empty bracket pair>**
457, // letter
483, // "a"
483, // "p"
483, // "s"
483, // "v"
483, // "c"
483, // "f"
483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
483, // "i"
483, // "l"
483, // "o"
483, // "r"
483, // "u"
483, // "x"
483, // "b"
483, // "e"
483, // "h"
483, // "n"
483, // "t"
483, // "w"
490, // letter128
376, // {199..218 231..250}
376, // {193..198 225..230}
-1, // digit
90, // {"1".."9"}
466, // "0"
454, // digit128
59, // {176..185}
-1, // any
-1, // "["
320, // "-"
-1, // "<"
-1, // "|"
-1, // " "
475, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
394, // ";"
-1, // ">"
503, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
549, // "("
112, // "+"
-1, // "."
-1, // "_"
-1, // "="
282, // "@"
-1, // {10}
351, // "}"
405, // "!"
357, // "'"
204, // '"'
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
{ // state 312
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 313
7,128, // ID
8,27, // `{
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,493, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,545, // <stmt>
36,260, // <assign>
37,26, // <local var decl>
38,51, // `if
40,253, // `for
41,62, // `while
42,563, // `break
44,240, // `++
45,597, // `--
46,24, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,196, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 314
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 315
111,73, // "<"
112,660, // "|"
115,331, // "&"
129,71, // "="
133,80, // "!"
  }
,
{ // state 316
113,MIN_REDUCTION+224, // " "
131,MIN_REDUCTION+224, // {10}
140,MIN_REDUCTION+224, // ws
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 317
92,75, // "u"
  }
,
{ // state 318
7,643, // ID
16,456, // `void
19,524, // <type>
29,417, // `int
30,166, // `boolean
31,330, // `null
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
114,648, // "#"
  }
,
{ // state 319
2,393, // ws*
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 320
2,53, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 321
2,560, // ws*
33,MIN_REDUCTION+113, // `[
109,MIN_REDUCTION+113, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 322
33,MIN_REDUCTION+79, // `[
109,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 323
7,643, // ID
10,642, // `}
12,308, // <decl in class>
13,270, // <method decl>
14,278, // <inst var decl>
15,76, // `public
16,456, // `void
19,187, // <type>
29,417, // `int
30,166, // `boolean
31,330, // `null
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
114,476, // "#"
132,351, // "}"
  }
,
{ // state 324
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 325
43,344, // `=
129,214, // "="
  }
,
{ // state 326
7,128, // ID
8,311, // `{
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,101, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,599, // <stmt>
36,149, // <assign>
37,602, // <local var decl>
38,248, // `if
40,100, // `for
41,350, // `while
42,585, // `break
44,240, // `++
45,597, // `--
46,259, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,394, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 327
3,590, // <program>
4,74, // <class decl>+
5,592, // <class decl>
6,462, // `class
113,106, // " "
114,654, // "#"
131,32, // {10}
140,49, // ws
  }
,
{ // state 328
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 329
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 330
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 331
2,401, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 332
2,77, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 333
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 334
89,385, // "l"
  }
,
{ // state 335
7,12, // ID
22,325, // <exp>
24,507, // `(
31,5, // `null
36,436, // <assign>
44,240, // `++
45,597, // `--
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 336
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 337
2,188, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 338
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 339
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 340
7,502, // ID
31,5, // `null
57,501, // <exp1>
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
114,40, // "#"
130,419, // "@"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 341
67,291, // `*
68,536, // `/
69,547, // `%
119,161, // "/"
124,279, // "%"
136,568, // "*"
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 342
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 343
7,502, // ID
22,679, // <exp>
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 344
7,502, // ID
22,43, // <exp>
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 345
7,128, // ID
8,311, // `{
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,101, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,29, // <stmt>
36,149, // <assign>
37,602, // <local var decl>
38,248, // `if
40,100, // `for
41,350, // `while
42,585, // `break
44,240, // `++
45,597, // `--
46,259, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,394, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 346
79,640, // <empty bracket pair>**
153,9, // <empty bracket pair>*
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 347
81,52, // "a"
82,52, // "p"
83,52, // "s"
84,52, // "v"
85,52, // "c"
86,52, // "f"
87,52, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,52, // "i"
89,52, // "l"
90,52, // "o"
91,52, // "r"
92,52, // "u"
93,52, // "x"
94,52, // "b"
95,52, // "e"
96,52, // "h"
97,52, // "n"
98,52, // "t"
99,52, // "w"
101,675, // {199..218 231..250}
102,675, // {193..198 225..230}
104,52, // {"1".."9"}
105,52, // "0"
107,675, // {176..185}
108,336, // any
109,52, // "["
110,52, // "-"
111,52, // "<"
112,52, // "|"
113,52, // " "
114,52, // "#"
115,52, // "&"
116,52, // ")"
117,52, // ","
118,52, // "]"
119,52, // "/"
120,52, // ";"
121,52, // ">"
122,52, // "{"
123,52, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
124,52, // "%"
125,52, // "("
126,52, // "+"
127,52, // "."
128,52, // "_"
129,52, // "="
130,52, // "@"
131,52, // {10}
132,52, // "}"
133,52, // "!"
134,52, // "'"
135,52, // '"'
136,52, // "*"
137,70, // any128
138,675, // {223}
139,675, // {128..175 186..192 219..222 224 251..255}
148,668, // $$3
  }
,
{ // state 348
59,557, // `&&
130,224, // "@"
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 349
33,562, // `[
74,280, // `.
109,34, // "["
127,2, // "."
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 350
24,646, // `(
125,549, // "("
  }
,
{ // state 351
2,218, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 353
81,84, // "a"
  }
,
{ // state 354
65,93, // `+
66,363, // `-
110,320, // "-"
126,112, // "+"
MIN_REDUCTION+61, // (default reduction)
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
{ // state 355
32,645, // <empty bracket pair>
33,287, // `[
79,640, // <empty bracket pair>**
109,34, // "["
153,9, // <empty bracket pair>*
  }
,
{ // state 356
34,141, // `]
118,127, // "]"
  }
,
{ // state 357
81,116, // "a"
82,116, // "p"
83,116, // "s"
84,116, // "v"
85,116, // "c"
86,116, // "f"
87,116, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,116, // "i"
89,116, // "l"
90,116, // "o"
91,116, // "r"
92,116, // "u"
93,116, // "x"
94,116, // "b"
95,116, // "e"
96,116, // "h"
97,116, // "n"
98,116, // "t"
99,116, // "w"
104,116, // {"1".."9"}
105,116, // "0"
108,548, // any
109,116, // "["
110,116, // "-"
111,116, // "<"
112,116, // "|"
113,116, // " "
114,116, // "#"
115,116, // "&"
116,116, // ")"
117,116, // ","
118,116, // "]"
119,116, // "/"
120,116, // ";"
121,116, // ">"
122,116, // "{"
123,116, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
124,116, // "%"
125,116, // "("
126,116, // "+"
127,116, // "."
128,116, // "_"
129,116, // "="
130,116, // "@"
131,116, // {10}
132,116, // "}"
133,116, // "!"
134,116, // "'"
135,116, // '"'
136,116, // "*"
  }
,
{ // state 358
23,497, // `;
120,394, // ";"
  }
,
{ // state 359
84,142, // "v"
  }
,
{ // state 360
2,393, // ws*
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 361
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 362
7,128, // ID
8,27, // `{
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,493, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,396, // <stmt>
36,260, // <assign>
37,26, // <local var decl>
38,51, // `if
40,253, // `for
41,62, // `while
42,563, // `break
44,240, // `++
45,597, // `--
46,24, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,196, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 363
7,502, // ID
24,507, // `(
31,5, // `null
55,341, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 364
2,156, // ws*
  }
,
{ // state 365
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 366
2,674, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 368
62,633, // `<
63,107, // `<=
64,78, // `>
111,432, // "<"
121,85, // ">"
130,315, // "@"
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 369
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 370
33,MIN_REDUCTION+88, // `[
109,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 371
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 372
0x80000000|635, // match move
0x80000000|38, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 373
114,118, // "#"
  }
,
{ // state 374
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 375
0x80000000|168, // match move
0x80000000|303, // no-match move
0x80000000|10, // NT-test-match state for `void
  }
,
{ // state 376
0x80000000|177, // match move
0x80000000|565, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 377
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 378
7,502, // ID
22,570, // <exp>
23,335, // `;
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
120,394, // ";"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 379
0x80000000|221, // match move
0x80000000|269, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 380
10,324, // `}
47,408, // <case>*
48,374, // <case>
49,624, // `case
114,527, // "#"
132,351, // "}"
  }
,
{ // state 381
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 382
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 383
0x80000000|1, // match move
0x80000000|595, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 384
0x80000000|1, // match move
0x80000000|245, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 385
2,514, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 386
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 387
7,12, // ID
22,325, // <exp>
24,507, // `(
31,5, // `null
36,358, // <assign>
44,240, // `++
45,597, // `--
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 388
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 389
96,435, // "h"
  }
,
{ // state 390
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 391
59,557, // `&&
130,224, // "@"
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 392
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 393
0x80000000|555, // match move
0x80000000|124, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 394
2,167, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 395
0x80000000|108, // match move
0x80000000|559, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 396
0x80000000|23, // match move
0x80000000|87, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 397
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 398
2,57, // ws*
33,MIN_REDUCTION+181, // `[
109,MIN_REDUCTION+181, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 399
7,643, // ID
19,531, // <type>
29,417, // `int
30,166, // `boolean
31,330, // `null
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
114,415, // "#"
  }
,
{ // state 400
62,633, // `<
63,107, // `<=
64,78, // `>
111,432, // "<"
121,85, // ">"
130,315, // "@"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 401
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 402
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 403
0x80000000|1, // match move
0x80000000|603, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 404
0x80000000|657, // match move
0x80000000|561, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 405
2,573, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 406
0x80000000|621, // match move
0x80000000|17, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 407
7,643, // ID
9,556, // <decl in class>*
10,329, // `}
12,234, // <decl in class>
13,270, // <method decl>
14,278, // <inst var decl>
15,76, // `public
16,456, // `void
19,187, // <type>
29,417, // `int
30,166, // `boolean
31,330, // `null
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
114,476, // "#"
132,351, // "}"
  }
,
{ // state 408
10,102, // `}
48,528, // <case>
49,624, // `case
114,527, // "#"
132,351, // "}"
  }
,
{ // state 409
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 410
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 411
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 412
33,562, // `[
74,280, // `.
109,34, // "["
127,2, // "."
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 413
7,502, // ID
22,262, // <exp>
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 414
2,272, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 415
88,68, // "i"
94,484, // "b"
97,571, // "n"
  }
,
{ // state 416
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 417
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 418
7,502, // ID
24,507, // `(
31,5, // `null
53,368, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 419
135,627, // '"'
  }
,
{ // state 420
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 421
0x80000000|286, // match move
0x80000000|123, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 422
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 423
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 424
33,534, // `[
109,34, // "["
  }
,
{ // state 425
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 426
2,384, // ws*
  }
,
{ // state 427
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 428
2,614, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 429
32,251, // <empty bracket pair>
33,287, // `[
109,34, // "["
  }
,
{ // state 430
90,379, // "o"
  }
,
{ // state 431
0x80000000|263, // match move
0x80000000|115, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 432
2,508, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 433
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 434
0x80000000|488, // match move
0x80000000|87, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 435
2,492, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 436
26,612, // `)
116,535, // ")"
  }
,
{ // state 437
8,569, // `{
122,503, // "{"
  }
,
{ // state 438
2,35, // ws*
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 439
0x80000000|319, // match move
0x80000000|360, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 440
0x80000000|46, // match move
0x80000000|190, // no-match move
0x80000000|10, // NT-test-match state for `void
  }
,
{ // state 441
2,11, // ws*
  }
,
{ // state 442
80,209, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,574, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
103,611, // digit
104,309, // {"1".."9"}
105,309, // "0"
106,189, // digit128
107,59, // {176..185}
128,13, // "_"
138,421, // {223}
142,179, // $$0
149,328, // idChar
150,584, // idChar128
  }
,
{ // state 443
92,75, // "u"
95,366, // "e"
  }
,
{ // state 444
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 445
0x80000000|438, // match move
0x80000000|213, // no-match move
0x80000000|10, // NT-test-match state for `void
  }
,
{ // state 446
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 447
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 448
81,84, // "a"
90,117, // "o"
  }
,
{ // state 449
33,MIN_REDUCTION+78, // `[
109,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 450
7,128, // ID
8,311, // `{
10,496, // `}
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,101, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,111, // <stmt>
36,149, // <assign>
37,602, // <local var decl>
38,248, // `if
40,100, // `for
41,350, // `while
42,585, // `break
44,240, // `++
45,597, // `--
46,259, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,394, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
132,351, // "}"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 451
33,MIN_REDUCTION+203, // `[
109,MIN_REDUCTION+203, // "["
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 452
65,93, // `+
66,363, // `-
110,320, // "-"
126,112, // "+"
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 453
0x80000000|1, // match move
0x80000000|632, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 454
0x80000000|426, // match move
0x80000000|677, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 455
7,128, // ID
8,311, // `{
10,639, // `}
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,101, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,111, // <stmt>
36,149, // <assign>
37,602, // <local var decl>
38,248, // `if
40,100, // `for
41,350, // `while
42,585, // `break
44,240, // `++
45,597, // `--
46,259, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,394, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
132,404, // "}"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 456
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 457
80,209, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,574, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
103,611, // digit
104,309, // {"1".."9"}
105,309, // "0"
106,189, // digit128
107,59, // {176..185}
128,13, // "_"
138,421, // {223}
141,442, // idChar*
142,22, // $$0
149,586, // idChar
150,584, // idChar128
  }
,
{ // state 458
33,MIN_REDUCTION+200, // `[
109,MIN_REDUCTION+200, // "["
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 459
0x80000000|441, // match move
0x80000000|652, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 460
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 461
33,MIN_REDUCTION+77, // `[
109,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 462
7,505, // ID
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
  }
,
{ // state 463
0x80000000|1, // match move
0x80000000|104, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 464
155,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 465
2,57, // ws*
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 466
81,410, // "a"
82,410, // "p"
83,410, // "s"
84,410, // "v"
85,410, // "c"
86,410, // "f"
87,410, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,410, // "i"
89,410, // "l"
90,410, // "o"
91,410, // "r"
92,410, // "u"
93,410, // "x"
94,410, // "b"
95,410, // "e"
96,410, // "h"
97,410, // "n"
98,410, // "t"
99,410, // "w"
102,485, // {193..198 225..230}
104,410, // {"1".."9"}
105,410, // "0"
107,485, // {176..185}
145,658, // hexDigit*
146,540, // $$2
151,30, // hexDigit
152,598, // hexDigit128
  }
,
{ // state 467
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 468
16,210, // `void
114,359, // "#"
  }
,
{ // state 469
7,12, // ID
22,325, // <exp>
24,507, // `(
31,5, // `null
36,151, // <assign>
44,240, // `++
45,597, // `--
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 470
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 471
113,106, // " "
131,32, // {10}
140,49, // ws
155,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 472
33,MIN_REDUCTION+118, // `[
109,MIN_REDUCTION+118, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 473
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 474
80,209, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,235, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
103,611, // digit
104,309, // {"1".."9"}
105,309, // "0"
106,133, // digit128
107,522, // {176..185}
128,13, // "_"
138,618, // {223}
142,96, // $$0
149,328, // idChar
150,526, // idChar128
  }
,
{ // state 475
83,673, // "s"
84,142, // "v"
86,448, // "f"
88,68, // "i"
94,665, // "b"
97,443, // "n"
98,88, // "t"
99,389, // "w"
126,79, // "+"
  }
,
{ // state 476
82,491, // "p"
84,142, // "v"
88,68, // "i"
94,484, // "b"
97,571, // "n"
  }
,
{ // state 477
7,502, // ID
22,292, // <exp>
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 478
0x80000000|1, // match move
0x80000000|69, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 479
23,159, // `;
120,394, // ";"
  }
,
{ // state 480
26,258, // `)
116,535, // ")"
  }
,
{ // state 481
7,12, // ID
22,325, // <exp>
24,507, // `(
31,5, // `null
36,122, // <assign>
44,240, // `++
45,597, // `--
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 482
95,428, // "e"
  }
,
{ // state 483
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 484
90,533, // "o"
  }
,
{ // state 485
0x80000000|155, // match move
0x80000000|451, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 486
103,81, // digit
104,309, // {"1".."9"}
105,309, // "0"
106,459, // digit128
107,59, // {176..185}
144,121, // $$1
  }
,
{ // state 487
0x80000000|1, // match move
0x80000000|64, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 488
39,313, // `else
114,118, // "#"
  }
,
{ // state 489
0x80000000|1, // match move
0x80000000|306, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 490
0x80000000|465, // match move
0x80000000|398, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 491
92,445, // "u"
  }
,
{ // state 492
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 493
0x80000000|267, // match move
0x80000000|423, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 494
2,275, // ws*
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 495
0x80000000|512, // match move
0x80000000|296, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 496
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 497
7,502, // ID
22,152, // <exp>
23,620, // `;
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
120,394, // ";"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 498
0x80000000|409, // match move
0x80000000|56, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 499
2,171, // ws*
  }
,
{ // state 500
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 501
0x80000000|1, // match move
0x80000000|412, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 502
0x80000000|1, // match move
0x80000000|290, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 503
2,314, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 504
17,18, // <formalList>
24,576, // `(
125,549, // "("
  }
,
{ // state 505
8,407, // `{
11,164, // `extends
114,197, // "#"
122,503, // "{"
  }
,
{ // state 506
89,553, // "l"
  }
,
{ // state 507
7,643, // ID
16,456, // `void
19,172, // <type>
29,417, // `int
30,166, // `boolean
31,330, // `null
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
114,648, // "#"
  }
,
{ // state 508
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 509
33,356, // `[
109,34, // "["
  }
,
{ // state 510
67,291, // `*
68,536, // `/
69,547, // `%
119,161, // "/"
124,279, // "%"
136,568, // "*"
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 511
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 512
2,498, // ws*
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 513
7,502, // ID
24,507, // `(
31,5, // `null
53,94, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 514
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 515
8,380, // `{
122,503, // "{"
  }
,
{ // state 516
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 517
26,239, // `)
116,45, // ")"
  }
,
{ // state 518
2,453, // ws*
33,MIN_REDUCTION+143, // `[
109,MIN_REDUCTION+143, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 519
25,276, // <listElement>*
26,615, // `)
27,392, // <listElement>
28,318, // `,
116,535, // ")"
117,72, // ","
  }
,
{ // state 520
7,502, // ID
22,480, // <exp>
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 521
0x80000000|653, // match move
0x80000000|321, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 522
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 523
113,MIN_REDUCTION+223, // " "
131,MIN_REDUCTION+223, // {10}
140,MIN_REDUCTION+223, // ws
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 524
7,367, // ID
32,252, // <empty bracket pair>
33,356, // `[
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
109,34, // "["
  }
,
{ // state 525
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 526
2,676, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 527
85,185, // "c"
  }
,
{ // state 528
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 529
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 530
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 531
7,504, // ID
32,252, // <empty bracket pair>
33,356, // `[
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
109,34, // "["
  }
,
{ // state 532
7,134, // ID
16,601, // `void
19,86, // <type>
29,181, // `int
30,271, // `boolean
31,667, // `null
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
114,54, // "#"
  }
,
{ // state 533
2,105, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 534
7,502, // ID
22,67, // <exp>
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 535
2,232, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 536
7,502, // ID
24,507, // `(
31,5, // `null
56,169, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 537
33,MIN_REDUCTION+223, // `[
109,MIN_REDUCTION+223, // "["
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 538
33,MIN_REDUCTION+180, // `[
109,MIN_REDUCTION+180, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 539
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
128, // ID
311, // `{
-1, // <decl in class>*
220, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // <inst var decl>
-1, // `public
456, // `void
-1, // <formalList>
450, // <stmt>*
589, // <type>
-1, // <returnStmt>
-1, // `return
325, // <exp>
101, // `;
507, // `(
-1, // <listElement>*
-1, // `)
-1, // <listElement>
-1, // `,
417, // `int
166, // `boolean
41, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
33, // <stmt>
149, // <assign>
602, // <local var decl>
248, // `if
-1, // `else
100, // `for
350, // `while
585, // `break
-1, // `=
240, // `++
597, // `--
259, // `switch
-1, // <case>*
-1, // <case>
-1, // `case
178, // <exp8>
391, // <exp7>
191, // <exp6>
400, // <exp5>
298, // <exp4>
510, // <exp3>
237, // <exp2>
144, // <exp1>
-1, // `||
-1, // `&&
-1, // `==
-1, // `!=
-1, // `<
-1, // `<=
-1, // `>
554, // `+
340, // `-
-1, // `*
-1, // `/
-1, // `%
268, // `!
489, // INTLIT
146, // STRINGLIT
383, // CHARLIT
-1, // `.
284, // `this
19, // `true
285, // `false
532, // `new
-1, // <empty bracket pair>**
457, // letter
483, // "a"
483, // "p"
483, // "s"
483, // "v"
483, // "c"
483, // "f"
483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
483, // "i"
483, // "l"
483, // "o"
483, // "r"
483, // "u"
483, // "x"
483, // "b"
483, // "e"
483, // "h"
483, // "n"
483, // "t"
483, // "w"
490, // letter128
376, // {199..218 231..250}
376, // {193..198 225..230}
-1, // digit
90, // {"1".."9"}
466, // "0"
454, // digit128
59, // {176..185}
-1, // any
-1, // "["
320, // "-"
-1, // "<"
-1, // "|"
-1, // " "
475, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
394, // ";"
-1, // ">"
503, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
549, // "("
112, // "+"
-1, // "."
-1, // "_"
-1, // "="
282, // "@"
-1, // {10}
351, // "}"
405, // "!"
357, // "'"
204, // '"'
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
{ // state 540
0x80000000|1, // match move
0x80000000|638, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 541
33,MIN_REDUCTION+182, // `[
109,MIN_REDUCTION+182, // "["
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 542
110,636, // "-"
126,650, // "+"
  }
,
{ // state 543
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 544
33,MIN_REDUCTION+233, // `[
109,MIN_REDUCTION+233, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 545
0x80000000|411, // match move
0x80000000|352, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 546
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 547
7,502, // ID
24,507, // `(
31,5, // `null
56,207, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 548
0x80000000|580, // match move
0x80000000|162, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 549
2,281, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 550
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 551
7,519, // ID
32,252, // <empty bracket pair>
33,356, // `[
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
109,34, // "["
  }
,
{ // state 552
10,138, // `}
48,528, // <case>
49,624, // `case
114,527, // "#"
132,404, // "}"
  }
,
{ // state 553
2,471, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
155,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 554
7,502, // ID
31,5, // `null
57,478, // <exp1>
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
114,40, // "#"
130,419, // "@"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 555
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 556
7,643, // ID
10,365, // `}
12,308, // <decl in class>
13,270, // <method decl>
14,278, // <inst var decl>
15,76, // `public
16,456, // `void
19,187, // <type>
29,417, // `int
30,166, // `boolean
31,330, // `null
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
114,476, // "#"
132,351, // "}"
  }
,
{ // state 557
7,502, // ID
24,507, // `(
31,5, // `null
52,219, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 558
2,156, // ws*
33,MIN_REDUCTION+234, // `[
109,MIN_REDUCTION+234, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 559
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 560
0x80000000|1, // match move
0x80000000|211, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 561
2,175, // ws*
113,670, // " "
131,206, // {10}
140,257, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 562
7,502, // ID
22,261, // <exp>
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 563
23,150, // `;
120,196, // ";"
  }
,
{ // state 564
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 565
33,MIN_REDUCTION+85, // `[
109,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 566
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 567
33,MIN_REDUCTION+185, // `[
109,MIN_REDUCTION+185, // "["
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 568
2,132, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 569
7,643, // ID
9,323, // <decl in class>*
10,388, // `}
12,234, // <decl in class>
13,270, // <method decl>
14,278, // <inst var decl>
15,76, // `public
16,456, // `void
19,187, // <type>
29,417, // `int
30,166, // `boolean
31,330, // `null
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
114,476, // "#"
132,351, // "}"
  }
,
{ // state 570
23,58, // `;
120,394, // ";"
  }
,
{ // state 571
92,594, // "u"
  }
,
{ // state 572
80,209, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,235, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
103,611, // digit
104,309, // {"1".."9"}
105,309, // "0"
106,133, // digit128
107,522, // {176..185}
128,13, // "_"
138,618, // {223}
141,474, // idChar*
142,460, // $$0
149,586, // idChar
150,526, // idChar128
  }
,
{ // state 573
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 574
0x80000000|433, // match move
0x80000000|669, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 575
23,195, // `;
120,394, // ";"
  }
,
{ // state 576
7,643, // ID
16,456, // `void
19,551, // <type>
26,422, // `)
29,417, // `int
30,166, // `boolean
31,330, // `null
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
114,648, // "#"
116,535, // ")"
  }
,
{ // state 577
7,128, // ID
8,27, // `{
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,493, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,243, // <stmt>
36,260, // <assign>
37,26, // <local var decl>
38,51, // `if
40,253, // `for
41,62, // `while
42,563, // `break
44,240, // `++
45,597, // `--
46,24, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,196, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 578
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 579
0x80000000|256, // match move
0x80000000|236, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 580
2,37, // ws*
  }
,
{ // state 581
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 582
33,MIN_REDUCTION+231, // `[
109,MIN_REDUCTION+231, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 583
7,128, // ID
8,311, // `{
16,456, // `void
19,589, // <type>
20,649, // <returnStmt>
21,477, // `return
22,325, // <exp>
23,101, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,111, // <stmt>
36,149, // <assign>
37,602, // <local var decl>
38,248, // `if
40,100, // `for
41,350, // `while
42,585, // `break
44,240, // `++
45,597, // `--
46,259, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,641, // "#"
120,394, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 584
0x80000000|264, // match move
0x80000000|55, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 585
23,170, // `;
120,394, // ";"
  }
,
{ // state 586
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 587
10,215, // `}
132,351, // "}"
  }
,
{ // state 588
113,670, // " "
131,206, // {10}
140,131, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 589
7,184, // ID
32,252, // <empty bracket pair>
33,356, // `[
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
109,34, // "["
  }
,
{ // state 590
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 591
2,14, // ws*
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 592
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 593
17,310, // <formalList>
24,576, // `(
125,549, // "("
  }
,
{ // state 594
2,222, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 595
33,MIN_REDUCTION+75, // `[
109,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 596
98,439, // "t"
  }
,
{ // state 597
7,228, // ID
80,572, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,337, // letter128
101,183, // {199..218 231..250}
102,183, // {193..198 225..230}
  }
,
{ // state 598
0x80000000|499, // match move
0x80000000|623, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 599
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 600
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 601
0x80000000|530, // match move
0x80000000|447, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 602
23,312, // `;
120,394, // ";"
  }
,
{ // state 603
33,MIN_REDUCTION+193, // `[
109,MIN_REDUCTION+193, // "["
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 604
154,MIN_REDUCTION+0, // $
  }
,
{ // state 605
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 606
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 607
10,395, // `}
47,552, // <case>*
48,374, // <case>
49,624, // `case
114,527, // "#"
132,404, // "}"
  }
,
{ // state 608
33,MIN_REDUCTION+188, // `[
109,MIN_REDUCTION+188, // "["
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 609
113,MIN_REDUCTION+91, // " "
131,MIN_REDUCTION+91, // {10}
140,MIN_REDUCTION+91, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 610
7,502, // ID
24,507, // `(
31,5, // `null
51,348, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
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
{ // state 611
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 612
7,128, // ID
8,311, // `{
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,101, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,42, // <stmt>
36,149, // <assign>
37,602, // <local var decl>
38,248, // `if
40,100, // `for
41,350, // `while
42,585, // `break
44,240, // `++
45,597, // `--
46,259, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,394, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 613
33,MIN_REDUCTION+229, // `[
109,MIN_REDUCTION+229, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 614
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 615
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 616
0x80000000|525, // match move
0x80000000|82, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 617
33,MIN_REDUCTION+82, // `[
109,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 618
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 619
2,192, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 620
7,12, // ID
22,325, // <exp>
24,507, // `(
31,5, // `null
36,205, // <assign>
44,240, // `++
45,597, // `--
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 621
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 622
112,660, // "|"
  }
,
{ // state 623
2,171, // ws*
33,MIN_REDUCTION+232, // `[
109,MIN_REDUCTION+232, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 624
7,502, // ID
22,479, // <exp>
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 625
24,517, // `(
125,549, // "("
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 626
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 627
0x80000000|659, // match move
0x80000000|301, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 628
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 629
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 630
7,128, // ID
8,27, // `{
16,456, // `void
19,589, // <type>
22,325, // <exp>
23,493, // `;
24,507, // `(
29,417, // `int
30,166, // `boolean
31,41, // `null
35,372, // <stmt>
36,260, // <assign>
37,26, // <local var decl>
38,51, // `if
40,253, // `for
41,62, // `while
42,563, // `break
44,240, // `++
45,597, // `--
46,24, // `switch
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,475, // "#"
120,196, // ";"
122,503, // "{"
125,549, // "("
126,112, // "+"
130,282, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 631
7,502, // ID
22,305, // <exp>
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 632
33,MIN_REDUCTION+142, // `[
109,MIN_REDUCTION+142, // "["
113,406, // " "
131,265, // {10}
140,230, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 633
7,502, // ID
24,507, // `(
31,5, // `null
54,254, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 634
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 635
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 636
2,50, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 637
33,MIN_REDUCTION+89, // `[
109,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 638
33,MIN_REDUCTION+189, // `[
109,MIN_REDUCTION+189, // "["
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 639
0x80000000|200, // match move
0x80000000|377, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 640
0x80000000|1, // match move
0x80000000|617, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 641
83,673, // "s"
84,142, // "v"
86,448, // "f"
88,68, // "i"
91,482, // "r"
94,665, // "b"
97,443, // "n"
98,88, // "t"
99,389, // "w"
126,79, // "+"
  }
,
{ // state 642
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 643
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 644
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 645
0x80000000|342, // match move
0x80000000|606, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 646
7,502, // ID
22,140, // <exp>
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 647
0x80000000|203, // match move
0x80000000|293, // no-match move
0x80000000|10, // NT-test-match state for `void
  }
,
{ // state 648
84,142, // "v"
88,68, // "i"
94,484, // "b"
97,571, // "n"
  }
,
{ // state 649
10,339, // `}
132,351, // "}"
  }
,
{ // state 650
2,564, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 651
113,MIN_REDUCTION+223, // " "
131,MIN_REDUCTION+223, // {10}
140,MIN_REDUCTION+223, // ws
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 652
2,11, // ws*
33,MIN_REDUCTION+230, // `[
109,MIN_REDUCTION+230, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 653
2,560, // ws*
  }
,
{ // state 654
85,334, // "c"
  }
,
{ // state 655
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 656
113,106, // " "
131,32, // {10}
140,49, // ws
155,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 657
2,175, // ws*
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 658
81,410, // "a"
82,410, // "p"
83,410, // "s"
84,410, // "v"
85,410, // "c"
86,410, // "f"
87,410, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,410, // "i"
89,410, // "l"
90,410, // "o"
91,410, // "r"
92,410, // "u"
93,410, // "x"
94,410, // "b"
95,410, // "e"
96,410, // "h"
97,410, // "n"
98,410, // "t"
99,410, // "w"
102,485, // {193..198 225..230}
104,410, // {"1".."9"}
105,410, // "0"
107,485, // {176..185}
146,242, // $$2
151,307, // hexDigit
152,598, // hexDigit128
  }
,
{ // state 659
2,126, // ws*
  }
,
{ // state 660
2,397, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 661
0x80000000|390, // match move
0x80000000|180, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 662
7,502, // ID
22,299, // <exp>
24,507, // `(
31,5, // `null
50,178, // <exp8>
51,391, // <exp7>
52,191, // <exp6>
53,400, // <exp5>
54,298, // <exp4>
55,510, // <exp3>
56,237, // <exp2>
57,144, // <exp1>
65,554, // `+
66,340, // `-
70,268, // `!
71,489, // INTLIT
72,146, // STRINGLIT
73,383, // CHARLIT
75,284, // `this
76,19, // `true
77,285, // `false
78,532, // `new
80,457, // letter
81,483, // "a"
82,483, // "p"
83,483, // "s"
84,483, // "v"
85,483, // "c"
86,483, // "f"
87,483, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
88,483, // "i"
89,483, // "l"
90,483, // "o"
91,483, // "r"
92,483, // "u"
93,483, // "x"
94,483, // "b"
95,483, // "e"
96,483, // "h"
97,483, // "n"
98,483, // "t"
99,483, // "w"
100,490, // letter128
101,376, // {199..218 231..250}
102,376, // {193..198 225..230}
104,90, // {"1".."9"}
105,466, // "0"
106,454, // digit128
107,59, // {176..185}
110,320, // "-"
114,40, // "#"
125,549, // "("
126,112, // "+"
130,419, // "@"
133,405, // "!"
134,357, // "'"
135,204, // '"'
  }
,
{ // state 663
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 664
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 665
90,533, // "o"
91,414, // "r"
  }
,
{ // state 666
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 667
0x80000000|246, // match move
0x80000000|25, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 668
0x80000000|1, // match move
0x80000000|229, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 669
33,MIN_REDUCTION+199, // `[
109,MIN_REDUCTION+199, // "["
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 670
0x80000000|173, // match move
0x80000000|255, // no-match move
0x80000000|373, // NT-test-match state for `else
  }
,
{ // state 671
2,382, // ws*
113,106, // " "
131,32, // {10}
140,464, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 672
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 673
99,619, // "w"
  }
,
{ // state 674
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 675
0x80000000|446, // match move
0x80000000|637, // no-match move
0x80000000|509, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 676
113,106, // " "
131,32, // {10}
140,49, // ws
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 677
2,384, // ws*
33,MIN_REDUCTION+187, // `[
109,MIN_REDUCTION+187, // "["
113,406, // " "
131,265, // {10}
140,661, // ws
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 678
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 679
MIN_REDUCTION+41, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[680][];
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
// <method decl> ::= `public `void ID <formalList> `{ <stmt>* `}
(13<<16)+7,
// <method decl> ::= `public `void ID <formalList> `{ `}
(13<<16)+6,
// <method decl> ::= `public !`void <type> ID <formalList> `{ <stmt>* <returnStmt> `}
(13<<16)+8,
// <method decl> ::= `public !`void <type> ID <formalList> `{ <returnStmt> `}
(13<<16)+7,
// <returnStmt> ::= `return <exp> `;
(20<<16)+3,
// <formalList> ::= `( <type> ID <listElement>* `)
(17<<16)+5,
// <formalList> ::= `( <type> ID `)
(17<<16)+4,
// <formalList> ::= `( `)
(17<<16)+2,
// <listElement> ::= `, <type> ID
(27<<16)+3,
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
(32<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(35<<16)+3,
// <stmt> ::= `{ `}
(35<<16)+2,
// <stmt> ::= <assign> `;
(35<<16)+2,
// <stmt> ::= <local var decl> `;
(35<<16)+2,
// <stmt> ::= `if `( <exp> `) <stmt> !`else
(35<<16)+5,
// <stmt> ::= `if `( <exp> `) <stmt> `else <stmt>
(35<<16)+7,
// <stmt> ::= `for `( <assign> `; <exp> `; <assign> `) <stmt>
(35<<16)+9,
// <stmt> ::= `for `( <assign> `; `; <assign> `) <stmt>
(35<<16)+8,
// <stmt> ::= `while `( <exp> `) <stmt>
(35<<16)+5,
// <stmt> ::= `break `;
(35<<16)+2,
// <assign> ::= <exp> `= <exp>
(36<<16)+3,
// <assign> ::= ID `++
(36<<16)+2,
// <assign> ::= `++ ID
(36<<16)+2,
// <assign> ::= ID `--
(36<<16)+2,
// <assign> ::= `-- ID
(36<<16)+2,
// <local var decl> ::= <type> ID `= <exp>
(37<<16)+4,
// <inst var decl> ::= <type> ID `;
(14<<16)+3,
// <stmt> ::= `;
(35<<16)+1,
// <stmt> ::= `switch `( <exp> `) `{ <case>* `}
(35<<16)+7,
// <stmt> ::= `switch `( <exp> `) `{ `}
(35<<16)+6,
// <case> ::= `case <exp> `;
(48<<16)+3,
// <exp> ::= <exp8>
(22<<16)+1,
// <exp8> ::= <exp7>
(50<<16)+1,
// <exp7> ::= <exp6>
(51<<16)+1,
// <exp6> ::= <exp5>
(52<<16)+1,
// <exp5> ::= <exp4>
(53<<16)+1,
// <exp4> ::= <exp3>
(54<<16)+1,
// <exp3> ::= <exp2>
(55<<16)+1,
// <exp2> ::= <exp1>
(56<<16)+1,
// <exp8> ::= <exp8> `|| <exp7>
(50<<16)+3,
// <exp7> ::= <exp7> `&& <exp6>
(51<<16)+3,
// <exp6> ::= <exp6> `== <exp5>
(52<<16)+3,
// <exp6> ::= <exp6> `!= <exp5>
(52<<16)+3,
// <exp5> ::= <exp5> `< <exp4>
(53<<16)+3,
// <exp5> ::= <exp5> `<= <exp4>
(53<<16)+3,
// <exp5> ::= <exp5> `> <exp4>
(53<<16)+3,
// <exp4> ::= <exp4> `+ <exp3>
(54<<16)+3,
// <exp4> ::= <exp4> `- <exp3>
(54<<16)+3,
// <exp3> ::= <exp3> `* <exp2>
(55<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(55<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(55<<16)+3,
// <exp2> ::= `( <type> `) <exp1>
(56<<16)+4,
// <exp2> ::= `+ <exp1>
(56<<16)+2,
// <exp2> ::= `- <exp1>
(56<<16)+2,
// <exp2> ::= `! <exp1>
(56<<16)+2,
// <exp1> ::= ID
(57<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(57<<16)+4,
// <exp1> ::= INTLIT
(57<<16)+1,
// <exp1> ::= STRINGLIT
(57<<16)+1,
// <exp1> ::= CHARLIT
(57<<16)+1,
// <exp1> ::= <exp1> `. ID
(57<<16)+3,
// <exp1> ::= `this
(57<<16)+1,
// <exp1> ::= `true
(57<<16)+1,
// <exp1> ::= `false
(57<<16)+1,
// <exp1> ::= `null
(57<<16)+1,
// <exp1> ::= `new ID `( `)
(57<<16)+4,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] <empty bracket pair>**
(57<<16)+6,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] !<empty bracket pair>
(57<<16)+5,
// letter ::= {"A".."Z" "a".."z"}
(80<<16)+1,
// letter128 ::= {193..218 225..250}
(100<<16)+1,
// digit ::= {"0".."9"}
(103<<16)+1,
// digit128 ::= {176..185}
(106<<16)+1,
// any ::= {0..127}
(108<<16)+1,
// any128 ::= {128..255}
(137<<16)+1,
// ws ::= " "
(140<<16)+1,
// ws ::= {10}
(140<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(30<<16)+4,
// `boolean ::= "#" "b" "o"
(30<<16)+3,
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
(29<<16)+4,
// `int ::= "#" "i" "t"
(29<<16)+3,
// `while ::= "#" "w" "h" ws*
(41<<16)+4,
// `while ::= "#" "w" "h"
(41<<16)+3,
// `if ::= "#" "+" ws*
(38<<16)+3,
// `if ::= "#" "+"
(38<<16)+2,
// `else ::= "#" "e" "l" ws*
(39<<16)+4,
// `else ::= "#" "e" "l"
(39<<16)+3,
// `for ::= "#" "f" "o" ws*
(40<<16)+4,
// `for ::= "#" "f" "o"
(40<<16)+3,
// `break ::= "#" "b" "r" ws*
(42<<16)+4,
// `break ::= "#" "b" "r"
(42<<16)+3,
// `this ::= "#" "t" "h" ws*
(75<<16)+4,
// `this ::= "#" "t" "h"
(75<<16)+3,
// `false ::= "#" "f" "a" ws*
(77<<16)+4,
// `false ::= "#" "f" "a"
(77<<16)+3,
// `true ::= "#" "t" "r" ws*
(76<<16)+4,
// `true ::= "#" "t" "r"
(76<<16)+3,
// `null ::= "#" "n" "u" ws*
(31<<16)+4,
// `null ::= "#" "n" "u"
(31<<16)+3,
// `return ::= "#" "r" "e" ws*
(21<<16)+4,
// `return ::= "#" "r" "e"
(21<<16)+3,
// `new ::= "#" "n" "e" ws*
(78<<16)+4,
// `new ::= "#" "n" "e"
(78<<16)+3,
// `case ::= "#" "c" "e" ws*
(49<<16)+4,
// `case ::= "#" "c" "e"
(49<<16)+3,
// `public ::= "#" "p" "u" ws*
(15<<16)+4,
// `public ::= "#" "p" "u"
(15<<16)+3,
// `switch ::= "#" "s" "w" ws*
(46<<16)+4,
// `switch ::= "#" "s" "w"
(46<<16)+3,
// `! ::= "!" ws*
(70<<16)+2,
// `! ::= "!"
(70<<16)+1,
// `!= ::= "@" "!" ws*
(61<<16)+3,
// `!= ::= "@" "!"
(61<<16)+2,
// `% ::= "%" ws*
(69<<16)+2,
// `% ::= "%"
(69<<16)+1,
// `&& ::= "@" "&" ws*
(59<<16)+3,
// `&& ::= "@" "&"
(59<<16)+2,
// `* ::= "*" ws*
(67<<16)+2,
// `* ::= "*"
(67<<16)+1,
// `( ::= "(" ws*
(24<<16)+2,
// `( ::= "("
(24<<16)+1,
// `) ::= ")" ws*
(26<<16)+2,
// `) ::= ")"
(26<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(66<<16)+2,
// `- ::= "-"
(66<<16)+1,
// `+ ::= "+" ws*
(65<<16)+2,
// `+ ::= "+"
(65<<16)+1,
// `= ::= "=" ws*
(43<<16)+2,
// `= ::= "="
(43<<16)+1,
// `== ::= "@" "=" ws*
(60<<16)+3,
// `== ::= "@" "="
(60<<16)+2,
// `[ ::= "[" ws*
(33<<16)+2,
// `[ ::= "["
(33<<16)+1,
// `] ::= "]" ws*
(34<<16)+2,
// `] ::= "]"
(34<<16)+1,
// `|| ::= "@" "|" ws*
(58<<16)+3,
// `|| ::= "@" "|"
(58<<16)+2,
// `< ::= "<" ws*
(62<<16)+2,
// `< ::= "<"
(62<<16)+1,
// `<= ::= "@" "<" ws*
(63<<16)+3,
// `<= ::= "@" "<"
(63<<16)+2,
// `, ::= "," ws*
(28<<16)+2,
// `, ::= ","
(28<<16)+1,
// `> ::= ">" !"=" ws*
(64<<16)+2,
// `> ::= ">" !"="
(64<<16)+1,
// `. ::= "." ws*
(74<<16)+2,
// `. ::= "."
(74<<16)+1,
// `; ::= ";" ws*
(23<<16)+2,
// `; ::= ";"
(23<<16)+1,
// `++ ::= "@" "+" ws*
(44<<16)+3,
// `++ ::= "@" "+"
(44<<16)+2,
// `-- ::= "@" "-" ws*
(45<<16)+3,
// `-- ::= "@" "-"
(45<<16)+2,
// `/ ::= "/" ws*
(68<<16)+2,
// `/ ::= "/"
(68<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(71<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(71<<16)+2,
// INTLIT ::= digit128 ws*
(71<<16)+2,
// INTLIT ::= digit128
(71<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(71<<16)+3,
// INTLIT ::= "0" $$2
(71<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(72<<16)+3,
// STRINGLIT ::= "@" '"'
(72<<16)+2,
// STRINGLIT ::= '"' any* $$3
(72<<16)+3,
// STRINGLIT ::= '"' $$3
(72<<16)+2,
// CHARLIT ::= "'" any ws*
(73<<16)+3,
// CHARLIT ::= "'" any
(73<<16)+2,
// idChar ::= letter
(149<<16)+1,
// idChar ::= digit
(149<<16)+1,
// idChar ::= "_"
(149<<16)+1,
// idChar128 ::= letter128
(150<<16)+1,
// idChar128 ::= digit128
(150<<16)+1,
// idChar128 ::= {223}
(150<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(151<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(152<<16)+1,
// digit* ::= digit* digit
(143<<16)+2,
// digit* ::= digit
(143<<16)+1,
// any* ::= any* any
(147<<16)+2,
// any* ::= any
(147<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// <listElement>* ::= <listElement>* <listElement>
(25<<16)+2,
// <listElement>* ::= <listElement>
(25<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(145<<16)+2,
// hexDigit* ::= hexDigit
(145<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// <case>* ::= <case>* <case>
(47<<16)+2,
// <case>* ::= <case>
(47<<16)+1,
// idChar* ::= idChar* idChar
(141<<16)+2,
// idChar* ::= idChar
(141<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>
(79<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>
(153<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>
(153<<16)+1,
// $$0 ::= idChar128 ws*
(142<<16)+2,
// $$0 ::= idChar128
(142<<16)+1,
// $$1 ::= digit128 ws*
(144<<16)+2,
// $$1 ::= digit128
(144<<16)+1,
// $$2 ::= hexDigit128 ws*
(146<<16)+2,
// $$2 ::= hexDigit128
(146<<16)+1,
// $$3 ::= any128 ws*
(148<<16)+2,
// $$3 ::= any128
(148<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
123, // 0
123, // 1
123, // 2
123, // 3
123, // 4
123, // 5
123, // 6
123, // 7
123, // 8
123, // 9
131, // 10
123, // 11
123, // 12
123, // 13
123, // 14
123, // 15
123, // 16
123, // 17
123, // 18
123, // 19
123, // 20
123, // 21
123, // 22
123, // 23
123, // 24
123, // 25
123, // 26
123, // 27
123, // 28
123, // 29
123, // 30
123, // 31
113, // " "
133, // "!"
135, // '"'
114, // "#"
123, // "$"
124, // "%"
115, // "&"
134, // "'"
125, // "("
116, // ")"
136, // "*"
126, // "+"
117, // ","
110, // "-"
127, // "."
119, // "/"
105, // "0"
104, // "1"
104, // "2"
104, // "3"
104, // "4"
104, // "5"
104, // "6"
104, // "7"
104, // "8"
104, // "9"
123, // ":"
120, // ";"
111, // "<"
129, // "="
121, // ">"
123, // "?"
130, // "@"
87, // "A"
87, // "B"
87, // "C"
87, // "D"
87, // "E"
87, // "F"
87, // "G"
87, // "H"
87, // "I"
87, // "J"
87, // "K"
87, // "L"
87, // "M"
87, // "N"
87, // "O"
87, // "P"
87, // "Q"
87, // "R"
87, // "S"
87, // "T"
87, // "U"
87, // "V"
87, // "W"
87, // "X"
87, // "Y"
87, // "Z"
109, // "["
123, // "\"
118, // "]"
123, // "^"
128, // "_"
123, // "`"
81, // "a"
94, // "b"
85, // "c"
87, // "d"
95, // "e"
86, // "f"
87, // "g"
96, // "h"
88, // "i"
87, // "j"
87, // "k"
89, // "l"
87, // "m"
97, // "n"
90, // "o"
82, // "p"
87, // "q"
91, // "r"
83, // "s"
98, // "t"
92, // "u"
84, // "v"
99, // "w"
93, // "x"
87, // "y"
87, // "z"
122, // "{"
112, // "|"
132, // "}"
123, // "~"
123, // 127
139, // 128
139, // 129
139, // 130
139, // 131
139, // 132
139, // 133
139, // 134
139, // 135
139, // 136
139, // 137
139, // 138
139, // 139
139, // 140
139, // 141
139, // 142
139, // 143
139, // 144
139, // 145
139, // 146
139, // 147
139, // 148
139, // 149
139, // 150
139, // 151
139, // 152
139, // 153
139, // 154
139, // 155
139, // 156
139, // 157
139, // 158
139, // 159
139, // 160
139, // 161
139, // 162
139, // 163
139, // 164
139, // 165
139, // 166
139, // 167
139, // 168
139, // 169
139, // 170
139, // 171
139, // 172
139, // 173
139, // 174
139, // 175
107, // 176
107, // 177
107, // 178
107, // 179
107, // 180
107, // 181
107, // 182
107, // 183
107, // 184
107, // 185
139, // 186
139, // 187
139, // 188
139, // 189
139, // 190
139, // 191
139, // 192
102, // 193
102, // 194
102, // 195
102, // 196
102, // 197
102, // 198
101, // 199
101, // 200
101, // 201
101, // 202
101, // 203
101, // 204
101, // 205
101, // 206
101, // 207
101, // 208
101, // 209
101, // 210
101, // 211
101, // 212
101, // 213
101, // 214
101, // 215
101, // 216
101, // 217
101, // 218
139, // 219
139, // 220
139, // 221
139, // 222
138, // 223
139, // 224
102, // 225
102, // 226
102, // 227
102, // 228
102, // 229
102, // 230
101, // 231
101, // 232
101, // 233
101, // 234
101, // 235
101, // 236
101, // 237
101, // 238
101, // 239
101, // 240
101, // 241
101, // 242
101, // 243
101, // 244
101, // 245
101, // 246
101, // 247
101, // 248
101, // 249
101, // 250
139, // 251
139, // 252
139, // 253
139, // 254
139, // 255
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
"<method decl> ::= `public `void # ID <formalList> `{ <stmt>* `}", // 10
"<method decl> ::= `public `void # ID <formalList> `{ <stmt>* `}", // 11
"<method decl> ::= `public !`void <type> # ID <formalList> `{ <stmt>* <returnStmt> `}", // 12
"<method decl> ::= `public !`void <type> # ID <formalList> `{ <stmt>* <returnStmt> `}", // 13
"<returnStmt> ::= `return <exp> `;", // 14
"<formalList> ::= `( <type> # ID <listElement>* `)", // 15
"<formalList> ::= `( <type> # ID <listElement>* `)", // 16
"<formalList> ::= `( `)", // 17
"<listElement> ::= `, <type> # ID", // 18
"<type> ::= # `int", // 19
"<type> ::= # `boolean", // 20
"<type> ::= # `void", // 21
"<type> ::= # `null", // 22
"<type> ::= # ID", // 23
"<type> ::= # <type> <empty bracket pair>", // 24
"<empty bracket pair> ::= `[ `]", // 25
"<stmt> ::= # `{ <stmt>* `}", // 26
"<stmt> ::= # `{ <stmt>* `}", // 27
"<stmt> ::= <assign> `;", // 28
"<stmt> ::= <local var decl> `;", // 29
"<stmt> ::= # `if `( <exp> `) <stmt> # !`else", // 30
"<stmt> ::= # `if `( <exp> `) <stmt> # `else <stmt>", // 31
"<stmt> ::= # `for `( <assign> `; <exp> `; <assign> `) <stmt>", // 32
"<stmt> ::= # `for `( <assign> `; `; <assign> `) <stmt>", // 33
"<stmt> ::= # `while `( <exp> `) <stmt>", // 34
"<stmt> ::= # `break `;", // 35
"<assign> ::= <exp> # `= <exp>", // 36
"<assign> ::= # ID `++", // 37
"<assign> ::= # `++ ID", // 38
"<assign> ::= # ID `--", // 39
"<assign> ::= # `-- ID", // 40
"<local var decl> ::= <type> # ID `= <exp>", // 41
"<inst var decl> ::= <type> # ID `;", // 42
"<stmt> ::= # `;", // 43
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 44
"<stmt> ::= # `switch `( <exp> `) `{ <case>* `}", // 45
"<case> ::= `case # <exp> `;", // 46
"<exp> ::= <exp8>", // 47
"<exp8> ::= <exp7>", // 48
"<exp7> ::= <exp6>", // 49
"<exp6> ::= <exp5>", // 50
"<exp5> ::= <exp4>", // 51
"<exp4> ::= <exp3>", // 52
"<exp3> ::= <exp2>", // 53
"<exp2> ::= <exp1>", // 54
"<exp8> ::= <exp8> # `|| <exp7>", // 55
"<exp7> ::= <exp7> # `&& <exp6>", // 56
"<exp6> ::= <exp6> # `== <exp5>", // 57
"<exp6> ::= <exp6> # `!= <exp5>", // 58
"<exp5> ::= <exp5> # `< <exp4>", // 59
"<exp5> ::= <exp5> # `<= <exp4>", // 60
"<exp5> ::= <exp5> # `> <exp4>", // 61
"<exp4> ::= <exp4> # `+ <exp3>", // 62
"<exp4> ::= <exp4> # `- <exp3>", // 63
"<exp3> ::= <exp3> # `* <exp2>", // 64
"<exp3> ::= <exp3> # `/ <exp2>", // 65
"<exp3> ::= <exp3> # `% <exp2>", // 66
"<exp2> ::= # `( <type> `) <exp1>", // 67
"<exp2> ::= # `+ <exp1>", // 68
"<exp2> ::= # `- <exp1>", // 69
"<exp2> ::= # `! <exp1>", // 70
"<exp1> ::= # ID", // 71
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 72
"<exp1> ::= # INTLIT", // 73
"<exp1> ::= # STRINGLIT", // 74
"<exp1> ::= # CHARLIT", // 75
"<exp1> ::= <exp1> `. # ID", // 76
"<exp1> ::= # `this", // 77
"<exp1> ::= # `true", // 78
"<exp1> ::= # `false", // 79
"<exp1> ::= # `null", // 80
"<exp1> ::= # `new # ID `( `)", // 81
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 82
"<exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>**", // 83
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 84
"letter128 ::= {193..218 225..250}", // 85
"digit ::= {\"0\"..\"9\"}", // 86
"digit128 ::= {176..185}", // 87
"any ::= {0..127}", // 88
"any128 ::= {128..255}", // 89
"ws ::= \" \"", // 90
"ws ::= {10} registerNewline", // 91
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 92
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 93
"`class ::= \"#\" \"c\" \"l\" ws*", // 94
"`class ::= \"#\" \"c\" \"l\" ws*", // 95
"`extends ::= \"#\" \"e\" \"x\" ws*", // 96
"`extends ::= \"#\" \"e\" \"x\" ws*", // 97
"`void ::= \"#\" \"v\" \"o\" ws*", // 98
"`void ::= \"#\" \"v\" \"o\" ws*", // 99
"`int ::= \"#\" \"i\" \"t\" ws*", // 100
"`int ::= \"#\" \"i\" \"t\" ws*", // 101
"`while ::= \"#\" \"w\" \"h\" ws*", // 102
"`while ::= \"#\" \"w\" \"h\" ws*", // 103
"`if ::= \"#\" \"+\" ws*", // 104
"`if ::= \"#\" \"+\" ws*", // 105
"`else ::= \"#\" \"e\" \"l\" ws*", // 106
"`else ::= \"#\" \"e\" \"l\" ws*", // 107
"`for ::= \"#\" \"f\" \"o\" ws*", // 108
"`for ::= \"#\" \"f\" \"o\" ws*", // 109
"`break ::= \"#\" \"b\" \"r\" ws*", // 110
"`break ::= \"#\" \"b\" \"r\" ws*", // 111
"`this ::= \"#\" \"t\" \"h\" ws*", // 112
"`this ::= \"#\" \"t\" \"h\" ws*", // 113
"`false ::= \"#\" \"f\" \"a\" ws*", // 114
"`false ::= \"#\" \"f\" \"a\" ws*", // 115
"`true ::= \"#\" \"t\" \"r\" ws*", // 116
"`true ::= \"#\" \"t\" \"r\" ws*", // 117
"`null ::= \"#\" \"n\" \"u\" ws*", // 118
"`null ::= \"#\" \"n\" \"u\" ws*", // 119
"`return ::= \"#\" \"r\" \"e\" ws*", // 120
"`return ::= \"#\" \"r\" \"e\" ws*", // 121
"`new ::= \"#\" \"n\" \"e\" ws*", // 122
"`new ::= \"#\" \"n\" \"e\" ws*", // 123
"`case ::= \"#\" \"c\" \"e\" ws*", // 124
"`case ::= \"#\" \"c\" \"e\" ws*", // 125
"`public ::= \"#\" \"p\" \"u\" ws*", // 126
"`public ::= \"#\" \"p\" \"u\" ws*", // 127
"`switch ::= \"#\" \"s\" \"w\" ws*", // 128
"`switch ::= \"#\" \"s\" \"w\" ws*", // 129
"`! ::= \"!\" ws*", // 130
"`! ::= \"!\" ws*", // 131
"`!= ::= \"@\" \"!\" ws*", // 132
"`!= ::= \"@\" \"!\" ws*", // 133
"`% ::= \"%\" ws*", // 134
"`% ::= \"%\" ws*", // 135
"`&& ::= \"@\" \"&\" ws*", // 136
"`&& ::= \"@\" \"&\" ws*", // 137
"`* ::= \"*\" ws*", // 138
"`* ::= \"*\" ws*", // 139
"`( ::= \"(\" ws*", // 140
"`( ::= \"(\" ws*", // 141
"`) ::= \")\" ws*", // 142
"`) ::= \")\" ws*", // 143
"`{ ::= \"{\" ws*", // 144
"`{ ::= \"{\" ws*", // 145
"`} ::= \"}\" ws*", // 146
"`} ::= \"}\" ws*", // 147
"`- ::= \"-\" ws*", // 148
"`- ::= \"-\" ws*", // 149
"`+ ::= \"+\" ws*", // 150
"`+ ::= \"+\" ws*", // 151
"`= ::= \"=\" ws*", // 152
"`= ::= \"=\" ws*", // 153
"`== ::= \"@\" \"=\" ws*", // 154
"`== ::= \"@\" \"=\" ws*", // 155
"`[ ::= \"[\" ws*", // 156
"`[ ::= \"[\" ws*", // 157
"`] ::= \"]\" ws*", // 158
"`] ::= \"]\" ws*", // 159
"`|| ::= \"@\" \"|\" ws*", // 160
"`|| ::= \"@\" \"|\" ws*", // 161
"`< ::= \"<\" ws*", // 162
"`< ::= \"<\" ws*", // 163
"`<= ::= \"@\" \"<\" ws*", // 164
"`<= ::= \"@\" \"<\" ws*", // 165
"`, ::= \",\" ws*", // 166
"`, ::= \",\" ws*", // 167
"`> ::= \">\" !\"=\" ws*", // 168
"`> ::= \">\" !\"=\" ws*", // 169
"`. ::= \".\" ws*", // 170
"`. ::= \".\" ws*", // 171
"`; ::= \";\" ws*", // 172
"`; ::= \";\" ws*", // 173
"`++ ::= \"@\" \"+\" ws*", // 174
"`++ ::= \"@\" \"+\" ws*", // 175
"`-- ::= \"@\" \"-\" ws*", // 176
"`-- ::= \"@\" \"-\" ws*", // 177
"`/ ::= \"/\" ws*", // 178
"`/ ::= \"/\" ws*", // 179
"ID ::= letter128 ws*", // 180
"ID ::= letter128 ws*", // 181
"ID ::= letter idChar* idChar128 ws*", // 182
"ID ::= letter idChar* idChar128 ws*", // 183
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 184
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 185
"INTLIT ::= digit128 ws*", // 186
"INTLIT ::= digit128 ws*", // 187
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 188
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 189
"STRINGLIT ::= \"@\" \'\"\' ws*", // 190
"STRINGLIT ::= \"@\" \'\"\' ws*", // 191
"STRINGLIT ::= \'\"\' any* any128 ws*", // 192
"STRINGLIT ::= \'\"\' any* any128 ws*", // 193
"CHARLIT ::= \"\'\" any ws*", // 194
"CHARLIT ::= \"\'\" any ws*", // 195
"idChar ::= letter", // 196
"idChar ::= digit", // 197
"idChar ::= \"_\"", // 198
"idChar128 ::= letter128", // 199
"idChar128 ::= digit128", // 200
"idChar128 ::= {223}", // 201
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 202
"hexDigit128 ::= {176..185 193..198 225..230}", // 203
"digit* ::= digit* digit", // 204
"digit* ::= digit* digit", // 205
"any* ::= any* any", // 206
"any* ::= any* any", // 207
"<decl in class>* ::= <decl in class>* <decl in class>", // 208
"<decl in class>* ::= <decl in class>* <decl in class>", // 209
"<listElement>* ::= <listElement>* <listElement>", // 210
"<listElement>* ::= <listElement>* <listElement>", // 211
"hexDigit* ::= hexDigit* hexDigit", // 212
"hexDigit* ::= hexDigit* hexDigit", // 213
"<stmt>* ::= <stmt>* <stmt>", // 214
"<stmt>* ::= <stmt>* <stmt>", // 215
"<case>* ::= <case>* <case>", // 216
"<case>* ::= <case>* <case>", // 217
"idChar* ::= idChar* idChar", // 218
"idChar* ::= idChar* idChar", // 219
"<class decl>+ ::= <class decl>", // 220
"<class decl>+ ::= <class decl>+ <class decl>", // 221
"<empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair>", // 222
"ws* ::= ws* ws", // 223
"ws* ::= ws* ws", // 224
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 225
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 226
"", // 227
"", // 228
"", // 229
"", // 230
"", // 231
"", // 232
"", // 233
"", // 234
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
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
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
      ((11<<5)|0x6)/*nullProductionAction:11*/,
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
      ((11<<5)|0x6)/*nullProductionAction:11*/,
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
    { // 10: <method decl> ::= `public `void [#] ID <formalList> `{ <stmt>* `} @createMethodDeclVoid(int,String,VarDeclList,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <method decl> ::= `public `void [#] ID <formalList> `{ [<stmt>*] `} @createMethodDeclVoid(int,String,VarDeclList,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 12: <method decl> ::= `public !`void <type> [#] ID <formalList> `{ <stmt>* <returnStmt> `} @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 13: <method decl> ::= `public !`void <type> [#] ID <formalList> `{ [<stmt>*] <returnStmt> `} @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 14: <returnStmt> ::= `return <exp> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 15: <formalList> ::= `( <type> [#] ID <listElement>* `) @createVarDeclList(Type,int,String,List<VarDecl>)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 16: <formalList> ::= `( <type> [#] ID [<listElement>*] `) @createVarDeclList(Type,int,String,List<VarDecl>)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 17: <formalList> ::= `( `) @createEmptyVarDeclList()=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 18: <listElement> ::= `, <type> [#] ID @createListVarDecl(Type,int,String)=>VarDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 19: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 20: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 21: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 25: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 26: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 27: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 28: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <stmt> ::= [#] `if `( <exp> `) <stmt> !`else [#] @newIfOnlyBlock(int,Exp,Statement,int)=>Statement
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 31: <stmt> ::= [#] `if `( <exp> `) <stmt> [#] `else <stmt> @newIfElseBlock(int,Exp,Statement,int,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 32: <stmt> ::= [#] `for `( <assign> `; <exp> `; <assign> `) <stmt> @newForLoop(int,Statement,Exp,Statement,Statement)=>Statement
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
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 33: <stmt> ::= [#] `for `( <assign> `; `; <assign> `) <stmt> @newTrueForLoop(int,Statement,Statement,Statement)=>Statement
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
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 34: <stmt> ::= [#] `while `( <exp> `) <stmt> @newWhileBlock(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 35: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 36: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 37: <assign> ::= [#] ID `++ @assignPlusPlus(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 38: <assign> ::= [#] `++ ID @assignPlusPlusLeft(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 39: <assign> ::= [#] ID `-- @assignMinusMinus(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 40: <assign> ::= [#] `-- ID @assignMinusMinusLeft(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 41: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 42: <inst var decl> ::= <type> [#] ID `; @instanceVarDecl(Type,int,String)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 43: <stmt> ::= [#] `; @newEmptyStmt(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 44: <stmt> ::= [#] `switch `( <exp> `) `{ <case>* `} @newSwitch(int,Exp,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 45: <stmt> ::= [#] `switch `( <exp> `) `{ [<case>*] `} @newSwitch(int,Exp,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 46: <case> ::= `case [#] <exp> `; @newCase(int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 47: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 48: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 49: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 50: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 51: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 52: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 53: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 54: <exp2> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 55: <exp8> ::= <exp8> [#] `|| <exp7> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 56: <exp7> ::= <exp7> [#] `&& <exp6> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 57: <exp6> ::= <exp6> [#] `== <exp5> @newDoubleEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 58: <exp6> ::= <exp6> [#] `!= <exp5> @newNotEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 59: <exp5> ::= <exp5> [#] `< <exp4> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 60: <exp5> ::= <exp5> [#] `<= <exp4> @newLessThanEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 61: <exp5> ::= <exp5> [#] `> <exp4> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 62: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 63: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 64: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 65: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 66: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 67: <exp2> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 68: <exp2> ::= [#] `+ <exp1> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 69: <exp2> ::= [#] `- <exp1> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 70: <exp2> ::= [#] `! <exp1> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 71: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 72: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 73: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 74: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 75: <exp1> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 76: <exp1> ::= <exp1> `. [#] ID @newInstVarAccess(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 77: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 78: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 79: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 80: <exp1> ::= [#] `null @newNullExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 81: <exp1> ::= [#] `new [#] ID `( `) @newObject(int,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 82: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] <empty bracket pair>** @newArray(Type,int,Exp,List<Object>)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 83: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] !<empty bracket pair> [<empty bracket pair>**] @newArray(Type,int,Exp,List<Object>)=>Exp
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 84: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 85: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 86: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 87: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 88: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 89: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 90: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: ws ::= {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 93: `boolean ::= "#" "b" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 94: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 95: `class ::= "#" "c" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 96: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 97: `extends ::= "#" "e" "x" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 98: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 99: `void ::= "#" "v" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 101: `int ::= "#" "i" "t" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 102: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 103: `while ::= "#" "w" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 104: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 105: `if ::= "#" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 106: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `else ::= "#" "e" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: `for ::= "#" "f" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 109: `for ::= "#" "f" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: `break ::= "#" "b" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 112: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: `this ::= "#" "t" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 114: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 115: `false ::= "#" "f" "a" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: `true ::= "#" "t" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: `null ::= "#" "n" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 121: `return ::= "#" "r" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 122: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 123: `new ::= "#" "n" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 124: `case ::= "#" "c" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 125: `case ::= "#" "c" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 126: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 127: `public ::= "#" "p" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 128: `switch ::= "#" "s" "w" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 129: `switch ::= "#" "s" "w" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 130: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `! ::= "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 133: `!= ::= "@" "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 134: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `% ::= "%" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 137: `&& ::= "@" "&" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 138: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `* ::= "*" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `( ::= "(" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `) ::= ")" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `{ ::= "{" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `} ::= "}" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `- ::= "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `+ ::= "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `= ::= "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 155: `== ::= "@" "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 156: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `[ ::= "[" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `] ::= "]" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 161: `|| ::= "@" "|" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 162: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `< ::= "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 165: `<= ::= "@" "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 166: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `, ::= "," [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `> ::= ">" !"=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `. ::= "." [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `; ::= ";" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 175: `++ ::= "@" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 176: `-- ::= "@" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 177: `-- ::= "@" "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 178: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `/ ::= "/" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 181: ID ::= letter128 [ws*] @text
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 182: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 183: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 184: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 185: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 186: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 187: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 188: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 189: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 190: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 191: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 192: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 193: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 194: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 195: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 196: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 197: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 198: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 199: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 200: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 201: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 202: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 203: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 204: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 205: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 206: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 207: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 208: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 209: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 210: <listElement>* ::= <listElement>* <listElement> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 211: <listElement>* ::= [<listElement>*] <listElement> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 212: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 213: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 214: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 215: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 216: <case>* ::= <case>* <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 217: <case>* ::= [<case>*] <case> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 218: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 219: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 220: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 221: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 222: <empty bracket pair>** ::= <empty bracket pair>* !<empty bracket pair> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 223: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 224: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 225: <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 226: <empty bracket pair>* ::= [<empty bracket pair>*] <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 227: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 228: $$0 ::= idChar128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 229: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 230: $$1 ::= digit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 231: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 232: $$2 ::= hexDigit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 233: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 234: $$3 ::= any128 [ws*] @pass
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
    "<listElement>* ::=", // <listElement>*
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
    { // <listElement>*
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
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((68<<5)|0x5)/*methodCall:68*/,
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
      VarDeclList parm2 = (VarDeclList)si.popPb();
      List<Statement> parm3 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 5: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      VarDeclList parm3 = (VarDeclList)si.popPb();
      List<Statement> parm4 = (List<Statement>)si.popPb();
      Exp parm5 = (Exp)si.popPb();
      Decl result = actionObject.createMethodDeclNonVoid(parm0,parm1,parm2,parm3,parm4,parm5);
      si.pushPb(result);
    }
    break;
    case 6: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      List<VarDecl> parm3 = (List<VarDecl>)si.popPb();
      VarDeclList result = actionObject.createVarDeclList(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 7: {
      VarDeclList result = actionObject.createEmptyVarDeclList();
      si.pushPb(result);
    }
    break;
    case 8: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      VarDecl result = actionObject.createListVarDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.voidType(parm0);
      si.pushPb(result);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.nullType(parm0);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      int parm3 = (Integer)si.popPb();
      Statement result = actionObject.newIfOnlyBlock(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      int parm3 = (Integer)si.popPb();
      Statement parm4 = (Statement)si.popPb();
      Statement result = actionObject.newIfElseBlock(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      Statement parm1 = (Statement)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement parm4 = (Statement)si.popPb();
      Statement result = actionObject.newForLoop(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      Statement parm1 = (Statement)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement result = actionObject.newTrueForLoop(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newWhileBlock(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignPlusPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignPlusPlusLeft(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignMinusMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.assignMinusMinusLeft(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 27: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 28: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Decl result = actionObject.instanceVarDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newEmptyStmt(parm0);
      si.pushPb(result);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Statement result = actionObject.newSwitch(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement result = actionObject.newCase(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 32: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 33: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 34: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDoubleEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 35: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 36: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 37: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 38: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 39: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 40: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 41: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 42: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 43: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 49: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 53: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNullExp(parm0);
      si.pushPb(result);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newObject(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 59: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      List<Object> parm3 = (List<Object>)si.popPb();
      Exp result = actionObject.newArray(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 60: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 61: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 62: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 63: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 64: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 65: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 66: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 67: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 68: {
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
"Decl createMethodDeclVoid(int,String,VarDeclList,List<Statement>)",
"Decl createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)",
"VarDeclList createVarDeclList(Type,int,String,List<VarDecl>)",
"VarDeclList createEmptyVarDeclList()",
"VarDecl createListVarDecl(Type,int,String)",
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
4,1,
6,1,
4,1,
0,1,
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
    1,
    1,
    1,
    1,
    0,
    1,
    0,
    0,
    1,
    0,
    1,
    0,
    0,
    0,
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
