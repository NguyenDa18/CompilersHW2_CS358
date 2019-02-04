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
public int getEofSym() { return 110; }
public int getNttSym() { return 111; }
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
"<decl in class>",
"<method decl>",
"`public",
"`void",
"`(",
"`)",
"<stmt>*",
"<type>",
"`int",
"`null",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"<local var decl>",
"`break",
"<exp>",
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
"INTLIT",
"STRINGLIT",
"letter",
"\"a\"",
"\"p\"",
"\"v\"",
"{\"A\"..\"Z\" \"d\"..\"e\" \"g\"..\"h\" \"j\"..\"k\" \"m\" \"q\" \"s\" \"w\"..\"z\"}",
"\"c\"",
"\"f\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"b\"",
"\"n\"",
"\"t\"",
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
"{0..9 11..31 \"!\" \"$\" \"\'\" \",\" \".\" \":\" \"<\" \">\"..\"?\" \"\\\" \"^\" \"`\" \"|\" \"~\"..127}",
"\"_\"",
"\"=\"",
"\"@\"",
"10",
"\"}\"",
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
public int numSymbols() { return 112;}
private static final int MIN_REDUCTION = 300;
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
1,223, // <start>
2,291, // ws*
3,138, // <program>
4,56, // <class decl>+
5,208, // <class decl>
6,83, // `class
75,78, // " "
76,180, // "#"
90,24, // {10}
97,260, // ws
  }
,
{ // state 1
  }
,
{ // state 2
23,MIN_REDUCTION+52, // `[
73,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 4
75,78, // " "
90,24, // {10}
97,36, // ws
111,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 5
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 6
7,125, // ID
15,76, // `(
30,298, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,91, // <exp3>
37,261, // `-
38,201, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
76,44, // "#"
84,8, // "("
89,264, // "@"
92,221, // '"'
  }
,
{ // state 7
52,183, // "v"
56,181, // "i"
61,25, // "b"
62,263, // "n"
  }
,
{ // state 8
2,251, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 9
0x80000000|1, // match move
0x80000000|233, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 10
7,125, // ID
15,76, // `(
30,31, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,91, // <exp3>
37,261, // `-
38,201, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
76,44, // "#"
84,8, // "("
89,264, // "@"
92,221, // '"'
  }
,
{ // state 11
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 12
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 13
0x80000000|1, // match move
0x80000000|166, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 14
50,39, // "a"
51,39, // "p"
52,39, // "v"
53,39, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,39, // "c"
55,39, // "f"
56,39, // "i"
57,39, // "l"
58,39, // "o"
59,39, // "r"
60,39, // "u"
61,39, // "b"
62,39, // "n"
63,39, // "t"
65,295, // {199..218 231..250}
66,295, // {193..198 225..230}
68,39, // {"1".."9"}
69,39, // "0"
71,295, // {176..185}
72,3, // any
73,39, // "["
74,39, // "-"
75,39, // " "
76,39, // "#"
77,39, // "&"
78,39, // ")"
79,39, // "]"
80,39, // "/"
81,39, // ";"
82,39, // "{"
83,39, // "%"
84,39, // "("
85,39, // "+"
86,39, // {0..9 11..31 "!" "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
87,39, // "_"
88,39, // "="
89,39, // "@"
90,39, // {10}
91,39, // "}"
92,39, // '"'
93,39, // "*"
94,109, // any128
95,295, // {223}
96,295, // {128..175 186..192 219..222 224 251..255}
105,285, // $$3
  }
,
{ // state 15
23,MIN_REDUCTION+51, // `[
73,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 17
24,102, // `]
79,293, // "]"
  }
,
{ // state 18
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 19
7,125, // ID
15,76, // `(
37,261, // `-
38,67, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
84,8, // "("
89,264, // "@"
92,221, // '"'
  }
,
{ // state 20
23,MIN_REDUCTION+105, // `[
73,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 21
60,60, // "u"
  }
,
{ // state 22
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 23
50,52, // "a"
51,52, // "p"
52,52, // "v"
53,52, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,52, // "c"
55,52, // "f"
56,52, // "i"
57,52, // "l"
58,52, // "o"
59,52, // "r"
60,52, // "u"
61,52, // "b"
62,52, // "n"
63,52, // "t"
66,116, // {193..198 225..230}
68,52, // {"1".."9"}
69,52, // "0"
71,116, // {176..185}
102,277, // hexDigit*
103,29, // $$2
108,133, // hexDigit
109,128, // hexDigit128
  }
,
{ // state 24
111,MIN_REDUCTION+52, // $NT
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 25
58,287, // "o"
  }
,
{ // state 26
2,124, // ws*
  }
,
{ // state 27
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 28
2,296, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 29
0x80000000|1, // match move
0x80000000|77, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 30
2,42, // ws*
23,MIN_REDUCTION+102, // `[
73,MIN_REDUCTION+102, // "["
75,48, // " "
90,231, // {10}
97,169, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 31
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 32
0x80000000|150, // match move
0x80000000|176, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 33
23,MIN_REDUCTION+44, // `[
73,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 34
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 35
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 36
111,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 37
0x80000000|1, // match move
0x80000000|215, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
0x80000000|136, // match move
0x80000000|171, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 39
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 40
2,224, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 41
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 42
0x80000000|160, // match move
0x80000000|155, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 43
0x80000000|270, // match move
0x80000000|182, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 44
55,54, // "f"
63,122, // "t"
  }
,
{ // state 45
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 46
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 47
58,287, // "o"
59,250, // "r"
  }
,
{ // state 48
0x80000000|244, // match move
0x80000000|15, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 49
2,193, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 50
23,MIN_REDUCTION+111, // `[
73,MIN_REDUCTION+111, // "["
75,48, // " "
90,231, // {10}
97,190, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 51
23,MIN_REDUCTION+42, // `[
73,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 53
16,103, // `)
22,217, // <empty bracket pair>
23,17, // `[
73,126, // "["
78,49, // ")"
  }
,
{ // state 54
50,236, // "a"
  }
,
{ // state 55
23,MIN_REDUCTION+138, // `[
73,MIN_REDUCTION+138, // "["
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 56
5,266, // <class decl>
6,83, // `class
76,180, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 59
52,183, // "v"
55,54, // "f"
56,181, // "i"
61,47, // "b"
62,263, // "n"
63,122, // "t"
  }
,
{ // state 60
2,216, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 62
0x80000000|254, // match move
0x80000000|94, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 63
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 64
7,125, // ID
15,76, // `(
36,194, // <exp3>
37,261, // `-
38,201, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
84,8, // "("
89,264, // "@"
92,221, // '"'
  }
,
{ // state 65
2,139, // ws*
23,MIN_REDUCTION+144, // `[
73,MIN_REDUCTION+144, // "["
75,48, // " "
90,231, // {10}
97,169, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 66
49,178, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,185, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
67,232, // digit
68,276, // {"1".."9"}
69,276, // "0"
70,163, // digit128
71,43, // {176..185}
87,11, // "_"
95,62, // {223}
98,81, // idChar*
99,38, // $$0
106,87, // idChar
107,234, // idChar128
  }
,
{ // state 67
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 68
2,37, // ws*
  }
,
{ // state 69
23,MIN_REDUCTION+95, // `[
73,MIN_REDUCTION+95, // "["
75,48, // " "
90,231, // {10}
97,190, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 70
0x80000000|68, // match move
0x80000000|154, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 71
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 72
0x80000000|229, // match move
0x80000000|86, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 73
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 75
2,63, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 76
7,265, // ID
14,96, // `void
18,53, // <type>
19,58, // `int
20,294, // `null
21,132, // `boolean
49,257, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,172, // letter128
65,156, // {199..218 231..250}
66,156, // {193..198 225..230}
76,7, // "#"
  }
,
{ // state 77
23,MIN_REDUCTION+110, // `[
73,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 78
111,MIN_REDUCTION+51, // $NT
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 79
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 80
2,9, // ws*
  }
,
{ // state 81
49,178, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,185, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
67,232, // digit
68,276, // {"1".."9"}
69,276, // "0"
70,163, // digit128
71,43, // {176..185}
87,11, // "_"
95,62, // {223}
99,151, // $$0
106,292, // idChar
107,234, // idChar128
  }
,
{ // state 82
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 83
7,104, // ID
49,257, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,172, // letter128
65,156, // {199..218 231..250}
66,156, // {193..198 225..230}
  }
,
{ // state 84
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 85
0x80000000|1, // match move
0x80000000|290, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 86
23,MIN_REDUCTION+139, // `[
73,MIN_REDUCTION+139, // "["
75,48, // " "
90,231, // {10}
97,190, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 89
0x80000000|1, // match move
0x80000000|20, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 90
2,46, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 91
37,218, // `-
39,255, // `*
40,152, // `/
41,165, // `%
42,19, // `&&
46,228, // `instanceof
74,149, // "-"
76,170, // "#"
80,258, // "/"
83,204, // "%"
89,196, // "@"
93,269, // "*"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 92
7,120, // ID
8,92, // `{
10,18, // `}
14,96, // `void
15,76, // `(
17,101, // <stmt>*
18,202, // <type>
19,58, // `int
20,294, // `null
21,132, // `boolean
25,210, // <stmt>
26,114, // <assign>
28,222, // <local var decl>
29,195, // `break
30,288, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,91, // <exp3>
37,261, // `-
38,201, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
76,59, // "#"
82,235, // "{"
84,8, // "("
89,264, // "@"
91,143, // "}"
92,221, // '"'
  }
,
{ // state 93
23,MIN_REDUCTION+122, // `[
73,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 94
23,MIN_REDUCTION+120, // `[
73,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 95
23,MIN_REDUCTION+119, // `[
73,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 96
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|50, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 99
2,124, // ws*
23,MIN_REDUCTION+146, // `[
73,MIN_REDUCTION+146, // "["
75,48, // " "
90,231, // {10}
97,169, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 101
7,120, // ID
8,92, // `{
10,130, // `}
14,96, // `void
15,76, // `(
18,202, // <type>
19,58, // `int
20,294, // `null
21,132, // `boolean
25,82, // <stmt>
26,114, // <assign>
28,222, // <local var decl>
29,195, // `break
30,288, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,91, // <exp3>
37,261, // `-
38,201, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
76,59, // "#"
82,235, // "{"
84,8, // "("
89,264, // "@"
91,143, // "}"
92,221, // '"'
  }
,
{ // state 102
111,MIN_REDUCTION+15, // $NT
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 103
7,125, // ID
15,76, // `(
43,88, // <cast exp>
45,13, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
84,8, // "("
89,264, // "@"
92,221, // '"'
  }
,
{ // state 104
8,148, // `{
82,235, // "{"
  }
,
{ // state 105
2,134, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 107
2,164, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 109
0x80000000|26, // match move
0x80000000|99, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 110
49,178, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,199, // letter128
65,156, // {199..218 231..250}
66,156, // {193..198 225..230}
67,232, // digit
68,276, // {"1".."9"}
69,276, // "0"
70,100, // digit128
71,141, // {176..185}
87,11, // "_"
95,239, // {223}
99,71, // $$0
106,292, // idChar
107,28, // idChar128
  }
,
{ // state 111
35,64, // `+
85,214, // "+"
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 112
0x80000000|1, // match move
0x80000000|33, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 113
2,42, // ws*
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 114
27,34, // `;
81,272, // ";"
  }
,
{ // state 115
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 116
0x80000000|121, // match move
0x80000000|93, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 117
67,61, // digit
68,276, // {"1".."9"}
69,276, // "0"
70,284, // digit128
71,43, // {176..185}
101,89, // $$1
  }
,
{ // state 118
0x80000000|1, // match move
0x80000000|51, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 119
0x80000000|1, // match move
0x80000000|271, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 120
0x80000000|297, // match move
0x80000000|227, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 122
59,40, // "r"
  }
,
{ // state 123
2,139, // ws*
  }
,
{ // state 124
0x80000000|1, // match move
0x80000000|161, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 125
0x80000000|1, // match move
0x80000000|256, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 126
2,45, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 127
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 128
0x80000000|123, // match move
0x80000000|65, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
23,17, // `[
73,126, // "["
  }
,
{ // state 130
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 131
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 134
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 138
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 139
0x80000000|1, // match move
0x80000000|191, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 140
57,105, // "l"
  }
,
{ // state 141
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 143
2,184, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 144
16,198, // `)
78,49, // ")"
  }
,
{ // state 145
2,9, // ws*
23,MIN_REDUCTION+142, // `[
73,MIN_REDUCTION+142, // "["
75,48, // " "
90,231, // {10}
97,169, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 146
62,259, // "n"
  }
,
{ // state 147
23,MIN_REDUCTION+114, // `[
73,MIN_REDUCTION+114, // "["
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 148
9,173, // <decl in class>*
10,73, // `}
11,247, // <decl in class>
12,237, // <method decl>
13,268, // `public
76,267, // "#"
91,143, // "}"
  }
,
{ // state 149
2,41, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 151
0x80000000|108, // match move
0x80000000|159, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 152
7,125, // ID
15,76, // `(
37,261, // `-
38,135, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
84,8, // "("
89,264, // "@"
92,221, // '"'
  }
,
{ // state 153
23,MIN_REDUCTION+137, // `[
73,MIN_REDUCTION+137, // "["
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 154
2,37, // ws*
23,MIN_REDUCTION+108, // `[
73,MIN_REDUCTION+108, // "["
75,48, // " "
90,231, // {10}
97,169, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 155
23,MIN_REDUCTION+101, // `[
73,MIN_REDUCTION+101, // "["
75,48, // " "
90,231, // {10}
97,190, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 157
2,246, // ws*
23,MIN_REDUCTION+96, // `[
73,MIN_REDUCTION+96, // "["
75,48, // " "
90,231, // {10}
97,169, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 158
31,6, // `=
88,107, // "="
  }
,
{ // state 159
23,MIN_REDUCTION+103, // `[
73,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 161
23,MIN_REDUCTION+145, // `[
73,MIN_REDUCTION+145, // "["
75,48, // " "
90,231, // {10}
97,190, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 162
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 163
0x80000000|57, // match move
0x80000000|95, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 164
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 165
7,125, // ID
15,76, // `(
37,261, // `-
38,177, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
84,8, // "("
89,264, // "@"
92,221, // '"'
  }
,
{ // state 166
23,175, // `[
73,126, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 167
22,217, // <empty bracket pair>
23,17, // `[
73,126, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 168
0x80000000|1, // match move
0x80000000|147, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 169
0x80000000|22, // match move
0x80000000|55, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 170
56,146, // "i"
  }
,
{ // state 171
23,MIN_REDUCTION+104, // `[
73,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 172
2,162, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 173
10,27, // `}
11,274, // <decl in class>
12,237, // <method decl>
13,268, // `public
76,267, // "#"
91,143, // "}"
  }
,
{ // state 174
15,144, // `(
84,8, // "("
  }
,
{ // state 175
7,125, // ID
15,76, // `(
30,226, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,91, // <exp3>
37,261, // `-
38,201, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
76,44, // "#"
84,8, // "("
89,264, // "@"
92,221, // '"'
  }
,
{ // state 176
23,MIN_REDUCTION+46, // `[
73,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 177
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 180
54,140, // "c"
  }
,
{ // state 181
63,75, // "t"
  }
,
{ // state 182
23,MIN_REDUCTION+48, // `[
73,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 183
58,281, // "o"
  }
,
{ // state 184
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 185
0x80000000|74, // match move
0x80000000|286, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 186
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 187
0x80000000|213, // match move
0x80000000|157, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 188
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 189
23,MIN_REDUCTION+113, // `[
73,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 190
0x80000000|243, // match move
0x80000000|153, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 191
23,MIN_REDUCTION+143, // `[
73,MIN_REDUCTION+143, // "["
75,48, // " "
90,231, // {10}
97,190, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 193
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 194
37,218, // `-
39,255, // `*
40,152, // `/
41,165, // `%
42,19, // `&&
46,228, // `instanceof
74,149, // "-"
76,170, // "#"
80,258, // "/"
83,204, // "%"
89,196, // "@"
93,269, // "*"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 195
27,137, // `;
81,272, // ";"
  }
,
{ // state 196
77,90, // "&"
  }
,
{ // state 197
2,186, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 198
8,253, // `{
82,235, // "{"
  }
,
{ // state 199
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 200
67,238, // digit
68,276, // {"1".."9"}
69,276, // "0"
70,284, // digit128
71,43, // {176..185}
100,117, // digit*
101,207, // $$1
  }
,
{ // state 201
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 202
7,158, // ID
22,217, // <empty bracket pair>
23,17, // `[
49,257, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,172, // letter128
65,156, // {199..218 231..250}
66,156, // {193..198 225..230}
73,126, // "["
  }
,
{ // state 203
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 204
2,188, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 205
23,MIN_REDUCTION+106, // `[
73,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 206
52,183, // "v"
  }
,
{ // state 207
0x80000000|1, // match move
0x80000000|205, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 208
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 209
0x80000000|1, // match move
0x80000000|225, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 210
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 211
2,97, // ws*
23,MIN_REDUCTION+112, // `[
73,MIN_REDUCTION+112, // "["
75,48, // " "
90,231, // {10}
97,169, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 212
0x80000000|278, // match move
0x80000000|211, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 213
2,246, // ws*
  }
,
{ // state 214
2,127, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 215
23,MIN_REDUCTION+107, // `[
73,MIN_REDUCTION+107, // "["
75,48, // " "
90,231, // {10}
97,190, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 216
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 218
7,125, // ID
15,76, // `(
37,261, // `-
38,248, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
84,8, // "("
89,264, // "@"
92,221, // '"'
  }
,
{ // state 219
2,72, // ws*
23,MIN_REDUCTION+140, // `[
73,MIN_REDUCTION+140, // "["
75,48, // " "
90,231, // {10}
97,169, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 220
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 221
50,39, // "a"
51,39, // "p"
52,39, // "v"
53,39, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,39, // "c"
55,39, // "f"
56,39, // "i"
57,39, // "l"
58,39, // "o"
59,39, // "r"
60,39, // "u"
61,39, // "b"
62,39, // "n"
63,39, // "t"
65,295, // {199..218 231..250}
66,295, // {193..198 225..230}
68,39, // {"1".."9"}
69,39, // "0"
71,295, // {176..185}
72,142, // any
73,39, // "["
74,39, // "-"
75,39, // " "
76,39, // "#"
77,39, // "&"
78,39, // ")"
79,39, // "]"
80,39, // "/"
81,39, // ";"
82,39, // "{"
83,39, // "%"
84,39, // "("
85,39, // "+"
86,39, // {0..9 11..31 "!" "$" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
87,39, // "_"
88,39, // "="
89,39, // "@"
90,39, // {10}
91,39, // "}"
92,39, // '"'
93,39, // "*"
94,109, // any128
95,295, // {223}
96,295, // {128..175 186..192 219..222 224 251..255}
104,14, // any*
105,168, // $$3
  }
,
{ // state 222
27,279, // `;
81,272, // ";"
  }
,
{ // state 223
110,MIN_REDUCTION+0, // $
  }
,
{ // state 224
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 225
23,MIN_REDUCTION+109, // `[
73,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 226
24,118, // `]
79,187, // "]"
  }
,
{ // state 227
23,MIN_REDUCTION+41, // `[
31,MIN_REDUCTION+41, // `=
35,MIN_REDUCTION+41, // `+
37,MIN_REDUCTION+41, // `-
39,MIN_REDUCTION+41, // `*
40,MIN_REDUCTION+41, // `/
41,MIN_REDUCTION+41, // `%
42,MIN_REDUCTION+41, // `&&
46,MIN_REDUCTION+41, // `instanceof
73,MIN_REDUCTION+41, // "["
74,MIN_REDUCTION+41, // "-"
76,MIN_REDUCTION+41, // "#"
80,MIN_REDUCTION+41, // "/"
83,MIN_REDUCTION+41, // "%"
85,MIN_REDUCTION+41, // "+"
88,MIN_REDUCTION+41, // "="
89,MIN_REDUCTION+41, // "@"
93,MIN_REDUCTION+41, // "*"
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 228
7,265, // ID
14,96, // `void
18,167, // <type>
19,58, // `int
20,294, // `null
21,132, // `boolean
49,257, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,172, // letter128
65,156, // {199..218 231..250}
66,156, // {193..198 225..230}
76,7, // "#"
  }
,
{ // state 229
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 230
7,174, // ID
49,257, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,172, // letter128
65,156, // {199..218 231..250}
66,156, // {193..198 225..230}
  }
,
{ // state 231
0x80000000|249, // match move
0x80000000|2, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 232
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 233
23,MIN_REDUCTION+141, // `[
73,MIN_REDUCTION+141, // "["
75,48, // " "
90,231, // {10}
97,190, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 234
0x80000000|252, // match move
0x80000000|219, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 235
2,280, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 236
2,220, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 239
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 240
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 243
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 244
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 245
0x80000000|113, // match move
0x80000000|30, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 246
0x80000000|1, // match move
0x80000000|69, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 247
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 248
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 249
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 250
2,240, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 251
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 252
2,72, // ws*
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 253
7,120, // ID
8,92, // `{
10,179, // `}
14,96, // `void
15,76, // `(
17,283, // <stmt>*
18,202, // <type>
19,58, // `int
20,294, // `null
21,132, // `boolean
25,210, // <stmt>
26,114, // <assign>
28,222, // <local var decl>
29,195, // `break
30,288, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,91, // <exp3>
37,261, // `-
38,201, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
76,59, // "#"
82,235, // "{"
84,8, // "("
89,264, // "@"
91,143, // "}"
92,221, // '"'
  }
,
{ // state 254
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 255
7,125, // ID
15,76, // `(
37,261, // `-
38,282, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
84,8, // "("
89,264, // "@"
92,221, // '"'
  }
,
{ // state 256
23,MIN_REDUCTION+41, // `[
73,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 257
49,178, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,199, // letter128
65,156, // {199..218 231..250}
66,156, // {193..198 225..230}
67,232, // digit
68,276, // {"1".."9"}
69,276, // "0"
70,100, // digit128
71,141, // {176..185}
87,11, // "_"
95,239, // {223}
98,110, // idChar*
99,289, // $$0
106,87, // idChar
107,28, // idChar128
  }
,
{ // state 258
2,12, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 259
2,35, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 260
111,MIN_REDUCTION+138, // $NT
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 261
7,125, // ID
37,261, // `-
44,241, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
89,264, // "@"
92,221, // '"'
  }
,
{ // state 262
23,MIN_REDUCTION+50, // `[
73,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 263
60,197, // "u"
  }
,
{ // state 264
92,212, // '"'
  }
,
{ // state 265
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 266
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 267
51,21, // "p"
  }
,
{ // state 268
14,230, // `void
76,206, // "#"
  }
,
{ // state 269
2,98, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 270
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 271
23,MIN_REDUCTION+43, // `[
73,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 272
2,131, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 273
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 274
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 275
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 276
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 277
50,52, // "a"
51,52, // "p"
52,52, // "v"
53,52, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,52, // "c"
55,52, // "f"
56,52, // "i"
57,52, // "l"
58,52, // "o"
59,52, // "r"
60,52, // "u"
61,52, // "b"
62,52, // "n"
63,52, // "t"
66,116, // {193..198 225..230}
68,52, // {"1".."9"}
69,52, // "0"
71,116, // {176..185}
103,209, // $$2
108,273, // hexDigit
109,128, // hexDigit128
  }
,
{ // state 278
2,97, // ws*
  }
,
{ // state 279
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 280
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 281
2,275, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 283
7,120, // ID
8,92, // `{
10,242, // `}
14,96, // `void
15,76, // `(
18,202, // <type>
19,58, // `int
20,294, // `null
21,132, // `boolean
25,82, // <stmt>
26,114, // <assign>
28,222, // <local var decl>
29,195, // `break
30,288, // <exp>
32,111, // <exp4>
33,5, // `true
34,106, // `false
36,91, // <exp3>
37,261, // `-
38,201, // <exp2>
43,16, // <cast exp>
44,192, // <unary exp>
45,85, // <exp1>
47,119, // INTLIT
48,112, // STRINGLIT
49,66, // letter
50,115, // "a"
51,115, // "p"
52,115, // "v"
53,115, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
54,115, // "c"
55,115, // "f"
56,115, // "i"
57,115, // "l"
58,115, // "o"
59,115, // "r"
60,115, // "u"
61,115, // "b"
62,115, // "n"
63,115, // "t"
64,245, // letter128
65,32, // {199..218 231..250}
66,32, // {193..198 225..230}
68,200, // {"1".."9"}
69,23, // "0"
70,70, // digit128
71,43, // {176..185}
74,149, // "-"
76,59, // "#"
82,235, // "{"
84,8, // "("
89,264, // "@"
91,143, // "}"
92,221, // '"'
  }
,
{ // state 284
0x80000000|80, // match move
0x80000000|145, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 285
0x80000000|1, // match move
0x80000000|189, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 286
23,MIN_REDUCTION+118, // `[
73,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 287
2,79, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 288
31,10, // `=
88,107, // "="
  }
,
{ // state 289
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 290
23,175, // `[
73,126, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 291
3,203, // <program>
4,56, // <class decl>+
5,208, // <class decl>
6,83, // `class
75,78, // " "
76,180, // "#"
90,24, // {10}
97,36, // ws
  }
,
{ // state 292
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 293
2,4, // ws*
75,78, // " "
90,24, // {10}
97,260, // ws
111,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 294
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 295
0x80000000|84, // match move
0x80000000|262, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 296
75,78, // " "
90,24, // {10}
97,36, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 297
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 298
MIN_REDUCTION+22, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[299][];
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
// <decl in class> ::= <method decl>
(11<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(12<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(12<<16)+7,
// <type> ::= `int
(18<<16)+1,
// <type> ::= `null
(18<<16)+1,
// <type> ::= `void
(18<<16)+1,
// <type> ::= `boolean
(18<<16)+1,
// <type> ::= ID
(18<<16)+1,
// <type> ::= <type> <empty bracket pair>
(18<<16)+2,
// <empty bracket pair> ::= `[ `]
(22<<16)+2,
// <stmt> ::= <assign> `;
(25<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(25<<16)+3,
// <stmt> ::= `{ `}
(25<<16)+2,
// <stmt> ::= <local var decl> `;
(25<<16)+2,
// <stmt> ::= `break `;
(25<<16)+2,
// <assign> ::= <exp> `= <exp>
(26<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(28<<16)+4,
// <exp> ::= <exp4>
(30<<16)+1,
// <exp4> ::= `true
(32<<16)+1,
// <exp4> ::= `false
(32<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(32<<16)+3,
// <exp3> ::= <exp3> `- <exp2>
(36<<16)+3,
// <exp4> ::= <exp3>
(32<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(36<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(36<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(36<<16)+3,
// <exp3> ::= <exp3> `&& <exp2>
(36<<16)+3,
// <exp3> ::= <exp2>
(36<<16)+1,
// <exp2> ::= <cast exp>
(38<<16)+1,
// <exp2> ::= <unary exp>
(38<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(43<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(43<<16)+4,
// <exp3> ::= <exp3> `instanceof <type>
(36<<16)+3,
// <unary exp> ::= `- <unary exp>
(44<<16)+2,
// <unary exp> ::= <exp1>
(44<<16)+1,
// <exp1> ::= ID
(45<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(45<<16)+4,
// <exp1> ::= INTLIT
(45<<16)+1,
// <exp1> ::= STRINGLIT
(45<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(49<<16)+1,
// letter128 ::= {193..218 225..250}
(64<<16)+1,
// digit ::= {"0".."9"}
(67<<16)+1,
// digit128 ::= {176..185}
(70<<16)+1,
// any ::= {0..127}
(72<<16)+1,
// any128 ::= {128..255}
(94<<16)+1,
// ws ::= " "
(97<<16)+1,
// ws ::= {10}
(97<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(21<<16)+4,
// `boolean ::= "#" "b" "o"
(21<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(14<<16)+4,
// `void ::= "#" "v" "o"
(14<<16)+3,
// `int ::= "#" "i" "t" ws*
(19<<16)+4,
// `int ::= "#" "i" "t"
(19<<16)+3,
// `break ::= "#" "b" "r" ws*
(29<<16)+4,
// `break ::= "#" "b" "r"
(29<<16)+3,
// `false ::= "#" "f" "a" ws*
(34<<16)+4,
// `false ::= "#" "f" "a"
(34<<16)+3,
// `true ::= "#" "t" "r" ws*
(33<<16)+4,
// `true ::= "#" "t" "r"
(33<<16)+3,
// `null ::= "#" "n" "u" ws*
(20<<16)+4,
// `null ::= "#" "n" "u"
(20<<16)+3,
// `instanceof ::= "#" "i" "n" ws*
(46<<16)+4,
// `instanceof ::= "#" "i" "n"
(46<<16)+3,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `% ::= "%" ws*
(41<<16)+2,
// `% ::= "%"
(41<<16)+1,
// `&& ::= "@" "&" ws*
(42<<16)+3,
// `&& ::= "@" "&"
(42<<16)+2,
// `* ::= "*" ws*
(39<<16)+2,
// `* ::= "*"
(39<<16)+1,
// `( ::= "(" ws*
(15<<16)+2,
// `( ::= "("
(15<<16)+1,
// `) ::= ")" ws*
(16<<16)+2,
// `) ::= ")"
(16<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(37<<16)+2,
// `- ::= "-"
(37<<16)+1,
// `+ ::= "+" ws*
(35<<16)+2,
// `+ ::= "+"
(35<<16)+1,
// `= ::= "=" ws*
(31<<16)+2,
// `= ::= "="
(31<<16)+1,
// `[ ::= "[" ws*
(23<<16)+2,
// `[ ::= "["
(23<<16)+1,
// `] ::= "]" ws*
(24<<16)+2,
// `] ::= "]"
(24<<16)+1,
// `; ::= ";" ws*
(27<<16)+2,
// `; ::= ";"
(27<<16)+1,
// `/ ::= "/" ws*
(40<<16)+2,
// `/ ::= "/"
(40<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(47<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(47<<16)+2,
// INTLIT ::= digit128 ws*
(47<<16)+2,
// INTLIT ::= digit128
(47<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(47<<16)+3,
// INTLIT ::= "0" $$2
(47<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(48<<16)+3,
// STRINGLIT ::= "@" '"'
(48<<16)+2,
// STRINGLIT ::= '"' any* $$3
(48<<16)+3,
// STRINGLIT ::= '"' $$3
(48<<16)+2,
// idChar ::= letter
(106<<16)+1,
// idChar ::= digit
(106<<16)+1,
// idChar ::= "_"
(106<<16)+1,
// idChar128 ::= letter128
(107<<16)+1,
// idChar128 ::= digit128
(107<<16)+1,
// idChar128 ::= {223}
(107<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(108<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(109<<16)+1,
// digit* ::= digit* digit
(100<<16)+2,
// digit* ::= digit
(100<<16)+1,
// any* ::= any* any
(104<<16)+2,
// any* ::= any
(104<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(102<<16)+2,
// hexDigit* ::= hexDigit
(102<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// idChar* ::= idChar* idChar
(98<<16)+2,
// idChar* ::= idChar
(98<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(99<<16)+2,
// $$0 ::= idChar128
(99<<16)+1,
// $$1 ::= digit128 ws*
(101<<16)+2,
// $$1 ::= digit128
(101<<16)+1,
// $$2 ::= hexDigit128 ws*
(103<<16)+2,
// $$2 ::= hexDigit128
(103<<16)+1,
// $$3 ::= any128 ws*
(105<<16)+2,
// $$3 ::= any128
(105<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
86, // 0
86, // 1
86, // 2
86, // 3
86, // 4
86, // 5
86, // 6
86, // 7
86, // 8
86, // 9
90, // 10
86, // 11
86, // 12
86, // 13
86, // 14
86, // 15
86, // 16
86, // 17
86, // 18
86, // 19
86, // 20
86, // 21
86, // 22
86, // 23
86, // 24
86, // 25
86, // 26
86, // 27
86, // 28
86, // 29
86, // 30
86, // 31
75, // " "
86, // "!"
92, // '"'
76, // "#"
86, // "$"
83, // "%"
77, // "&"
86, // "'"
84, // "("
78, // ")"
93, // "*"
85, // "+"
86, // ","
74, // "-"
86, // "."
80, // "/"
69, // "0"
68, // "1"
68, // "2"
68, // "3"
68, // "4"
68, // "5"
68, // "6"
68, // "7"
68, // "8"
68, // "9"
86, // ":"
81, // ";"
86, // "<"
88, // "="
86, // ">"
86, // "?"
89, // "@"
53, // "A"
53, // "B"
53, // "C"
53, // "D"
53, // "E"
53, // "F"
53, // "G"
53, // "H"
53, // "I"
53, // "J"
53, // "K"
53, // "L"
53, // "M"
53, // "N"
53, // "O"
53, // "P"
53, // "Q"
53, // "R"
53, // "S"
53, // "T"
53, // "U"
53, // "V"
53, // "W"
53, // "X"
53, // "Y"
53, // "Z"
73, // "["
86, // "\"
79, // "]"
86, // "^"
87, // "_"
86, // "`"
50, // "a"
61, // "b"
54, // "c"
53, // "d"
53, // "e"
55, // "f"
53, // "g"
53, // "h"
56, // "i"
53, // "j"
53, // "k"
57, // "l"
53, // "m"
62, // "n"
58, // "o"
51, // "p"
53, // "q"
59, // "r"
53, // "s"
63, // "t"
60, // "u"
52, // "v"
53, // "w"
53, // "x"
53, // "y"
53, // "z"
82, // "{"
86, // "|"
91, // "}"
86, // "~"
86, // 127
96, // 128
96, // 129
96, // 130
96, // 131
96, // 132
96, // 133
96, // 134
96, // 135
96, // 136
96, // 137
96, // 138
96, // 139
96, // 140
96, // 141
96, // 142
96, // 143
96, // 144
96, // 145
96, // 146
96, // 147
96, // 148
96, // 149
96, // 150
96, // 151
96, // 152
96, // 153
96, // 154
96, // 155
96, // 156
96, // 157
96, // 158
96, // 159
96, // 160
96, // 161
96, // 162
96, // 163
96, // 164
96, // 165
96, // 166
96, // 167
96, // 168
96, // 169
96, // 170
96, // 171
96, // 172
96, // 173
96, // 174
96, // 175
71, // 176
71, // 177
71, // 178
71, // 179
71, // 180
71, // 181
71, // 182
71, // 183
71, // 184
71, // 185
96, // 186
96, // 187
96, // 188
96, // 189
96, // 190
96, // 191
96, // 192
66, // 193
66, // 194
66, // 195
66, // 196
66, // 197
66, // 198
65, // 199
65, // 200
65, // 201
65, // 202
65, // 203
65, // 204
65, // 205
65, // 206
65, // 207
65, // 208
65, // 209
65, // 210
65, // 211
65, // 212
65, // 213
65, // 214
65, // 215
65, // 216
65, // 217
65, // 218
96, // 219
96, // 220
96, // 221
96, // 222
95, // 223
96, // 224
66, // 225
66, // 226
66, // 227
66, // 228
66, // 229
66, // 230
65, // 231
65, // 232
65, // 233
65, // 234
65, // 235
65, // 236
65, // 237
65, // 238
65, // 239
65, // 240
65, // 241
65, // 242
65, // 243
65, // 244
65, // 245
65, // 246
65, // 247
65, // 248
65, // 249
65, // 250
96, // 251
96, // 252
96, // 253
96, // 254
96, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"<start> ::= ws* <program>", // 1
"<start> ::= ws* <program>", // 2
"<program> ::= # <class decl>+", // 3
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 4
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 5
"<decl in class> ::= <method decl>", // 6
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 7
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 8
"<type> ::= # `int", // 9
"<type> ::= # `null", // 10
"<type> ::= # `void", // 11
"<type> ::= # `boolean", // 12
"<type> ::= # ID", // 13
"<type> ::= # <type> <empty bracket pair>", // 14
"<empty bracket pair> ::= `[ `]", // 15
"<stmt> ::= <assign> `;", // 16
"<stmt> ::= # `{ <stmt>* `}", // 17
"<stmt> ::= # `{ <stmt>* `}", // 18
"<stmt> ::= <local var decl> `;", // 19
"<stmt> ::= # `break `;", // 20
"<assign> ::= <exp> # `= <exp>", // 21
"<local var decl> ::= <type> # ID `= <exp>", // 22
"<exp> ::= <exp4>", // 23
"<exp4> ::= # `true", // 24
"<exp4> ::= # `false", // 25
"<exp4> ::= <exp4> # `+ <exp3>", // 26
"<exp3> ::= <exp3> # `- <exp2>", // 27
"<exp4> ::= <exp3>", // 28
"<exp3> ::= <exp3> # `* <exp2>", // 29
"<exp3> ::= <exp3> # `/ <exp2>", // 30
"<exp3> ::= <exp3> # `% <exp2>", // 31
"<exp3> ::= <exp3> # `&& <exp2>", // 32
"<exp3> ::= <exp2>", // 33
"<exp2> ::= <cast exp>", // 34
"<exp2> ::= <unary exp>", // 35
"<cast exp> ::= # `( <type> `) <cast exp>", // 36
"<cast exp> ::= # `( <type> `) <exp1>", // 37
"<exp3> ::= <exp3> # `instanceof <type>", // 38
"<unary exp> ::= # `- <unary exp>", // 39
"<unary exp> ::= <exp1>", // 40
"<exp1> ::= # ID", // 41
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 42
"<exp1> ::= # INTLIT", // 43
"<exp1> ::= # STRINGLIT", // 44
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 45
"letter128 ::= {193..218 225..250}", // 46
"digit ::= {\"0\"..\"9\"}", // 47
"digit128 ::= {176..185}", // 48
"any ::= {0..127}", // 49
"any128 ::= {128..255}", // 50
"ws ::= \" \"", // 51
"ws ::= {10} registerNewline", // 52
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 53
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 54
"`class ::= \"#\" \"c\" \"l\" ws*", // 55
"`class ::= \"#\" \"c\" \"l\" ws*", // 56
"`void ::= \"#\" \"v\" \"o\" ws*", // 57
"`void ::= \"#\" \"v\" \"o\" ws*", // 58
"`int ::= \"#\" \"i\" \"t\" ws*", // 59
"`int ::= \"#\" \"i\" \"t\" ws*", // 60
"`break ::= \"#\" \"b\" \"r\" ws*", // 61
"`break ::= \"#\" \"b\" \"r\" ws*", // 62
"`false ::= \"#\" \"f\" \"a\" ws*", // 63
"`false ::= \"#\" \"f\" \"a\" ws*", // 64
"`true ::= \"#\" \"t\" \"r\" ws*", // 65
"`true ::= \"#\" \"t\" \"r\" ws*", // 66
"`null ::= \"#\" \"n\" \"u\" ws*", // 67
"`null ::= \"#\" \"n\" \"u\" ws*", // 68
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 69
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 70
"`public ::= \"#\" \"p\" \"u\" ws*", // 71
"`public ::= \"#\" \"p\" \"u\" ws*", // 72
"`% ::= \"%\" ws*", // 73
"`% ::= \"%\" ws*", // 74
"`&& ::= \"@\" \"&\" ws*", // 75
"`&& ::= \"@\" \"&\" ws*", // 76
"`* ::= \"*\" ws*", // 77
"`* ::= \"*\" ws*", // 78
"`( ::= \"(\" ws*", // 79
"`( ::= \"(\" ws*", // 80
"`) ::= \")\" ws*", // 81
"`) ::= \")\" ws*", // 82
"`{ ::= \"{\" ws*", // 83
"`{ ::= \"{\" ws*", // 84
"`} ::= \"}\" ws*", // 85
"`} ::= \"}\" ws*", // 86
"`- ::= \"-\" ws*", // 87
"`- ::= \"-\" ws*", // 88
"`+ ::= \"+\" ws*", // 89
"`+ ::= \"+\" ws*", // 90
"`= ::= \"=\" ws*", // 91
"`= ::= \"=\" ws*", // 92
"`[ ::= \"[\" ws*", // 93
"`[ ::= \"[\" ws*", // 94
"`] ::= \"]\" ws*", // 95
"`] ::= \"]\" ws*", // 96
"`; ::= \";\" ws*", // 97
"`; ::= \";\" ws*", // 98
"`/ ::= \"/\" ws*", // 99
"`/ ::= \"/\" ws*", // 100
"ID ::= letter128 ws*", // 101
"ID ::= letter128 ws*", // 102
"ID ::= letter idChar* idChar128 ws*", // 103
"ID ::= letter idChar* idChar128 ws*", // 104
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 105
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 106
"INTLIT ::= digit128 ws*", // 107
"INTLIT ::= digit128 ws*", // 108
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 109
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 110
"STRINGLIT ::= \"@\" \'\"\' ws*", // 111
"STRINGLIT ::= \"@\" \'\"\' ws*", // 112
"STRINGLIT ::= \'\"\' any* any128 ws*", // 113
"STRINGLIT ::= \'\"\' any* any128 ws*", // 114
"idChar ::= letter", // 115
"idChar ::= digit", // 116
"idChar ::= \"_\"", // 117
"idChar128 ::= letter128", // 118
"idChar128 ::= digit128", // 119
"idChar128 ::= {223}", // 120
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 121
"hexDigit128 ::= {176..185 193..198 225..230}", // 122
"digit* ::= digit* digit", // 123
"digit* ::= digit* digit", // 124
"any* ::= any* any", // 125
"any* ::= any* any", // 126
"<decl in class>* ::= <decl in class>* <decl in class>", // 127
"<decl in class>* ::= <decl in class>* <decl in class>", // 128
"hexDigit* ::= hexDigit* hexDigit", // 129
"hexDigit* ::= hexDigit* hexDigit", // 130
"<stmt>* ::= <stmt>* <stmt>", // 131
"<stmt>* ::= <stmt>* <stmt>", // 132
"idChar* ::= idChar* idChar", // 133
"idChar* ::= idChar* idChar", // 134
"<class decl>+ ::= <class decl>", // 135
"<class decl>+ ::= <class decl>+ <class decl>", // 136
"ws* ::= ws* ws", // 137
"ws* ::= ws* ws", // 138
"", // 139
"", // 140
"", // 141
"", // 142
"", // 143
"", // 144
"", // 145
"", // 146
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
    { // 6: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 7: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
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
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
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
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 16: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 17: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 18: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 19: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 20: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 21: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 22: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 23: <exp> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 24: <exp4> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 25: <exp4> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 26: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 27: <exp3> ::= <exp3> [#] `- <exp2> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 28: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 30: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 31: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 32: <exp3> ::= <exp3> [#] `&& <exp2> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 33: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 34: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 36: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 37: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 38: <exp3> ::= <exp3> [#] `instanceof <type> @newInstanceOf(Exp,int,Type)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 39: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 40: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 42: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 43: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 44: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 45: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 46: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 47: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 48: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 49: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 50: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 51: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 52: ws ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 53: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `break ::= "#" "b" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `false ::= "#" "f" "a" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 65: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `true ::= "#" "t" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `null ::= "#" "n" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 69: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 70: `instanceof ::= "#" "i" "n" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 71: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 72: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 73: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `% ::= "%" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 76: `&& ::= "@" "&" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 77: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 90: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 93: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 95: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 96: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 97: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 100: `/ ::= "/" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 101: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 102: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 103: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 104: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 105: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 106: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 107: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 108: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 109: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 110: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 111: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 112: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 113: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 114: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 115: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 116: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 117: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 118: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 119: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 120: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 121: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 122: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 123: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 124: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 125: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 126: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 127: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 128: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 129: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 130: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 131: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 132: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 133: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 134: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 135: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 136: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 137: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 138: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 139: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 140: $$0 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 141: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 142: $$1 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 143: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 144: $$2 ::= hexDigit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 145: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 146: $$3 ::= any128 [ws*] @pass
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
      ((36<<5)|0x5)/*methodCall:36*/,
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
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.nullType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.voidType(parm0);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 12: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Type parm2 = (Type)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 26: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 29: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 30: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 32: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 33: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 34: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 35: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 36: {
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
"Decl createMethodDeclVoid(int,String,List<Statement>)",
"Type intType(int)",
"Type nullType(int)",
"Type voidType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBlock(int,List<Statement>)",
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
"Exp newUnaryMinus(int,Exp)",
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
3,1,
1,1,
1,1,
1,1,
1,1,
2,1,
3,1,
2,1,
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
