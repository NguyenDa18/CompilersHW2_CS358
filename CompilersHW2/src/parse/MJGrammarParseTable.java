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
public int getEofSym() { return 120; }
public int getNttSym() { return 121; }
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
"<exp4>",
"`true",
"`false",
"`+",
"<exp3>",
"`-",
"<exp2>",
"`*",
"`/",
"`%",
"`&&",
"<cast exp>",
"<unary exp>",
"<exp1>",
"`instanceof",
"`!",
"INTLIT",
"STRINGLIT",
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
"\" \"",
"\"#\"",
"\"&\"",
"\")\"",
"\"]\"",
"\"/\"",
"\";\"",
"\"{\"",
"\"%\"",
"\"(\"",
"\"+\"",
"\"_\"",
"\"=\"",
"{0..9 11..31 \"$\" \"\'\" \",\" \".\" \":\" \"<\" \">\"..\"?\" \"\\\" \"^\" \"`\" \"|\" \"~\"..127}",
"\"@\"",
"10",
"\"}\"",
"\"!\"",
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
public int numSymbols() { return 122;}
private static final int MIN_REDUCTION = 376;
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
1,281, // <start>
2,363, // ws*
3,271, // <program>
4,73, // <class decl>+
5,265, // <class decl>
6,245, // `class
84,99, // " "
85,176, // "#"
99,34, // {10}
107,158, // ws
  }
,
{ // state 1
  }
,
{ // state 2
24,MIN_REDUCTION+58, // `[
82,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 4
84,99, // " "
99,34, // {10}
107,48, // ws
121,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 5
2,47, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 6
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 7
68,338, // "h"
  }
,
{ // state 8
7,175, // ID
16,96, // `(
31,373, // <exp>
36,151, // <exp4>
37,6, // `true
38,144, // `false
39,336, // `+
40,122, // <exp3>
41,319, // `-
42,259, // <exp2>
47,25, // <cast exp>
48,250, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
85,154, // "#"
93,262, // "("
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 9
85,347, // "#"
  }
,
{ // state 10
2,187, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 11
0x80000000|1, // match move
0x80000000|294, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
2,15, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 13
7,175, // ID
16,96, // `(
31,40, // <exp>
36,151, // <exp4>
37,6, // `true
38,144, // `false
39,336, // `+
40,122, // <exp3>
41,319, // `-
42,259, // <exp2>
47,25, // <cast exp>
48,250, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
85,154, // "#"
93,262, // "("
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 14
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 15
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 16
0x80000000|1, // match move
0x80000000|214, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 17
86,110, // "&"
  }
,
{ // state 18
55,50, // "a"
56,50, // "p"
57,50, // "v"
58,50, // "c"
59,50, // "f"
60,50, // "i"
61,50, // "l"
62,50, // "o"
63,50, // "r"
64,50, // "u"
65,50, // "x"
66,50, // "b"
67,50, // "e"
68,50, // "h"
69,50, // "n"
70,50, // "t"
71,50, // "w"
72,50, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
74,370, // {199..218 231..250}
75,370, // {193..198 225..230}
77,50, // {"1".."9"}
78,50, // "0"
80,370, // {176..185}
81,3, // any
82,50, // "["
83,50, // "-"
84,50, // " "
85,50, // "#"
86,50, // "&"
87,50, // ")"
88,50, // "]"
89,50, // "/"
90,50, // ";"
91,50, // "{"
92,50, // "%"
93,50, // "("
94,50, // "+"
95,50, // "_"
96,50, // "="
97,50, // {0..9 11..31 "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
98,50, // "@"
99,50, // {10}
100,50, // "}"
101,50, // "!"
102,50, // '"'
103,50, // "*"
104,286, // any128
105,370, // {223}
106,370, // {128..175 186..192 219..222 224 251..255}
115,354, // $$3
  }
,
{ // state 19
0x80000000|220, // match move
0x80000000|146, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 20
24,MIN_REDUCTION+57, // `[
82,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 21
2,4, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
121,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 22
16,330, // `(
93,262, // "("
  }
,
{ // state 23
57,360, // "v"
  }
,
{ // state 24
16,78, // `(
93,262, // "("
  }
,
{ // state 25
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 26
25,136, // `]
88,21, // "]"
  }
,
{ // state 27
7,24, // ID
54,283, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,59, // letter128
74,204, // {199..218 231..250}
75,204, // {193..198 225..230}
  }
,
{ // state 28
7,175, // ID
16,96, // `(
39,336, // `+
41,319, // `-
42,87, // <exp2>
47,25, // <cast exp>
48,250, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
93,262, // "("
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 29
24,MIN_REDUCTION+121, // `[
82,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 30
24,MIN_REDUCTION+126, // `[
82,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 31
70,141, // "t"
  }
,
{ // state 32
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 33
84,356, // " "
99,229, // {10}
107,131, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 34
121,MIN_REDUCTION+58, // $NT
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 35
2,174, // ws*
  }
,
{ // state 36
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 37
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 38
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 39
9,221, // <decl in class>*
10,142, // `}
12,194, // <decl in class>
13,297, // <method decl>
14,364, // `public
85,79, // "#"
100,124, // "}"
  }
,
{ // state 40
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 41
0x80000000|197, // match move
0x80000000|227, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
0x80000000|268, // match move
0x80000000|366, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 43
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 44
24,MIN_REDUCTION+50, // `[
82,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 45
28,169, // `;
90,19, // ";"
  }
,
{ // state 46
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 47
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 48
121,MIN_REDUCTION+153, // $NT
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 49
0x80000000|1, // match move
0x80000000|269, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 50
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 51
2,37, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 52
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 53
0x80000000|208, // match move
0x80000000|202, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 54
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 55
0x80000000|332, // match move
0x80000000|234, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 56
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 57
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 59
2,210, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 60
0x80000000|1, // match move
0x80000000|167, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 61
0x80000000|166, // match move
0x80000000|310, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 62
0x80000000|304, // match move
0x80000000|20, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 63
17,296, // `)
87,177, // ")"
  }
,
{ // state 64
57,360, // "v"
59,352, // "f"
60,31, // "i"
66,77, // "b"
69,185, // "n"
70,240, // "t"
71,7, // "w"
94,51, // "+"
  }
,
{ // state 65
0x80000000|1, // match move
0x80000000|33, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 66
2,56, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 67
24,MIN_REDUCTION+127, // `[
82,MIN_REDUCTION+127, // "["
84,62, // " "
99,292, // {10}
107,248, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 68
0x80000000|1, // match move
0x80000000|318, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 69
24,MIN_REDUCTION+48, // `[
82,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 71
0x80000000|343, // match move
0x80000000|251, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 72
17,137, // `)
23,273, // <empty bracket pair>
24,26, // `[
82,66, // "["
87,177, // ")"
  }
,
{ // state 73
5,328, // <class decl>
6,245, // `class
85,176, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 75
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 76
2,212, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 77
62,207, // "o"
63,116, // "r"
  }
,
{ // state 78
17,119, // `)
87,177, // ")"
  }
,
{ // state 79
56,108, // "p"
  }
,
{ // state 80
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 81
0x80000000|313, // match move
0x80000000|126, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 82
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
165, // ID
232, // `{
-1, // <decl in class>*
60, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
128, // `void
96, // `(
-1, // `)
180, // <stmt>*
260, // <type>
75, // `int
184, // `boolean
369, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
226, // <stmt>
155, // <assign>
-1, // `;
280, // <local var decl>
374, // `if
359, // <exp>
-1, // `else
22, // `while
254, // `break
-1, // `=
151, // <exp4>
6, // `true
144, // `false
336, // `+
122, // <exp3>
319, // `-
259, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
25, // <cast exp>
250, // <unary exp>
113, // <exp1>
-1, // `instanceof
201, // `!
163, // INTLIT
153, // STRINGLIT
107, // letter
157, // "a"
157, // "p"
157, // "v"
157, // "c"
157, // "f"
157, // "i"
157, // "l"
157, // "o"
157, // "r"
157, // "u"
157, // "x"
157, // "b"
157, // "e"
157, // "h"
157, // "n"
157, // "t"
157, // "w"
157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
170, // letter128
41, // {199..218 231..250}
41, // {193..198 225..230}
-1, // digit
102, // {"1".."9"}
100, // "0"
225, // digit128
55, // {176..185}
-1, // any
-1, // "["
106, // "-"
-1, // " "
64, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
312, // "{"
-1, // "%"
262, // "("
322, // "+"
-1, // "_"
-1, // "="
-1, // {0..9 11..31 "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
172, // "@"
-1, // {10}
306, // "}"
91, // "!"
104, // '"'
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
{ // state 83
2,65, // ws*
  }
,
{ // state 84
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 85
7,175, // ID
16,96, // `(
39,336, // `+
40,253, // <exp3>
41,319, // `-
42,259, // <exp2>
47,25, // <cast exp>
48,250, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
93,262, // "("
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 86
0x80000000|1, // match move
0x80000000|43, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 87
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 88
2,183, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 89
16,228, // `(
93,262, // "("
  }
,
{ // state 90
2,49, // ws*
  }
,
{ // state 91
2,235, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 92
24,MIN_REDUCTION+111, // `[
82,MIN_REDUCTION+111, // "["
84,62, // " "
99,292, // {10}
107,248, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 94
0x80000000|291, // match move
0x80000000|115, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 95
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 96
7,327, // ID
15,128, // `void
19,72, // <type>
20,75, // `int
21,184, // `boolean
22,369, // `null
54,283, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,59, // letter128
74,204, // {199..218 231..250}
75,204, // {193..198 225..230}
85,196, // "#"
  }
,
{ // state 97
28,118, // `;
90,19, // ";"
  }
,
{ // state 98
0x80000000|1, // match move
0x80000000|38, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 99
121,MIN_REDUCTION+57, // $NT
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 100
55,70, // "a"
56,70, // "p"
57,70, // "v"
58,70, // "c"
59,70, // "f"
60,70, // "i"
61,70, // "l"
62,70, // "o"
63,70, // "r"
64,70, // "u"
65,70, // "x"
66,70, // "b"
67,70, // "e"
68,70, // "h"
69,70, // "n"
70,70, // "t"
71,70, // "w"
72,70, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,159, // {193..198 225..230}
77,70, // {"1".."9"}
78,70, // "0"
80,159, // {176..185}
112,342, // hexDigit*
113,120, // $$2
118,58, // hexDigit
119,311, // hexDigit128
  }
,
{ // state 101
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 102
76,365, // digit
77,341, // {"1".."9"}
78,341, // "0"
79,114, // digit128
80,55, // {176..185}
110,160, // digit*
111,331, // $$1
  }
,
{ // state 103
2,11, // ws*
  }
,
{ // state 104
55,50, // "a"
56,50, // "p"
57,50, // "v"
58,50, // "c"
59,50, // "f"
60,50, // "i"
61,50, // "l"
62,50, // "o"
63,50, // "r"
64,50, // "u"
65,50, // "x"
66,50, // "b"
67,50, // "e"
68,50, // "h"
69,50, // "n"
70,50, // "t"
71,50, // "w"
72,50, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
74,370, // {199..218 231..250}
75,370, // {193..198 225..230}
77,50, // {"1".."9"}
78,50, // "0"
80,370, // {176..185}
81,257, // any
82,50, // "["
83,50, // "-"
84,50, // " "
85,50, // "#"
86,50, // "&"
87,50, // ")"
88,50, // "]"
89,50, // "/"
90,50, // ";"
91,50, // "{"
92,50, // "%"
93,50, // "("
94,50, // "+"
95,50, // "_"
96,50, // "="
97,50, // {0..9 11..31 "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
98,50, // "@"
99,50, // {10}
100,50, // "}"
101,50, // "!"
102,50, // '"'
103,50, // "*"
104,286, // any128
105,370, // {223}
106,370, // {128..175 186..192 219..222 224 251..255}
114,18, // any*
115,239, // $$3
  }
,
{ // state 105
54,231, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,237, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
76,293, // digit
77,341, // {"1".."9"}
78,341, // "0"
79,211, // digit128
80,55, // {176..185}
95,14, // "_"
105,81, // {223}
109,198, // $$0
116,367, // idChar
117,61, // idChar128
  }
,
{ // state 106
2,52, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 107
54,231, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,237, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
76,293, // digit
77,341, // {"1".."9"}
78,341, // "0"
79,211, // digit128
80,55, // {176..185}
95,14, // "_"
105,81, // {223}
108,105, // idChar*
109,316, // $$0
116,123, // idChar
117,61, // idChar128
  }
,
{ // state 108
64,195, // "u"
  }
,
{ // state 109
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 110
2,57, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 112
0x80000000|263, // match move
0x80000000|325, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 113
0x80000000|1, // match move
0x80000000|362, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 114
0x80000000|103, // match move
0x80000000|244, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 115
24,MIN_REDUCTION+155, // `[
82,MIN_REDUCTION+155, // "["
84,62, // " "
99,292, // {10}
107,248, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 116
2,299, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 117
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 118
0x80000000|1, // match move
0x80000000|179, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 119
8,279, // `{
91,312, // "{"
  }
,
{ // state 120
0x80000000|1, // match move
0x80000000|30, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
0x80000000|1, // match move
0x80000000|29, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 122
41,274, // `-
43,314, // `*
44,199, // `/
45,213, // `%
46,28, // `&&
50,290, // `instanceof
83,106, // "-"
85,278, // "#"
89,12, // "/"
92,152, // "%"
98,17, // "@"
103,255, // "*"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 124
2,236, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 125
24,MIN_REDUCTION+138, // `[
82,MIN_REDUCTION+138, // "["
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 126
24,MIN_REDUCTION+136, // `[
82,MIN_REDUCTION+136, // "["
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 127
24,MIN_REDUCTION+135, // `[
82,MIN_REDUCTION+135, // "["
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 129
0x80000000|1, // match move
0x80000000|67, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 130
9,358, // <decl in class>*
10,54, // `}
12,194, // <decl in class>
13,297, // <method decl>
14,364, // `public
85,79, // "#"
100,124, // "}"
  }
,
{ // state 131
0x80000000|1, // match move
0x80000000|333, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 132
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 134
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
165, // ID
232, // `{
-1, // <decl in class>*
182, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
128, // `void
96, // `(
-1, // `)
-1, // <stmt>*
260, // <type>
75, // `int
184, // `boolean
369, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
109, // <stmt>
155, // <assign>
-1, // `;
280, // <local var decl>
374, // `if
359, // <exp>
-1, // `else
22, // `while
254, // `break
-1, // `=
151, // <exp4>
6, // `true
144, // `false
336, // `+
122, // <exp3>
319, // `-
259, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
25, // <cast exp>
250, // <unary exp>
113, // <exp1>
-1, // `instanceof
201, // `!
163, // INTLIT
153, // STRINGLIT
107, // letter
157, // "a"
157, // "p"
157, // "v"
157, // "c"
157, // "f"
157, // "i"
157, // "l"
157, // "o"
157, // "r"
157, // "u"
157, // "x"
157, // "b"
157, // "e"
157, // "h"
157, // "n"
157, // "t"
157, // "w"
157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
170, // letter128
41, // {199..218 231..250}
41, // {193..198 225..230}
-1, // digit
102, // {"1".."9"}
100, // "0"
225, // digit128
55, // {176..185}
-1, // any
-1, // "["
106, // "-"
-1, // " "
64, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
312, // "{"
-1, // "%"
262, // "("
322, // "+"
-1, // "_"
-1, // "="
-1, // {0..9 11..31 "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
172, // "@"
-1, // {10}
124, // "}"
91, // "!"
104, // '"'
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
{ // state 135
17,361, // `)
87,177, // ")"
  }
,
{ // state 136
121,MIN_REDUCTION+17, // $NT
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 137
7,175, // ID
16,96, // `(
47,117, // <cast exp>
49,16, // <exp1>
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
93,262, // "("
98,172, // "@"
102,104, // '"'
  }
,
{ // state 138
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
165, // ID
82, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
128, // `void
96, // `(
-1, // `)
-1, // <stmt>*
260, // <type>
75, // `int
184, // `boolean
369, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
329, // <stmt>
45, // <assign>
-1, // `;
267, // <local var decl>
374, // `if
359, // <exp>
-1, // `else
89, // `while
97, // `break
-1, // `=
151, // <exp4>
6, // `true
144, // `false
336, // `+
122, // <exp3>
319, // `-
259, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
25, // <cast exp>
250, // <unary exp>
113, // <exp1>
-1, // `instanceof
201, // `!
163, // INTLIT
153, // STRINGLIT
107, // letter
157, // "a"
157, // "p"
157, // "v"
157, // "c"
157, // "f"
157, // "i"
157, // "l"
157, // "o"
157, // "r"
157, // "u"
157, // "x"
157, // "b"
157, // "e"
157, // "h"
157, // "n"
157, // "t"
157, // "w"
157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
170, // letter128
41, // {199..218 231..250}
41, // {193..198 225..230}
-1, // digit
102, // {"1".."9"}
100, // "0"
225, // digit128
55, // {176..185}
-1, // any
-1, // "["
106, // "-"
-1, // " "
64, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
312, // "{"
-1, // "%"
262, // "("
322, // "+"
-1, // "_"
-1, // "="
-1, // {0..9 11..31 "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
172, // "@"
-1, // {10}
-1, // "}"
91, // "!"
104, // '"'
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
{ // state 139
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 140
84,99, // " "
99,34, // {10}
107,48, // ws
121,MIN_REDUCTION+73, // $NT
  }
,
{ // state 141
2,84, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 143
61,10, // "l"
  }
,
{ // state 144
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 145
2,241, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 146
2,186, // ws*
84,356, // " "
99,229, // {10}
107,68, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 148
2,192, // ws*
24,MIN_REDUCTION+160, // `[
82,MIN_REDUCTION+160, // "["
84,62, // " "
99,292, // {10}
107,112, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 149
54,231, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,256, // letter128
74,204, // {199..218 231..250}
75,204, // {193..198 225..230}
76,293, // digit
77,341, // {"1".."9"}
78,341, // "0"
79,133, // digit128
80,193, // {176..185}
95,14, // "_"
105,298, // {223}
109,93, // $$0
116,367, // idChar
117,349, // idChar128
  }
,
{ // state 150
8,39, // `{
11,317, // `extends
85,321, // "#"
91,312, // "{"
  }
,
{ // state 151
39,85, // `+
94,322, // "+"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 152
2,246, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 153
0x80000000|1, // match move
0x80000000|44, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 154
59,352, // "f"
70,240, // "t"
  }
,
{ // state 155
28,46, // `;
90,88, // ";"
  }
,
{ // state 156
24,MIN_REDUCTION+130, // `[
82,MIN_REDUCTION+130, // "["
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 158
121,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 159
0x80000000|168, // match move
0x80000000|125, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 160
76,80, // digit
77,341, // {"1".."9"}
78,341, // "0"
79,114, // digit128
80,55, // {176..185}
111,121, // $$1
  }
,
{ // state 161
0x80000000|1, // match move
0x80000000|69, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 162
7,175, // ID
16,96, // `(
31,324, // <exp>
36,151, // <exp4>
37,6, // `true
38,144, // `false
39,336, // `+
40,122, // <exp3>
41,319, // `-
42,259, // <exp2>
47,25, // <cast exp>
48,250, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
85,154, // "#"
93,262, // "("
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 163
0x80000000|1, // match move
0x80000000|334, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 164
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 165
0x80000000|372, // match move
0x80000000|289, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 166
2,94, // ws*
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 169
0x80000000|1, // match move
0x80000000|32, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 170
0x80000000|368, // match move
0x80000000|339, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 171
2,174, // ws*
24,MIN_REDUCTION+162, // `[
82,MIN_REDUCTION+162, // "["
84,62, // " "
99,292, // {10}
107,112, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 172
102,71, // '"'
  }
,
{ // state 173
2,192, // ws*
  }
,
{ // state 174
0x80000000|1, // match move
0x80000000|209, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 175
0x80000000|1, // match move
0x80000000|315, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 176
58,143, // "c"
  }
,
{ // state 177
2,252, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 178
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 180
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
165, // ID
232, // `{
-1, // <decl in class>*
86, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
128, // `void
96, // `(
-1, // `)
-1, // <stmt>*
260, // <type>
75, // `int
184, // `boolean
369, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
109, // <stmt>
155, // <assign>
-1, // `;
280, // <local var decl>
374, // `if
359, // <exp>
-1, // `else
22, // `while
254, // `break
-1, // `=
151, // <exp4>
6, // `true
144, // `false
336, // `+
122, // <exp3>
319, // `-
259, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
25, // <cast exp>
250, // <unary exp>
113, // <exp1>
-1, // `instanceof
201, // `!
163, // INTLIT
153, // STRINGLIT
107, // letter
157, // "a"
157, // "p"
157, // "v"
157, // "c"
157, // "f"
157, // "i"
157, // "l"
157, // "o"
157, // "r"
157, // "u"
157, // "x"
157, // "b"
157, // "e"
157, // "h"
157, // "n"
157, // "t"
157, // "w"
157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
170, // letter128
41, // {199..218 231..250}
41, // {193..198 225..230}
-1, // digit
102, // {"1".."9"}
100, // "0"
225, // digit128
55, // {176..185}
-1, // any
-1, // "["
106, // "-"
-1, // " "
64, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
312, // "{"
-1, // "%"
262, // "("
322, // "+"
-1, // "_"
-1, // "="
-1, // {0..9 11..31 "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
172, // "@"
-1, // {10}
306, // "}"
91, // "!"
104, // '"'
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
{ // state 181
24,26, // `[
82,66, // "["
  }
,
{ // state 182
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 183
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 185
64,145, // "u"
  }
,
{ // state 186
0x80000000|1, // match move
0x80000000|258, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 187
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 189
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 190
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 191
2,49, // ws*
24,MIN_REDUCTION+124, // `[
82,MIN_REDUCTION+124, // "["
84,62, // " "
99,292, // {10}
107,112, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 192
0x80000000|1, // match move
0x80000000|249, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 193
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 195
2,272, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 196
57,360, // "v"
60,31, // "i"
66,357, // "b"
69,185, // "n"
  }
,
{ // state 197
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 198
0x80000000|147, // match move
0x80000000|206, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 199
7,175, // ID
16,96, // `(
39,336, // `+
41,319, // `-
42,188, // <exp2>
47,25, // <cast exp>
48,250, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
93,262, // "("
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 200
24,MIN_REDUCTION+153, // `[
82,MIN_REDUCTION+153, // "["
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 201
7,175, // ID
39,336, // `+
41,319, // `-
48,189, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 202
24,MIN_REDUCTION+117, // `[
82,MIN_REDUCTION+117, // "["
84,62, // " "
99,292, // {10}
107,248, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 203
2,276, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 204
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 205
35,8, // `=
96,76, // "="
  }
,
{ // state 206
24,MIN_REDUCTION+119, // `[
82,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 207
2,101, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 208
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 209
24,MIN_REDUCTION+161, // `[
82,MIN_REDUCTION+161, // "["
84,62, // " "
99,292, // {10}
107,248, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 210
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 211
0x80000000|74, // match move
0x80000000|127, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 212
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 213
7,175, // ID
16,96, // `(
39,336, // `+
41,319, // `-
42,230, // <exp2>
47,25, // <cast exp>
48,250, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
93,262, // "("
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 214
24,224, // `[
82,66, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 215
23,273, // <empty bracket pair>
24,26, // `[
82,66, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 216
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 217
2,282, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 218
0x80000000|1, // match move
0x80000000|139, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 219
24,MIN_REDUCTION+122, // `[
82,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 220
2,186, // ws*
  }
,
{ // state 221
10,36, // `}
12,337, // <decl in class>
13,297, // <method decl>
14,364, // `public
85,79, // "#"
100,124, // "}"
  }
,
{ // state 222
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 223
2,65, // ws*
84,356, // " "
99,229, // {10}
107,68, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 224
7,175, // ID
16,96, // `(
31,288, // <exp>
36,151, // <exp4>
37,6, // `true
38,144, // `false
39,336, // `+
40,122, // <exp3>
41,319, // `-
42,259, // <exp2>
47,25, // <cast exp>
48,250, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
85,154, // "#"
93,262, // "("
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 225
0x80000000|90, // match move
0x80000000|191, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 226
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 227
24,MIN_REDUCTION+52, // `[
82,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 228
7,175, // ID
16,96, // `(
31,63, // <exp>
36,151, // <exp4>
37,6, // `true
38,144, // `false
39,336, // `+
40,122, // <exp3>
41,319, // `-
42,259, // <exp2>
47,25, // <cast exp>
48,250, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
85,154, // "#"
93,262, // "("
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 229
0x80000000|1, // match move
0x80000000|285, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 230
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 232
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
165, // ID
232, // `{
-1, // <decl in class>*
216, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
128, // `void
96, // `(
-1, // `)
134, // <stmt>*
260, // <type>
75, // `int
184, // `boolean
369, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
226, // <stmt>
155, // <assign>
-1, // `;
280, // <local var decl>
374, // `if
359, // <exp>
-1, // `else
22, // `while
254, // `break
-1, // `=
151, // <exp4>
6, // `true
144, // `false
336, // `+
122, // <exp3>
319, // `-
259, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
25, // <cast exp>
250, // <unary exp>
113, // <exp1>
-1, // `instanceof
201, // `!
163, // INTLIT
153, // STRINGLIT
107, // letter
157, // "a"
157, // "p"
157, // "v"
157, // "c"
157, // "f"
157, // "i"
157, // "l"
157, // "o"
157, // "r"
157, // "u"
157, // "x"
157, // "b"
157, // "e"
157, // "h"
157, // "n"
157, // "t"
157, // "w"
157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
170, // letter128
41, // {199..218 231..250}
41, // {193..198 225..230}
-1, // digit
102, // {"1".."9"}
100, // "0"
225, // digit128
55, // {176..185}
-1, // any
-1, // "["
106, // "-"
-1, // " "
64, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
312, // "{"
-1, // "%"
262, // "("
322, // "+"
-1, // "_"
-1, // "="
-1, // {0..9 11..31 "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
172, // "@"
-1, // {10}
124, // "}"
91, // "!"
104, // '"'
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
{ // state 233
2,275, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 234
24,MIN_REDUCTION+54, // `[
82,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 235
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 236
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 237
0x80000000|95, // match move
0x80000000|355, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 238
2,140, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
121,MIN_REDUCTION+74, // $NT
  }
,
{ // state 239
0x80000000|1, // match move
0x80000000|156, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 240
63,217, // "r"
  }
,
{ // state 241
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 243
24,MIN_REDUCTION+120, // `[
82,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 244
2,11, // ws*
24,MIN_REDUCTION+158, // `[
82,MIN_REDUCTION+158, // "["
84,62, // " "
99,292, // {10}
107,112, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 245
7,150, // ID
54,283, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,59, // letter128
74,204, // {199..218 231..250}
75,204, // {193..198 225..230}
  }
,
{ // state 246
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 247
24,MIN_REDUCTION+129, // `[
82,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 248
0x80000000|302, // match move
0x80000000|200, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 249
24,MIN_REDUCTION+159, // `[
82,MIN_REDUCTION+159, // "["
84,62, // " "
99,292, // {10}
107,248, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 251
2,129, // ws*
24,MIN_REDUCTION+128, // `[
82,MIN_REDUCTION+128, // "["
84,62, // " "
99,292, // {10}
107,112, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 252
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 253
41,274, // `-
43,314, // `*
44,199, // `/
45,213, // `%
46,28, // `&&
50,290, // `instanceof
83,106, // "-"
85,278, // "#"
89,12, // "/"
92,152, // "%"
98,17, // "@"
103,255, // "*"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 254
28,190, // `;
90,88, // ";"
  }
,
{ // state 255
2,132, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 256
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 257
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 258
84,356, // " "
99,229, // {10}
107,131, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 260
7,205, // ID
23,273, // <empty bracket pair>
24,26, // `[
54,283, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,59, // letter128
74,204, // {199..218 231..250}
75,204, // {193..198 225..230}
82,66, // "["
  }
,
{ // state 261
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 262
2,309, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 263
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 264
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 265
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 266
0x80000000|1, // match move
0x80000000|284, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 267
28,218, // `;
90,19, // ";"
  }
,
{ // state 268
2,305, // ws*
  }
,
{ // state 269
24,MIN_REDUCTION+123, // `[
82,MIN_REDUCTION+123, // "["
84,62, // " "
99,292, // {10}
107,248, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 270
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 271
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 272
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 273
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 274
7,175, // ID
16,96, // `(
39,336, // `+
41,319, // `-
42,307, // <exp2>
47,25, // <cast exp>
48,250, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
93,262, // "("
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 275
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 276
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 277
84,MIN_REDUCTION+57, // " "
99,MIN_REDUCTION+57, // {10}
107,MIN_REDUCTION+57, // ws
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 278
60,303, // "i"
  }
,
{ // state 279
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
165, // ID
232, // `{
-1, // <decl in class>*
242, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
128, // `void
96, // `(
-1, // `)
351, // <stmt>*
260, // <type>
75, // `int
184, // `boolean
369, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
226, // <stmt>
155, // <assign>
-1, // `;
280, // <local var decl>
374, // `if
359, // <exp>
-1, // `else
22, // `while
254, // `break
-1, // `=
151, // <exp4>
6, // `true
144, // `false
336, // `+
122, // <exp3>
319, // `-
259, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
25, // <cast exp>
250, // <unary exp>
113, // <exp1>
-1, // `instanceof
201, // `!
163, // INTLIT
153, // STRINGLIT
107, // letter
157, // "a"
157, // "p"
157, // "v"
157, // "c"
157, // "f"
157, // "i"
157, // "l"
157, // "o"
157, // "r"
157, // "u"
157, // "x"
157, // "b"
157, // "e"
157, // "h"
157, // "n"
157, // "t"
157, // "w"
157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
170, // letter128
41, // {199..218 231..250}
41, // {193..198 225..230}
-1, // digit
102, // {"1".."9"}
100, // "0"
225, // digit128
55, // {176..185}
-1, // any
-1, // "["
106, // "-"
-1, // " "
64, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
312, // "{"
-1, // "%"
262, // "("
322, // "+"
-1, // "_"
-1, // "="
-1, // {0..9 11..31 "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
172, // "@"
-1, // {10}
124, // "}"
91, // "!"
104, // '"'
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
{ // state 280
28,345, // `;
90,88, // ";"
  }
,
{ // state 281
120,MIN_REDUCTION+0, // $
  }
,
{ // state 282
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 283
54,231, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,256, // letter128
74,204, // {199..218 231..250}
75,204, // {193..198 225..230}
76,293, // digit
77,341, // {"1".."9"}
78,341, // "0"
79,133, // digit128
80,193, // {176..185}
95,14, // "_"
105,298, // {223}
108,149, // idChar*
109,264, // $$0
116,123, // idChar
117,349, // idChar128
  }
,
{ // state 284
24,MIN_REDUCTION+125, // `[
82,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 285
84,MIN_REDUCTION+58, // " "
99,MIN_REDUCTION+58, // {10}
107,MIN_REDUCTION+58, // ws
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 286
0x80000000|35, // match move
0x80000000|171, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 287
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 288
25,161, // `]
88,42, // "]"
  }
,
{ // state 289
24,MIN_REDUCTION+47, // `[
35,MIN_REDUCTION+47, // `=
39,MIN_REDUCTION+47, // `+
41,MIN_REDUCTION+47, // `-
43,MIN_REDUCTION+47, // `*
44,MIN_REDUCTION+47, // `/
45,MIN_REDUCTION+47, // `%
46,MIN_REDUCTION+47, // `&&
50,MIN_REDUCTION+47, // `instanceof
82,MIN_REDUCTION+47, // "["
83,MIN_REDUCTION+47, // "-"
85,MIN_REDUCTION+47, // "#"
89,MIN_REDUCTION+47, // "/"
92,MIN_REDUCTION+47, // "%"
94,MIN_REDUCTION+47, // "+"
96,MIN_REDUCTION+47, // "="
98,MIN_REDUCTION+47, // "@"
103,MIN_REDUCTION+47, // "*"
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 290
7,327, // ID
15,128, // `void
19,215, // <type>
20,75, // `int
21,184, // `boolean
22,369, // `null
54,283, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,59, // letter128
74,204, // {199..218 231..250}
75,204, // {193..198 225..230}
85,196, // "#"
  }
,
{ // state 291
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 292
0x80000000|308, // match move
0x80000000|2, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 293
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 294
24,MIN_REDUCTION+157, // `[
82,MIN_REDUCTION+157, // "["
84,62, // " "
99,292, // {10}
107,248, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 295
2,340, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 296
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
165, // ID
82, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
128, // `void
96, // `(
-1, // `)
-1, // <stmt>*
260, // <type>
75, // `int
184, // `boolean
369, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
98, // <stmt>
45, // <assign>
-1, // `;
267, // <local var decl>
374, // `if
359, // <exp>
-1, // `else
89, // `while
97, // `break
-1, // `=
151, // <exp4>
6, // `true
144, // `false
336, // `+
122, // <exp3>
319, // `-
259, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
25, // <cast exp>
250, // <unary exp>
113, // <exp1>
-1, // `instanceof
201, // `!
163, // INTLIT
153, // STRINGLIT
107, // letter
157, // "a"
157, // "p"
157, // "v"
157, // "c"
157, // "f"
157, // "i"
157, // "l"
157, // "o"
157, // "r"
157, // "u"
157, // "x"
157, // "b"
157, // "e"
157, // "h"
157, // "n"
157, // "t"
157, // "w"
157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
170, // letter128
41, // {199..218 231..250}
41, // {193..198 225..230}
-1, // digit
102, // {"1".."9"}
100, // "0"
225, // digit128
55, // {176..185}
-1, // any
-1, // "["
106, // "-"
-1, // " "
64, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
312, // "{"
-1, // "%"
262, // "("
322, // "+"
-1, // "_"
-1, // "="
-1, // {0..9 11..31 "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
172, // "@"
-1, // {10}
-1, // "}"
91, // "!"
104, // '"'
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
{ // state 297
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 298
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 299
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 300
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 301
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 302
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 303
69,5, // "n"
  }
,
{ // state 304
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 305
0x80000000|1, // match move
0x80000000|92, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 306
0x80000000|83, // match move
0x80000000|223, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 307
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 308
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 309
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 310
2,94, // ws*
24,MIN_REDUCTION+156, // `[
82,MIN_REDUCTION+156, // "["
84,62, // " "
99,292, // {10}
107,112, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 311
0x80000000|173, // match move
0x80000000|148, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 312
2,346, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 313
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 314
7,175, // ID
16,96, // `(
39,336, // `+
41,319, // `-
42,348, // <exp2>
47,25, // <cast exp>
48,250, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
93,262, // "("
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 315
24,MIN_REDUCTION+47, // `[
82,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 316
0x80000000|222, // match move
0x80000000|243, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 317
7,353, // ID
54,283, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,59, // letter128
74,204, // {199..218 231..250}
75,204, // {193..198 225..230}
  }
,
{ // state 318
84,MIN_REDUCTION+154, // " "
99,MIN_REDUCTION+154, // {10}
107,MIN_REDUCTION+154, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 319
7,175, // ID
39,336, // `+
41,319, // `-
48,300, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 320
24,MIN_REDUCTION+56, // `[
82,MIN_REDUCTION+56, // "["
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 321
67,350, // "e"
  }
,
{ // state 322
2,178, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 323
61,238, // "l"
  }
,
{ // state 324
17,138, // `)
87,177, // ")"
  }
,
{ // state 325
24,MIN_REDUCTION+154, // `[
82,MIN_REDUCTION+154, // "["
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 326
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 327
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 328
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 329
0x80000000|1, // match move
0x80000000|287, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 330
7,175, // ID
16,96, // `(
31,135, // <exp>
36,151, // <exp4>
37,6, // `true
38,144, // `false
39,336, // `+
40,122, // <exp3>
41,319, // `-
42,259, // <exp2>
47,25, // <cast exp>
48,250, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
85,154, // "#"
93,262, // "("
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 331
0x80000000|1, // match move
0x80000000|219, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 332
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 333
84,MIN_REDUCTION+153, // " "
99,MIN_REDUCTION+153, // {10}
107,MIN_REDUCTION+153, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 334
24,MIN_REDUCTION+49, // `[
82,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 335
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 336
7,175, // ID
39,336, // `+
41,319, // `-
48,344, // <unary exp>
49,113, // <exp1>
51,201, // `!
52,163, // INTLIT
53,153, // STRINGLIT
54,107, // letter
55,157, // "a"
56,157, // "p"
57,157, // "v"
58,157, // "c"
59,157, // "f"
60,157, // "i"
61,157, // "l"
62,157, // "o"
63,157, // "r"
64,157, // "u"
65,157, // "x"
66,157, // "b"
67,157, // "e"
68,157, // "h"
69,157, // "n"
70,157, // "t"
71,157, // "w"
72,157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
73,170, // letter128
74,41, // {199..218 231..250}
75,41, // {193..198 225..230}
77,102, // {"1".."9"}
78,100, // "0"
79,225, // digit128
80,55, // {176..185}
83,106, // "-"
94,322, // "+"
98,172, // "@"
101,91, // "!"
102,104, // '"'
  }
,
{ // state 337
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 338
2,164, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 339
2,53, // ws*
24,MIN_REDUCTION+118, // `[
82,MIN_REDUCTION+118, // "["
84,62, // " "
99,292, // {10}
107,112, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 340
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 342
55,70, // "a"
56,70, // "p"
57,70, // "v"
58,70, // "c"
59,70, // "f"
60,70, // "i"
61,70, // "l"
62,70, // "o"
63,70, // "r"
64,70, // "u"
65,70, // "x"
66,70, // "b"
67,70, // "e"
68,70, // "h"
69,70, // "n"
70,70, // "t"
71,70, // "w"
72,70, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
75,159, // {193..198 225..230}
77,70, // {"1".."9"}
78,70, // "0"
80,159, // {176..185}
113,266, // $$2
118,335, // hexDigit
119,311, // hexDigit128
  }
,
{ // state 343
2,129, // ws*
  }
,
{ // state 344
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 345
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 346
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 347
67,323, // "e"
  }
,
{ // state 348
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 349
2,371, // ws*
84,99, // " "
99,34, // {10}
107,158, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 350
65,233, // "x"
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
165, // ID
232, // `{
-1, // <decl in class>*
301, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
128, // `void
96, // `(
-1, // `)
-1, // <stmt>*
260, // <type>
75, // `int
184, // `boolean
369, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
109, // <stmt>
155, // <assign>
-1, // `;
280, // <local var decl>
374, // `if
359, // <exp>
-1, // `else
22, // `while
254, // `break
-1, // `=
151, // <exp4>
6, // `true
144, // `false
336, // `+
122, // <exp3>
319, // `-
259, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
25, // <cast exp>
250, // <unary exp>
113, // <exp1>
-1, // `instanceof
201, // `!
163, // INTLIT
153, // STRINGLIT
107, // letter
157, // "a"
157, // "p"
157, // "v"
157, // "c"
157, // "f"
157, // "i"
157, // "l"
157, // "o"
157, // "r"
157, // "u"
157, // "x"
157, // "b"
157, // "e"
157, // "h"
157, // "n"
157, // "t"
157, // "w"
157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
170, // letter128
41, // {199..218 231..250}
41, // {193..198 225..230}
-1, // digit
102, // {"1".."9"}
100, // "0"
225, // digit128
55, // {176..185}
-1, // any
-1, // "["
106, // "-"
-1, // " "
64, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
312, // "{"
-1, // "%"
262, // "("
322, // "+"
-1, // "_"
-1, // "="
-1, // {0..9 11..31 "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
172, // "@"
-1, // {10}
124, // "}"
91, // "!"
104, // '"'
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
{ // state 352
55,203, // "a"
  }
,
{ // state 353
8,130, // `{
91,312, // "{"
  }
,
{ // state 354
0x80000000|1, // match move
0x80000000|247, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 355
24,MIN_REDUCTION+134, // `[
82,MIN_REDUCTION+134, // "["
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 356
0x80000000|1, // match move
0x80000000|277, // no-match move
0x80000000|9, // NT-test-match state for `else
  }
,
{ // state 357
62,207, // "o"
  }
,
{ // state 358
10,326, // `}
12,337, // <decl in class>
13,297, // <method decl>
14,364, // `public
85,79, // "#"
100,124, // "}"
  }
,
{ // state 359
35,13, // `=
96,76, // "="
  }
,
{ // state 360
62,295, // "o"
  }
,
{ // state 361
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
165, // ID
232, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
128, // `void
96, // `(
-1, // `)
-1, // <stmt>*
260, // <type>
75, // `int
184, // `boolean
369, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
270, // <stmt>
155, // <assign>
-1, // `;
280, // <local var decl>
374, // `if
359, // <exp>
-1, // `else
22, // `while
254, // `break
-1, // `=
151, // <exp4>
6, // `true
144, // `false
336, // `+
122, // <exp3>
319, // `-
259, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
25, // <cast exp>
250, // <unary exp>
113, // <exp1>
-1, // `instanceof
201, // `!
163, // INTLIT
153, // STRINGLIT
107, // letter
157, // "a"
157, // "p"
157, // "v"
157, // "c"
157, // "f"
157, // "i"
157, // "l"
157, // "o"
157, // "r"
157, // "u"
157, // "x"
157, // "b"
157, // "e"
157, // "h"
157, // "n"
157, // "t"
157, // "w"
157, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
170, // letter128
41, // {199..218 231..250}
41, // {193..198 225..230}
-1, // digit
102, // {"1".."9"}
100, // "0"
225, // digit128
55, // {176..185}
-1, // any
-1, // "["
106, // "-"
-1, // " "
64, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
312, // "{"
-1, // "%"
262, // "("
322, // "+"
-1, // "_"
-1, // "="
-1, // {0..9 11..31 "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
172, // "@"
-1, // {10}
-1, // "}"
91, // "!"
104, // '"'
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
{ // state 362
24,224, // `[
82,66, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 363
3,261, // <program>
4,73, // <class decl>+
5,265, // <class decl>
6,245, // `class
84,99, // " "
85,176, // "#"
99,34, // {10}
107,48, // ws
  }
,
{ // state 364
15,27, // `void
85,23, // "#"
  }
,
{ // state 365
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 366
2,305, // ws*
24,MIN_REDUCTION+112, // `[
82,MIN_REDUCTION+112, // "["
84,62, // " "
99,292, // {10}
107,112, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 368
2,53, // ws*
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 369
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 370
0x80000000|111, // match move
0x80000000|320, // no-match move
0x80000000|181, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 371
84,99, // " "
99,34, // {10}
107,48, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 372
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 373
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 374
16,162, // `(
93,262, // "("
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[375][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
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
// <stmt> ::= `while `( <exp> `) <stmt>
(26<<16)+5,
// <stmt> ::= `break `;
(26<<16)+2,
// <assign> ::= <exp> `= <exp>
(27<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(29<<16)+4,
// <exp> ::= <exp4>
(31<<16)+1,
// <exp4> ::= `true
(36<<16)+1,
// <exp4> ::= `false
(36<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(36<<16)+3,
// <exp3> ::= <exp3> `- <exp2>
(40<<16)+3,
// <exp4> ::= <exp3>
(36<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(40<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(40<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(40<<16)+3,
// <exp3> ::= <exp3> `&& <exp2>
(40<<16)+3,
// <exp3> ::= <exp2>
(40<<16)+1,
// <exp2> ::= <cast exp>
(42<<16)+1,
// <exp2> ::= <unary exp>
(42<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(47<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(47<<16)+4,
// <exp3> ::= <exp3> `instanceof <type>
(40<<16)+3,
// <unary exp> ::= `+ <unary exp>
(48<<16)+2,
// <unary exp> ::= `- <unary exp>
(48<<16)+2,
// <unary exp> ::= `! <unary exp>
(48<<16)+2,
// <unary exp> ::= <exp1>
(48<<16)+1,
// <exp1> ::= ID
(49<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(49<<16)+4,
// <exp1> ::= INTLIT
(49<<16)+1,
// <exp1> ::= STRINGLIT
(49<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(54<<16)+1,
// letter128 ::= {193..218 225..250}
(73<<16)+1,
// digit ::= {"0".."9"}
(76<<16)+1,
// digit128 ::= {176..185}
(79<<16)+1,
// any ::= {0..127}
(81<<16)+1,
// any128 ::= {128..255}
(104<<16)+1,
// ws ::= " "
(107<<16)+1,
// ws ::= {10}
(107<<16)+1,
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
// `false ::= "#" "f" "a" ws*
(38<<16)+4,
// `false ::= "#" "f" "a"
(38<<16)+3,
// `true ::= "#" "t" "r" ws*
(37<<16)+4,
// `true ::= "#" "t" "r"
(37<<16)+3,
// `null ::= "#" "n" "u" ws*
(22<<16)+4,
// `null ::= "#" "n" "u"
(22<<16)+3,
// `instanceof ::= "#" "i" "n" ws*
(50<<16)+4,
// `instanceof ::= "#" "i" "n"
(50<<16)+3,
// `public ::= "#" "p" "u" ws*
(14<<16)+4,
// `public ::= "#" "p" "u"
(14<<16)+3,
// `! ::= "!" ws*
(51<<16)+2,
// `! ::= "!"
(51<<16)+1,
// `% ::= "%" ws*
(45<<16)+2,
// `% ::= "%"
(45<<16)+1,
// `&& ::= "@" "&" ws*
(46<<16)+3,
// `&& ::= "@" "&"
(46<<16)+2,
// `* ::= "*" ws*
(43<<16)+2,
// `* ::= "*"
(43<<16)+1,
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
(41<<16)+2,
// `- ::= "-"
(41<<16)+1,
// `+ ::= "+" ws*
(39<<16)+2,
// `+ ::= "+"
(39<<16)+1,
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
// `; ::= ";" ws*
(28<<16)+2,
// `; ::= ";"
(28<<16)+1,
// `/ ::= "/" ws*
(44<<16)+2,
// `/ ::= "/"
(44<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(52<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(52<<16)+2,
// INTLIT ::= digit128 ws*
(52<<16)+2,
// INTLIT ::= digit128
(52<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(52<<16)+3,
// INTLIT ::= "0" $$2
(52<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(53<<16)+3,
// STRINGLIT ::= "@" '"'
(53<<16)+2,
// STRINGLIT ::= '"' any* $$3
(53<<16)+3,
// STRINGLIT ::= '"' $$3
(53<<16)+2,
// idChar ::= letter
(116<<16)+1,
// idChar ::= digit
(116<<16)+1,
// idChar ::= "_"
(116<<16)+1,
// idChar128 ::= letter128
(117<<16)+1,
// idChar128 ::= digit128
(117<<16)+1,
// idChar128 ::= {223}
(117<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(118<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(119<<16)+1,
// digit* ::= digit* digit
(110<<16)+2,
// digit* ::= digit
(110<<16)+1,
// any* ::= any* any
(114<<16)+2,
// any* ::= any
(114<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(112<<16)+2,
// hexDigit* ::= hexDigit
(112<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// idChar* ::= idChar* idChar
(108<<16)+2,
// idChar* ::= idChar
(108<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(109<<16)+2,
// $$0 ::= idChar128
(109<<16)+1,
// $$1 ::= digit128 ws*
(111<<16)+2,
// $$1 ::= digit128
(111<<16)+1,
// $$2 ::= hexDigit128 ws*
(113<<16)+2,
// $$2 ::= hexDigit128
(113<<16)+1,
// $$3 ::= any128 ws*
(115<<16)+2,
// $$3 ::= any128
(115<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
97, // 0
97, // 1
97, // 2
97, // 3
97, // 4
97, // 5
97, // 6
97, // 7
97, // 8
97, // 9
99, // 10
97, // 11
97, // 12
97, // 13
97, // 14
97, // 15
97, // 16
97, // 17
97, // 18
97, // 19
97, // 20
97, // 21
97, // 22
97, // 23
97, // 24
97, // 25
97, // 26
97, // 27
97, // 28
97, // 29
97, // 30
97, // 31
84, // " "
101, // "!"
102, // '"'
85, // "#"
97, // "$"
92, // "%"
86, // "&"
97, // "'"
93, // "("
87, // ")"
103, // "*"
94, // "+"
97, // ","
83, // "-"
97, // "."
89, // "/"
78, // "0"
77, // "1"
77, // "2"
77, // "3"
77, // "4"
77, // "5"
77, // "6"
77, // "7"
77, // "8"
77, // "9"
97, // ":"
90, // ";"
97, // "<"
96, // "="
97, // ">"
97, // "?"
98, // "@"
72, // "A"
72, // "B"
72, // "C"
72, // "D"
72, // "E"
72, // "F"
72, // "G"
72, // "H"
72, // "I"
72, // "J"
72, // "K"
72, // "L"
72, // "M"
72, // "N"
72, // "O"
72, // "P"
72, // "Q"
72, // "R"
72, // "S"
72, // "T"
72, // "U"
72, // "V"
72, // "W"
72, // "X"
72, // "Y"
72, // "Z"
82, // "["
97, // "\"
88, // "]"
97, // "^"
95, // "_"
97, // "`"
55, // "a"
66, // "b"
58, // "c"
72, // "d"
67, // "e"
59, // "f"
72, // "g"
68, // "h"
60, // "i"
72, // "j"
72, // "k"
61, // "l"
72, // "m"
69, // "n"
62, // "o"
56, // "p"
72, // "q"
63, // "r"
72, // "s"
70, // "t"
64, // "u"
57, // "v"
71, // "w"
65, // "x"
72, // "y"
72, // "z"
91, // "{"
97, // "|"
100, // "}"
97, // "~"
97, // 127
106, // 128
106, // 129
106, // 130
106, // 131
106, // 132
106, // 133
106, // 134
106, // 135
106, // 136
106, // 137
106, // 138
106, // 139
106, // 140
106, // 141
106, // 142
106, // 143
106, // 144
106, // 145
106, // 146
106, // 147
106, // 148
106, // 149
106, // 150
106, // 151
106, // 152
106, // 153
106, // 154
106, // 155
106, // 156
106, // 157
106, // 158
106, // 159
106, // 160
106, // 161
106, // 162
106, // 163
106, // 164
106, // 165
106, // 166
106, // 167
106, // 168
106, // 169
106, // 170
106, // 171
106, // 172
106, // 173
106, // 174
106, // 175
80, // 176
80, // 177
80, // 178
80, // 179
80, // 180
80, // 181
80, // 182
80, // 183
80, // 184
80, // 185
106, // 186
106, // 187
106, // 188
106, // 189
106, // 190
106, // 191
106, // 192
75, // 193
75, // 194
75, // 195
75, // 196
75, // 197
75, // 198
74, // 199
74, // 200
74, // 201
74, // 202
74, // 203
74, // 204
74, // 205
74, // 206
74, // 207
74, // 208
74, // 209
74, // 210
74, // 211
74, // 212
74, // 213
74, // 214
74, // 215
74, // 216
74, // 217
74, // 218
106, // 219
106, // 220
106, // 221
106, // 222
105, // 223
106, // 224
75, // 225
75, // 226
75, // 227
75, // 228
75, // 229
75, // 230
74, // 231
74, // 232
74, // 233
74, // 234
74, // 235
74, // 236
74, // 237
74, // 238
74, // 239
74, // 240
74, // 241
74, // 242
74, // 243
74, // 244
74, // 245
74, // 246
74, // 247
74, // 248
74, // 249
74, // 250
106, // 251
106, // 252
106, // 253
106, // 254
106, // 255
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
"<stmt> ::= # `while `( <exp> `) <stmt>", // 23
"<stmt> ::= # `break `;", // 24
"<assign> ::= <exp> # `= <exp>", // 25
"<local var decl> ::= <type> # ID `= <exp>", // 26
"<exp> ::= <exp4>", // 27
"<exp4> ::= # `true", // 28
"<exp4> ::= # `false", // 29
"<exp4> ::= <exp4> # `+ <exp3>", // 30
"<exp3> ::= <exp3> # `- <exp2>", // 31
"<exp4> ::= <exp3>", // 32
"<exp3> ::= <exp3> # `* <exp2>", // 33
"<exp3> ::= <exp3> # `/ <exp2>", // 34
"<exp3> ::= <exp3> # `% <exp2>", // 35
"<exp3> ::= <exp3> # `&& <exp2>", // 36
"<exp3> ::= <exp2>", // 37
"<exp2> ::= <cast exp>", // 38
"<exp2> ::= <unary exp>", // 39
"<cast exp> ::= # `( <type> `) <cast exp>", // 40
"<cast exp> ::= # `( <type> `) <exp1>", // 41
"<exp3> ::= <exp3> # `instanceof <type>", // 42
"<unary exp> ::= # `+ <unary exp>", // 43
"<unary exp> ::= # `- <unary exp>", // 44
"<unary exp> ::= # `! <unary exp>", // 45
"<unary exp> ::= <exp1>", // 46
"<exp1> ::= # ID", // 47
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 48
"<exp1> ::= # INTLIT", // 49
"<exp1> ::= # STRINGLIT", // 50
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 51
"letter128 ::= {193..218 225..250}", // 52
"digit ::= {\"0\"..\"9\"}", // 53
"digit128 ::= {176..185}", // 54
"any ::= {0..127}", // 55
"any128 ::= {128..255}", // 56
"ws ::= \" \"", // 57
"ws ::= {10} registerNewline", // 58
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 59
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 60
"`class ::= \"#\" \"c\" \"l\" ws*", // 61
"`class ::= \"#\" \"c\" \"l\" ws*", // 62
"`extends ::= \"#\" \"e\" \"x\" ws*", // 63
"`extends ::= \"#\" \"e\" \"x\" ws*", // 64
"`void ::= \"#\" \"v\" \"o\" ws*", // 65
"`void ::= \"#\" \"v\" \"o\" ws*", // 66
"`int ::= \"#\" \"i\" \"t\" ws*", // 67
"`int ::= \"#\" \"i\" \"t\" ws*", // 68
"`while ::= \"#\" \"w\" \"h\" ws*", // 69
"`while ::= \"#\" \"w\" \"h\" ws*", // 70
"`if ::= \"#\" \"+\" ws*", // 71
"`if ::= \"#\" \"+\" ws*", // 72
"`else ::= \"#\" \"e\" \"l\" ws*", // 73
"`else ::= \"#\" \"e\" \"l\" ws*", // 74
"`break ::= \"#\" \"b\" \"r\" ws*", // 75
"`break ::= \"#\" \"b\" \"r\" ws*", // 76
"`false ::= \"#\" \"f\" \"a\" ws*", // 77
"`false ::= \"#\" \"f\" \"a\" ws*", // 78
"`true ::= \"#\" \"t\" \"r\" ws*", // 79
"`true ::= \"#\" \"t\" \"r\" ws*", // 80
"`null ::= \"#\" \"n\" \"u\" ws*", // 81
"`null ::= \"#\" \"n\" \"u\" ws*", // 82
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 83
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 84
"`public ::= \"#\" \"p\" \"u\" ws*", // 85
"`public ::= \"#\" \"p\" \"u\" ws*", // 86
"`! ::= \"!\" ws*", // 87
"`! ::= \"!\" ws*", // 88
"`% ::= \"%\" ws*", // 89
"`% ::= \"%\" ws*", // 90
"`&& ::= \"@\" \"&\" ws*", // 91
"`&& ::= \"@\" \"&\" ws*", // 92
"`* ::= \"*\" ws*", // 93
"`* ::= \"*\" ws*", // 94
"`( ::= \"(\" ws*", // 95
"`( ::= \"(\" ws*", // 96
"`) ::= \")\" ws*", // 97
"`) ::= \")\" ws*", // 98
"`{ ::= \"{\" ws*", // 99
"`{ ::= \"{\" ws*", // 100
"`} ::= \"}\" ws*", // 101
"`} ::= \"}\" ws*", // 102
"`- ::= \"-\" ws*", // 103
"`- ::= \"-\" ws*", // 104
"`+ ::= \"+\" ws*", // 105
"`+ ::= \"+\" ws*", // 106
"`= ::= \"=\" ws*", // 107
"`= ::= \"=\" ws*", // 108
"`[ ::= \"[\" ws*", // 109
"`[ ::= \"[\" ws*", // 110
"`] ::= \"]\" ws*", // 111
"`] ::= \"]\" ws*", // 112
"`; ::= \";\" ws*", // 113
"`; ::= \";\" ws*", // 114
"`/ ::= \"/\" ws*", // 115
"`/ ::= \"/\" ws*", // 116
"ID ::= letter128 ws*", // 117
"ID ::= letter128 ws*", // 118
"ID ::= letter idChar* idChar128 ws*", // 119
"ID ::= letter idChar* idChar128 ws*", // 120
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 121
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 122
"INTLIT ::= digit128 ws*", // 123
"INTLIT ::= digit128 ws*", // 124
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 125
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 126
"STRINGLIT ::= \"@\" \'\"\' ws*", // 127
"STRINGLIT ::= \"@\" \'\"\' ws*", // 128
"STRINGLIT ::= \'\"\' any* any128 ws*", // 129
"STRINGLIT ::= \'\"\' any* any128 ws*", // 130
"idChar ::= letter", // 131
"idChar ::= digit", // 132
"idChar ::= \"_\"", // 133
"idChar128 ::= letter128", // 134
"idChar128 ::= digit128", // 135
"idChar128 ::= {223}", // 136
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 137
"hexDigit128 ::= {176..185 193..198 225..230}", // 138
"digit* ::= digit* digit", // 139
"digit* ::= digit* digit", // 140
"any* ::= any* any", // 141
"any* ::= any* any", // 142
"<decl in class>* ::= <decl in class>* <decl in class>", // 143
"<decl in class>* ::= <decl in class>* <decl in class>", // 144
"hexDigit* ::= hexDigit* hexDigit", // 145
"hexDigit* ::= hexDigit* hexDigit", // 146
"<stmt>* ::= <stmt>* <stmt>", // 147
"<stmt>* ::= <stmt>* <stmt>", // 148
"idChar* ::= idChar* idChar", // 149
"idChar* ::= idChar* idChar", // 150
"<class decl>+ ::= <class decl>", // 151
"<class decl>+ ::= <class decl>+ <class decl>", // 152
"ws* ::= ws* ws", // 153
"ws* ::= ws* ws", // 154
"", // 155
"", // 156
"", // 157
"", // 158
"", // 159
"", // 160
"", // 161
"", // 162
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
    { // 23: <stmt> ::= [#] `while `( <exp> `) <stmt> @newWhileBlock(int,Exp,Statement)=>Statement
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
    { // 24: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 25: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 26: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 27: <exp> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <exp4> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 29: <exp4> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 30: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 31: <exp3> ::= <exp3> [#] `- <exp2> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 32: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 34: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 35: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 36: <exp3> ::= <exp3> [#] `&& <exp2> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 37: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 40: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 41: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 42: <exp3> ::= <exp3> [#] `instanceof <type> @newInstanceOf(Exp,int,Type)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 43: <unary exp> ::= [#] `+ <unary exp> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 44: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 45: <unary exp> ::= [#] `! <unary exp> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 46: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 47: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 48: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 49: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 50: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 51: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 52: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 53: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 54: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 55: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 56: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 57: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 58: ws ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 59: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `extends ::= "#" "e" "x" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 65: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 69: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 70: `while ::= "#" "w" "h" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 71: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 72: `if ::= "#" "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 73: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 74: `else ::= "#" "e" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 75: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 76: `break ::= "#" "b" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 77: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 78: `false ::= "#" "f" "a" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 79: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 80: `true ::= "#" "t" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 81: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 82: `null ::= "#" "n" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 83: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 84: `instanceof ::= "#" "i" "n" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 85: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 86: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 87: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `! ::= "!" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 90: `% ::= "%" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 92: `&& ::= "@" "&" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 93: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 95: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 96: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 97: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 100: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 101: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 102: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 103: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 104: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 105: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 106: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 107: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 108: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 111: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 112: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `/ ::= "/" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 118: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 119: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 120: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 121: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 122: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 123: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 124: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 125: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 126: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 127: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 128: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 129: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 130: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 131: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 132: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 133: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 134: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 135: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 136: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 137: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 138: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 139: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 140: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 141: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 142: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 143: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 144: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 145: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 146: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 147: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 148: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 149: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 150: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 151: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 152: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 153: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 154: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 155: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 156: $$0 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 157: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 158: $$1 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 159: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 160: $$2 ::= hexDigit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 161: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 162: $$3 ::= any128 [ws*] @pass
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
      ((41<<5)|0x5)/*methodCall:41*/,
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
      Statement result = actionObject.newWhileBlock(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 15: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
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
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Type parm2 = (Type)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2);
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
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 35: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 36: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 37: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 38: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 39: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 40: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 41: {
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
"Statement newWhileBlock(int,Exp,Statement)",
"Statement newBreak(int)",
"Statement assign(Exp,int,Exp)",
"Statement localVarDecl(Type,int,String,Exp)",
"Exp newTrue(int)",
"Exp newFalse(int)",
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newRemainder(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newInstanceOf(Exp,int,Type)",
"Exp newUnaryPlus(int,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newUnaryNot(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"Exp newStringLiteral(int,String)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"String emptyString(char,char)",
"String string(char,List<Character>,char)",
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
3,1,
1,1,
3,1,
4,1,
1,1,
1,1,
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
1,1,
3,1,
1,1,
3,1,
2,1,
3,1,
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
    0,
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
    1,
    1,
    0,
    0,
    1,
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
