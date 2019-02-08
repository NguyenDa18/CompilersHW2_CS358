package
parse
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
public int getEofSym() { return 124; }
public int getNttSym() { return 125; }
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
"`while",
"`break",
"`=",
"<exp5>",
"<exp4>",
"<exp3>",
"<exp2>",
"<exp1>",
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
"`this",
"`true",
"`false",
"letter",
"\"a\"",
"\"p\"",
"\"v\"",
"\"c\"",
"\"f\"",
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
"{\"A\"..\"Z\" \"d\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"s\" \"y\"..\"z\"}",
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
"\" \"",
"\"#\"",
"\")\"",
"\"]\"",
"\"/\"",
"\";\"",
"\">\"",
"\"{\"",
"{0..9 11..31 \"$\" \"&\" \",\" \".\" \":\" \"?\" \"\\\" \"^\" \"`\" \"|\" \"~\"..127}",
"\"%\"",
"\"(\"",
"\"+\"",
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
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 126;}
private static final int MIN_REDUCTION = 443;
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
1,385, // <start>
2,221, // ws*
3,170, // <program>
4,52, // <class decl>+
5,376, // <class decl>
6,364, // `class
87,68, // " "
88,111, // "#"
102,25, // {10}
111,105, // ws
  }
,
{ // state 1
  }
,
{ // state 2
24,MIN_REDUCTION+61, // `[
84,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 3
87,68, // " "
102,25, // {10}
111,35, // ws
125,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 4
0x80000000|1, // match move
0x80000000|155, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 5
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 6
0x80000000|420, // match move
0x80000000|375, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 7
0x80000000|1, // match move
0x80000000|392, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 8
2,11, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 9
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 10
0x80000000|65, // match move
0x80000000|301, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 11
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 12
2,3, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
125,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 13
24,MIN_REDUCTION+60, // `[
84,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 14
0x80000000|1, // match move
0x80000000|285, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 15
0x80000000|200, // match move
0x80000000|242, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 16
32,78, // `else
88,213, // "#"
  }
,
{ // state 17
16,268, // `(
97,164, // "("
  }
,
{ // state 18
28,87, // `;
92,224, // ";"
  }
,
{ // state 19
86,42, // "<"
  }
,
{ // state 20
24,MIN_REDUCTION+128, // `[
84,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 21
0x80000000|363, // match move
0x80000000|139, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 22
41,404, // `<
42,73, // `<=
43,55, // `>
86,403, // "<"
93,90, // ">"
101,19, // "@"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 23
72,96, // "t"
  }
,
{ // state 24
87,430, // " "
102,140, // {10}
111,88, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 25
125,MIN_REDUCTION+61, // $NT
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 26
0x80000000|1, // match move
0x80000000|172, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 27
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 28
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 29
0x80000000|169, // match move
0x80000000|201, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 30
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 31
0x80000000|167, // match move
0x80000000|436, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 32
2,149, // ws*
  }
,
{ // state 33
24,MIN_REDUCTION+48, // `[
84,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 34
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 35
125,MIN_REDUCTION+162, // $NT
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 36
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 37
2,246, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 38
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 39
2,254, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 40
0x80000000|341, // match move
0x80000000|338, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 41
0x80000000|204, // match move
0x80000000|148, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
2,28, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 43
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 44
16,263, // `(
97,164, // "("
  }
,
{ // state 45
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 46
0x80000000|319, // match move
0x80000000|399, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 47
2,43, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 48
24,MIN_REDUCTION+134, // `[
84,MIN_REDUCTION+134, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 49
24,MIN_REDUCTION+46, // `[
84,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 50
0x80000000|424, // match move
0x80000000|367, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 51
0x80000000|176, // match move
0x80000000|435, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 52
5,417, // <class decl>
6,364, // `class
88,111, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 53
66,124, // "u"
  }
,
{ // state 54
64,340, // "o"
65,284, // "r"
  }
,
{ // state 55
7,323, // ID
16,325, // `(
22,4, // `null
37,237, // <exp4>
38,329, // <exp3>
39,163, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 56
58,280, // "p"
  }
,
{ // state 57
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 59
7,323, // ID
16,325, // `(
22,4, // `null
31,379, // <exp>
36,22, // <exp5>
37,202, // <exp4>
38,329, // <exp3>
39,163, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 60
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 61
0x80000000|92, // match move
0x80000000|371, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 62
7,323, // ID
16,325, // `(
22,4, // `null
38,183, // <exp3>
39,163, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 63
24,MIN_REDUCTION+112, // `[
84,MIN_REDUCTION+112, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 64
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 65
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 66
2,125, // ws*
87,430, // " "
102,140, // {10}
111,260, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 67
24,MIN_REDUCTION+84, // `[
84,MIN_REDUCTION+84, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 68
125,MIN_REDUCTION+60, // $NT
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 69
57,261, // "a"
58,261, // "p"
59,261, // "v"
60,261, // "c"
61,261, // "f"
62,261, // "i"
63,261, // "l"
64,261, // "o"
65,261, // "r"
66,261, // "u"
67,261, // "x"
68,261, // "b"
69,261, // "e"
70,261, // "h"
71,261, // "n"
72,261, // "t"
73,261, // "w"
74,261, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,312, // {193..198 225..230}
79,261, // {"1".."9"}
80,261, // "0"
82,312, // {176..185}
116,423, // hexDigit*
117,83, // $$2
122,45, // hexDigit
123,400, // hexDigit128
  }
,
{ // state 70
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 71
2,125, // ws*
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 72
78,433, // digit
79,209, // {"1".."9"}
80,209, // "0"
81,283, // digit128
82,41, // {176..185}
114,313, // digit*
115,203, // $$1
  }
,
{ // state 73
7,323, // ID
16,325, // `(
22,4, // `null
37,289, // <exp4>
38,329, // <exp3>
39,163, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 74
57,36, // "a"
58,36, // "p"
59,36, // "v"
60,36, // "c"
61,36, // "f"
62,36, // "i"
63,36, // "l"
64,36, // "o"
65,36, // "r"
66,36, // "u"
67,36, // "x"
68,36, // "b"
69,36, // "e"
70,36, // "h"
71,36, // "n"
72,36, // "t"
73,36, // "w"
74,36, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
76,438, // {199..218 231..250}
77,438, // {193..198 225..230}
79,36, // {"1".."9"}
80,36, // "0"
82,438, // {176..185}
83,162, // any
84,36, // "["
85,36, // "-"
86,36, // "<"
87,36, // " "
88,36, // "#"
89,36, // ")"
90,36, // "]"
91,36, // "/"
92,36, // ";"
93,36, // ">"
94,36, // "{"
95,36, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
96,36, // "%"
97,36, // "("
98,36, // "+"
99,36, // "_"
100,36, // "="
101,36, // "@"
102,36, // {10}
103,36, // "}"
104,36, // "!"
105,36, // "'"
106,36, // '"'
107,36, // "*"
108,388, // any128
109,438, // {223}
110,438, // {128..175 186..192 219..222 224 251..255}
118,233, // any*
119,151, // $$3
  }
,
{ // state 75
2,38, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 76
56,142, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,360, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
78,391, // digit
79,209, // {"1".."9"}
80,209, // "0"
81,134, // digit128
82,41, // {176..185}
99,9, // "_"
109,269, // {223}
112,278, // idChar*
113,198, // $$0
120,286, // idChar
121,46, // idChar128
  }
,
{ // state 77
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 78
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
146, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
291, // `void
325, // `(
-1, // `)
-1, // <stmt>*
372, // <type>
265, // `int
115, // `boolean
29, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
297, // <stmt>
103, // <assign>
-1, // `;
384, // <local var decl>
370, // `if
218, // <exp>
-1, // `else
234, // `while
368, // `break
-1, // `=
22, // <exp5>
202, // <exp4>
329, // <exp3>
163, // <exp2>
102, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
347, // `+
226, // `-
-1, // `*
-1, // `/
-1, // `%
185, // `!
316, // INTLIT
100, // STRINGLIT
255, // CHARLIT
193, // `this
14, // `true
194, // `false
76, // letter
311, // "a"
311, // "p"
311, // "v"
311, // "c"
311, // "f"
311, // "i"
311, // "l"
311, // "o"
311, // "r"
311, // "u"
311, // "x"
311, // "b"
311, // "e"
311, // "h"
311, // "n"
311, // "t"
311, // "w"
311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
108, // letter128
251, // {199..218 231..250}
251, // {193..198 225..230}
-1, // digit
72, // {"1".."9"}
69, // "0"
356, // digit128
41, // {176..185}
-1, // any
-1, // "["
75, // "-"
-1, // "<"
-1, // " "
282, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
192, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
164, // "("
410, // "+"
-1, // "_"
-1, // "="
321, // "@"
-1, // {10}
-1, // "}"
273, // "!"
327, // "'"
74, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 79
0x80000000|165, // match move
0x80000000|413, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 80
24,MIN_REDUCTION+164, // `[
84,MIN_REDUCTION+164, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 81
0x80000000|405, // match move
0x80000000|247, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 82
8,383, // `{
94,192, // "{"
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|241, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 84
0x80000000|1, // match move
0x80000000|20, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 85
24,MIN_REDUCTION+145, // `[
84,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 86
0x80000000|1, // match move
0x80000000|48, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 87
0x80000000|365, // match move
0x80000000|299, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 88
0x80000000|34, // match move
0x80000000|419, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 89
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 90
0x80000000|1, // match move
0x80000000|39, // no-match move
// T-test match for "=":
100,
  }
,
{ // state 91
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 92
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 93
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
146, // `{
-1, // <decl in class>*
330, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
291, // `void
325, // `(
-1, // `)
-1, // <stmt>*
372, // <type>
265, // `int
115, // `boolean
29, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
77, // <stmt>
103, // <assign>
-1, // `;
384, // <local var decl>
370, // `if
218, // <exp>
-1, // `else
234, // `while
368, // `break
-1, // `=
22, // <exp5>
202, // <exp4>
329, // <exp3>
163, // <exp2>
102, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
347, // `+
226, // `-
-1, // `*
-1, // `/
-1, // `%
185, // `!
316, // INTLIT
100, // STRINGLIT
255, // CHARLIT
193, // `this
14, // `true
194, // `false
76, // letter
311, // "a"
311, // "p"
311, // "v"
311, // "c"
311, // "f"
311, // "i"
311, // "l"
311, // "o"
311, // "r"
311, // "u"
311, // "x"
311, // "b"
311, // "e"
311, // "h"
311, // "n"
311, // "t"
311, // "w"
311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
108, // letter128
251, // {199..218 231..250}
251, // {193..198 225..230}
-1, // digit
72, // {"1".."9"}
69, // "0"
356, // digit128
41, // {176..185}
-1, // any
-1, // "["
75, // "-"
-1, // "<"
-1, // " "
282, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
192, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
164, // "("
410, // "+"
-1, // "_"
-1, // "="
321, // "@"
-1, // {10}
287, // "}"
273, // "!"
327, // "'"
74, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 94
125,MIN_REDUCTION+17, // $NT
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 95
17,220, // `)
89,324, // ")"
  }
,
{ // state 96
2,60, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|401, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 99
2,121, // ws*
24,MIN_REDUCTION+169, // `[
84,MIN_REDUCTION+169, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 100
0x80000000|1, // match move
0x80000000|33, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 101
7,323, // ID
22,4, // `null
40,381, // <exp1>
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
88,335, // "#"
101,321, // "@"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 102
0x80000000|1, // match move
0x80000000|416, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 103
28,253, // `;
92,271, // ";"
  }
,
{ // state 104
24,MIN_REDUCTION+137, // `[
84,MIN_REDUCTION+137, // "["
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 105
125,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 106
0x80000000|58, // match move
0x80000000|113, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 107
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 108
0x80000000|437, // match move
0x80000000|208, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 109
2,110, // ws*
24,MIN_REDUCTION+171, // `[
84,MIN_REDUCTION+171, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 110
0x80000000|1, // match move
0x80000000|342, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 111
60,302, // "c"
  }
,
{ // state 112
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 113
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 114
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
146, // `{
-1, // <decl in class>*
130, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
291, // `void
325, // `(
-1, // `)
290, // <stmt>*
372, // <type>
265, // `int
115, // `boolean
29, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
357, // <stmt>
103, // <assign>
-1, // `;
384, // <local var decl>
370, // `if
218, // <exp>
-1, // `else
234, // `while
368, // `break
-1, // `=
22, // <exp5>
202, // <exp4>
329, // <exp3>
163, // <exp2>
102, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
347, // `+
226, // `-
-1, // `*
-1, // `/
-1, // `%
185, // `!
316, // INTLIT
100, // STRINGLIT
255, // CHARLIT
193, // `this
14, // `true
194, // `false
76, // letter
311, // "a"
311, // "p"
311, // "v"
311, // "c"
311, // "f"
311, // "i"
311, // "l"
311, // "o"
311, // "r"
311, // "u"
311, // "x"
311, // "b"
311, // "e"
311, // "h"
311, // "n"
311, // "t"
311, // "w"
311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
108, // letter128
251, // {199..218 231..250}
251, // {193..198 225..230}
-1, // digit
72, // {"1".."9"}
69, // "0"
356, // digit128
41, // {176..185}
-1, // any
-1, // "["
75, // "-"
-1, // "<"
-1, // " "
282, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
192, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
164, // "("
410, // "+"
-1, // "_"
-1, // "="
321, // "@"
-1, // {10}
351, // "}"
273, // "!"
327, // "'"
74, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 115
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 116
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 117
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 118
16,59, // `(
97,164, // "("
  }
,
{ // state 119
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 120
2,256, // ws*
24,MIN_REDUCTION+131, // `[
84,MIN_REDUCTION+131, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 121
0x80000000|1, // match move
0x80000000|366, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 122
17,101, // `)
23,173, // <empty bracket pair>
24,238, // `[
84,47, // "["
89,324, // ")"
  }
,
{ // state 123
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 124
0x80000000|250, // match move
0x80000000|394, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 125
0x80000000|5, // match move
0x80000000|24, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 126
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 127
2,171, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 129
0x80000000|305, // match move
0x80000000|339, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 130
0x80000000|354, // match move
0x80000000|320, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 131
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 132
35,229, // `=
100,266, // "="
  }
,
{ // state 133
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 134
0x80000000|264, // match move
0x80000000|292, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 135
24,MIN_REDUCTION+129, // `[
84,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 136
24,MIN_REDUCTION+82, // `[
84,MIN_REDUCTION+82, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 138
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 139
2,26, // ws*
24,MIN_REDUCTION+139, // `[
84,MIN_REDUCTION+139, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 140
0x80000000|190, // match move
0x80000000|387, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 141
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 143
24,MIN_REDUCTION+80, // `[
84,MIN_REDUCTION+80, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 144
24,353, // `[
84,47, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 145
7,323, // ID
16,325, // `(
22,4, // `null
31,349, // <exp>
36,22, // <exp5>
37,202, // <exp4>
38,329, // <exp3>
39,163, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 146
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
146, // `{
-1, // <decl in class>*
346, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
291, // `void
325, // `(
-1, // `)
93, // <stmt>*
372, // <type>
265, // `int
115, // `boolean
29, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
357, // <stmt>
103, // <assign>
-1, // `;
384, // <local var decl>
370, // `if
218, // <exp>
-1, // `else
234, // `while
368, // `break
-1, // `=
22, // <exp5>
202, // <exp4>
329, // <exp3>
163, // <exp2>
102, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
347, // `+
226, // `-
-1, // `*
-1, // `/
-1, // `%
185, // `!
316, // INTLIT
100, // STRINGLIT
255, // CHARLIT
193, // `this
14, // `true
194, // `false
76, // letter
311, // "a"
311, // "p"
311, // "v"
311, // "c"
311, // "f"
311, // "i"
311, // "l"
311, // "o"
311, // "r"
311, // "u"
311, // "x"
311, // "b"
311, // "e"
311, // "h"
311, // "n"
311, // "t"
311, // "w"
311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
108, // letter128
251, // {199..218 231..250}
251, // {193..198 225..230}
-1, // digit
72, // {"1".."9"}
69, // "0"
356, // digit128
41, // {176..185}
-1, // any
-1, // "["
75, // "-"
-1, // "<"
-1, // " "
282, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
192, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
164, // "("
410, // "+"
-1, // "_"
-1, // "="
321, // "@"
-1, // {10}
287, // "}"
273, // "!"
327, // "'"
74, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 147
2,382, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 148
24,MIN_REDUCTION+57, // `[
84,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 149
0x80000000|1, // match move
0x80000000|136, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 150
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 151
0x80000000|1, // match move
0x80000000|104, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 152
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 153
24,MIN_REDUCTION+127, // `[
84,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 154
2,7, // ws*
24,MIN_REDUCTION+167, // `[
84,MIN_REDUCTION+167, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 155
24,MIN_REDUCTION+53, // `[
84,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 156
0x80000000|32, // match move
0x80000000|377, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 157
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 158
24,MIN_REDUCTION+136, // `[
84,MIN_REDUCTION+136, // "["
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 159
0x80000000|188, // match move
0x80000000|337, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 160
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 164
2,191, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 166
0x80000000|1, // match move
0x80000000|386, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 167
2,189, // ws*
  }
,
{ // state 168
24,MIN_REDUCTION+130, // `[
84,MIN_REDUCTION+130, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 169
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 171
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 172
24,MIN_REDUCTION+138, // `[
84,MIN_REDUCTION+138, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 174
44,62, // `+
45,243, // `-
85,75, // "-"
98,410, // "+"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 175
87,MIN_REDUCTION+60, // " "
102,MIN_REDUCTION+60, // {10}
111,MIN_REDUCTION+60, // ws
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 176
2,296, // ws*
  }
,
{ // state 177
56,142, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,161, // letter128
76,131, // {199..218 231..250}
77,131, // {193..198 225..230}
78,391, // digit
79,209, // {"1".."9"}
80,209, // "0"
81,91, // digit128
82,333, // {176..185}
99,9, // "_"
109,395, // {223}
112,304, // idChar*
113,374, // $$0
120,286, // idChar
121,214, // idChar128
  }
,
{ // state 178
28,15, // `;
92,224, // ";"
  }
,
{ // state 179
25,314, // `]
90,31, // "]"
  }
,
{ // state 180
17,402, // `)
89,324, // ")"
  }
,
{ // state 181
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 182
0x80000000|398, // match move
0x80000000|2, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 183
46,197, // `*
47,336, // `/
48,345, // `%
91,8, // "/"
96,307, // "%"
107,369, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 184
2,422, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 185
7,323, // ID
22,4, // `null
40,393, // <exp1>
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
88,335, // "#"
101,321, // "@"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 186
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 187
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 189
0x80000000|1, // match move
0x80000000|63, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 190
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 191
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 192
2,212, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 193
0x80000000|1, // match move
0x80000000|295, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 194
0x80000000|1, // match move
0x80000000|216, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 195
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 196
24,MIN_REDUCTION+45, // `[
84,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 197
7,323, // ID
16,325, // `(
22,4, // `null
39,425, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 198
0x80000000|137, // match move
0x80000000|153, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 199
7,427, // ID
56,177, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,258, // letter128
76,131, // {199..218 231..250}
77,131, // {193..198 225..230}
  }
,
{ // state 200
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 201
24,MIN_REDUCTION+53, // `[
35,MIN_REDUCTION+53, // `=
41,MIN_REDUCTION+53, // `<
42,MIN_REDUCTION+53, // `<=
43,MIN_REDUCTION+53, // `>
44,MIN_REDUCTION+53, // `+
45,MIN_REDUCTION+53, // `-
46,MIN_REDUCTION+53, // `*
47,MIN_REDUCTION+53, // `/
48,MIN_REDUCTION+53, // `%
84,MIN_REDUCTION+53, // "["
85,MIN_REDUCTION+53, // "-"
86,MIN_REDUCTION+53, // "<"
91,MIN_REDUCTION+53, // "/"
93,MIN_REDUCTION+53, // ">"
96,MIN_REDUCTION+53, // "%"
98,MIN_REDUCTION+53, // "+"
100,MIN_REDUCTION+53, // "="
101,MIN_REDUCTION+53, // "@"
107,MIN_REDUCTION+53, // "*"
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 202
44,62, // `+
45,243, // `-
85,75, // "-"
98,410, // "+"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 203
0x80000000|1, // match move
0x80000000|135, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 204
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 205
24,MIN_REDUCTION+47, // `[
84,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 206
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 208
2,40, // ws*
24,MIN_REDUCTION+125, // `[
84,MIN_REDUCTION+125, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 209
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 210
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 211
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
114, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
291, // `void
325, // `(
-1, // `)
-1, // <stmt>*
372, // <type>
265, // `int
115, // `boolean
29, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
343, // <stmt>
178, // <assign>
-1, // `;
18, // <local var decl>
118, // `if
218, // <exp>
-1, // `else
44, // `while
355, // `break
-1, // `=
22, // <exp5>
202, // <exp4>
329, // <exp3>
163, // <exp2>
102, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
347, // `+
226, // `-
-1, // `*
-1, // `/
-1, // `%
185, // `!
316, // INTLIT
100, // STRINGLIT
255, // CHARLIT
193, // `this
14, // `true
194, // `false
76, // letter
311, // "a"
311, // "p"
311, // "v"
311, // "c"
311, // "f"
311, // "i"
311, // "l"
311, // "o"
311, // "r"
311, // "u"
311, // "x"
311, // "b"
311, // "e"
311, // "h"
311, // "n"
311, // "t"
311, // "w"
311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
108, // letter128
251, // {199..218 231..250}
251, // {193..198 225..230}
-1, // digit
72, // {"1".."9"}
69, // "0"
356, // digit128
41, // {176..185}
-1, // any
-1, // "["
75, // "-"
-1, // "<"
-1, // " "
282, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
192, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
164, // "("
410, // "+"
-1, // "_"
-1, // "="
321, // "@"
-1, // {10}
-1, // "}"
273, // "!"
327, // "'"
74, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 212
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 213
69,412, // "e"
  }
,
{ // state 214
2,439, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 215
67,147, // "x"
  }
,
{ // state 216
24,MIN_REDUCTION+52, // `[
84,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 217
10,414, // `}
12,207, // <decl in class>
13,186, // <method decl>
14,432, // `public
88,56, // "#"
103,287, // "}"
  }
,
{ // state 218
35,232, // `=
100,266, // "="
  }
,
{ // state 219
64,184, // "o"
  }
,
{ // state 220
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
146, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
291, // `void
325, // `(
-1, // `)
-1, // <stmt>*
372, // <type>
265, // `int
115, // `boolean
29, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
380, // <stmt>
103, // <assign>
-1, // `;
384, // <local var decl>
370, // `if
218, // <exp>
-1, // `else
234, // `while
368, // `break
-1, // `=
22, // <exp5>
202, // <exp4>
329, // <exp3>
163, // <exp2>
102, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
347, // `+
226, // `-
-1, // `*
-1, // `/
-1, // `%
185, // `!
316, // INTLIT
100, // STRINGLIT
255, // CHARLIT
193, // `this
14, // `true
194, // `false
76, // letter
311, // "a"
311, // "p"
311, // "v"
311, // "c"
311, // "f"
311, // "i"
311, // "l"
311, // "o"
311, // "r"
311, // "u"
311, // "x"
311, // "b"
311, // "e"
311, // "h"
311, // "n"
311, // "t"
311, // "w"
311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
108, // letter128
251, // {199..218 231..250}
251, // {193..198 225..230}
-1, // digit
72, // {"1".."9"}
69, // "0"
356, // digit128
41, // {176..185}
-1, // any
-1, // "["
75, // "-"
-1, // "<"
-1, // " "
282, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
192, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
164, // "("
410, // "+"
-1, // "_"
-1, // "="
321, // "@"
-1, // {10}
-1, // "}"
273, // "!"
327, // "'"
74, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 221
3,373, // <program>
4,52, // <class decl>+
5,376, // <class decl>
6,364, // `class
87,68, // " "
88,111, // "#"
102,25, // {10}
111,35, // ws
  }
,
{ // state 222
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 224
0x80000000|270, // match move
0x80000000|309, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 225
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 226
7,323, // ID
22,4, // `null
40,298, // <exp1>
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
88,335, // "#"
101,321, // "@"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 227
46,197, // `*
47,336, // `/
48,345, // `%
91,8, // "/"
96,307, // "%"
107,369, // "*"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 228
70,421, // "h"
  }
,
{ // state 229
7,323, // ID
16,325, // `(
22,4, // `null
31,441, // <exp>
36,22, // <exp5>
37,202, // <exp4>
38,329, // <exp3>
39,163, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 230
88,213, // "#"
  }
,
{ // state 231
2,332, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 232
7,323, // ID
16,325, // `(
22,4, // `null
31,30, // <exp>
36,22, // <exp5>
37,202, // <exp4>
38,329, // <exp3>
39,163, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 233
57,36, // "a"
58,36, // "p"
59,36, // "v"
60,36, // "c"
61,36, // "f"
62,36, // "i"
63,36, // "l"
64,36, // "o"
65,36, // "r"
66,36, // "u"
67,36, // "x"
68,36, // "b"
69,36, // "e"
70,36, // "h"
71,36, // "n"
72,36, // "t"
73,36, // "w"
74,36, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
76,438, // {199..218 231..250}
77,438, // {193..198 225..230}
79,36, // {"1".."9"}
80,36, // "0"
82,438, // {176..185}
83,225, // any
84,36, // "["
85,36, // "-"
86,36, // "<"
87,36, // " "
88,36, // "#"
89,36, // ")"
90,36, // "]"
91,36, // "/"
92,36, // ";"
93,36, // ">"
94,36, // "{"
95,36, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
96,36, // "%"
97,36, // "("
98,36, // "+"
99,36, // "_"
100,36, // "="
101,36, // "@"
102,36, // {10}
103,36, // "}"
104,36, // "!"
105,36, // "'"
106,36, // '"'
107,36, // "*"
108,388, // any128
109,438, // {223}
110,438, // {128..175 186..192 219..222 224 251..255}
119,428, // $$3
  }
,
{ // state 234
16,418, // `(
97,164, // "("
  }
,
{ // state 235
59,219, // "v"
  }
,
{ // state 236
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 237
44,62, // `+
45,243, // `-
85,75, // "-"
98,410, // "+"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 238
25,94, // `]
90,12, // "]"
  }
,
{ // state 239
0x80000000|315, // match move
0x80000000|389, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 240
7,17, // ID
56,177, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,258, // letter128
76,131, // {199..218 231..250}
77,131, // {193..198 225..230}
  }
,
{ // state 241
24,MIN_REDUCTION+133, // `[
84,MIN_REDUCTION+133, // "["
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 243
7,323, // ID
16,325, // `(
22,4, // `null
38,227, // <exp3>
39,163, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 244
2,110, // ws*
  }
,
{ // state 245
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 246
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 247
24,MIN_REDUCTION+58, // `[
84,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 248
0x80000000|406, // match move
0x80000000|27, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 249
9,350, // <decl in class>*
10,98, // `}
12,126, // <decl in class>
13,186, // <method decl>
14,432, // `public
88,56, // "#"
103,287, // "}"
  }
,
{ // state 250
2,10, // ws*
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 251
0x80000000|128, // match move
0x80000000|358, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 252
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 253
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 254
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 255
0x80000000|1, // match move
0x80000000|378, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 256
0x80000000|1, // match move
0x80000000|168, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 257
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 258
2,133, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 259
0x80000000|397, // match move
0x80000000|13, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 260
0x80000000|267, // match move
0x80000000|407, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 261
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 262
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 263
7,323, // ID
16,325, // `(
22,4, // `null
31,180, // <exp>
36,22, // <exp5>
37,202, // <exp4>
38,329, // <exp3>
39,163, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 264
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 265
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 266
2,344, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 268
17,82, // `)
89,324, // ")"
  }
,
{ // state 269
0x80000000|195, // match move
0x80000000|85, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 270
2,61, // ws*
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 271
2,116, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 272
2,256, // ws*
  }
,
{ // state 273
2,359, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 274
0x80000000|181, // match move
0x80000000|80, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 275
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 276
24,353, // `[
84,47, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 277
2,7, // ws*
  }
,
{ // state 278
56,142, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,360, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
78,391, // digit
79,209, // {"1".."9"}
80,209, // "0"
81,134, // digit128
82,41, // {176..185}
99,9, // "_"
109,269, // {223}
113,129, // $$0
120,222, // idChar
121,46, // idChar128
  }
,
{ // state 279
24,353, // `[
84,47, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 280
66,127, // "u"
  }
,
{ // state 281
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 282
59,219, // "v"
61,293, // "f"
62,23, // "i"
68,54, // "b"
71,53, // "n"
72,348, // "t"
73,228, // "w"
98,37, // "+"
  }
,
{ // state 283
0x80000000|277, // match move
0x80000000|154, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 284
2,187, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 285
24,MIN_REDUCTION+51, // `[
84,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 286
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 287
2,150, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 288
24,MIN_REDUCTION+147, // `[
84,MIN_REDUCTION+147, // "["
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 289
44,62, // `+
45,243, // `-
85,75, // "-"
98,410, // "+"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 290
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
146, // `{
-1, // <decl in class>*
411, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
291, // `void
325, // `(
-1, // `)
-1, // <stmt>*
372, // <type>
265, // `int
115, // `boolean
29, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
77, // <stmt>
103, // <assign>
-1, // `;
384, // <local var decl>
370, // `if
218, // <exp>
-1, // `else
234, // `while
368, // `break
-1, // `=
22, // <exp5>
202, // <exp4>
329, // <exp3>
163, // <exp2>
102, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
347, // `+
226, // `-
-1, // `*
-1, // `/
-1, // `%
185, // `!
316, // INTLIT
100, // STRINGLIT
255, // CHARLIT
193, // `this
14, // `true
194, // `false
76, // letter
311, // "a"
311, // "p"
311, // "v"
311, // "c"
311, // "f"
311, // "i"
311, // "l"
311, // "o"
311, // "r"
311, // "u"
311, // "x"
311, // "b"
311, // "e"
311, // "h"
311, // "n"
311, // "t"
311, // "w"
311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
108, // letter128
251, // {199..218 231..250}
251, // {193..198 225..230}
-1, // digit
72, // {"1".."9"}
69, // "0"
356, // digit128
41, // {176..185}
-1, // any
-1, // "["
75, // "-"
-1, // "<"
-1, // " "
282, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
192, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
164, // "("
410, // "+"
-1, // "_"
-1, // "="
321, // "@"
-1, // {10}
351, // "}"
273, // "!"
327, // "'"
74, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 291
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 292
24,MIN_REDUCTION+144, // `[
84,MIN_REDUCTION+144, // "["
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 293
57,156, // "a"
  }
,
{ // state 294
9,217, // <decl in class>*
10,257, // `}
12,126, // <decl in class>
13,186, // <method decl>
14,432, // `public
88,56, // "#"
103,287, // "}"
  }
,
{ // state 295
24,MIN_REDUCTION+50, // `[
84,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 296
0x80000000|1, // match move
0x80000000|67, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 297
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 298
0x80000000|1, // match move
0x80000000|144, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 299
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 300
87,68, // " "
102,25, // {10}
111,35, // ws
125,MIN_REDUCTION+76, // $NT
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 301
24,MIN_REDUCTION+86, // `[
84,MIN_REDUCTION+86, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 302
63,231, // "l"
  }
,
{ // state 303
2,152, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 304
56,142, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,161, // letter128
76,131, // {199..218 231..250}
77,131, // {193..198 225..230}
78,391, // digit
79,209, // {"1".."9"}
80,209, // "0"
81,91, // digit128
82,333, // {176..185}
99,9, // "_"
109,395, // {223}
113,64, // $$0
120,222, // idChar
121,214, // idChar128
  }
,
{ // state 305
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 306
8,249, // `{
11,199, // `extends
88,409, // "#"
94,192, // "{"
  }
,
{ // state 307
2,157, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 308
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
114, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
291, // `void
325, // `(
-1, // `)
-1, // <stmt>*
372, // <type>
265, // `int
115, // `boolean
29, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
239, // <stmt>
178, // <assign>
-1, // `;
18, // <local var decl>
118, // `if
218, // <exp>
-1, // `else
44, // `while
355, // `break
-1, // `=
22, // <exp5>
202, // <exp4>
329, // <exp3>
163, // <exp2>
102, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
347, // `+
226, // `-
-1, // `*
-1, // `/
-1, // `%
185, // `!
316, // INTLIT
100, // STRINGLIT
255, // CHARLIT
193, // `this
14, // `true
194, // `false
76, // letter
311, // "a"
311, // "p"
311, // "v"
311, // "c"
311, // "f"
311, // "i"
311, // "l"
311, // "o"
311, // "r"
311, // "u"
311, // "x"
311, // "b"
311, // "e"
311, // "h"
311, // "n"
311, // "t"
311, // "w"
311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
108, // letter128
251, // {199..218 231..250}
251, // {193..198 225..230}
-1, // digit
72, // {"1".."9"}
69, // "0"
356, // digit128
41, // {176..185}
-1, // any
-1, // "["
75, // "-"
-1, // "<"
-1, // " "
282, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
192, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
164, // "("
410, // "+"
-1, // "_"
-1, // "="
321, // "@"
-1, // {10}
-1, // "}"
273, // "!"
327, // "'"
74, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 309
2,61, // ws*
87,430, // " "
102,140, // {10}
111,260, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 310
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
114, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
291, // `void
325, // `(
-1, // `)
-1, // <stmt>*
372, // <type>
265, // `int
115, // `boolean
29, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
434, // <stmt>
178, // <assign>
-1, // `;
18, // <local var decl>
118, // `if
218, // <exp>
-1, // `else
44, // `while
355, // `break
-1, // `=
22, // <exp5>
202, // <exp4>
329, // <exp3>
163, // <exp2>
102, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
347, // `+
226, // `-
-1, // `*
-1, // `/
-1, // `%
185, // `!
316, // INTLIT
100, // STRINGLIT
255, // CHARLIT
193, // `this
14, // `true
194, // `false
76, // letter
311, // "a"
311, // "p"
311, // "v"
311, // "c"
311, // "f"
311, // "i"
311, // "l"
311, // "o"
311, // "r"
311, // "u"
311, // "x"
311, // "b"
311, // "e"
311, // "h"
311, // "n"
311, // "t"
311, // "w"
311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
108, // letter128
251, // {199..218 231..250}
251, // {193..198 225..230}
-1, // digit
72, // {"1".."9"}
69, // "0"
356, // digit128
41, // {176..185}
-1, // any
-1, // "["
75, // "-"
-1, // "<"
-1, // " "
282, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
192, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
164, // "("
410, // "+"
-1, // "_"
-1, // "="
321, // "@"
-1, // {10}
-1, // "}"
273, // "!"
327, // "'"
74, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 311
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 312
0x80000000|107, // match move
0x80000000|288, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 313
78,57, // digit
79,209, // {"1".."9"}
80,209, // "0"
81,283, // digit128
82,41, // {176..185}
115,84, // $$1
  }
,
{ // state 314
0x80000000|1, // match move
0x80000000|49, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 315
32,211, // `else
88,213, // "#"
  }
,
{ // state 316
0x80000000|1, // match move
0x80000000|205, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 317
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 318
0x80000000|440, // match move
0x80000000|390, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 319
2,274, // ws*
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 320
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 321
106,50, // '"'
  }
,
{ // state 322
2,121, // ws*
  }
,
{ // state 323
0x80000000|1, // match move
0x80000000|196, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 324
2,160, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 325
7,415, // ID
15,291, // `void
19,122, // <type>
20,265, // `int
21,115, // `boolean
22,223, // `null
56,177, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,258, // letter128
76,131, // {199..218 231..250}
77,131, // {193..198 225..230}
88,334, // "#"
  }
,
{ // state 326
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 327
57,81, // "a"
58,81, // "p"
59,81, // "v"
60,81, // "c"
61,81, // "f"
62,81, // "i"
63,81, // "l"
64,81, // "o"
65,81, // "r"
66,81, // "u"
67,81, // "x"
68,81, // "b"
69,81, // "e"
70,81, // "h"
71,81, // "n"
72,81, // "t"
73,81, // "w"
74,81, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
79,81, // {"1".."9"}
80,81, // "0"
83,21, // any
84,81, // "["
85,81, // "-"
86,81, // "<"
87,81, // " "
88,81, // "#"
89,81, // ")"
90,81, // "]"
91,81, // "/"
92,81, // ";"
93,81, // ">"
94,81, // "{"
95,81, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
96,81, // "%"
97,81, // "("
98,81, // "+"
99,81, // "_"
100,81, // "="
101,81, // "@"
102,81, // {10}
103,81, // "}"
104,81, // "!"
105,81, // "'"
106,81, // '"'
107,81, // "*"
  }
,
{ // state 328
24,238, // `[
84,47, // "["
  }
,
{ // state 329
46,197, // `*
47,336, // `/
48,345, // `%
91,8, // "/"
96,307, // "%"
107,369, // "*"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 330
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 331
66,303, // "u"
  }
,
{ // state 332
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 333
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 334
59,219, // "v"
62,23, // "i"
68,431, // "b"
71,331, // "n"
  }
,
{ // state 335
61,293, // "f"
71,53, // "n"
72,348, // "t"
  }
,
{ // state 336
7,323, // ID
16,325, // `(
22,4, // `null
39,117, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 337
24,MIN_REDUCTION+162, // `[
84,MIN_REDUCTION+162, // "["
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 338
24,MIN_REDUCTION+124, // `[
84,MIN_REDUCTION+124, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 339
24,MIN_REDUCTION+126, // `[
84,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 340
2,70, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 342
24,MIN_REDUCTION+170, // `[
84,MIN_REDUCTION+170, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 343
0x80000000|262, // match move
0x80000000|236, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 344
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 345
7,323, // ID
16,325, // `(
22,4, // `null
39,141, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 346
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 347
7,323, // ID
22,4, // `null
40,97, // <exp1>
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
88,335, // "#"
101,321, // "@"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 348
65,51, // "r"
70,6, // "h"
  }
,
{ // state 349
17,310, // `)
89,324, // ")"
  }
,
{ // state 350
10,245, // `}
12,207, // <decl in class>
13,186, // <method decl>
14,432, // `public
88,56, // "#"
103,287, // "}"
  }
,
{ // state 351
0x80000000|71, // match move
0x80000000|66, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 352
0x80000000|1, // match move
0x80000000|143, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 353
7,323, // ID
16,325, // `(
22,4, // `null
31,179, // <exp>
36,22, // <exp5>
37,202, // <exp4>
38,329, // <exp3>
39,163, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
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
{ // state 354
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 355
28,106, // `;
92,224, // ";"
  }
,
{ // state 356
0x80000000|272, // match move
0x80000000|120, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 357
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 358
24,MIN_REDUCTION+55, // `[
84,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 359
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 360
0x80000000|275, // match move
0x80000000|429, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 361
2,300, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
125,MIN_REDUCTION+77, // $NT
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 362
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 363
2,26, // ws*
  }
,
{ // state 364
7,306, // ID
56,177, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,258, // letter128
76,131, // {199..218 231..250}
77,131, // {193..198 225..230}
  }
,
{ // state 365
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 366
24,MIN_REDUCTION+168, // `[
84,MIN_REDUCTION+168, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 367
2,86, // ws*
24,MIN_REDUCTION+135, // `[
84,MIN_REDUCTION+135, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 368
28,119, // `;
92,271, // ";"
  }
,
{ // state 369
2,89, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 370
16,145, // `(
97,164, // "("
  }
,
{ // state 371
87,430, // " "
102,140, // {10}
111,88, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 372
7,132, // ID
23,173, // <empty bracket pair>
24,238, // `[
56,177, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,258, // letter128
76,131, // {199..218 231..250}
77,131, // {193..198 225..230}
84,47, // "["
  }
,
{ // state 373
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 374
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 375
2,352, // ws*
24,MIN_REDUCTION+81, // `[
84,MIN_REDUCTION+81, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 376
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 377
2,149, // ws*
24,MIN_REDUCTION+83, // `[
84,MIN_REDUCTION+83, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 378
24,MIN_REDUCTION+49, // `[
84,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 379
17,308, // `)
89,324, // ")"
  }
,
{ // state 380
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 381
0x80000000|1, // match move
0x80000000|276, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 382
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 383
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
146, // `{
-1, // <decl in class>*
362, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
291, // `void
325, // `(
-1, // `)
426, // <stmt>*
372, // <type>
265, // `int
115, // `boolean
29, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
357, // <stmt>
103, // <assign>
-1, // `;
384, // <local var decl>
370, // `if
218, // <exp>
-1, // `else
234, // `while
368, // `break
-1, // `=
22, // <exp5>
202, // <exp4>
329, // <exp3>
163, // <exp2>
102, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
347, // `+
226, // `-
-1, // `*
-1, // `/
-1, // `%
185, // `!
316, // INTLIT
100, // STRINGLIT
255, // CHARLIT
193, // `this
14, // `true
194, // `false
76, // letter
311, // "a"
311, // "p"
311, // "v"
311, // "c"
311, // "f"
311, // "i"
311, // "l"
311, // "o"
311, // "r"
311, // "u"
311, // "x"
311, // "b"
311, // "e"
311, // "h"
311, // "n"
311, // "t"
311, // "w"
311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
108, // letter128
251, // {199..218 231..250}
251, // {193..198 225..230}
-1, // digit
72, // {"1".."9"}
69, // "0"
356, // digit128
41, // {176..185}
-1, // any
-1, // "["
75, // "-"
-1, // "<"
-1, // " "
282, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
192, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
164, // "("
410, // "+"
-1, // "_"
-1, // "="
321, // "@"
-1, // {10}
287, // "}"
273, // "!"
327, // "'"
74, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 384
28,210, // `;
92,271, // ";"
  }
,
{ // state 385
124,MIN_REDUCTION+0, // $
  }
,
{ // state 386
24,MIN_REDUCTION+132, // `[
84,MIN_REDUCTION+132, // "["
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 387
87,MIN_REDUCTION+61, // " "
102,MIN_REDUCTION+61, // {10}
111,MIN_REDUCTION+61, // ws
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 388
0x80000000|244, // match move
0x80000000|109, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 389
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 390
24,MIN_REDUCTION+45, // `[
35,MIN_REDUCTION+45, // `=
41,MIN_REDUCTION+45, // `<
42,MIN_REDUCTION+45, // `<=
43,MIN_REDUCTION+45, // `>
44,MIN_REDUCTION+45, // `+
45,MIN_REDUCTION+45, // `-
46,MIN_REDUCTION+45, // `*
47,MIN_REDUCTION+45, // `/
48,MIN_REDUCTION+45, // `%
84,MIN_REDUCTION+45, // "["
85,MIN_REDUCTION+45, // "-"
86,MIN_REDUCTION+45, // "<"
91,MIN_REDUCTION+45, // "/"
93,MIN_REDUCTION+45, // ">"
96,MIN_REDUCTION+45, // "%"
98,MIN_REDUCTION+45, // "+"
100,MIN_REDUCTION+45, // "="
101,MIN_REDUCTION+45, // "@"
107,MIN_REDUCTION+45, // "*"
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 391
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 392
24,MIN_REDUCTION+166, // `[
84,MIN_REDUCTION+166, // "["
87,259, // " "
102,182, // {10}
111,159, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 393
0x80000000|1, // match move
0x80000000|279, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 394
2,10, // ws*
24,MIN_REDUCTION+87, // `[
84,MIN_REDUCTION+87, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 395
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 396
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 397
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 398
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 399
2,274, // ws*
24,MIN_REDUCTION+165, // `[
84,MIN_REDUCTION+165, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 400
0x80000000|322, // match move
0x80000000|99, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 401
24,353, // `[
84,47, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 402
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
114, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
291, // `void
325, // `(
-1, // `)
-1, // <stmt>*
372, // <type>
265, // `int
115, // `boolean
29, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
248, // <stmt>
178, // <assign>
-1, // `;
18, // <local var decl>
118, // `if
218, // <exp>
-1, // `else
44, // `while
355, // `break
-1, // `=
22, // <exp5>
202, // <exp4>
329, // <exp3>
163, // <exp2>
102, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
347, // `+
226, // `-
-1, // `*
-1, // `/
-1, // `%
185, // `!
316, // INTLIT
100, // STRINGLIT
255, // CHARLIT
193, // `this
14, // `true
194, // `false
76, // letter
311, // "a"
311, // "p"
311, // "v"
311, // "c"
311, // "f"
311, // "i"
311, // "l"
311, // "o"
311, // "r"
311, // "u"
311, // "x"
311, // "b"
311, // "e"
311, // "h"
311, // "n"
311, // "t"
311, // "w"
311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
108, // letter128
251, // {199..218 231..250}
251, // {193..198 225..230}
-1, // digit
72, // {"1".."9"}
69, // "0"
356, // digit128
41, // {176..185}
-1, // any
-1, // "["
75, // "-"
-1, // "<"
-1, // " "
282, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
192, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
164, // "("
410, // "+"
-1, // "_"
-1, // "="
321, // "@"
-1, // {10}
-1, // "}"
273, // "!"
327, // "'"
74, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 403
2,326, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 404
7,323, // ID
16,325, // `(
22,4, // `null
37,174, // <exp4>
38,329, // <exp3>
39,163, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 405
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 406
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 407
87,MIN_REDUCTION+163, // " "
102,MIN_REDUCTION+163, // {10}
111,MIN_REDUCTION+163, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 408
24,MIN_REDUCTION+59, // `[
84,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 409
69,215, // "e"
  }
,
{ // state 410
2,112, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 411
0x80000000|138, // match move
0x80000000|252, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 412
63,361, // "l"
  }
,
{ // state 413
24,MIN_REDUCTION+163, // `[
84,MIN_REDUCTION+163, // "["
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 414
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 415
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 416
24,353, // `[
84,47, // "["
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 417
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 418
7,323, // ID
16,325, // `(
22,4, // `null
31,95, // <exp>
36,22, // <exp5>
37,202, // <exp4>
38,329, // <exp3>
39,163, // <exp2>
40,102, // <exp1>
44,347, // `+
45,226, // `-
49,185, // `!
50,316, // INTLIT
51,100, // STRINGLIT
52,255, // CHARLIT
53,193, // `this
54,14, // `true
55,194, // `false
56,76, // letter
57,311, // "a"
58,311, // "p"
59,311, // "v"
60,311, // "c"
61,311, // "f"
62,311, // "i"
63,311, // "l"
64,311, // "o"
65,311, // "r"
66,311, // "u"
67,311, // "x"
68,311, // "b"
69,311, // "e"
70,311, // "h"
71,311, // "n"
72,311, // "t"
73,311, // "w"
74,311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,108, // letter128
76,251, // {199..218 231..250}
77,251, // {193..198 225..230}
79,72, // {"1".."9"}
80,69, // "0"
81,356, // digit128
82,41, // {176..185}
85,75, // "-"
88,335, // "#"
97,164, // "("
98,410, // "+"
101,321, // "@"
104,273, // "!"
105,327, // "'"
106,74, // '"'
  }
,
{ // state 419
87,MIN_REDUCTION+162, // " "
102,MIN_REDUCTION+162, // {10}
111,MIN_REDUCTION+162, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 420
2,352, // ws*
  }
,
{ // state 421
2,317, // ws*
87,68, // " "
102,25, // {10}
111,105, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 422
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 423
57,261, // "a"
58,261, // "p"
59,261, // "v"
60,261, // "c"
61,261, // "f"
62,261, // "i"
63,261, // "l"
64,261, // "o"
65,261, // "r"
66,261, // "u"
67,261, // "x"
68,261, // "b"
69,261, // "e"
70,261, // "h"
71,261, // "n"
72,261, // "t"
73,261, // "w"
74,261, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,312, // {193..198 225..230}
79,261, // {"1".."9"}
80,261, // "0"
82,312, // {176..185}
117,166, // $$2
122,206, // hexDigit
123,400, // hexDigit128
  }
,
{ // state 424
2,86, // ws*
  }
,
{ // state 425
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 426
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
146, // `{
-1, // <decl in class>*
396, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
291, // `void
325, // `(
-1, // `)
-1, // <stmt>*
372, // <type>
265, // `int
115, // `boolean
29, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
77, // <stmt>
103, // <assign>
-1, // `;
384, // <local var decl>
370, // `if
218, // <exp>
-1, // `else
234, // `while
368, // `break
-1, // `=
22, // <exp5>
202, // <exp4>
329, // <exp3>
163, // <exp2>
102, // <exp1>
-1, // `<
-1, // `<=
-1, // `>
347, // `+
226, // `-
-1, // `*
-1, // `/
-1, // `%
185, // `!
316, // INTLIT
100, // STRINGLIT
255, // CHARLIT
193, // `this
14, // `true
194, // `false
76, // letter
311, // "a"
311, // "p"
311, // "v"
311, // "c"
311, // "f"
311, // "i"
311, // "l"
311, // "o"
311, // "r"
311, // "u"
311, // "x"
311, // "b"
311, // "e"
311, // "h"
311, // "n"
311, // "t"
311, // "w"
311, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
108, // letter128
251, // {199..218 231..250}
251, // {193..198 225..230}
-1, // digit
72, // {"1".."9"}
69, // "0"
356, // digit128
41, // {176..185}
-1, // any
-1, // "["
75, // "-"
-1, // "<"
-1, // " "
282, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
192, // "{"
-1, // {0..9 11..31 "$" "&" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
164, // "("
410, // "+"
-1, // "_"
-1, // "="
321, // "@"
-1, // {10}
287, // "}"
273, // "!"
327, // "'"
74, // '"'
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
-1, // $
-1, // $NT
  }
,
{ // state 427
8,294, // `{
94,192, // "{"
  }
,
{ // state 428
0x80000000|1, // match move
0x80000000|158, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 429
24,MIN_REDUCTION+143, // `[
84,MIN_REDUCTION+143, // "["
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 430
0x80000000|123, // match move
0x80000000|175, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 431
64,340, // "o"
  }
,
{ // state 432
15,240, // `void
88,235, // "#"
  }
,
{ // state 433
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 434
0x80000000|16, // match move
0x80000000|389, // no-match move
0x80000000|230, // NT-test-match state for `else
  }
,
{ // state 435
2,296, // ws*
24,MIN_REDUCTION+85, // `[
84,MIN_REDUCTION+85, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 436
2,189, // ws*
24,MIN_REDUCTION+113, // `[
84,MIN_REDUCTION+113, // "["
87,259, // " "
102,182, // {10}
111,79, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 437
2,40, // ws*
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 438
0x80000000|281, // match move
0x80000000|408, // no-match move
0x80000000|328, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 439
87,68, // " "
102,25, // {10}
111,35, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 440
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 441
MIN_REDUCTION+27, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[442][];
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
// <stmt> ::= `while `( <exp> `) <stmt>
(26<<16)+5,
// <stmt> ::= `break `;
(26<<16)+2,
// <assign> ::= <exp> `= <exp>
(27<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(29<<16)+4,
// <exp> ::= <exp5>
(31<<16)+1,
// <exp5> ::= <exp4>
(36<<16)+1,
// <exp4> ::= <exp3>
(37<<16)+1,
// <exp3> ::= <exp2>
(38<<16)+1,
// <exp2> ::= <exp1>
(39<<16)+1,
// <exp5> ::= <exp5> `< <exp4>
(36<<16)+3,
// <exp5> ::= <exp5> `<= <exp4>
(36<<16)+3,
// <exp5> ::= <exp5> `> <exp4>
(36<<16)+3,
// <exp4> ::= <exp4> `+ <exp3>
(37<<16)+3,
// <exp4> ::= <exp4> `- <exp3>
(37<<16)+3,
// <exp3> ::= <exp3> `* <exp2>
(38<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(38<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(38<<16)+3,
// <exp2> ::= `( <type> `) <exp1>
(39<<16)+4,
// <exp2> ::= `+ <exp1>
(39<<16)+2,
// <exp2> ::= `- <exp1>
(39<<16)+2,
// <exp2> ::= `! <exp1>
(39<<16)+2,
// <exp1> ::= ID
(40<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(40<<16)+4,
// <exp1> ::= INTLIT
(40<<16)+1,
// <exp1> ::= STRINGLIT
(40<<16)+1,
// <exp1> ::= CHARLIT
(40<<16)+1,
// <exp1> ::= `this
(40<<16)+1,
// <exp1> ::= `true
(40<<16)+1,
// <exp1> ::= `false
(40<<16)+1,
// <exp1> ::= `null
(40<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(56<<16)+1,
// letter128 ::= {193..218 225..250}
(75<<16)+1,
// digit ::= {"0".."9"}
(78<<16)+1,
// digit128 ::= {176..185}
(81<<16)+1,
// any ::= {0..127}
(83<<16)+1,
// any128 ::= {128..255}
(108<<16)+1,
// ws ::= " "
(111<<16)+1,
// ws ::= {10}
(111<<16)+1,
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
(33<<16)+4,
// `while ::= "#" "w" "h"
(33<<16)+3,
// `if ::= "#" "+" ws*
(30<<16)+3,
// `if ::= "#" "+"
(30<<16)+2,
// `else ::= "#" "e" "l" ws*
(32<<16)+4,
// `else ::= "#" "e" "l"
(32<<16)+3,
// `break ::= "#" "b" "r" ws*
(34<<16)+4,
// `break ::= "#" "b" "r"
(34<<16)+3,
// `this ::= "#" "t" "h" ws*
(53<<16)+4,
// `this ::= "#" "t" "h"
(53<<16)+3,
// `false ::= "#" "f" "a" ws*
(55<<16)+4,
// `false ::= "#" "f" "a"
(55<<16)+3,
// `true ::= "#" "t" "r" ws*
(54<<16)+4,
// `true ::= "#" "t" "r"
(54<<16)+3,
// `null ::= "#" "n" "u" ws*
(22<<16)+4,
// `null ::= "#" "n" "u"
(22<<16)+3,
// `public ::= "#" "p" "u" ws*
(14<<16)+4,
// `public ::= "#" "p" "u"
(14<<16)+3,
// `! ::= "!" ws*
(49<<16)+2,
// `! ::= "!"
(49<<16)+1,
// `% ::= "%" ws*
(48<<16)+2,
// `% ::= "%"
(48<<16)+1,
// `* ::= "*" ws*
(46<<16)+2,
// `* ::= "*"
(46<<16)+1,
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
(45<<16)+2,
// `- ::= "-"
(45<<16)+1,
// `+ ::= "+" ws*
(44<<16)+2,
// `+ ::= "+"
(44<<16)+1,
// `= ::= "=" ws*
(35<<16)+2,
// `= ::= "="
(35<<16)+1,
// `[ ::= "[" ws*
(24<<16)+2,
// `[ ::= "["
(24<<16)+1,
// `] ::= "]" ws*
(25<<16)+2,
// `] ::= "]"
(25<<16)+1,
// `< ::= "<" ws*
(41<<16)+2,
// `< ::= "<"
(41<<16)+1,
// `<= ::= "@" "<" ws*
(42<<16)+3,
// `<= ::= "@" "<"
(42<<16)+2,
// `> ::= ">" !"=" ws*
(43<<16)+2,
// `> ::= ">" !"="
(43<<16)+1,
// `; ::= ";" ws*
(28<<16)+2,
// `; ::= ";"
(28<<16)+1,
// `/ ::= "/" ws*
(47<<16)+2,
// `/ ::= "/"
(47<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(50<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(50<<16)+2,
// INTLIT ::= digit128 ws*
(50<<16)+2,
// INTLIT ::= digit128
(50<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(50<<16)+3,
// INTLIT ::= "0" $$2
(50<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(51<<16)+3,
// STRINGLIT ::= "@" '"'
(51<<16)+2,
// STRINGLIT ::= '"' any* $$3
(51<<16)+3,
// STRINGLIT ::= '"' $$3
(51<<16)+2,
// CHARLIT ::= "'" any ws*
(52<<16)+3,
// CHARLIT ::= "'" any
(52<<16)+2,
// idChar ::= letter
(120<<16)+1,
// idChar ::= digit
(120<<16)+1,
// idChar ::= "_"
(120<<16)+1,
// idChar128 ::= letter128
(121<<16)+1,
// idChar128 ::= digit128
(121<<16)+1,
// idChar128 ::= {223}
(121<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(122<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(123<<16)+1,
// digit* ::= digit* digit
(114<<16)+2,
// digit* ::= digit
(114<<16)+1,
// any* ::= any* any
(118<<16)+2,
// any* ::= any
(118<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(116<<16)+2,
// hexDigit* ::= hexDigit
(116<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// idChar* ::= idChar* idChar
(112<<16)+2,
// idChar* ::= idChar
(112<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(113<<16)+2,
// $$0 ::= idChar128
(113<<16)+1,
// $$1 ::= digit128 ws*
(115<<16)+2,
// $$1 ::= digit128
(115<<16)+1,
// $$2 ::= hexDigit128 ws*
(117<<16)+2,
// $$2 ::= hexDigit128
(117<<16)+1,
// $$3 ::= any128 ws*
(119<<16)+2,
// $$3 ::= any128
(119<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
95, // 0
95, // 1
95, // 2
95, // 3
95, // 4
95, // 5
95, // 6
95, // 7
95, // 8
95, // 9
102, // 10
95, // 11
95, // 12
95, // 13
95, // 14
95, // 15
95, // 16
95, // 17
95, // 18
95, // 19
95, // 20
95, // 21
95, // 22
95, // 23
95, // 24
95, // 25
95, // 26
95, // 27
95, // 28
95, // 29
95, // 30
95, // 31
87, // " "
104, // "!"
106, // '"'
88, // "#"
95, // "$"
96, // "%"
95, // "&"
105, // "'"
97, // "("
89, // ")"
107, // "*"
98, // "+"
95, // ","
85, // "-"
95, // "."
91, // "/"
80, // "0"
79, // "1"
79, // "2"
79, // "3"
79, // "4"
79, // "5"
79, // "6"
79, // "7"
79, // "8"
79, // "9"
95, // ":"
92, // ";"
86, // "<"
100, // "="
93, // ">"
95, // "?"
101, // "@"
74, // "A"
74, // "B"
74, // "C"
74, // "D"
74, // "E"
74, // "F"
74, // "G"
74, // "H"
74, // "I"
74, // "J"
74, // "K"
74, // "L"
74, // "M"
74, // "N"
74, // "O"
74, // "P"
74, // "Q"
74, // "R"
74, // "S"
74, // "T"
74, // "U"
74, // "V"
74, // "W"
74, // "X"
74, // "Y"
74, // "Z"
84, // "["
95, // "\"
90, // "]"
95, // "^"
99, // "_"
95, // "`"
57, // "a"
68, // "b"
60, // "c"
74, // "d"
69, // "e"
61, // "f"
74, // "g"
70, // "h"
62, // "i"
74, // "j"
74, // "k"
63, // "l"
74, // "m"
71, // "n"
64, // "o"
58, // "p"
74, // "q"
65, // "r"
74, // "s"
72, // "t"
66, // "u"
59, // "v"
73, // "w"
67, // "x"
74, // "y"
74, // "z"
94, // "{"
95, // "|"
103, // "}"
95, // "~"
95, // 127
110, // 128
110, // 129
110, // 130
110, // 131
110, // 132
110, // 133
110, // 134
110, // 135
110, // 136
110, // 137
110, // 138
110, // 139
110, // 140
110, // 141
110, // 142
110, // 143
110, // 144
110, // 145
110, // 146
110, // 147
110, // 148
110, // 149
110, // 150
110, // 151
110, // 152
110, // 153
110, // 154
110, // 155
110, // 156
110, // 157
110, // 158
110, // 159
110, // 160
110, // 161
110, // 162
110, // 163
110, // 164
110, // 165
110, // 166
110, // 167
110, // 168
110, // 169
110, // 170
110, // 171
110, // 172
110, // 173
110, // 174
110, // 175
82, // 176
82, // 177
82, // 178
82, // 179
82, // 180
82, // 181
82, // 182
82, // 183
82, // 184
82, // 185
110, // 186
110, // 187
110, // 188
110, // 189
110, // 190
110, // 191
110, // 192
77, // 193
77, // 194
77, // 195
77, // 196
77, // 197
77, // 198
76, // 199
76, // 200
76, // 201
76, // 202
76, // 203
76, // 204
76, // 205
76, // 206
76, // 207
76, // 208
76, // 209
76, // 210
76, // 211
76, // 212
76, // 213
76, // 214
76, // 215
76, // 216
76, // 217
76, // 218
110, // 219
110, // 220
110, // 221
110, // 222
109, // 223
110, // 224
77, // 225
77, // 226
77, // 227
77, // 228
77, // 229
77, // 230
76, // 231
76, // 232
76, // 233
76, // 234
76, // 235
76, // 236
76, // 237
76, // 238
76, // 239
76, // 240
76, // 241
76, // 242
76, // 243
76, // 244
76, // 245
76, // 246
76, // 247
76, // 248
76, // 249
76, // 250
110, // 251
110, // 252
110, // 253
110, // 254
110, // 255
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
"<stmt> ::= # `while `( <exp> `) <stmt>", // 24
"<stmt> ::= # `break `;", // 25
"<assign> ::= <exp> # `= <exp>", // 26
"<local var decl> ::= <type> # ID `= <exp>", // 27
"<exp> ::= <exp5>", // 28
"<exp5> ::= <exp4>", // 29
"<exp4> ::= <exp3>", // 30
"<exp3> ::= <exp2>", // 31
"<exp2> ::= <exp1>", // 32
"<exp5> ::= <exp5> # `< <exp4>", // 33
"<exp5> ::= <exp5> # `<= <exp4>", // 34
"<exp5> ::= <exp5> # `> <exp4>", // 35
"<exp4> ::= <exp4> # `+ <exp3>", // 36
"<exp4> ::= <exp4> # `- <exp3>", // 37
"<exp3> ::= <exp3> # `* <exp2>", // 38
"<exp3> ::= <exp3> # `/ <exp2>", // 39
"<exp3> ::= <exp3> # `% <exp2>", // 40
"<exp2> ::= # `( <type> `) <exp1>", // 41
"<exp2> ::= # `+ <exp1>", // 42
"<exp2> ::= # `- <exp1>", // 43
"<exp2> ::= # `! <exp1>", // 44
"<exp1> ::= # ID", // 45
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 46
"<exp1> ::= # INTLIT", // 47
"<exp1> ::= # STRINGLIT", // 48
"<exp1> ::= # CHARLIT", // 49
"<exp1> ::= # `this", // 50
"<exp1> ::= # `true", // 51
"<exp1> ::= # `false", // 52
"<exp1> ::= # `null", // 53
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 54
"letter128 ::= {193..218 225..250}", // 55
"digit ::= {\"0\"..\"9\"}", // 56
"digit128 ::= {176..185}", // 57
"any ::= {0..127}", // 58
"any128 ::= {128..255}", // 59
"ws ::= \" \"", // 60
"ws ::= {10} registerNewline", // 61
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 62
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 63
"`class ::= \"#\" \"c\" \"l\" ws*", // 64
"`class ::= \"#\" \"c\" \"l\" ws*", // 65
"`extends ::= \"#\" \"e\" \"x\" ws*", // 66
"`extends ::= \"#\" \"e\" \"x\" ws*", // 67
"`void ::= \"#\" \"v\" \"o\" ws*", // 68
"`void ::= \"#\" \"v\" \"o\" ws*", // 69
"`int ::= \"#\" \"i\" \"t\" ws*", // 70
"`int ::= \"#\" \"i\" \"t\" ws*", // 71
"`while ::= \"#\" \"w\" \"h\" ws*", // 72
"`while ::= \"#\" \"w\" \"h\" ws*", // 73
"`if ::= \"#\" \"+\" ws*", // 74
"`if ::= \"#\" \"+\" ws*", // 75
"`else ::= \"#\" \"e\" \"l\" ws*", // 76
"`else ::= \"#\" \"e\" \"l\" ws*", // 77
"`break ::= \"#\" \"b\" \"r\" ws*", // 78
"`break ::= \"#\" \"b\" \"r\" ws*", // 79
"`this ::= \"#\" \"t\" \"h\" ws*", // 80
"`this ::= \"#\" \"t\" \"h\" ws*", // 81
"`false ::= \"#\" \"f\" \"a\" ws*", // 82
"`false ::= \"#\" \"f\" \"a\" ws*", // 83
"`true ::= \"#\" \"t\" \"r\" ws*", // 84
"`true ::= \"#\" \"t\" \"r\" ws*", // 85
"`null ::= \"#\" \"n\" \"u\" ws*", // 86
"`null ::= \"#\" \"n\" \"u\" ws*", // 87
"`public ::= \"#\" \"p\" \"u\" ws*", // 88
"`public ::= \"#\" \"p\" \"u\" ws*", // 89
"`! ::= \"!\" ws*", // 90
"`! ::= \"!\" ws*", // 91
"`% ::= \"%\" ws*", // 92
"`% ::= \"%\" ws*", // 93
"`* ::= \"*\" ws*", // 94
"`* ::= \"*\" ws*", // 95
"`( ::= \"(\" ws*", // 96
"`( ::= \"(\" ws*", // 97
"`) ::= \")\" ws*", // 98
"`) ::= \")\" ws*", // 99
"`{ ::= \"{\" ws*", // 100
"`{ ::= \"{\" ws*", // 101
"`} ::= \"}\" ws*", // 102
"`} ::= \"}\" ws*", // 103
"`- ::= \"-\" ws*", // 104
"`- ::= \"-\" ws*", // 105
"`+ ::= \"+\" ws*", // 106
"`+ ::= \"+\" ws*", // 107
"`= ::= \"=\" ws*", // 108
"`= ::= \"=\" ws*", // 109
"`[ ::= \"[\" ws*", // 110
"`[ ::= \"[\" ws*", // 111
"`] ::= \"]\" ws*", // 112
"`] ::= \"]\" ws*", // 113
"`< ::= \"<\" ws*", // 114
"`< ::= \"<\" ws*", // 115
"`<= ::= \"@\" \"<\" ws*", // 116
"`<= ::= \"@\" \"<\" ws*", // 117
"`> ::= \">\" !\"=\" ws*", // 118
"`> ::= \">\" !\"=\" ws*", // 119
"`; ::= \";\" ws*", // 120
"`; ::= \";\" ws*", // 121
"`/ ::= \"/\" ws*", // 122
"`/ ::= \"/\" ws*", // 123
"ID ::= letter128 ws*", // 124
"ID ::= letter128 ws*", // 125
"ID ::= letter idChar* idChar128 ws*", // 126
"ID ::= letter idChar* idChar128 ws*", // 127
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 128
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 129
"INTLIT ::= digit128 ws*", // 130
"INTLIT ::= digit128 ws*", // 131
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 132
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 133
"STRINGLIT ::= \"@\" \'\"\' ws*", // 134
"STRINGLIT ::= \"@\" \'\"\' ws*", // 135
"STRINGLIT ::= \'\"\' any* any128 ws*", // 136
"STRINGLIT ::= \'\"\' any* any128 ws*", // 137
"CHARLIT ::= \"\'\" any ws*", // 138
"CHARLIT ::= \"\'\" any ws*", // 139
"idChar ::= letter", // 140
"idChar ::= digit", // 141
"idChar ::= \"_\"", // 142
"idChar128 ::= letter128", // 143
"idChar128 ::= digit128", // 144
"idChar128 ::= {223}", // 145
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 146
"hexDigit128 ::= {176..185 193..198 225..230}", // 147
"digit* ::= digit* digit", // 148
"digit* ::= digit* digit", // 149
"any* ::= any* any", // 150
"any* ::= any* any", // 151
"<decl in class>* ::= <decl in class>* <decl in class>", // 152
"<decl in class>* ::= <decl in class>* <decl in class>", // 153
"hexDigit* ::= hexDigit* hexDigit", // 154
"hexDigit* ::= hexDigit* hexDigit", // 155
"<stmt>* ::= <stmt>* <stmt>", // 156
"<stmt>* ::= <stmt>* <stmt>", // 157
"idChar* ::= idChar* idChar", // 158
"idChar* ::= idChar* idChar", // 159
"<class decl>+ ::= <class decl>", // 160
"<class decl>+ ::= <class decl>+ <class decl>", // 161
"ws* ::= ws* ws", // 162
"ws* ::= ws* ws", // 163
"", // 164
"", // 165
"", // 166
"", // 167
"", // 168
"", // 169
"", // 170
"", // 171
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 7: <class decl> ::= `class [#] ID `extends ID `{ [<decl in class>*] `} @createdExtendsClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 12: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 13: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 14: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 15: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 16: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 19: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <stmt> ::= [#] `if `( <exp> `) <stmt> [#] `else <stmt> @newIfElseBlock(int,Exp,Statement,int,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <stmt> ::= [#] `while `( <exp> `) <stmt> @newWhileBlock(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 25: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 26: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 27: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 28: <exp> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 32: <exp2> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <exp5> ::= <exp5> [#] `< <exp4> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 34: <exp5> ::= <exp5> [#] `<= <exp4> @newLessThanEqualTo(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 35: <exp5> ::= <exp5> [#] `> <exp4> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 36: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 37: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 38: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 39: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 40: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 41: <exp2> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 42: <exp2> ::= [#] `+ <exp1> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 43: <exp2> ::= [#] `- <exp1> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 44: <exp2> ::= [#] `! <exp1> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 45: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 46: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 47: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 48: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 49: <exp1> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 50: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 51: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 52: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 53: <exp1> ::= [#] `null @newNullExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 54: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 55: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 56: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 57: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 58: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 59: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 60: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 61: ws ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 62: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 65: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `extends ::= "#" "e" "x" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 69: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 70: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 71: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 72: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 73: `while ::= "#" "w" "h" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 74: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 75: `if ::= "#" "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 76: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 77: `else ::= "#" "e" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 78: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 79: `break ::= "#" "b" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 80: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 81: `this ::= "#" "t" "h" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 82: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 83: `false ::= "#" "f" "a" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 84: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 85: `true ::= "#" "t" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 86: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 87: `null ::= "#" "n" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 88: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 89: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 90: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `! ::= "!" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 93: `% ::= "%" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 95: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 96: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 97: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 100: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 101: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 102: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 103: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 104: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 105: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 106: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 107: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 108: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 111: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 112: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `< ::= "<" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 117: `<= ::= "@" "<" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 118: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `> ::= ">" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `/ ::= "/" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 125: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 126: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 127: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 128: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 129: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 130: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 131: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 132: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 133: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 134: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 135: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 136: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 137: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 138: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 139: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 140: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 141: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 142: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 143: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 144: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 145: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 146: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 147: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 148: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 149: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 150: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 151: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 152: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 153: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 154: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 155: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 156: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 157: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 158: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 159: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 160: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 161: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 162: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 163: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 164: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 165: $$0 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 166: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 167: $$1 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 168: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 169: $$2 ::= hexDigit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 170: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 171: $$3 ::= any128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "any* ::=", // any*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((47<<5)|0x5)/*methodCall:47*/,
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
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newWhileBlock(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanEqualTo(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 31: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNullExp(parm0);
      si.pushPb(result);
    }
    break;
    case 39: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 40: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 41: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 42: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 43: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 44: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 45: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 46: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 47: {
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
"Statement newWhileBlock(int,Exp,Statement)",
"Statement newBreak(int)",
"Statement assign(Exp,int,Exp)",
"Statement localVarDecl(Type,int,String,Exp)",
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
"Exp newThis(int)",
"Exp newTrue(int)",
"Exp newFalse(int)",
"Exp newNullExp(int)",
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
3,1,
1,1,
3,1,
4,1,
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
1,1,
1,1,
1,1,
1,1,
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
    1,
    1,
    1,
    0,
    0,
    0,
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
