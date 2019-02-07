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
public int getEofSym() { return 127; }
public int getNttSym() { return 128; }
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
"`<",
"`>",
"<cast exp>",
"<unary exp>",
"<exp1>",
"`instanceof",
"`!",
"INTLIT",
"STRINGLIT",
"CHARLIT",
"`this",
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
"\"&\"",
"\")\"",
"\"]\"",
"\"/\"",
"\";\"",
"\">\"",
"\"{\"",
"{0..9 11..31 \"$\" \",\" \".\" \":\" \"?\" \"\\\" \"^\" \"`\" \"|\" \"~\"..127}",
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
public int numSymbols() { return 129;}
private static final int MIN_REDUCTION = 430;
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
1,373, // <start>
2,213, // ws*
3,164, // <program>
4,47, // <class decl>+
5,363, // <class decl>
6,350, // `class
89,60, // " "
90,106, // "#"
105,25, // {10}
114,99, // ws
  }
,
{ // state 1
  }
,
{ // state 2
24,MIN_REDUCTION+63, // `[
86,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 3
89,60, // " "
105,25, // {10}
114,32, // ws
128,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 4
2,242, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 5
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 6
0x80000000|406, // match move
0x80000000|361, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 7
0x80000000|1, // match move
0x80000000|381, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 8
2,10, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 9
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 10
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 11
0x80000000|1, // match move
0x80000000|132, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
91,70, // "&"
  }
,
{ // state 13
24,MIN_REDUCTION+62, // `[
86,MIN_REDUCTION+62, // "["
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 14
2,3, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
128,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 15
0x80000000|192, // match move
0x80000000|232, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 16
32,69, // `else
90,205, // "#"
  }
,
{ // state 17
16,260, // `(
100,159, // "("
  }
,
{ // state 18
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 19
28,81, // `;
95,216, // ";"
  }
,
{ // state 20
7,310, // ID
16,58, // `(
39,407, // `+
41,193, // `-
42,263, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,143, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 21
24,MIN_REDUCTION+132, // `[
86,MIN_REDUCTION+132, // "["
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 22
0x80000000|349, // match move
0x80000000|137, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 23
74,91, // "t"
  }
,
{ // state 24
89,417, // " "
105,138, // {10}
114,82, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 25
128,MIN_REDUCTION+63, // $NT
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 26
0x80000000|1, // match move
0x80000000|166, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 27
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 28
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 29
0x80000000|162, // match move
0x80000000|423, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 30
24,MIN_REDUCTION+53, // `[
86,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 31
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 32
128,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 33
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 34
2,235, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 35
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 36
2,243, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 37
0x80000000|326, // match move
0x80000000|323, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
0x80000000|195, // match move
0x80000000|146, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 39
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 40
16,253, // `(
100,159, // "("
  }
,
{ // state 41
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 42
0x80000000|306, // match move
0x80000000|388, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 43
2,39, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 44
24,MIN_REDUCTION+138, // `[
86,MIN_REDUCTION+138, // "["
89,249, // " "
105,176, // {10}
114,154, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 45
24,MIN_REDUCTION+51, // `[
86,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 46
0x80000000|411, // match move
0x80000000|354, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 47
5,403, // <class decl>
6,350, // `class
90,106, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 48
66,325, // "o"
67,275, // "r"
  }
,
{ // state 49
60,271, // "p"
  }
,
{ // state 50
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 52
7,310, // ID
16,58, // `(
31,365, // <exp>
36,95, // <exp4>
37,218, // `true
38,93, // `false
39,407, // `+
40,105, // <exp3>
41,193, // `-
42,158, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,256, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 53
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 54
0x80000000|86, // match move
0x80000000|358, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 55
7,310, // ID
16,58, // `(
39,407, // `+
40,368, // <exp3>
41,193, // `-
42,158, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,143, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 56
24,MIN_REDUCTION+118, // `[
86,MIN_REDUCTION+118, // "["
89,249, // " "
105,176, // {10}
114,154, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 58
7,402, // ID
15,282, // `void
19,254, // <type>
20,257, // `int
21,111, // `boolean
22,215, // `null
58,170, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,248, // letter128
78,128, // {199..218 231..250}
79,128, // {193..198 225..230}
90,320, // "#"
  }
,
{ // state 59
2,119, // ws*
89,417, // " "
105,138, // {10}
114,250, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 60
128,MIN_REDUCTION+62, // $NT
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 61
59,251, // "a"
60,251, // "p"
61,251, // "v"
62,251, // "c"
63,251, // "f"
64,251, // "i"
65,251, // "l"
66,251, // "o"
67,251, // "r"
68,251, // "u"
69,251, // "x"
70,251, // "b"
71,251, // "e"
72,251, // "h"
73,251, // "n"
74,251, // "t"
75,251, // "w"
76,251, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
79,299, // {193..198 225..230}
81,251, // {"1".."9"}
82,251, // "0"
84,299, // {176..185}
119,410, // hexDigit*
120,76, // $$2
125,41, // hexDigit
126,389, // hexDigit128
  }
,
{ // state 62
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 63
2,119, // ws*
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 64
80,421, // digit
81,200, // {"1".."9"}
82,200, // "0"
83,274, // digit128
84,38, // {176..185}
117,300, // digit*
118,194, // $$1
  }
,
{ // state 65
59,33, // "a"
60,33, // "p"
61,33, // "v"
62,33, // "c"
63,33, // "f"
64,33, // "i"
65,33, // "l"
66,33, // "o"
67,33, // "r"
68,33, // "u"
69,33, // "x"
70,33, // "b"
71,33, // "e"
72,33, // "h"
73,33, // "n"
74,33, // "t"
75,33, // "w"
76,33, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
78,425, // {199..218 231..250}
79,425, // {193..198 225..230}
81,33, // {"1".."9"}
82,33, // "0"
84,425, // {176..185}
85,157, // any
86,33, // "["
87,33, // "-"
88,33, // "<"
89,33, // " "
90,33, // "#"
91,33, // "&"
92,33, // ")"
93,33, // "]"
94,33, // "/"
95,33, // ";"
96,33, // ">"
97,33, // "{"
98,33, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
99,33, // "%"
100,33, // "("
101,33, // "+"
102,33, // "_"
103,33, // "="
104,33, // "@"
105,33, // {10}
106,33, // "}"
107,33, // "!"
108,33, // "'"
109,33, // '"'
110,33, // "*"
111,377, // any128
112,425, // {223}
113,425, // {128..175 186..192 219..222 224 251..255}
121,224, // any*
122,148, // $$3
  }
,
{ // state 66
2,35, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 67
58,140, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,346, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
80,380, // digit
81,200, // {"1".."9"}
82,200, // "0"
83,131, // digit128
84,38, // {176..185}
102,9, // "_"
112,261, // {223}
115,270, // idChar*
116,190, // $$0
123,277, // idChar
124,42, // idChar128
  }
,
{ // state 68
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 69
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
305, // ID
144, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
282, // `void
58, // `(
-1, // `)
-1, // <stmt>*
359, // <type>
257, // `int
111, // `boolean
215, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
285, // <stmt>
97, // <assign>
-1, // `;
372, // <local var decl>
357, // `if
210, // <exp>
-1, // `else
225, // `while
355, // `break
-1, // `=
95, // <exp4>
218, // `true
93, // `false
407, // `+
105, // <exp3>
193, // `-
158, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
-1, // `<
-1, // `>
18, // <cast exp>
353, // <unary exp>
273, // <exp1>
-1, // `instanceof
125, // `!
303, // INTLIT
96, // STRINGLIT
244, // CHARLIT
186, // `this
67, // letter
298, // "a"
298, // "p"
298, // "v"
298, // "c"
298, // "f"
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
102, // letter128
239, // {199..218 231..250}
239, // {193..198 225..230}
-1, // digit
64, // {"1".."9"}
61, // "0"
341, // digit128
38, // {176..185}
-1, // any
-1, // "["
66, // "-"
-1, // "<"
-1, // " "
331, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
185, // "{"
-1, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
159, // "("
397, // "+"
-1, // "_"
-1, // "="
308, // "@"
-1, // {10}
-1, // "}"
266, // "!"
313, // "'"
65, // '"'
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
{ // state 70
2,247, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 71
0x80000000|160, // match move
0x80000000|400, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 72
24,MIN_REDUCTION+168, // `[
86,MIN_REDUCTION+168, // "["
89,249, // " "
105,176, // {10}
114,154, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 73
0x80000000|392, // match move
0x80000000|236, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 74
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 75
8,371, // `{
97,185, // "{"
  }
,
{ // state 76
0x80000000|1, // match move
0x80000000|231, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 77
0x80000000|1, // match move
0x80000000|21, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 78
7,310, // ID
16,58, // `(
39,407, // `+
41,193, // `-
42,295, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,143, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 79
24,MIN_REDUCTION+149, // `[
86,MIN_REDUCTION+149, // "["
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 80
0x80000000|1, // match move
0x80000000|44, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 81
0x80000000|351, // match move
0x80000000|286, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 82
0x80000000|31, // match move
0x80000000|405, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 83
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 84
0x80000000|1, // match move
0x80000000|36, // no-match move
// T-test match for "=":
103,
  }
,
{ // state 85
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 86
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 87
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
305, // ID
144, // `{
-1, // <decl in class>*
315, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
282, // `void
58, // `(
-1, // `)
-1, // <stmt>*
359, // <type>
257, // `int
111, // `boolean
215, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
68, // <stmt>
97, // <assign>
-1, // `;
372, // <local var decl>
357, // `if
210, // <exp>
-1, // `else
225, // `while
355, // `break
-1, // `=
95, // <exp4>
218, // `true
93, // `false
407, // `+
105, // <exp3>
193, // `-
158, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
-1, // `<
-1, // `>
18, // <cast exp>
353, // <unary exp>
273, // <exp1>
-1, // `instanceof
125, // `!
303, // INTLIT
96, // STRINGLIT
244, // CHARLIT
186, // `this
67, // letter
298, // "a"
298, // "p"
298, // "v"
298, // "c"
298, // "f"
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
102, // letter128
239, // {199..218 231..250}
239, // {193..198 225..230}
-1, // digit
64, // {"1".."9"}
61, // "0"
341, // digit128
38, // {176..185}
-1, // any
-1, // "["
66, // "-"
-1, // "<"
-1, // " "
331, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
185, // "{"
-1, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
159, // "("
397, // "+"
-1, // "_"
-1, // "="
308, // "@"
-1, // {10}
278, // "}"
266, // "!"
313, // "'"
65, // '"'
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
{ // state 88
17,212, // `)
92,311, // ")"
  }
,
{ // state 89
128,MIN_REDUCTION+17, // $NT
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 90
7,310, // ID
16,58, // `(
49,74, // <cast exp>
51,11, // <exp1>
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
90,143, // "#"
100,159, // "("
104,308, // "@"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 91
2,53, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 92
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 94
2,116, // ws*
24,MIN_REDUCTION+173, // `[
86,MIN_REDUCTION+173, // "["
89,249, // " "
105,176, // {10}
114,71, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 95
39,55, // `+
101,397, // "+"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 96
0x80000000|1, // match move
0x80000000|30, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 97
28,241, // `;
95,264, // ";"
  }
,
{ // state 98
24,MIN_REDUCTION+141, // `[
86,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 99
128,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 100
0x80000000|51, // match move
0x80000000|108, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 101
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 102
0x80000000|424, // match move
0x80000000|199, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 103
2,104, // ws*
24,MIN_REDUCTION+175, // `[
86,MIN_REDUCTION+175, // "["
89,249, // " "
105,176, // {10}
114,71, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 104
0x80000000|1, // match move
0x80000000|327, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 105
41,168, // `-
43,188, // `*
44,321, // `/
45,330, // `%
46,20, // `&&
47,78, // `<
48,127, // `>
52,174, // `instanceof
87,66, // "-"
88,391, // "<"
90,370, // "#"
94,8, // "/"
96,84, // ">"
99,293, // "%"
104,12, // "@"
110,356, // "*"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 106
62,288, // "c"
  }
,
{ // state 107
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 109
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
305, // ID
144, // `{
-1, // <decl in class>*
124, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
282, // `void
58, // `(
-1, // `)
280, // <stmt>*
359, // <type>
257, // `int
111, // `boolean
215, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
342, // <stmt>
97, // <assign>
-1, // `;
372, // <local var decl>
357, // `if
210, // <exp>
-1, // `else
225, // `while
355, // `break
-1, // `=
95, // <exp4>
218, // `true
93, // `false
407, // `+
105, // <exp3>
193, // `-
158, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
-1, // `<
-1, // `>
18, // <cast exp>
353, // <unary exp>
273, // <exp1>
-1, // `instanceof
125, // `!
303, // INTLIT
96, // STRINGLIT
244, // CHARLIT
186, // `this
67, // letter
298, // "a"
298, // "p"
298, // "v"
298, // "c"
298, // "f"
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
102, // letter128
239, // {199..218 231..250}
239, // {193..198 225..230}
-1, // digit
64, // {"1".."9"}
61, // "0"
341, // digit128
38, // {176..185}
-1, // any
-1, // "["
66, // "-"
-1, // "<"
-1, // " "
331, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
185, // "{"
-1, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
159, // "("
397, // "+"
-1, // "_"
-1, // "="
308, // "@"
-1, // {10}
336, // "}"
266, // "!"
313, // "'"
65, // '"'
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
{ // state 110
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 112
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 113
16,52, // `(
100,159, // "("
  }
,
{ // state 114
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 115
2,245, // ws*
24,MIN_REDUCTION+135, // `[
86,MIN_REDUCTION+135, // "["
89,249, // " "
105,176, // {10}
114,71, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 116
0x80000000|1, // match move
0x80000000|352, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 117
72,6, // "h"
  }
,
{ // state 118
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 119
0x80000000|5, // match move
0x80000000|24, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 120
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 121
2,165, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 123
0x80000000|290, // match move
0x80000000|324, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 124
0x80000000|339, // match move
0x80000000|307, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 125
7,310, // ID
39,407, // `+
41,193, // `-
50,318, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,143, // "#"
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 126
2,369, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 127
7,310, // ID
16,58, // `(
39,407, // `+
41,193, // `-
42,343, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,143, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 128
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 129
35,220, // `=
103,258, // "="
  }
,
{ // state 130
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 131
0x80000000|255, // match move
0x80000000|281, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 132
24,338, // `[
86,43, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 133
2,374, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 134
24,MIN_REDUCTION+133, // `[
86,MIN_REDUCTION+133, // "["
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 137
2,26, // ws*
24,MIN_REDUCTION+143, // `[
86,MIN_REDUCTION+143, // "["
89,249, // " "
105,176, // {10}
114,71, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 138
0x80000000|183, // match move
0x80000000|376, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 139
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 141
24,MIN_REDUCTION+82, // `[
86,MIN_REDUCTION+82, // "["
89,249, // " "
105,176, // {10}
114,154, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 142
7,310, // ID
16,58, // `(
31,334, // <exp>
36,95, // <exp4>
37,218, // `true
38,93, // `false
39,407, // `+
40,105, // <exp3>
41,193, // `-
42,158, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,256, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 143
74,117, // "t"
  }
,
{ // state 144
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
305, // ID
144, // `{
-1, // <decl in class>*
333, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
282, // `void
58, // `(
-1, // `)
87, // <stmt>*
359, // <type>
257, // `int
111, // `boolean
215, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
342, // <stmt>
97, // <assign>
-1, // `;
372, // <local var decl>
357, // `if
210, // <exp>
-1, // `else
225, // `while
355, // `break
-1, // `=
95, // <exp4>
218, // `true
93, // `false
407, // `+
105, // <exp3>
193, // `-
158, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
-1, // `<
-1, // `>
18, // <cast exp>
353, // <unary exp>
273, // <exp1>
-1, // `instanceof
125, // `!
303, // INTLIT
96, // STRINGLIT
244, // CHARLIT
186, // `this
67, // letter
298, // "a"
298, // "p"
298, // "v"
298, // "c"
298, // "f"
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
102, // letter128
239, // {199..218 231..250}
239, // {193..198 225..230}
-1, // digit
64, // {"1".."9"}
61, // "0"
341, // digit128
38, // {176..185}
-1, // any
-1, // "["
66, // "-"
-1, // "<"
-1, // " "
331, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
185, // "{"
-1, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
159, // "("
397, // "+"
-1, // "_"
-1, // "="
308, // "@"
-1, // {10}
278, // "}"
266, // "!"
313, // "'"
65, // '"'
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
{ // state 145
2,367, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 146
24,MIN_REDUCTION+59, // `[
86,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 147
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 148
0x80000000|1, // match move
0x80000000|98, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 149
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 150
24,MIN_REDUCTION+131, // `[
86,MIN_REDUCTION+131, // "["
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 151
2,7, // ws*
24,MIN_REDUCTION+171, // `[
86,MIN_REDUCTION+171, // "["
89,249, // " "
105,176, // {10}
114,71, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 152
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 153
24,MIN_REDUCTION+140, // `[
86,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 154
0x80000000|180, // match move
0x80000000|322, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 155
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 159
2,184, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 161
0x80000000|1, // match move
0x80000000|375, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 162
2,182, // ws*
  }
,
{ // state 163
24,MIN_REDUCTION+134, // `[
86,MIN_REDUCTION+134, // "["
89,249, // " "
105,176, // {10}
114,154, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 165
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 166
24,MIN_REDUCTION+142, // `[
86,MIN_REDUCTION+142, // "["
89,249, // " "
105,176, // {10}
114,154, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 168
7,310, // ID
16,58, // `(
39,407, // `+
41,193, // `-
42,386, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,143, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 169
89,MIN_REDUCTION+62, // " "
105,MIN_REDUCTION+62, // {10}
114,MIN_REDUCTION+62, // ws
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 170
58,140, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,156, // letter128
78,128, // {199..218 231..250}
79,128, // {193..198 225..230}
80,380, // digit
81,200, // {"1".."9"}
82,200, // "0"
83,85, // digit128
84,319, // {176..185}
102,9, // "_"
112,382, // {223}
115,291, // idChar*
116,362, // $$0
123,277, // idChar
124,206, // idChar128
  }
,
{ // state 171
28,15, // `;
95,216, // ";"
  }
,
{ // state 172
25,301, // `]
93,29, // "]"
  }
,
{ // state 173
17,390, // `)
92,311, // ")"
  }
,
{ // state 174
7,402, // ID
15,282, // `void
19,332, // <type>
20,257, // `int
21,111, // `boolean
22,215, // `null
58,170, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,248, // letter128
78,128, // {199..218 231..250}
79,128, // {193..198 225..230}
90,320, // "#"
  }
,
{ // state 175
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 176
0x80000000|387, // match move
0x80000000|2, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 177
2,409, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 179
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 181
73,4, // "n"
  }
,
{ // state 182
0x80000000|1, // match move
0x80000000|56, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 183
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 184
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 185
2,204, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 186
0x80000000|1, // match move
0x80000000|284, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 187
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 188
7,310, // ID
16,58, // `(
39,407, // `+
41,193, // `-
42,412, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,143, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 189
24,MIN_REDUCTION+50, // `[
86,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 190
0x80000000|135, // match move
0x80000000|150, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 191
7,414, // ID
58,170, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,248, // letter128
78,128, // {199..218 231..250}
79,128, // {193..198 225..230}
  }
,
{ // state 192
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 193
7,310, // ID
39,407, // `+
41,193, // `-
50,383, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,143, // "#"
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 194
0x80000000|1, // match move
0x80000000|134, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 195
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 196
24,MIN_REDUCTION+52, // `[
86,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 197
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 198
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 199
2,37, // ws*
24,MIN_REDUCTION+129, // `[
86,MIN_REDUCTION+129, // "["
89,249, // " "
105,176, // {10}
114,71, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 201
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 203
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
305, // ID
109, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
282, // `void
58, // `(
-1, // `)
-1, // <stmt>*
359, // <type>
257, // `int
111, // `boolean
215, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
328, // <stmt>
171, // <assign>
-1, // `;
19, // <local var decl>
113, // `if
210, // <exp>
-1, // `else
40, // `while
340, // `break
-1, // `=
95, // <exp4>
218, // `true
93, // `false
407, // `+
105, // <exp3>
193, // `-
158, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
-1, // `<
-1, // `>
18, // <cast exp>
353, // <unary exp>
273, // <exp1>
-1, // `instanceof
125, // `!
303, // INTLIT
96, // STRINGLIT
244, // CHARLIT
186, // `this
67, // letter
298, // "a"
298, // "p"
298, // "v"
298, // "c"
298, // "f"
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
102, // letter128
239, // {199..218 231..250}
239, // {193..198 225..230}
-1, // digit
64, // {"1".."9"}
61, // "0"
341, // digit128
38, // {176..185}
-1, // any
-1, // "["
66, // "-"
-1, // "<"
-1, // " "
331, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
185, // "{"
-1, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
159, // "("
397, // "+"
-1, // "_"
-1, // "="
308, // "@"
-1, // {10}
-1, // "}"
266, // "!"
313, // "'"
65, // '"'
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
{ // state 204
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 205
71,399, // "e"
  }
,
{ // state 206
2,426, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 207
69,145, // "x"
  }
,
{ // state 208
59,126, // "a"
  }
,
{ // state 209
10,401, // `}
12,198, // <decl in class>
13,178, // <method decl>
14,420, // `public
90,49, // "#"
106,278, // "}"
  }
,
{ // state 210
35,223, // `=
103,258, // "="
  }
,
{ // state 211
66,177, // "o"
  }
,
{ // state 212
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
305, // ID
144, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
282, // `void
58, // `(
-1, // `)
-1, // <stmt>*
359, // <type>
257, // `int
111, // `boolean
215, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
366, // <stmt>
97, // <assign>
-1, // `;
372, // <local var decl>
357, // `if
210, // <exp>
-1, // `else
225, // `while
355, // `break
-1, // `=
95, // <exp4>
218, // `true
93, // `false
407, // `+
105, // <exp3>
193, // `-
158, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
-1, // `<
-1, // `>
18, // <cast exp>
353, // <unary exp>
273, // <exp1>
-1, // `instanceof
125, // `!
303, // INTLIT
96, // STRINGLIT
244, // CHARLIT
186, // `this
67, // letter
298, // "a"
298, // "p"
298, // "v"
298, // "c"
298, // "f"
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
102, // letter128
239, // {199..218 231..250}
239, // {193..198 225..230}
-1, // digit
64, // {"1".."9"}
61, // "0"
341, // digit128
38, // {176..185}
-1, // any
-1, // "["
66, // "-"
-1, // "<"
-1, // " "
331, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
185, // "{"
-1, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
159, // "("
397, // "+"
-1, // "_"
-1, // "="
308, // "@"
-1, // {10}
-1, // "}"
266, // "!"
313, // "'"
65, // '"'
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
{ // state 213
3,360, // <program>
4,47, // <class decl>+
5,363, // <class decl>
6,350, // `class
89,60, // " "
90,106, // "#"
105,25, // {10}
114,32, // ws
  }
,
{ // state 214
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 215
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 216
0x80000000|262, // match move
0x80000000|296, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 217
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 219
72,408, // "h"
  }
,
{ // state 220
7,310, // ID
16,58, // `(
31,428, // <exp>
36,95, // <exp4>
37,218, // `true
38,93, // `false
39,407, // `+
40,105, // <exp3>
41,193, // `-
42,158, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,256, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 221
90,205, // "#"
  }
,
{ // state 222
2,317, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 223
7,310, // ID
16,58, // `(
31,28, // <exp>
36,95, // <exp4>
37,218, // `true
38,93, // `false
39,407, // `+
40,105, // <exp3>
41,193, // `-
42,158, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,256, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 224
59,33, // "a"
60,33, // "p"
61,33, // "v"
62,33, // "c"
63,33, // "f"
64,33, // "i"
65,33, // "l"
66,33, // "o"
67,33, // "r"
68,33, // "u"
69,33, // "x"
70,33, // "b"
71,33, // "e"
72,33, // "h"
73,33, // "n"
74,33, // "t"
75,33, // "w"
76,33, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
78,425, // {199..218 231..250}
79,425, // {193..198 225..230}
81,33, // {"1".."9"}
82,33, // "0"
84,425, // {176..185}
85,217, // any
86,33, // "["
87,33, // "-"
88,33, // "<"
89,33, // " "
90,33, // "#"
91,33, // "&"
92,33, // ")"
93,33, // "]"
94,33, // "/"
95,33, // ";"
96,33, // ">"
97,33, // "{"
98,33, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
99,33, // "%"
100,33, // "("
101,33, // "+"
102,33, // "_"
103,33, // "="
104,33, // "@"
105,33, // {10}
106,33, // "}"
107,33, // "!"
108,33, // "'"
109,33, // '"'
110,33, // "*"
111,377, // any128
112,425, // {223}
113,425, // {128..175 186..192 219..222 224 251..255}
122,415, // $$3
  }
,
{ // state 225
16,404, // `(
100,159, // "("
  }
,
{ // state 226
61,211, // "v"
  }
,
{ // state 227
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 228
25,89, // `]
93,14, // "]"
  }
,
{ // state 229
0x80000000|302, // match move
0x80000000|378, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 230
7,17, // ID
58,170, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,248, // letter128
78,128, // {199..218 231..250}
79,128, // {193..198 225..230}
  }
,
{ // state 231
24,MIN_REDUCTION+137, // `[
86,MIN_REDUCTION+137, // "["
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 233
2,104, // ws*
  }
,
{ // state 234
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 235
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 236
24,MIN_REDUCTION+60, // `[
86,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 237
0x80000000|393, // match move
0x80000000|27, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 238
9,335, // <decl in class>*
10,92, // `}
12,120, // <decl in class>
13,178, // <method decl>
14,420, // `public
90,49, // "#"
106,278, // "}"
  }
,
{ // state 239
0x80000000|122, // match move
0x80000000|344, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 240
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 242
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 243
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 244
0x80000000|1, // match move
0x80000000|364, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 245
0x80000000|1, // match move
0x80000000|163, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 246
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 247
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 248
2,130, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 249
0x80000000|385, // match move
0x80000000|13, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 250
0x80000000|259, // match move
0x80000000|394, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 251
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 252
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 253
7,310, // ID
16,58, // `(
31,173, // <exp>
36,95, // <exp4>
37,218, // `true
38,93, // `false
39,407, // `+
40,105, // <exp3>
41,193, // `-
42,158, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,256, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 254
17,90, // `)
23,167, // <empty bracket pair>
24,228, // `[
86,43, // "["
92,311, // ")"
  }
,
{ // state 255
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 256
63,208, // "f"
74,276, // "t"
  }
,
{ // state 257
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 258
2,329, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 260
17,75, // `)
92,311, // ")"
  }
,
{ // state 261
0x80000000|187, // match move
0x80000000|79, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 262
2,54, // ws*
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 263
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 264
2,110, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 265
2,245, // ws*
  }
,
{ // state 266
2,345, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 267
0x80000000|175, // match move
0x80000000|72, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 268
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 269
2,7, // ws*
  }
,
{ // state 270
58,140, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,346, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
80,380, // digit
81,200, // {"1".."9"}
82,200, // "0"
83,131, // digit128
84,38, // {176..185}
102,9, // "_"
112,261, // {223}
116,123, // $$0
123,214, // idChar
124,42, // idChar128
  }
,
{ // state 271
68,121, // "u"
  }
,
{ // state 272
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 273
0x80000000|1, // match move
0x80000000|419, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 274
0x80000000|269, // match move
0x80000000|151, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 275
2,179, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 276
67,133, // "r"
72,6, // "h"
  }
,
{ // state 277
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 278
2,147, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 279
24,MIN_REDUCTION+151, // `[
86,MIN_REDUCTION+151, // "["
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 280
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
305, // ID
144, // `{
-1, // <decl in class>*
398, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
282, // `void
58, // `(
-1, // `)
-1, // <stmt>*
359, // <type>
257, // `int
111, // `boolean
215, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
68, // <stmt>
97, // <assign>
-1, // `;
372, // <local var decl>
357, // `if
210, // <exp>
-1, // `else
225, // `while
355, // `break
-1, // `=
95, // <exp4>
218, // `true
93, // `false
407, // `+
105, // <exp3>
193, // `-
158, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
-1, // `<
-1, // `>
18, // <cast exp>
353, // <unary exp>
273, // <exp1>
-1, // `instanceof
125, // `!
303, // INTLIT
96, // STRINGLIT
244, // CHARLIT
186, // `this
67, // letter
298, // "a"
298, // "p"
298, // "v"
298, // "c"
298, // "f"
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
102, // letter128
239, // {199..218 231..250}
239, // {193..198 225..230}
-1, // digit
64, // {"1".."9"}
61, // "0"
341, // digit128
38, // {176..185}
-1, // any
-1, // "["
66, // "-"
-1, // "<"
-1, // " "
331, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
185, // "{"
-1, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
159, // "("
397, // "+"
-1, // "_"
-1, // "="
308, // "@"
-1, // {10}
336, // "}"
266, // "!"
313, // "'"
65, // '"'
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
{ // state 281
24,MIN_REDUCTION+148, // `[
86,MIN_REDUCTION+148, // "["
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 283
9,209, // <decl in class>*
10,246, // `}
12,120, // <decl in class>
13,178, // <method decl>
14,420, // `public
90,49, // "#"
106,278, // "}"
  }
,
{ // state 284
24,MIN_REDUCTION+55, // `[
86,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 285
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 286
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 287
89,60, // " "
105,25, // {10}
114,32, // ws
128,MIN_REDUCTION+78, // $NT
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 288
65,222, // "l"
  }
,
{ // state 289
2,149, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 291
58,140, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,156, // letter128
78,128, // {199..218 231..250}
79,128, // {193..198 225..230}
80,380, // digit
81,200, // {"1".."9"}
82,200, // "0"
83,85, // digit128
84,319, // {176..185}
102,9, // "_"
112,382, // {223}
116,57, // $$0
123,214, // idChar
124,206, // idChar128
  }
,
{ // state 292
8,238, // `{
11,191, // `extends
90,396, // "#"
97,185, // "{"
  }
,
{ // state 293
2,152, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 294
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
305, // ID
109, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
282, // `void
58, // `(
-1, // `)
-1, // <stmt>*
359, // <type>
257, // `int
111, // `boolean
215, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
229, // <stmt>
171, // <assign>
-1, // `;
19, // <local var decl>
113, // `if
210, // <exp>
-1, // `else
40, // `while
340, // `break
-1, // `=
95, // <exp4>
218, // `true
93, // `false
407, // `+
105, // <exp3>
193, // `-
158, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
-1, // `<
-1, // `>
18, // <cast exp>
353, // <unary exp>
273, // <exp1>
-1, // `instanceof
125, // `!
303, // INTLIT
96, // STRINGLIT
244, // CHARLIT
186, // `this
67, // letter
298, // "a"
298, // "p"
298, // "v"
298, // "c"
298, // "f"
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
102, // letter128
239, // {199..218 231..250}
239, // {193..198 225..230}
-1, // digit
64, // {"1".."9"}
61, // "0"
341, // digit128
38, // {176..185}
-1, // any
-1, // "["
66, // "-"
-1, // "<"
-1, // " "
331, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
185, // "{"
-1, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
159, // "("
397, // "+"
-1, // "_"
-1, // "="
308, // "@"
-1, // {10}
-1, // "}"
266, // "!"
313, // "'"
65, // '"'
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
{ // state 295
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 296
2,54, // ws*
89,417, // " "
105,138, // {10}
114,250, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 297
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
305, // ID
109, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
282, // `void
58, // `(
-1, // `)
-1, // <stmt>*
359, // <type>
257, // `int
111, // `boolean
215, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
422, // <stmt>
171, // <assign>
-1, // `;
19, // <local var decl>
113, // `if
210, // <exp>
-1, // `else
40, // `while
340, // `break
-1, // `=
95, // <exp4>
218, // `true
93, // `false
407, // `+
105, // <exp3>
193, // `-
158, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
-1, // `<
-1, // `>
18, // <cast exp>
353, // <unary exp>
273, // <exp1>
-1, // `instanceof
125, // `!
303, // INTLIT
96, // STRINGLIT
244, // CHARLIT
186, // `this
67, // letter
298, // "a"
298, // "p"
298, // "v"
298, // "c"
298, // "f"
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
102, // letter128
239, // {199..218 231..250}
239, // {193..198 225..230}
-1, // digit
64, // {"1".."9"}
61, // "0"
341, // digit128
38, // {176..185}
-1, // any
-1, // "["
66, // "-"
-1, // "<"
-1, // " "
331, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
185, // "{"
-1, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
159, // "("
397, // "+"
-1, // "_"
-1, // "="
308, // "@"
-1, // {10}
-1, // "}"
266, // "!"
313, // "'"
65, // '"'
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
{ // state 298
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 299
0x80000000|101, // match move
0x80000000|279, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 300
80,50, // digit
81,200, // {"1".."9"}
82,200, // "0"
83,274, // digit128
84,38, // {176..185}
118,77, // $$1
  }
,
{ // state 301
0x80000000|1, // match move
0x80000000|45, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 302
32,203, // `else
90,205, // "#"
  }
,
{ // state 303
0x80000000|1, // match move
0x80000000|196, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 304
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 305
0x80000000|427, // match move
0x80000000|379, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 306
2,267, // ws*
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 308
109,46, // '"'
  }
,
{ // state 309
2,116, // ws*
  }
,
{ // state 310
0x80000000|1, // match move
0x80000000|189, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 311
2,155, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 312
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 313
59,73, // "a"
60,73, // "p"
61,73, // "v"
62,73, // "c"
63,73, // "f"
64,73, // "i"
65,73, // "l"
66,73, // "o"
67,73, // "r"
68,73, // "u"
69,73, // "x"
70,73, // "b"
71,73, // "e"
72,73, // "h"
73,73, // "n"
74,73, // "t"
75,73, // "w"
76,73, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
81,73, // {"1".."9"}
82,73, // "0"
85,22, // any
86,73, // "["
87,73, // "-"
88,73, // "<"
89,73, // " "
90,73, // "#"
91,73, // "&"
92,73, // ")"
93,73, // "]"
94,73, // "/"
95,73, // ";"
96,73, // ">"
97,73, // "{"
98,73, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
99,73, // "%"
100,73, // "("
101,73, // "+"
102,73, // "_"
103,73, // "="
104,73, // "@"
105,73, // {10}
106,73, // "}"
107,73, // "!"
108,73, // "'"
109,73, // '"'
110,73, // "*"
  }
,
{ // state 314
24,228, // `[
86,43, // "["
  }
,
{ // state 315
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 316
68,289, // "u"
  }
,
{ // state 317
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 318
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 319
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 320
61,211, // "v"
64,23, // "i"
70,418, // "b"
73,316, // "n"
  }
,
{ // state 321
7,310, // ID
16,58, // `(
39,407, // `+
41,193, // `-
42,112, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,143, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 322
24,MIN_REDUCTION+166, // `[
86,MIN_REDUCTION+166, // "["
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 323
24,MIN_REDUCTION+128, // `[
86,MIN_REDUCTION+128, // "["
89,249, // " "
105,176, // {10}
114,154, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 324
24,MIN_REDUCTION+130, // `[
86,MIN_REDUCTION+130, // "["
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 325
2,62, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 326
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 327
24,MIN_REDUCTION+174, // `[
86,MIN_REDUCTION+174, // "["
89,249, // " "
105,176, // {10}
114,154, // ws
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 328
0x80000000|252, // match move
0x80000000|227, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 329
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 330
7,310, // ID
16,58, // `(
39,407, // `+
41,193, // `-
42,139, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,143, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 331
61,211, // "v"
63,208, // "f"
64,23, // "i"
70,48, // "b"
73,316, // "n"
74,276, // "t"
75,219, // "w"
101,34, // "+"
  }
,
{ // state 332
23,167, // <empty bracket pair>
24,228, // `[
86,43, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 333
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 334
17,297, // `)
92,311, // ")"
  }
,
{ // state 335
10,234, // `}
12,198, // <decl in class>
13,178, // <method decl>
14,420, // `public
90,49, // "#"
106,278, // "}"
  }
,
{ // state 336
0x80000000|63, // match move
0x80000000|59, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 337
0x80000000|1, // match move
0x80000000|141, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 338
7,310, // ID
16,58, // `(
31,172, // <exp>
36,95, // <exp4>
37,218, // `true
38,93, // `false
39,407, // `+
40,105, // <exp3>
41,193, // `-
42,158, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,256, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 339
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 340
28,100, // `;
95,216, // ";"
  }
,
{ // state 341
0x80000000|265, // match move
0x80000000|115, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 342
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 343
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 344
24,MIN_REDUCTION+57, // `[
86,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 345
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+94, // (default reduction)
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
{ // state 346
0x80000000|268, // match move
0x80000000|416, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 347
2,287, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
128,MIN_REDUCTION+79, // $NT
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 348
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 349
2,26, // ws*
  }
,
{ // state 350
7,292, // ID
58,170, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,248, // letter128
78,128, // {199..218 231..250}
79,128, // {193..198 225..230}
  }
,
{ // state 351
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 352
24,MIN_REDUCTION+172, // `[
86,MIN_REDUCTION+172, // "["
89,249, // " "
105,176, // {10}
114,154, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 353
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 354
2,80, // ws*
24,MIN_REDUCTION+139, // `[
86,MIN_REDUCTION+139, // "["
89,249, // " "
105,176, // {10}
114,71, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 355
28,114, // `;
95,264, // ";"
  }
,
{ // state 356
2,83, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 357
16,142, // `(
100,159, // "("
  }
,
{ // state 358
89,417, // " "
105,138, // {10}
114,82, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 359
7,129, // ID
23,167, // <empty bracket pair>
24,228, // `[
58,170, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,248, // letter128
78,128, // {199..218 231..250}
79,128, // {193..198 225..230}
86,43, // "["
  }
,
{ // state 360
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 361
2,337, // ws*
24,MIN_REDUCTION+83, // `[
86,MIN_REDUCTION+83, // "["
89,249, // " "
105,176, // {10}
114,71, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 362
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 363
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 364
24,MIN_REDUCTION+54, // `[
86,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 365
17,294, // `)
92,311, // ")"
  }
,
{ // state 366
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 367
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 368
41,168, // `-
43,188, // `*
44,321, // `/
45,330, // `%
46,20, // `&&
47,78, // `<
48,127, // `>
52,174, // `instanceof
87,66, // "-"
88,391, // "<"
90,370, // "#"
94,8, // "/"
96,84, // ">"
99,293, // "%"
104,12, // "@"
110,356, // "*"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 369
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 370
64,181, // "i"
  }
,
{ // state 371
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
305, // ID
144, // `{
-1, // <decl in class>*
348, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
282, // `void
58, // `(
-1, // `)
413, // <stmt>*
359, // <type>
257, // `int
111, // `boolean
215, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
342, // <stmt>
97, // <assign>
-1, // `;
372, // <local var decl>
357, // `if
210, // <exp>
-1, // `else
225, // `while
355, // `break
-1, // `=
95, // <exp4>
218, // `true
93, // `false
407, // `+
105, // <exp3>
193, // `-
158, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
-1, // `<
-1, // `>
18, // <cast exp>
353, // <unary exp>
273, // <exp1>
-1, // `instanceof
125, // `!
303, // INTLIT
96, // STRINGLIT
244, // CHARLIT
186, // `this
67, // letter
298, // "a"
298, // "p"
298, // "v"
298, // "c"
298, // "f"
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
102, // letter128
239, // {199..218 231..250}
239, // {193..198 225..230}
-1, // digit
64, // {"1".."9"}
61, // "0"
341, // digit128
38, // {176..185}
-1, // any
-1, // "["
66, // "-"
-1, // "<"
-1, // " "
331, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
185, // "{"
-1, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
159, // "("
397, // "+"
-1, // "_"
-1, // "="
308, // "@"
-1, // {10}
278, // "}"
266, // "!"
313, // "'"
65, // '"'
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
{ // state 372
28,202, // `;
95,264, // ";"
  }
,
{ // state 373
127,MIN_REDUCTION+0, // $
  }
,
{ // state 374
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 375
24,MIN_REDUCTION+136, // `[
86,MIN_REDUCTION+136, // "["
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 376
89,MIN_REDUCTION+63, // " "
105,MIN_REDUCTION+63, // {10}
114,MIN_REDUCTION+63, // ws
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 377
0x80000000|233, // match move
0x80000000|103, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 378
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 379
24,MIN_REDUCTION+50, // `[
35,MIN_REDUCTION+50, // `=
39,MIN_REDUCTION+50, // `+
41,MIN_REDUCTION+50, // `-
43,MIN_REDUCTION+50, // `*
44,MIN_REDUCTION+50, // `/
45,MIN_REDUCTION+50, // `%
46,MIN_REDUCTION+50, // `&&
47,MIN_REDUCTION+50, // `<
48,MIN_REDUCTION+50, // `>
52,MIN_REDUCTION+50, // `instanceof
86,MIN_REDUCTION+50, // "["
87,MIN_REDUCTION+50, // "-"
88,MIN_REDUCTION+50, // "<"
90,MIN_REDUCTION+50, // "#"
94,MIN_REDUCTION+50, // "/"
96,MIN_REDUCTION+50, // ">"
99,MIN_REDUCTION+50, // "%"
101,MIN_REDUCTION+50, // "+"
103,MIN_REDUCTION+50, // "="
104,MIN_REDUCTION+50, // "@"
110,MIN_REDUCTION+50, // "*"
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 380
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 381
24,MIN_REDUCTION+170, // `[
86,MIN_REDUCTION+170, // "["
89,249, // " "
105,176, // {10}
114,154, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 383
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 384
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 385
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 386
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 387
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 388
2,267, // ws*
24,MIN_REDUCTION+169, // `[
86,MIN_REDUCTION+169, // "["
89,249, // " "
105,176, // {10}
114,71, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 389
0x80000000|309, // match move
0x80000000|94, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 390
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
305, // ID
109, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
282, // `void
58, // `(
-1, // `)
-1, // <stmt>*
359, // <type>
257, // `int
111, // `boolean
215, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
237, // <stmt>
171, // <assign>
-1, // `;
19, // <local var decl>
113, // `if
210, // <exp>
-1, // `else
40, // `while
340, // `break
-1, // `=
95, // <exp4>
218, // `true
93, // `false
407, // `+
105, // <exp3>
193, // `-
158, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
-1, // `<
-1, // `>
18, // <cast exp>
353, // <unary exp>
273, // <exp1>
-1, // `instanceof
125, // `!
303, // INTLIT
96, // STRINGLIT
244, // CHARLIT
186, // `this
67, // letter
298, // "a"
298, // "p"
298, // "v"
298, // "c"
298, // "f"
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
102, // letter128
239, // {199..218 231..250}
239, // {193..198 225..230}
-1, // digit
64, // {"1".."9"}
61, // "0"
341, // digit128
38, // {176..185}
-1, // any
-1, // "["
66, // "-"
-1, // "<"
-1, // " "
331, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
185, // "{"
-1, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
159, // "("
397, // "+"
-1, // "_"
-1, // "="
308, // "@"
-1, // {10}
-1, // "}"
266, // "!"
313, // "'"
65, // '"'
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
{ // state 391
2,312, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 392
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 393
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 394
89,MIN_REDUCTION+167, // " "
105,MIN_REDUCTION+167, // {10}
114,MIN_REDUCTION+167, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 395
24,MIN_REDUCTION+61, // `[
86,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 396
71,207, // "e"
  }
,
{ // state 397
2,107, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 398
0x80000000|136, // match move
0x80000000|240, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 399
65,347, // "l"
  }
,
{ // state 400
24,MIN_REDUCTION+167, // `[
86,MIN_REDUCTION+167, // "["
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 401
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 402
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 403
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 404
7,310, // ID
16,58, // `(
31,88, // <exp>
36,95, // <exp4>
37,218, // `true
38,93, // `false
39,407, // `+
40,105, // <exp3>
41,193, // `-
42,158, // <exp2>
49,18, // <cast exp>
50,353, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,256, // "#"
100,159, // "("
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 405
89,MIN_REDUCTION+166, // " "
105,MIN_REDUCTION+166, // {10}
114,MIN_REDUCTION+166, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 406
2,337, // ws*
  }
,
{ // state 407
7,310, // ID
39,407, // `+
41,193, // `-
50,201, // <unary exp>
51,273, // <exp1>
53,125, // `!
54,303, // INTLIT
55,96, // STRINGLIT
56,244, // CHARLIT
57,186, // `this
58,67, // letter
59,298, // "a"
60,298, // "p"
61,298, // "v"
62,298, // "c"
63,298, // "f"
64,298, // "i"
65,298, // "l"
66,298, // "o"
67,298, // "r"
68,298, // "u"
69,298, // "x"
70,298, // "b"
71,298, // "e"
72,298, // "h"
73,298, // "n"
74,298, // "t"
75,298, // "w"
76,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
77,102, // letter128
78,239, // {199..218 231..250}
79,239, // {193..198 225..230}
81,64, // {"1".."9"}
82,61, // "0"
83,341, // digit128
84,38, // {176..185}
87,66, // "-"
90,143, // "#"
101,397, // "+"
104,308, // "@"
107,266, // "!"
108,313, // "'"
109,65, // '"'
  }
,
{ // state 408
2,304, // ws*
89,60, // " "
105,25, // {10}
114,99, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 409
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 410
59,251, // "a"
60,251, // "p"
61,251, // "v"
62,251, // "c"
63,251, // "f"
64,251, // "i"
65,251, // "l"
66,251, // "o"
67,251, // "r"
68,251, // "u"
69,251, // "x"
70,251, // "b"
71,251, // "e"
72,251, // "h"
73,251, // "n"
74,251, // "t"
75,251, // "w"
76,251, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
79,299, // {193..198 225..230}
81,251, // {"1".."9"}
82,251, // "0"
84,299, // {176..185}
120,161, // $$2
125,197, // hexDigit
126,389, // hexDigit128
  }
,
{ // state 411
2,80, // ws*
  }
,
{ // state 412
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 413
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
305, // ID
144, // `{
-1, // <decl in class>*
384, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
282, // `void
58, // `(
-1, // `)
-1, // <stmt>*
359, // <type>
257, // `int
111, // `boolean
215, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
68, // <stmt>
97, // <assign>
-1, // `;
372, // <local var decl>
357, // `if
210, // <exp>
-1, // `else
225, // `while
355, // `break
-1, // `=
95, // <exp4>
218, // `true
93, // `false
407, // `+
105, // <exp3>
193, // `-
158, // <exp2>
-1, // `*
-1, // `/
-1, // `%
-1, // `&&
-1, // `<
-1, // `>
18, // <cast exp>
353, // <unary exp>
273, // <exp1>
-1, // `instanceof
125, // `!
303, // INTLIT
96, // STRINGLIT
244, // CHARLIT
186, // `this
67, // letter
298, // "a"
298, // "p"
298, // "v"
298, // "c"
298, // "f"
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "y".."z"}
102, // letter128
239, // {199..218 231..250}
239, // {193..198 225..230}
-1, // digit
64, // {"1".."9"}
61, // "0"
341, // digit128
38, // {176..185}
-1, // any
-1, // "["
66, // "-"
-1, // "<"
-1, // " "
331, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
185, // "{"
-1, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "|" "~"..127}
-1, // "%"
159, // "("
397, // "+"
-1, // "_"
-1, // "="
308, // "@"
-1, // {10}
278, // "}"
266, // "!"
313, // "'"
65, // '"'
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
{ // state 414
8,283, // `{
97,185, // "{"
  }
,
{ // state 415
0x80000000|1, // match move
0x80000000|153, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 416
24,MIN_REDUCTION+147, // `[
86,MIN_REDUCTION+147, // "["
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 417
0x80000000|118, // match move
0x80000000|169, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 418
66,325, // "o"
  }
,
{ // state 419
24,338, // `[
86,43, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 420
15,230, // `void
90,226, // "#"
  }
,
{ // state 421
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 422
0x80000000|16, // match move
0x80000000|378, // no-match move
0x80000000|221, // NT-test-match state for `else
  }
,
{ // state 423
2,182, // ws*
24,MIN_REDUCTION+119, // `[
86,MIN_REDUCTION+119, // "["
89,249, // " "
105,176, // {10}
114,71, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 424
2,37, // ws*
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 425
0x80000000|272, // match move
0x80000000|395, // no-match move
0x80000000|314, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 426
89,60, // " "
105,25, // {10}
114,32, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 427
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 428
MIN_REDUCTION+27, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[429][];
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
// <exp3> ::= <exp3> `< <exp2>
(40<<16)+3,
// <exp3> ::= <exp3> `> <exp2>
(40<<16)+3,
// <exp3> ::= <exp2>
(40<<16)+1,
// <exp2> ::= <cast exp>
(42<<16)+1,
// <exp2> ::= <unary exp>
(42<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(49<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(49<<16)+4,
// <exp3> ::= <exp3> `instanceof <type>
(40<<16)+3,
// <unary exp> ::= `+ <unary exp>
(50<<16)+2,
// <unary exp> ::= `- <unary exp>
(50<<16)+2,
// <unary exp> ::= `! <unary exp>
(50<<16)+2,
// <unary exp> ::= <exp1>
(50<<16)+1,
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
// <exp1> ::= `this
(51<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(58<<16)+1,
// letter128 ::= {193..218 225..250}
(77<<16)+1,
// digit ::= {"0".."9"}
(80<<16)+1,
// digit128 ::= {176..185}
(83<<16)+1,
// any ::= {0..127}
(85<<16)+1,
// any128 ::= {128..255}
(111<<16)+1,
// ws ::= " "
(114<<16)+1,
// ws ::= {10}
(114<<16)+1,
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
(57<<16)+4,
// `this ::= "#" "t" "h"
(57<<16)+3,
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
(52<<16)+4,
// `instanceof ::= "#" "i" "n"
(52<<16)+3,
// `public ::= "#" "p" "u" ws*
(14<<16)+4,
// `public ::= "#" "p" "u"
(14<<16)+3,
// `! ::= "!" ws*
(53<<16)+2,
// `! ::= "!"
(53<<16)+1,
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
// `< ::= "<" ws*
(47<<16)+2,
// `< ::= "<"
(47<<16)+1,
// `> ::= ">" !"=" ws*
(48<<16)+2,
// `> ::= ">" !"="
(48<<16)+1,
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
(54<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(54<<16)+2,
// INTLIT ::= digit128 ws*
(54<<16)+2,
// INTLIT ::= digit128
(54<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(54<<16)+3,
// INTLIT ::= "0" $$2
(54<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(55<<16)+3,
// STRINGLIT ::= "@" '"'
(55<<16)+2,
// STRINGLIT ::= '"' any* $$3
(55<<16)+3,
// STRINGLIT ::= '"' $$3
(55<<16)+2,
// CHARLIT ::= "'" any ws*
(56<<16)+3,
// CHARLIT ::= "'" any
(56<<16)+2,
// idChar ::= letter
(123<<16)+1,
// idChar ::= digit
(123<<16)+1,
// idChar ::= "_"
(123<<16)+1,
// idChar128 ::= letter128
(124<<16)+1,
// idChar128 ::= digit128
(124<<16)+1,
// idChar128 ::= {223}
(124<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(125<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(126<<16)+1,
// digit* ::= digit* digit
(117<<16)+2,
// digit* ::= digit
(117<<16)+1,
// any* ::= any* any
(121<<16)+2,
// any* ::= any
(121<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(119<<16)+2,
// hexDigit* ::= hexDigit
(119<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// idChar* ::= idChar* idChar
(115<<16)+2,
// idChar* ::= idChar
(115<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(116<<16)+2,
// $$0 ::= idChar128
(116<<16)+1,
// $$1 ::= digit128 ws*
(118<<16)+2,
// $$1 ::= digit128
(118<<16)+1,
// $$2 ::= hexDigit128 ws*
(120<<16)+2,
// $$2 ::= hexDigit128
(120<<16)+1,
// $$3 ::= any128 ws*
(122<<16)+2,
// $$3 ::= any128
(122<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
98, // 0
98, // 1
98, // 2
98, // 3
98, // 4
98, // 5
98, // 6
98, // 7
98, // 8
98, // 9
105, // 10
98, // 11
98, // 12
98, // 13
98, // 14
98, // 15
98, // 16
98, // 17
98, // 18
98, // 19
98, // 20
98, // 21
98, // 22
98, // 23
98, // 24
98, // 25
98, // 26
98, // 27
98, // 28
98, // 29
98, // 30
98, // 31
89, // " "
107, // "!"
109, // '"'
90, // "#"
98, // "$"
99, // "%"
91, // "&"
108, // "'"
100, // "("
92, // ")"
110, // "*"
101, // "+"
98, // ","
87, // "-"
98, // "."
94, // "/"
82, // "0"
81, // "1"
81, // "2"
81, // "3"
81, // "4"
81, // "5"
81, // "6"
81, // "7"
81, // "8"
81, // "9"
98, // ":"
95, // ";"
88, // "<"
103, // "="
96, // ">"
98, // "?"
104, // "@"
76, // "A"
76, // "B"
76, // "C"
76, // "D"
76, // "E"
76, // "F"
76, // "G"
76, // "H"
76, // "I"
76, // "J"
76, // "K"
76, // "L"
76, // "M"
76, // "N"
76, // "O"
76, // "P"
76, // "Q"
76, // "R"
76, // "S"
76, // "T"
76, // "U"
76, // "V"
76, // "W"
76, // "X"
76, // "Y"
76, // "Z"
86, // "["
98, // "\"
93, // "]"
98, // "^"
102, // "_"
98, // "`"
59, // "a"
70, // "b"
62, // "c"
76, // "d"
71, // "e"
63, // "f"
76, // "g"
72, // "h"
64, // "i"
76, // "j"
76, // "k"
65, // "l"
76, // "m"
73, // "n"
66, // "o"
60, // "p"
76, // "q"
67, // "r"
76, // "s"
74, // "t"
68, // "u"
61, // "v"
75, // "w"
69, // "x"
76, // "y"
76, // "z"
97, // "{"
98, // "|"
106, // "}"
98, // "~"
98, // 127
113, // 128
113, // 129
113, // 130
113, // 131
113, // 132
113, // 133
113, // 134
113, // 135
113, // 136
113, // 137
113, // 138
113, // 139
113, // 140
113, // 141
113, // 142
113, // 143
113, // 144
113, // 145
113, // 146
113, // 147
113, // 148
113, // 149
113, // 150
113, // 151
113, // 152
113, // 153
113, // 154
113, // 155
113, // 156
113, // 157
113, // 158
113, // 159
113, // 160
113, // 161
113, // 162
113, // 163
113, // 164
113, // 165
113, // 166
113, // 167
113, // 168
113, // 169
113, // 170
113, // 171
113, // 172
113, // 173
113, // 174
113, // 175
84, // 176
84, // 177
84, // 178
84, // 179
84, // 180
84, // 181
84, // 182
84, // 183
84, // 184
84, // 185
113, // 186
113, // 187
113, // 188
113, // 189
113, // 190
113, // 191
113, // 192
79, // 193
79, // 194
79, // 195
79, // 196
79, // 197
79, // 198
78, // 199
78, // 200
78, // 201
78, // 202
78, // 203
78, // 204
78, // 205
78, // 206
78, // 207
78, // 208
78, // 209
78, // 210
78, // 211
78, // 212
78, // 213
78, // 214
78, // 215
78, // 216
78, // 217
78, // 218
113, // 219
113, // 220
113, // 221
113, // 222
112, // 223
113, // 224
79, // 225
79, // 226
79, // 227
79, // 228
79, // 229
79, // 230
78, // 231
78, // 232
78, // 233
78, // 234
78, // 235
78, // 236
78, // 237
78, // 238
78, // 239
78, // 240
78, // 241
78, // 242
78, // 243
78, // 244
78, // 245
78, // 246
78, // 247
78, // 248
78, // 249
78, // 250
113, // 251
113, // 252
113, // 253
113, // 254
113, // 255
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
"<exp> ::= <exp4>", // 28
"<exp4> ::= # `true", // 29
"<exp4> ::= # `false", // 30
"<exp4> ::= <exp4> # `+ <exp3>", // 31
"<exp3> ::= <exp3> # `- <exp2>", // 32
"<exp4> ::= <exp3>", // 33
"<exp3> ::= <exp3> # `* <exp2>", // 34
"<exp3> ::= <exp3> # `/ <exp2>", // 35
"<exp3> ::= <exp3> # `% <exp2>", // 36
"<exp3> ::= <exp3> # `&& <exp2>", // 37
"<exp3> ::= <exp3> # `< <exp2>", // 38
"<exp3> ::= <exp3> # `> <exp2>", // 39
"<exp3> ::= <exp2>", // 40
"<exp2> ::= <cast exp>", // 41
"<exp2> ::= <unary exp>", // 42
"<cast exp> ::= # `( <type> `) <cast exp>", // 43
"<cast exp> ::= # `( <type> `) <exp1>", // 44
"<exp3> ::= <exp3> # `instanceof <type>", // 45
"<unary exp> ::= # `+ <unary exp>", // 46
"<unary exp> ::= # `- <unary exp>", // 47
"<unary exp> ::= # `! <unary exp>", // 48
"<unary exp> ::= <exp1>", // 49
"<exp1> ::= # ID", // 50
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 51
"<exp1> ::= # INTLIT", // 52
"<exp1> ::= # STRINGLIT", // 53
"<exp1> ::= # CHARLIT", // 54
"<exp1> ::= # `this", // 55
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 56
"letter128 ::= {193..218 225..250}", // 57
"digit ::= {\"0\"..\"9\"}", // 58
"digit128 ::= {176..185}", // 59
"any ::= {0..127}", // 60
"any128 ::= {128..255}", // 61
"ws ::= \" \"", // 62
"ws ::= {10} registerNewline", // 63
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 64
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 65
"`class ::= \"#\" \"c\" \"l\" ws*", // 66
"`class ::= \"#\" \"c\" \"l\" ws*", // 67
"`extends ::= \"#\" \"e\" \"x\" ws*", // 68
"`extends ::= \"#\" \"e\" \"x\" ws*", // 69
"`void ::= \"#\" \"v\" \"o\" ws*", // 70
"`void ::= \"#\" \"v\" \"o\" ws*", // 71
"`int ::= \"#\" \"i\" \"t\" ws*", // 72
"`int ::= \"#\" \"i\" \"t\" ws*", // 73
"`while ::= \"#\" \"w\" \"h\" ws*", // 74
"`while ::= \"#\" \"w\" \"h\" ws*", // 75
"`if ::= \"#\" \"+\" ws*", // 76
"`if ::= \"#\" \"+\" ws*", // 77
"`else ::= \"#\" \"e\" \"l\" ws*", // 78
"`else ::= \"#\" \"e\" \"l\" ws*", // 79
"`break ::= \"#\" \"b\" \"r\" ws*", // 80
"`break ::= \"#\" \"b\" \"r\" ws*", // 81
"`this ::= \"#\" \"t\" \"h\" ws*", // 82
"`this ::= \"#\" \"t\" \"h\" ws*", // 83
"`false ::= \"#\" \"f\" \"a\" ws*", // 84
"`false ::= \"#\" \"f\" \"a\" ws*", // 85
"`true ::= \"#\" \"t\" \"r\" ws*", // 86
"`true ::= \"#\" \"t\" \"r\" ws*", // 87
"`null ::= \"#\" \"n\" \"u\" ws*", // 88
"`null ::= \"#\" \"n\" \"u\" ws*", // 89
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 90
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 91
"`public ::= \"#\" \"p\" \"u\" ws*", // 92
"`public ::= \"#\" \"p\" \"u\" ws*", // 93
"`! ::= \"!\" ws*", // 94
"`! ::= \"!\" ws*", // 95
"`% ::= \"%\" ws*", // 96
"`% ::= \"%\" ws*", // 97
"`&& ::= \"@\" \"&\" ws*", // 98
"`&& ::= \"@\" \"&\" ws*", // 99
"`* ::= \"*\" ws*", // 100
"`* ::= \"*\" ws*", // 101
"`( ::= \"(\" ws*", // 102
"`( ::= \"(\" ws*", // 103
"`) ::= \")\" ws*", // 104
"`) ::= \")\" ws*", // 105
"`{ ::= \"{\" ws*", // 106
"`{ ::= \"{\" ws*", // 107
"`} ::= \"}\" ws*", // 108
"`} ::= \"}\" ws*", // 109
"`- ::= \"-\" ws*", // 110
"`- ::= \"-\" ws*", // 111
"`+ ::= \"+\" ws*", // 112
"`+ ::= \"+\" ws*", // 113
"`= ::= \"=\" ws*", // 114
"`= ::= \"=\" ws*", // 115
"`[ ::= \"[\" ws*", // 116
"`[ ::= \"[\" ws*", // 117
"`] ::= \"]\" ws*", // 118
"`] ::= \"]\" ws*", // 119
"`< ::= \"<\" ws*", // 120
"`< ::= \"<\" ws*", // 121
"`> ::= \">\" !\"=\" ws*", // 122
"`> ::= \">\" !\"=\" ws*", // 123
"`; ::= \";\" ws*", // 124
"`; ::= \";\" ws*", // 125
"`/ ::= \"/\" ws*", // 126
"`/ ::= \"/\" ws*", // 127
"ID ::= letter128 ws*", // 128
"ID ::= letter128 ws*", // 129
"ID ::= letter idChar* idChar128 ws*", // 130
"ID ::= letter idChar* idChar128 ws*", // 131
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 132
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 133
"INTLIT ::= digit128 ws*", // 134
"INTLIT ::= digit128 ws*", // 135
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 136
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 137
"STRINGLIT ::= \"@\" \'\"\' ws*", // 138
"STRINGLIT ::= \"@\" \'\"\' ws*", // 139
"STRINGLIT ::= \'\"\' any* any128 ws*", // 140
"STRINGLIT ::= \'\"\' any* any128 ws*", // 141
"CHARLIT ::= \"\'\" any ws*", // 142
"CHARLIT ::= \"\'\" any ws*", // 143
"idChar ::= letter", // 144
"idChar ::= digit", // 145
"idChar ::= \"_\"", // 146
"idChar128 ::= letter128", // 147
"idChar128 ::= digit128", // 148
"idChar128 ::= {223}", // 149
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 150
"hexDigit128 ::= {176..185 193..198 225..230}", // 151
"digit* ::= digit* digit", // 152
"digit* ::= digit* digit", // 153
"any* ::= any* any", // 154
"any* ::= any* any", // 155
"<decl in class>* ::= <decl in class>* <decl in class>", // 156
"<decl in class>* ::= <decl in class>* <decl in class>", // 157
"hexDigit* ::= hexDigit* hexDigit", // 158
"hexDigit* ::= hexDigit* hexDigit", // 159
"<stmt>* ::= <stmt>* <stmt>", // 160
"<stmt>* ::= <stmt>* <stmt>", // 161
"idChar* ::= idChar* idChar", // 162
"idChar* ::= idChar* idChar", // 163
"<class decl>+ ::= <class decl>", // 164
"<class decl>+ ::= <class decl>+ <class decl>", // 165
"ws* ::= ws* ws", // 166
"ws* ::= ws* ws", // 167
"", // 168
"", // 169
"", // 170
"", // 171
"", // 172
"", // 173
"", // 174
"", // 175
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
    { // 28: <exp> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp4> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 30: <exp4> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 31: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 32: <exp3> ::= <exp3> [#] `- <exp2> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 33: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 34: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 35: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 36: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 37: <exp3> ::= <exp3> [#] `&& <exp2> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 38: <exp3> ::= <exp3> [#] `< <exp2> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 39: <exp3> ::= <exp3> [#] `> <exp2> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 40: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 43: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 44: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 45: <exp3> ::= <exp3> [#] `instanceof <type> @newInstanceOf(Exp,int,Type)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 46: <unary exp> ::= [#] `+ <unary exp> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 47: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 48: <unary exp> ::= [#] `! <unary exp> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 49: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 50: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 51: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 52: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 53: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 54: <exp1> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 55: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 56: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 57: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 58: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 59: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 60: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 61: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 62: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 63: ws ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 64: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 65: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 69: `extends ::= "#" "e" "x" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 70: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 71: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 72: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 73: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 74: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 75: `while ::= "#" "w" "h" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 76: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 77: `if ::= "#" "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 78: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 79: `else ::= "#" "e" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 80: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 81: `break ::= "#" "b" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 82: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 83: `this ::= "#" "t" "h" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 84: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 85: `false ::= "#" "f" "a" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 86: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 87: `true ::= "#" "t" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 88: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 89: `null ::= "#" "n" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 90: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 91: `instanceof ::= "#" "i" "n" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 92: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 93: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 94: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 95: `! ::= "!" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 96: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 97: `% ::= "%" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 99: `&& ::= "@" "&" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 100: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 101: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 102: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 103: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 104: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 105: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 106: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 107: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 108: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 111: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 112: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 118: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `< ::= "<" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `> ::= ">" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `/ ::= "/" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 129: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 130: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 131: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 132: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 133: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 134: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 135: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 136: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 137: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 138: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 139: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 140: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 141: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 142: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 143: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 144: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 145: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 146: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 147: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 148: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 149: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 150: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 151: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 152: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 153: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 154: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 155: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 156: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 157: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 158: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 159: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 160: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 161: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 162: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 163: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 164: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 165: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 166: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 167: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 168: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 169: $$0 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 170: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 171: $$1 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 172: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 173: $$2 ::= hexDigit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 174: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 175: $$3 ::= any128 [ws*] @pass
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
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Type parm2 = (Type)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 34: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
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
"Exp newTrue(int)",
"Exp newFalse(int)",
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newRemainder(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newLessThan(Exp,int,Exp)",
"Exp newGreaterThan(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newInstanceOf(Exp,int,Type)",
"Exp newUnaryPlus(int,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newUnaryNot(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"Exp newStringLiteral(int,String)",
"Exp newCharLiteral(int,int)",
"Exp newThis(int)",
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
