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
public int getEofSym() { return 107; }
public int getNttSym() { return 108; }
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
"`*",
"<exp2>",
"`/",
"`&&",
"<cast exp>",
"<unary exp>",
"<exp1>",
"`-",
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
"{0..9 11..31 \"!\" \"$\"..\"%\" \"\'\" \",\" \".\" \":\" \"<\" \">\"..\"?\" \"\\\" \"^\" \"`\" \"|\" \"~\"..127}",
"\" \"",
"\"#\"",
"\"&\"",
"\")\"",
"\"]\"",
"\"/\"",
"\";\"",
"\"{\"",
"\"(\"",
"\"+\"",
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
public int numSymbols() { return 109;}
private static final int MIN_REDUCTION = 287;
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
1,213, // <start>
2,278, // ws*
3,137, // <program>
4,55, // <class decl>+
5,199, // <class decl>
6,83, // `class
74,79, // " "
75,175, // "#"
87,25, // {10}
94,247, // ws
  }
,
{ // state 1
  }
,
{ // state 2
23,MIN_REDUCTION+49, // `[
71,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 4
74,79, // " "
87,25, // {10}
94,35, // ws
108,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 5
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 6
7,125, // ID
15,76, // `(
30,285, // <exp>
32,110, // <exp4>
33,5, // `true
34,105, // `false
36,115, // <exp3>
38,193, // <exp2>
41,16, // <cast exp>
42,186, // <unary exp>
43,85, // <exp1>
44,248, // `-
45,119, // INTLIT
46,111, // STRINGLIT
47,65, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,234, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
66,192, // {"1".."9"}
67,23, // "0"
68,69, // digit128
69,42, // {176..185}
72,147, // "-"
75,43, // "#"
82,8, // "("
86,252, // "@"
89,211, // '"'
  }
,
{ // state 7
50,178, // "v"
54,176, // "i"
59,24, // "b"
60,250, // "n"
  }
,
{ // state 8
2,239, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 9
0x80000000|1, // match move
0x80000000|222, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 10
7,125, // ID
15,76, // `(
30,31, // <exp>
32,110, // <exp4>
33,5, // `true
34,105, // `false
36,115, // <exp3>
38,193, // <exp2>
41,16, // <cast exp>
42,186, // <unary exp>
43,85, // <exp1>
44,248, // `-
45,119, // INTLIT
46,111, // STRINGLIT
47,65, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,234, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
66,192, // {"1".."9"}
67,23, // "0"
68,69, // digit128
69,42, // {176..185}
72,147, // "-"
75,43, // "#"
82,8, // "("
86,252, // "@"
89,211, // '"'
  }
,
{ // state 11
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 12
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 13
0x80000000|1, // match move
0x80000000|163, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 14
48,38, // "a"
49,38, // "p"
50,38, // "v"
51,38, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,38, // "c"
53,38, // "f"
54,38, // "i"
55,38, // "l"
56,38, // "o"
57,38, // "r"
58,38, // "u"
59,38, // "b"
60,38, // "n"
61,38, // "t"
63,283, // {199..218 231..250}
64,283, // {193..198 225..230}
66,38, // {"1".."9"}
67,38, // "0"
69,283, // {176..185}
70,3, // any
71,38, // "["
72,38, // "-"
73,38, // {0..9 11..31 "!" "$".."%" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
74,38, // " "
75,38, // "#"
76,38, // "&"
77,38, // ")"
78,38, // "]"
79,38, // "/"
80,38, // ";"
81,38, // "{"
82,38, // "("
83,38, // "+"
84,38, // "_"
85,38, // "="
86,38, // "@"
87,38, // {10}
88,38, // "}"
89,38, // '"'
90,38, // "*"
91,109, // any128
92,283, // {223}
93,283, // {128..175 186..192 219..222 224 251..255}
102,273, // $$3
  }
,
{ // state 15
23,MIN_REDUCTION+48, // `[
71,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 17
24,101, // `]
78,280, // "]"
  }
,
{ // state 18
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 19
7,125, // ID
15,76, // `(
38,66, // <exp2>
41,16, // <cast exp>
42,186, // <unary exp>
43,85, // <exp1>
44,248, // `-
45,119, // INTLIT
46,111, // STRINGLIT
47,65, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,234, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
66,192, // {"1".."9"}
67,23, // "0"
68,69, // digit128
69,42, // {176..185}
72,147, // "-"
82,8, // "("
86,252, // "@"
89,211, // '"'
  }
,
{ // state 20
23,MIN_REDUCTION+98, // `[
71,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 21
58,59, // "u"
  }
,
{ // state 22
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 23
48,51, // "a"
49,51, // "p"
50,51, // "v"
51,51, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,51, // "c"
53,51, // "f"
54,51, // "i"
55,51, // "l"
56,51, // "o"
57,51, // "r"
58,51, // "u"
59,51, // "b"
60,51, // "n"
61,51, // "t"
64,116, // {193..198 225..230}
66,51, // {"1".."9"}
67,51, // "0"
69,116, // {176..185}
99,264, // hexDigit*
100,29, // $$2
105,133, // hexDigit
106,128, // hexDigit128
  }
,
{ // state 24
56,272, // "o"
  }
,
{ // state 25
108,MIN_REDUCTION+49, // $NT
MIN_REDUCTION+49, // (default reduction)
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
2,282, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 29
0x80000000|1, // match move
0x80000000|77, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 30
2,41, // ws*
23,MIN_REDUCTION+95, // `[
71,MIN_REDUCTION+95, // "["
74,47, // " "
87,220, // {10}
94,165, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 31
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 32
0x80000000|148, // match move
0x80000000|171, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 33
23,MIN_REDUCTION+41, // `[
71,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 34
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 35
108,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 36
0x80000000|1, // match move
0x80000000|206, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 37
0x80000000|136, // match move
0x80000000|167, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 39
2,214, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 40
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 41
0x80000000|158, // match move
0x80000000|153, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
0x80000000|257, // match move
0x80000000|177, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 43
53,53, // "f"
61,122, // "t"
  }
,
{ // state 44
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 45
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 46
56,272, // "o"
57,238, // "r"
  }
,
{ // state 47
0x80000000|233, // match move
0x80000000|15, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 48
2,187, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 49
23,MIN_REDUCTION+104, // `[
71,MIN_REDUCTION+104, // "["
74,47, // " "
87,220, // {10}
94,184, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 50
23,MIN_REDUCTION+39, // `[
71,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 52
16,102, // `)
22,208, // <empty bracket pair>
23,17, // `[
71,126, // "["
77,48, // ")"
  }
,
{ // state 53
48,225, // "a"
  }
,
{ // state 54
23,MIN_REDUCTION+131, // `[
71,MIN_REDUCTION+131, // "["
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 55
5,253, // <class decl>
6,83, // `class
75,175, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 58
50,178, // "v"
53,53, // "f"
54,176, // "i"
59,46, // "b"
60,250, // "n"
61,122, // "t"
  }
,
{ // state 59
2,207, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 60
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 61
0x80000000|242, // match move
0x80000000|93, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 62
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 63
7,125, // ID
15,76, // `(
36,174, // <exp3>
38,193, // <exp2>
41,16, // <cast exp>
42,186, // <unary exp>
43,85, // <exp1>
44,248, // `-
45,119, // INTLIT
46,111, // STRINGLIT
47,65, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,234, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
66,192, // {"1".."9"}
67,23, // "0"
68,69, // digit128
69,42, // {176..185}
72,147, // "-"
82,8, // "("
86,252, // "@"
89,211, // '"'
  }
,
{ // state 64
2,138, // ws*
23,MIN_REDUCTION+137, // `[
71,MIN_REDUCTION+137, // "["
74,47, // " "
87,220, // {10}
94,165, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 65
47,172, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,180, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
65,221, // digit
66,263, // {"1".."9"}
67,263, // "0"
68,161, // digit128
69,42, // {176..185}
84,11, // "_"
92,61, // {223}
95,81, // idChar*
96,37, // $$0
103,87, // idChar
104,223, // idChar128
  }
,
{ // state 66
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 67
2,36, // ws*
  }
,
{ // state 68
23,MIN_REDUCTION+88, // `[
71,MIN_REDUCTION+88, // "["
74,47, // " "
87,220, // {10}
94,184, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 69
0x80000000|67, // match move
0x80000000|152, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 70
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 72
0x80000000|218, // match move
0x80000000|86, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 73
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 75
2,62, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 76
7,251, // ID
14,94, // `void
18,52, // <type>
19,57, // `int
20,281, // `null
21,131, // `boolean
47,245, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,166, // letter128
63,154, // {199..218 231..250}
64,154, // {193..198 225..230}
75,7, // "#"
  }
,
{ // state 77
23,MIN_REDUCTION+103, // `[
71,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 78
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 79
108,MIN_REDUCTION+48, // $NT
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 80
2,9, // ws*
  }
,
{ // state 81
47,172, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,180, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
65,221, // digit
66,263, // {"1".."9"}
67,263, // "0"
68,161, // digit128
69,42, // {176..185}
84,11, // "_"
92,61, // {223}
96,149, // $$0
103,279, // idChar
104,223, // idChar128
  }
,
{ // state 82
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 83
7,103, // ID
47,245, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,166, // letter128
63,154, // {199..218 231..250}
64,154, // {193..198 225..230}
  }
,
{ // state 84
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 85
0x80000000|1, // match move
0x80000000|277, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 86
23,MIN_REDUCTION+132, // `[
71,MIN_REDUCTION+132, // "["
74,47, // " "
87,220, // {10}
94,184, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 89
0x80000000|1, // match move
0x80000000|20, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 90
2,45, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 91
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
91, // `{
-1, // <decl in class>*
18, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
94, // `void
76, // `(
-1, // `)
100, // <stmt>*
194, // <type>
57, // `int
281, // `null
131, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
201, // <stmt>
113, // <assign>
-1, // `;
212, // <local var decl>
71, // `break
275, // <exp>
-1, // `=
110, // <exp4>
5, // `true
105, // `false
-1, // `+
115, // <exp3>
-1, // `*
193, // <exp2>
-1, // `/
-1, // `&&
16, // <cast exp>
186, // <unary exp>
85, // <exp1>
248, // `-
119, // INTLIT
111, // STRINGLIT
65, // letter
114, // "a"
114, // "p"
114, // "v"
114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
114, // "c"
114, // "f"
114, // "i"
114, // "l"
114, // "o"
114, // "r"
114, // "u"
114, // "b"
114, // "n"
114, // "t"
234, // letter128
32, // {199..218 231..250}
32, // {193..198 225..230}
-1, // digit
192, // {"1".."9"}
23, // "0"
69, // digit128
42, // {176..185}
-1, // any
-1, // "["
147, // "-"
-1, // {0..9 11..31 "!" "$".."%" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
-1, // " "
58, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
224, // "{"
8, // "("
-1, // "+"
-1, // "_"
-1, // "="
252, // "@"
-1, // {10}
142, // "}"
211, // '"'
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
{ // state 92
23,MIN_REDUCTION+115, // `[
71,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 93
23,MIN_REDUCTION+113, // `[
71,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 95
23,MIN_REDUCTION+112, // `[
71,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 96
0x80000000|1, // match move
0x80000000|49, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 97
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 98
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 99
2,124, // ws*
23,MIN_REDUCTION+139, // `[
71,MIN_REDUCTION+139, // "["
74,47, // " "
87,220, // {10}
94,165, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 100
7,120, // ID
8,91, // `{
10,130, // `}
14,94, // `void
15,76, // `(
18,194, // <type>
19,57, // `int
20,281, // `null
21,131, // `boolean
25,82, // <stmt>
26,113, // <assign>
28,212, // <local var decl>
29,71, // `break
30,275, // <exp>
32,110, // <exp4>
33,5, // `true
34,105, // `false
36,115, // <exp3>
38,193, // <exp2>
41,16, // <cast exp>
42,186, // <unary exp>
43,85, // <exp1>
44,248, // `-
45,119, // INTLIT
46,111, // STRINGLIT
47,65, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,234, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
66,192, // {"1".."9"}
67,23, // "0"
68,69, // digit128
69,42, // {176..185}
72,147, // "-"
75,58, // "#"
81,224, // "{"
82,8, // "("
86,252, // "@"
88,142, // "}"
89,211, // '"'
  }
,
{ // state 101
108,MIN_REDUCTION+15, // $NT
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 102
7,125, // ID
15,76, // `(
41,88, // <cast exp>
43,13, // <exp1>
45,119, // INTLIT
46,111, // STRINGLIT
47,65, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,234, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
66,192, // {"1".."9"}
67,23, // "0"
68,69, // digit128
69,42, // {176..185}
82,8, // "("
86,252, // "@"
89,211, // '"'
  }
,
{ // state 103
8,146, // `{
81,224, // "{"
  }
,
{ // state 104
2,134, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 106
2,162, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 107
47,172, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,191, // letter128
63,154, // {199..218 231..250}
64,154, // {193..198 225..230}
65,221, // digit
66,263, // {"1".."9"}
67,263, // "0"
68,98, // digit128
69,140, // {176..185}
84,11, // "_"
92,228, // {223}
96,70, // $$0
103,279, // idChar
104,28, // idChar128
  }
,
{ // state 108
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 109
0x80000000|26, // match move
0x80000000|99, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 110
35,63, // `+
83,205, // "+"
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 111
0x80000000|1, // match move
0x80000000|33, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 112
2,41, // ws*
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 113
27,34, // `;
80,259, // ";"
  }
,
{ // state 114
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 115
37,243, // `*
39,150, // `/
40,19, // `&&
79,246, // "/"
86,188, // "@"
90,256, // "*"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 116
0x80000000|121, // match move
0x80000000|92, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 117
65,60, // digit
66,263, // {"1".."9"}
67,263, // "0"
68,271, // digit128
69,42, // {176..185}
98,89, // $$1
  }
,
{ // state 118
0x80000000|1, // match move
0x80000000|50, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 119
0x80000000|1, // match move
0x80000000|258, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 120
0x80000000|284, // match move
0x80000000|217, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 122
57,39, // "r"
  }
,
{ // state 123
2,138, // ws*
  }
,
{ // state 124
0x80000000|1, // match move
0x80000000|159, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 125
0x80000000|1, // match move
0x80000000|244, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 126
2,44, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 127
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 128
0x80000000|123, // match move
0x80000000|64, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
23,17, // `[
71,126, // "["
  }
,
{ // state 130
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 132
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 134
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 138
0x80000000|1, // match move
0x80000000|185, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 139
55,104, // "l"
  }
,
{ // state 140
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 142
2,179, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 143
16,190, // `)
77,48, // ")"
  }
,
{ // state 144
2,9, // ws*
23,MIN_REDUCTION+135, // `[
71,MIN_REDUCTION+135, // "["
74,47, // " "
87,220, // {10}
94,165, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 145
23,MIN_REDUCTION+107, // `[
71,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 146
9,168, // <decl in class>*
10,73, // `}
11,236, // <decl in class>
12,226, // <method decl>
13,255, // `public
75,254, // "#"
88,142, // "}"
  }
,
{ // state 147
2,40, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 149
0x80000000|108, // match move
0x80000000|157, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 150
7,125, // ID
15,76, // `(
38,135, // <exp2>
41,16, // <cast exp>
42,186, // <unary exp>
43,85, // <exp1>
44,248, // `-
45,119, // INTLIT
46,111, // STRINGLIT
47,65, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,234, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
66,192, // {"1".."9"}
67,23, // "0"
68,69, // digit128
69,42, // {176..185}
72,147, // "-"
82,8, // "("
86,252, // "@"
89,211, // '"'
  }
,
{ // state 151
23,MIN_REDUCTION+130, // `[
71,MIN_REDUCTION+130, // "["
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 152
2,36, // ws*
23,MIN_REDUCTION+101, // `[
71,MIN_REDUCTION+101, // "["
74,47, // " "
87,220, // {10}
94,165, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 153
23,MIN_REDUCTION+94, // `[
71,MIN_REDUCTION+94, // "["
74,47, // " "
87,220, // {10}
94,184, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 154
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 155
2,235, // ws*
23,MIN_REDUCTION+89, // `[
71,MIN_REDUCTION+89, // "["
74,47, // " "
87,220, // {10}
94,165, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 156
31,6, // `=
85,106, // "="
  }
,
{ // state 157
23,MIN_REDUCTION+96, // `[
71,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 159
23,MIN_REDUCTION+138, // `[
71,MIN_REDUCTION+138, // "["
74,47, // " "
87,220, // {10}
94,184, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 160
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 161
0x80000000|56, // match move
0x80000000|95, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 162
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 163
23,170, // `[
71,126, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 164
0x80000000|1, // match move
0x80000000|145, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 165
0x80000000|22, // match move
0x80000000|54, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 166
2,160, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 167
23,MIN_REDUCTION+97, // `[
71,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 168
10,27, // `}
11,261, // <decl in class>
12,226, // <method decl>
13,255, // `public
75,254, // "#"
88,142, // "}"
  }
,
{ // state 169
15,143, // `(
82,8, // "("
  }
,
{ // state 170
7,125, // ID
15,76, // `(
30,216, // <exp>
32,110, // <exp4>
33,5, // `true
34,105, // `false
36,115, // <exp3>
38,193, // <exp2>
41,16, // <cast exp>
42,186, // <unary exp>
43,85, // <exp1>
44,248, // `-
45,119, // INTLIT
46,111, // STRINGLIT
47,65, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,234, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
66,192, // {"1".."9"}
67,23, // "0"
68,69, // digit128
69,42, // {176..185}
72,147, // "-"
75,43, // "#"
82,8, // "("
86,252, // "@"
89,211, // '"'
  }
,
{ // state 171
23,MIN_REDUCTION+43, // `[
71,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 174
37,243, // `*
39,150, // `/
40,19, // `&&
79,246, // "/"
86,188, // "@"
90,256, // "*"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 175
52,139, // "c"
  }
,
{ // state 176
61,75, // "t"
  }
,
{ // state 177
23,MIN_REDUCTION+45, // `[
71,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 178
56,268, // "o"
  }
,
{ // state 179
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 180
0x80000000|74, // match move
0x80000000|274, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 181
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 182
0x80000000|204, // match move
0x80000000|155, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 183
23,MIN_REDUCTION+106, // `[
71,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 184
0x80000000|232, // match move
0x80000000|151, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 185
23,MIN_REDUCTION+136, // `[
71,MIN_REDUCTION+136, // "["
74,47, // " "
87,220, // {10}
94,184, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 186
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 187
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 188
76,90, // "&"
  }
,
{ // state 189
2,181, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 190
8,241, // `{
81,224, // "{"
  }
,
{ // state 191
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 192
65,227, // digit
66,263, // {"1".."9"}
67,263, // "0"
68,271, // digit128
69,42, // {176..185}
97,117, // digit*
98,198, // $$1
  }
,
{ // state 193
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 194
7,156, // ID
22,208, // <empty bracket pair>
23,17, // `[
47,245, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,166, // letter128
63,154, // {199..218 231..250}
64,154, // {193..198 225..230}
71,126, // "["
  }
,
{ // state 195
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 196
23,MIN_REDUCTION+99, // `[
71,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 197
50,178, // "v"
  }
,
{ // state 198
0x80000000|1, // match move
0x80000000|196, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 199
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 200
0x80000000|1, // match move
0x80000000|215, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 201
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 202
2,96, // ws*
23,MIN_REDUCTION+105, // `[
71,MIN_REDUCTION+105, // "["
74,47, // " "
87,220, // {10}
94,165, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 203
0x80000000|265, // match move
0x80000000|202, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 204
2,235, // ws*
  }
,
{ // state 205
2,127, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 206
23,MIN_REDUCTION+100, // `[
71,MIN_REDUCTION+100, // "["
74,47, // " "
87,220, // {10}
94,184, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 207
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 208
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 209
2,72, // ws*
23,MIN_REDUCTION+133, // `[
71,MIN_REDUCTION+133, // "["
74,47, // " "
87,220, // {10}
94,165, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 210
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 211
48,38, // "a"
49,38, // "p"
50,38, // "v"
51,38, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,38, // "c"
53,38, // "f"
54,38, // "i"
55,38, // "l"
56,38, // "o"
57,38, // "r"
58,38, // "u"
59,38, // "b"
60,38, // "n"
61,38, // "t"
63,283, // {199..218 231..250}
64,283, // {193..198 225..230}
66,38, // {"1".."9"}
67,38, // "0"
69,283, // {176..185}
70,141, // any
71,38, // "["
72,38, // "-"
73,38, // {0..9 11..31 "!" "$".."%" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
74,38, // " "
75,38, // "#"
76,38, // "&"
77,38, // ")"
78,38, // "]"
79,38, // "/"
80,38, // ";"
81,38, // "{"
82,38, // "("
83,38, // "+"
84,38, // "_"
85,38, // "="
86,38, // "@"
87,38, // {10}
88,38, // "}"
89,38, // '"'
90,38, // "*"
91,109, // any128
92,283, // {223}
93,283, // {128..175 186..192 219..222 224 251..255}
101,14, // any*
102,164, // $$3
  }
,
{ // state 212
27,266, // `;
80,259, // ";"
  }
,
{ // state 213
107,MIN_REDUCTION+0, // $
  }
,
{ // state 214
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 215
23,MIN_REDUCTION+102, // `[
71,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 216
24,118, // `]
78,182, // "]"
  }
,
{ // state 217
23,MIN_REDUCTION+38, // `[
31,MIN_REDUCTION+38, // `=
35,MIN_REDUCTION+38, // `+
37,MIN_REDUCTION+38, // `*
39,MIN_REDUCTION+38, // `/
40,MIN_REDUCTION+38, // `&&
71,MIN_REDUCTION+38, // "["
79,MIN_REDUCTION+38, // "/"
83,MIN_REDUCTION+38, // "+"
85,MIN_REDUCTION+38, // "="
86,MIN_REDUCTION+38, // "@"
90,MIN_REDUCTION+38, // "*"
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 219
7,169, // ID
47,245, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,166, // letter128
63,154, // {199..218 231..250}
64,154, // {193..198 225..230}
  }
,
{ // state 220
0x80000000|237, // match move
0x80000000|2, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 221
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 222
23,MIN_REDUCTION+134, // `[
71,MIN_REDUCTION+134, // "["
74,47, // " "
87,220, // {10}
94,184, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 223
0x80000000|240, // match move
0x80000000|209, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 224
2,267, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 225
2,210, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 227
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 228
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 229
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 234
0x80000000|112, // match move
0x80000000|30, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 235
0x80000000|1, // match move
0x80000000|68, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 236
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 238
2,229, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 239
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 240
2,72, // ws*
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 241
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
120, // ID
91, // `{
-1, // <decl in class>*
173, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
94, // `void
76, // `(
-1, // `)
270, // <stmt>*
194, // <type>
57, // `int
281, // `null
131, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
201, // <stmt>
113, // <assign>
-1, // `;
212, // <local var decl>
71, // `break
275, // <exp>
-1, // `=
110, // <exp4>
5, // `true
105, // `false
-1, // `+
115, // <exp3>
-1, // `*
193, // <exp2>
-1, // `/
-1, // `&&
16, // <cast exp>
186, // <unary exp>
85, // <exp1>
248, // `-
119, // INTLIT
111, // STRINGLIT
65, // letter
114, // "a"
114, // "p"
114, // "v"
114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
114, // "c"
114, // "f"
114, // "i"
114, // "l"
114, // "o"
114, // "r"
114, // "u"
114, // "b"
114, // "n"
114, // "t"
234, // letter128
32, // {199..218 231..250}
32, // {193..198 225..230}
-1, // digit
192, // {"1".."9"}
23, // "0"
69, // digit128
42, // {176..185}
-1, // any
-1, // "["
147, // "-"
-1, // {0..9 11..31 "!" "$".."%" "'" "," "." ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
-1, // " "
58, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
224, // "{"
8, // "("
-1, // "+"
-1, // "_"
-1, // "="
252, // "@"
-1, // {10}
142, // "}"
211, // '"'
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
{ // state 242
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 243
7,125, // ID
15,76, // `(
38,269, // <exp2>
41,16, // <cast exp>
42,186, // <unary exp>
43,85, // <exp1>
44,248, // `-
45,119, // INTLIT
46,111, // STRINGLIT
47,65, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,234, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
66,192, // {"1".."9"}
67,23, // "0"
68,69, // digit128
69,42, // {176..185}
72,147, // "-"
82,8, // "("
86,252, // "@"
89,211, // '"'
  }
,
{ // state 244
23,MIN_REDUCTION+38, // `[
71,MIN_REDUCTION+38, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 245
47,172, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,191, // letter128
63,154, // {199..218 231..250}
64,154, // {193..198 225..230}
65,221, // digit
66,263, // {"1".."9"}
67,263, // "0"
68,98, // digit128
69,140, // {176..185}
84,11, // "_"
92,228, // {223}
95,107, // idChar*
96,276, // $$0
103,87, // idChar
104,28, // idChar128
  }
,
{ // state 246
2,12, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 247
108,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 248
7,125, // ID
42,230, // <unary exp>
43,85, // <exp1>
44,248, // `-
45,119, // INTLIT
46,111, // STRINGLIT
47,65, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,234, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
66,192, // {"1".."9"}
67,23, // "0"
68,69, // digit128
69,42, // {176..185}
72,147, // "-"
86,252, // "@"
89,211, // '"'
  }
,
{ // state 249
23,MIN_REDUCTION+47, // `[
71,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 250
58,189, // "u"
  }
,
{ // state 251
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 252
89,203, // '"'
  }
,
{ // state 253
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 254
49,21, // "p"
  }
,
{ // state 255
14,219, // `void
75,197, // "#"
  }
,
{ // state 256
2,97, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 257
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 258
23,MIN_REDUCTION+40, // `[
71,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 259
2,132, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 260
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 261
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 262
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 263
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 264
48,51, // "a"
49,51, // "p"
50,51, // "v"
51,51, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,51, // "c"
53,51, // "f"
54,51, // "i"
55,51, // "l"
56,51, // "o"
57,51, // "r"
58,51, // "u"
59,51, // "b"
60,51, // "n"
61,51, // "t"
64,116, // {193..198 225..230}
66,51, // {"1".."9"}
67,51, // "0"
69,116, // {176..185}
100,200, // $$2
105,260, // hexDigit
106,128, // hexDigit128
  }
,
{ // state 265
2,96, // ws*
  }
,
{ // state 266
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 267
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 268
2,262, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 269
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 270
7,120, // ID
8,91, // `{
10,231, // `}
14,94, // `void
15,76, // `(
18,194, // <type>
19,57, // `int
20,281, // `null
21,131, // `boolean
25,82, // <stmt>
26,113, // <assign>
28,212, // <local var decl>
29,71, // `break
30,275, // <exp>
32,110, // <exp4>
33,5, // `true
34,105, // `false
36,115, // <exp3>
38,193, // <exp2>
41,16, // <cast exp>
42,186, // <unary exp>
43,85, // <exp1>
44,248, // `-
45,119, // INTLIT
46,111, // STRINGLIT
47,65, // letter
48,114, // "a"
49,114, // "p"
50,114, // "v"
51,114, // {"A".."Z" "d".."e" "g".."h" "j".."k" "m" "q" "s" "w".."z"}
52,114, // "c"
53,114, // "f"
54,114, // "i"
55,114, // "l"
56,114, // "o"
57,114, // "r"
58,114, // "u"
59,114, // "b"
60,114, // "n"
61,114, // "t"
62,234, // letter128
63,32, // {199..218 231..250}
64,32, // {193..198 225..230}
66,192, // {"1".."9"}
67,23, // "0"
68,69, // digit128
69,42, // {176..185}
72,147, // "-"
75,58, // "#"
81,224, // "{"
82,8, // "("
86,252, // "@"
88,142, // "}"
89,211, // '"'
  }
,
{ // state 271
0x80000000|80, // match move
0x80000000|144, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 272
2,78, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 273
0x80000000|1, // match move
0x80000000|183, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 274
23,MIN_REDUCTION+111, // `[
71,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 275
31,10, // `=
85,106, // "="
  }
,
{ // state 276
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 277
23,170, // `[
71,126, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 278
3,195, // <program>
4,55, // <class decl>+
5,199, // <class decl>
6,83, // `class
74,79, // " "
75,175, // "#"
87,25, // {10}
94,35, // ws
  }
,
{ // state 279
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 280
2,4, // ws*
74,79, // " "
87,25, // {10}
94,247, // ws
108,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 281
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 282
74,79, // " "
87,25, // {10}
94,35, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 283
0x80000000|84, // match move
0x80000000|249, // no-match move
0x80000000|129, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 284
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 285
MIN_REDUCTION+22, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[286][];
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
// <stmt> ::= `break
(25<<16)+1,
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
// <exp4> ::= <exp3>
(32<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(36<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
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
(41<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(41<<16)+4,
// <unary exp> ::= `- <unary exp>
(42<<16)+2,
// <unary exp> ::= <exp1>
(42<<16)+1,
// <exp1> ::= ID
(43<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(43<<16)+4,
// <exp1> ::= INTLIT
(43<<16)+1,
// <exp1> ::= STRINGLIT
(43<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(47<<16)+1,
// letter128 ::= {193..218 225..250}
(62<<16)+1,
// digit ::= {"0".."9"}
(65<<16)+1,
// digit128 ::= {176..185}
(68<<16)+1,
// any ::= {0..127}
(70<<16)+1,
// any128 ::= {128..255}
(91<<16)+1,
// ws ::= " "
(94<<16)+1,
// ws ::= {10}
(94<<16)+1,
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
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `&& ::= "@" "&" ws*
(40<<16)+3,
// `&& ::= "@" "&"
(40<<16)+2,
// `* ::= "*" ws*
(37<<16)+2,
// `* ::= "*"
(37<<16)+1,
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
(44<<16)+2,
// `- ::= "-"
(44<<16)+1,
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
(39<<16)+2,
// `/ ::= "/"
(39<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(45<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(45<<16)+2,
// INTLIT ::= digit128 ws*
(45<<16)+2,
// INTLIT ::= digit128
(45<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(45<<16)+3,
// INTLIT ::= "0" $$2
(45<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(46<<16)+3,
// STRINGLIT ::= "@" '"'
(46<<16)+2,
// STRINGLIT ::= '"' any* $$3
(46<<16)+3,
// STRINGLIT ::= '"' $$3
(46<<16)+2,
// idChar ::= letter
(103<<16)+1,
// idChar ::= digit
(103<<16)+1,
// idChar ::= "_"
(103<<16)+1,
// idChar128 ::= letter128
(104<<16)+1,
// idChar128 ::= digit128
(104<<16)+1,
// idChar128 ::= {223}
(104<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(105<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(106<<16)+1,
// digit* ::= digit* digit
(97<<16)+2,
// digit* ::= digit
(97<<16)+1,
// any* ::= any* any
(101<<16)+2,
// any* ::= any
(101<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(99<<16)+2,
// hexDigit* ::= hexDigit
(99<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// idChar* ::= idChar* idChar
(95<<16)+2,
// idChar* ::= idChar
(95<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(96<<16)+2,
// $$0 ::= idChar128
(96<<16)+1,
// $$1 ::= digit128 ws*
(98<<16)+2,
// $$1 ::= digit128
(98<<16)+1,
// $$2 ::= hexDigit128 ws*
(100<<16)+2,
// $$2 ::= hexDigit128
(100<<16)+1,
// $$3 ::= any128 ws*
(102<<16)+2,
// $$3 ::= any128
(102<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
73, // 0
73, // 1
73, // 2
73, // 3
73, // 4
73, // 5
73, // 6
73, // 7
73, // 8
73, // 9
87, // 10
73, // 11
73, // 12
73, // 13
73, // 14
73, // 15
73, // 16
73, // 17
73, // 18
73, // 19
73, // 20
73, // 21
73, // 22
73, // 23
73, // 24
73, // 25
73, // 26
73, // 27
73, // 28
73, // 29
73, // 30
73, // 31
74, // " "
73, // "!"
89, // '"'
75, // "#"
73, // "$"
73, // "%"
76, // "&"
73, // "'"
82, // "("
77, // ")"
90, // "*"
83, // "+"
73, // ","
72, // "-"
73, // "."
79, // "/"
67, // "0"
66, // "1"
66, // "2"
66, // "3"
66, // "4"
66, // "5"
66, // "6"
66, // "7"
66, // "8"
66, // "9"
73, // ":"
80, // ";"
73, // "<"
85, // "="
73, // ">"
73, // "?"
86, // "@"
51, // "A"
51, // "B"
51, // "C"
51, // "D"
51, // "E"
51, // "F"
51, // "G"
51, // "H"
51, // "I"
51, // "J"
51, // "K"
51, // "L"
51, // "M"
51, // "N"
51, // "O"
51, // "P"
51, // "Q"
51, // "R"
51, // "S"
51, // "T"
51, // "U"
51, // "V"
51, // "W"
51, // "X"
51, // "Y"
51, // "Z"
71, // "["
73, // "\"
78, // "]"
73, // "^"
84, // "_"
73, // "`"
48, // "a"
59, // "b"
52, // "c"
51, // "d"
51, // "e"
53, // "f"
51, // "g"
51, // "h"
54, // "i"
51, // "j"
51, // "k"
55, // "l"
51, // "m"
60, // "n"
56, // "o"
49, // "p"
51, // "q"
57, // "r"
51, // "s"
61, // "t"
58, // "u"
50, // "v"
51, // "w"
51, // "x"
51, // "y"
51, // "z"
81, // "{"
73, // "|"
88, // "}"
73, // "~"
73, // 127
93, // 128
93, // 129
93, // 130
93, // 131
93, // 132
93, // 133
93, // 134
93, // 135
93, // 136
93, // 137
93, // 138
93, // 139
93, // 140
93, // 141
93, // 142
93, // 143
93, // 144
93, // 145
93, // 146
93, // 147
93, // 148
93, // 149
93, // 150
93, // 151
93, // 152
93, // 153
93, // 154
93, // 155
93, // 156
93, // 157
93, // 158
93, // 159
93, // 160
93, // 161
93, // 162
93, // 163
93, // 164
93, // 165
93, // 166
93, // 167
93, // 168
93, // 169
93, // 170
93, // 171
93, // 172
93, // 173
93, // 174
93, // 175
69, // 176
69, // 177
69, // 178
69, // 179
69, // 180
69, // 181
69, // 182
69, // 183
69, // 184
69, // 185
93, // 186
93, // 187
93, // 188
93, // 189
93, // 190
93, // 191
93, // 192
64, // 193
64, // 194
64, // 195
64, // 196
64, // 197
64, // 198
63, // 199
63, // 200
63, // 201
63, // 202
63, // 203
63, // 204
63, // 205
63, // 206
63, // 207
63, // 208
63, // 209
63, // 210
63, // 211
63, // 212
63, // 213
63, // 214
63, // 215
63, // 216
63, // 217
63, // 218
93, // 219
93, // 220
93, // 221
93, // 222
92, // 223
93, // 224
64, // 225
64, // 226
64, // 227
64, // 228
64, // 229
64, // 230
63, // 231
63, // 232
63, // 233
63, // 234
63, // 235
63, // 236
63, // 237
63, // 238
63, // 239
63, // 240
63, // 241
63, // 242
63, // 243
63, // 244
63, // 245
63, // 246
63, // 247
63, // 248
63, // 249
63, // 250
93, // 251
93, // 252
93, // 253
93, // 254
93, // 255
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
"<stmt> ::= # `break", // 20
"<assign> ::= <exp> # `= <exp>", // 21
"<local var decl> ::= <type> # ID `= <exp>", // 22
"<exp> ::= <exp4>", // 23
"<exp4> ::= # `true", // 24
"<exp4> ::= # `false", // 25
"<exp4> ::= <exp4> # `+ <exp3>", // 26
"<exp4> ::= <exp3>", // 27
"<exp3> ::= <exp3> # `* <exp2>", // 28
"<exp3> ::= <exp3> # `/ <exp2>", // 29
"<exp3> ::= <exp3> # `&& <exp2>", // 30
"<exp3> ::= <exp2>", // 31
"<exp2> ::= <cast exp>", // 32
"<exp2> ::= <unary exp>", // 33
"<cast exp> ::= # `( <type> `) <cast exp>", // 34
"<cast exp> ::= # `( <type> `) <exp1>", // 35
"<unary exp> ::= # `- <unary exp>", // 36
"<unary exp> ::= <exp1>", // 37
"<exp1> ::= # ID", // 38
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 39
"<exp1> ::= # INTLIT", // 40
"<exp1> ::= # STRINGLIT", // 41
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 42
"letter128 ::= {193..218 225..250}", // 43
"digit ::= {\"0\"..\"9\"}", // 44
"digit128 ::= {176..185}", // 45
"any ::= {0..127}", // 46
"any128 ::= {128..255}", // 47
"ws ::= \" \"", // 48
"ws ::= {10} registerNewline", // 49
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 50
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 51
"`class ::= \"#\" \"c\" \"l\" ws*", // 52
"`class ::= \"#\" \"c\" \"l\" ws*", // 53
"`void ::= \"#\" \"v\" \"o\" ws*", // 54
"`void ::= \"#\" \"v\" \"o\" ws*", // 55
"`int ::= \"#\" \"i\" \"t\" ws*", // 56
"`int ::= \"#\" \"i\" \"t\" ws*", // 57
"`break ::= \"#\" \"b\" \"r\" ws*", // 58
"`break ::= \"#\" \"b\" \"r\" ws*", // 59
"`false ::= \"#\" \"f\" \"a\" ws*", // 60
"`false ::= \"#\" \"f\" \"a\" ws*", // 61
"`true ::= \"#\" \"t\" \"r\" ws*", // 62
"`true ::= \"#\" \"t\" \"r\" ws*", // 63
"`null ::= \"#\" \"n\" \"u\" ws*", // 64
"`null ::= \"#\" \"n\" \"u\" ws*", // 65
"`public ::= \"#\" \"p\" \"u\" ws*", // 66
"`public ::= \"#\" \"p\" \"u\" ws*", // 67
"`&& ::= \"@\" \"&\" ws*", // 68
"`&& ::= \"@\" \"&\" ws*", // 69
"`* ::= \"*\" ws*", // 70
"`* ::= \"*\" ws*", // 71
"`( ::= \"(\" ws*", // 72
"`( ::= \"(\" ws*", // 73
"`) ::= \")\" ws*", // 74
"`) ::= \")\" ws*", // 75
"`{ ::= \"{\" ws*", // 76
"`{ ::= \"{\" ws*", // 77
"`} ::= \"}\" ws*", // 78
"`} ::= \"}\" ws*", // 79
"`- ::= \"-\" ws*", // 80
"`- ::= \"-\" ws*", // 81
"`+ ::= \"+\" ws*", // 82
"`+ ::= \"+\" ws*", // 83
"`= ::= \"=\" ws*", // 84
"`= ::= \"=\" ws*", // 85
"`[ ::= \"[\" ws*", // 86
"`[ ::= \"[\" ws*", // 87
"`] ::= \"]\" ws*", // 88
"`] ::= \"]\" ws*", // 89
"`; ::= \";\" ws*", // 90
"`; ::= \";\" ws*", // 91
"`/ ::= \"/\" ws*", // 92
"`/ ::= \"/\" ws*", // 93
"ID ::= letter128 ws*", // 94
"ID ::= letter128 ws*", // 95
"ID ::= letter idChar* idChar128 ws*", // 96
"ID ::= letter idChar* idChar128 ws*", // 97
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 98
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 99
"INTLIT ::= digit128 ws*", // 100
"INTLIT ::= digit128 ws*", // 101
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 102
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 103
"STRINGLIT ::= \"@\" \'\"\' ws*", // 104
"STRINGLIT ::= \"@\" \'\"\' ws*", // 105
"STRINGLIT ::= \'\"\' any* any128 ws*", // 106
"STRINGLIT ::= \'\"\' any* any128 ws*", // 107
"idChar ::= letter", // 108
"idChar ::= digit", // 109
"idChar ::= \"_\"", // 110
"idChar128 ::= letter128", // 111
"idChar128 ::= digit128", // 112
"idChar128 ::= {223}", // 113
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 114
"hexDigit128 ::= {176..185 193..198 225..230}", // 115
"digit* ::= digit* digit", // 116
"digit* ::= digit* digit", // 117
"any* ::= any* any", // 118
"any* ::= any* any", // 119
"<decl in class>* ::= <decl in class>* <decl in class>", // 120
"<decl in class>* ::= <decl in class>* <decl in class>", // 121
"hexDigit* ::= hexDigit* hexDigit", // 122
"hexDigit* ::= hexDigit* hexDigit", // 123
"<stmt>* ::= <stmt>* <stmt>", // 124
"<stmt>* ::= <stmt>* <stmt>", // 125
"idChar* ::= idChar* idChar", // 126
"idChar* ::= idChar* idChar", // 127
"<class decl>+ ::= <class decl>", // 128
"<class decl>+ ::= <class decl>+ <class decl>", // 129
"ws* ::= ws* ws", // 130
"ws* ::= ws* ws", // 131
"", // 132
"", // 133
"", // 134
"", // 135
"", // 136
"", // 137
"", // 138
"", // 139
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
    { // 20: <stmt> ::= [#] `break @newBreak(int)=>Statement
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
    { // 27: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 29: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 30: <exp3> ::= <exp3> [#] `&& <exp2> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 31: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 32: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 34: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 35: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 36: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 37: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 39: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 40: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 41: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 42: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 43: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 44: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 45: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 46: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 47: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 48: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 49: ws ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 50: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 51: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 52: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `break ::= "#" "b" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `false ::= "#" "f" "a" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `true ::= "#" "t" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 65: `null ::= "#" "n" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 69: `&& ::= "@" "&" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 70: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 90: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 93: `/ ::= "/" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 95: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 96: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 97: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 98: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 99: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 100: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 101: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 102: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 103: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 104: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 105: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 106: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 107: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 108: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 109: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 110: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 111: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 112: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 113: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 114: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 115: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 116: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 117: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 118: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 119: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 120: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 121: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 122: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 123: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 124: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 125: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 126: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 127: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 128: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 129: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 130: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 131: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 132: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 133: $$0 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 134: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 135: $$1 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 136: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 137: $$2 ::= hexDigit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 138: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 139: $$3 ::= any128 [ws*] @pass
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
      ((33<<5)|0x5)/*methodCall:33*/,
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
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 26: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 27: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 29: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 31: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 33: {
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
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
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
