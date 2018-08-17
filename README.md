# Calculate-Time-series

In the nestedArray class you need to put in the the file timeseries.csv which currently has my local link.

The timeseries.csv looks like:
label	time	value
cpu	2018-08-01T20:05:00.000Z	0.42
memory	2018-08-01T20:05:00.000Z	0.5
disk	2018-08-01T20:05:00.000Z	0.21
cpu	2018-08-01T20:04:00.000Z	0.4
memory	2018-08-01T20:04:00.000Z	0.47
disk	2018-08-01T20:04:00.000Z	0.21
cpu	2018-08-01T20:03:00.000Z	0.81
memory	2018-08-01T20:03:00.000Z	0.49
disk	2018-08-01T20:03:00.000Z	0.22
cpu	2018-08-01T20:02:00.000Z	0.97
memory	2018-08-01T20:02:00.000Z	0.19
disk	2018-08-01T20:02:00.000Z	0.22
cpu	2018-08-01T20:01:00.000Z	0.27
memory	2018-08-01T20:01:00.000Z	0.64
disk	2018-08-01T20:01:00.000Z	0.23
cpu	2018-08-01T20:00:00.000Z	0.56
memory	2018-08-01T20:00:00.000Z	0.2
disk	2018-08-01T20:00:00.000Z	0.24
cpu	2018-08-01T19:59:00.000Z	0.01
memory	2018-08-01T19:59:00.000Z	0.17
disk	2018-08-01T19:59:00.000Z	0.24
cpu	2018-08-01T19:58:00.000Z	0.71
memory	2018-08-01T19:58:00.000Z	0.87
disk	2018-08-01T19:58:00.000Z	0.24
cpu	2018-08-01T19:57:00.000Z	0.49
memory	2018-08-01T19:57:00.000Z	0.9
disk	2018-08-01T19:57:00.000Z	0.25
cpu	2018-08-01T19:56:00.000Z	0.26
memory	2018-08-01T19:56:00.000Z	0.22
disk	2018-08-01T19:56:00.000Z	0.26
cpu	2018-08-01T19:55:00.000Z	0.61
memory	2018-08-01T19:55:00.000Z	0.25
disk	2018-08-01T19:55:00.000Z	0.26
cpu	2018-08-01T19:42:00.000Z	0.47
memory	2018-08-01T19:42:00.000Z	0.02
disk	2018-08-01T19:42:00.000Z	0.32
cpu	2018-08-01T19:41:00.000Z	0.62
memory	2018-08-01T19:41:00.000Z	0.82
disk	2018-08-01T19:41:00.000Z	0.32
cpu	2018-08-01T19:40:00.000Z	0.94
memory	2018-08-01T19:40:00.000Z	0.32
disk	2018-08-01T19:40:00.000Z	0.33
cpu	2018-08-01T19:39:00.000Z	0.35
memory	2018-08-01T19:39:00.000Z	0.53
disk	2018-08-01T19:39:00.000Z	0.34
cpu	2018-08-01T19:38:00.000Z	0.1
memory	2018-08-01T19:38:00.000Z	0.65
disk	2018-08-01T19:38:00.000Z	0.35
cpu	2018-08-01T19:37:00.000Z	0.23
memory	2018-08-01T19:37:00.000Z	0.9
disk	2018-08-01T19:37:00.000Z	0.35
cpu	2018-08-01T19:36:00.000Z	0.48
memory	2018-08-01T19:36:00.000Z	0.77
disk	2018-08-01T19:36:00.000Z	0.36
cpu	2018-08-01T19:35:00.000Z	0.45
memory	2018-08-01T19:35:00.000Z	0.77
disk	2018-08-01T19:35:00.000Z	0.36
cpu	2018-08-01T19:34:00.000Z	1
memory	2018-08-01T19:34:00.000Z	0.3
disk	2018-08-01T19:34:00.000Z	0.37
cpu	2018-08-01T19:33:00.000Z	0.93
memory	2018-08-01T19:33:00.000Z	0.8
disk	2018-08-01T19:33:00.000Z	0.38
cpu	2018-08-01T19:32:00.000Z	0.26
memory	2018-08-01T19:32:00.000Z	0.46
disk	2018-08-01T19:32:00.000Z	0.38
cpu	2018-08-01T19:31:00.000Z	0.71
memory	2018-08-01T19:31:00.000Z	0.14
disk	2018-08-01T19:31:00.000Z	0.39
cpu	2018-08-01T19:30:00.000Z	0.38
memory	2018-08-01T19:30:00.000Z	0.38
disk	2018-08-01T19:30:00.000Z	0.4
cpu	2018-08-01T19:29:00.000Z	0.29
memory	2018-08-01T19:29:00.000Z	0.82
disk	2018-08-01T19:29:00.000Z	0.41
cpu	2018-08-01T19:28:00.000Z	0.97
memory	2018-08-01T19:28:00.000Z	0.14
disk	2018-08-01T19:28:00.000Z	0.41
cpu	2018-08-01T19:27:00.000Z	0.62
memory	2018-08-01T19:27:00.000Z	0.25
disk	2018-08-01T19:27:00.000Z	0.42
cpu	2018-08-01T19:26:00.000Z	0.11
memory	2018-08-01T19:26:00.000Z	0.98
disk	2018-08-01T19:26:00.000Z	0.42
cpu	2018-08-01T19:25:00.000Z	0.63
memory	2018-08-01T19:25:00.000Z	0.46
disk	2018-08-01T19:25:00.000Z	0.43
cpu	2018-08-01T19:24:00.000Z	0.59
memory	2018-08-01T19:24:00.000Z	0.79
disk	2018-08-01T19:24:00.000Z	0.44
cpu	2018-08-01T19:23:00.000Z	0.52
memory	2018-08-01T19:23:00.000Z	0.69
disk	2018-08-01T19:23:00.000Z	0.45
cpu	2018-08-01T19:22:00.000Z	0.89
memory	2018-08-01T19:22:00.000Z	0.9
disk	2018-08-01T19:22:00.000Z	0.46
cpu	2018-08-01T19:21:00.000Z	0.88
memory	2018-08-01T19:21:00.000Z	0.76
disk	2018-08-01T19:21:00.000Z	0.47
cpu	2018-08-01T19:20:00.000Z	0.91
memory	2018-08-01T19:20:00.000Z	0.3
disk	2018-08-01T19:20:00.000Z	0.47
cpu	2018-08-01T19:19:00.000Z	0.58
memory	2018-08-01T19:19:00.000Z	0.14
disk	2018-08-01T19:19:00.000Z	0.47
cpu	2018-08-01T19:18:00.000Z	0.81
memory	2018-08-01T19:18:00.000Z	0.56
disk	2018-08-01T19:18:00.000Z	0.47
cpu	2018-08-01T19:17:00.000Z	0.4
memory	2018-08-01T19:17:00.000Z	0.53
disk	2018-08-01T19:17:00.000Z	0.48
cpu	2018-08-01T19:16:00.000Z	0.29
memory	2018-08-01T19:16:00.000Z	0.05
disk	2018-08-01T19:16:00.000Z	0.48
cpu	2018-08-01T19:15:00.000Z	0.87
memory	2018-08-01T19:15:00.000Z	0.45
disk	2018-08-01T19:15:00.000Z	0.49
cpu	2018-08-01T19:14:00.000Z	0.78
memory	2018-08-01T19:14:00.000Z	0.98
disk	2018-08-01T19:14:00.000Z	0.5
cpu	2018-08-01T19:13:00.000Z	0.09
memory	2018-08-01T19:13:00.000Z	0.05
disk	2018-08-01T19:13:00.000Z	0.5
cpu	2018-08-01T19:12:00.000Z	0.53
memory	2018-08-01T19:12:00.000Z	0.66
disk	2018-08-01T19:12:00.000Z	0.5
cpu	2018-08-01T19:11:00.000Z	0.31
memory	2018-08-01T19:11:00.000Z	0.09
disk	2018-08-01T19:11:00.000Z	0.51
cpu	2018-08-01T19:10:00.000Z	0.05
memory	2018-08-01T19:10:00.000Z	0.1
disk	2018-08-01T19:10:00.000Z	0.52
cpu	2018-08-01T19:09:00.000Z	0.18
memory	2018-08-01T19:09:00.000Z	0.78
disk	2018-08-01T19:09:00.000Z	0.52
cpu	2018-08-01T19:08:00.000Z	0.7
memory	2018-08-01T19:08:00.000Z	0.42
disk	2018-08-01T19:08:00.000Z	0.52
cpu	2018-08-01T19:07:00.000Z	0.73
memory	2018-08-01T19:07:00.000Z	0.64
disk	2018-08-01T19:07:00.000Z	0.53
cpu	2018-08-01T19:06:00.000Z	0.39
memory	2018-08-01T19:06:00.000Z	0.9
disk	2018-08-01T19:06:00.000Z	0.53
cpu	2018-08-01T19:05:00.000Z	0.38
memory	2018-08-01T19:05:00.000Z	0.63
disk	2018-08-01T19:05:00.000Z	0.54
cpu	2018-08-01T19:04:00.000Z	0.94
memory	2018-08-01T19:04:00.000Z	0.42
disk	2018-08-01T19:04:00.000Z	0.55
cpu	2018-08-01T19:03:00.000Z	0.06
memory	2018-08-01T19:03:00.000Z	0.42
disk	2018-08-01T19:03:00.000Z	0.55
cpu	2018-08-01T19:02:00.000Z	0.05
memory	2018-08-01T19:02:00.000Z	0.05
disk	2018-08-01T19:02:00.000Z	0.56
cpu	2018-08-01T19:01:00.000Z	0.48
memory	2018-08-01T19:01:00.000Z	0.09
disk	2018-08-01T19:01:00.000Z	0.56
cpu	2018-08-01T19:00:00.000Z	0.85
memory	2018-08-01T19:00:00.000Z	0.65
disk	2018-08-01T19:00:00.000Z	0.56
cpu	2018-08-01T18:59:00.000Z	0.59
memory	2018-08-01T18:59:00.000Z	0.9
disk	2018-08-01T18:59:00.000Z	0.56
cpu	2018-08-01T18:58:00.000Z	0.86
memory	2018-08-01T18:58:00.000Z	0.05
disk	2018-08-01T18:58:00.000Z	0.56
cpu	2018-08-01T18:57:00.000Z	0.34
memory	2018-08-01T18:57:00.000Z	0.25
disk	2018-08-01T18:57:00.000Z	0.57
cpu	2018-08-01T18:56:00.000Z	0.5
memory	2018-08-01T18:56:00.000Z	0.09
disk	2018-08-01T18:56:00.000Z	0.58
cpu	2018-08-01T18:55:00.000Z	0.73
memory	2018-08-01T18:55:00.000Z	0.3
disk	2018-08-01T18:55:00.000Z	0.58
cpu	2018-08-01T18:54:00.000Z	0.81
memory	2018-08-01T18:54:00.000Z	0.28
disk	2018-08-01T18:54:00.000Z	0.58
cpu	2018-08-01T18:53:00.000Z	0.24
memory	2018-08-01T18:53:00.000Z	0.26
disk	2018-08-01T18:53:00.000Z	0.59
cpu	2018-08-01T18:52:00.000Z	0.88
memory	2018-08-01T18:52:00.000Z	0.47
disk	2018-08-01T18:52:00.000Z	0.6
cpu	2018-08-01T18:51:00.000Z	0.18
memory	2018-08-01T18:51:00.000Z	0.12
disk	2018-08-01T18:51:00.000Z	0.61
cpu	2018-08-01T18:50:00.000Z	0.51
memory	2018-08-01T18:50:00.000Z	0.18
disk	2018-08-01T18:50:00.000Z	0.62
cpu	2018-08-01T18:49:00.000Z	0.32
memory	2018-08-01T18:49:00.000Z	0.87
disk	2018-08-01T18:49:00.000Z	0.62
cpu	2018-08-01T18:48:00.000Z	0.4
memory	2018-08-01T18:48:00.000Z	0.38
disk	2018-08-01T18:48:00.000Z	0.63
cpu	2018-08-01T18:47:00.000Z	0.93
memory	2018-08-01T18:47:00.000Z	0.35
disk	2018-08-01T18:47:00.000Z	0.63
cpu	2018-08-01T18:46:00.000Z	0.33
memory	2018-08-01T18:46:00.000Z	0.05
disk	2018-08-01T18:46:00.000Z	0.63
cpu	2018-08-01T18:45:00.000Z	0.63
memory	2018-08-01T18:45:00.000Z	0.23
disk	2018-08-01T18:45:00.000Z	0.63
cpu	2018-08-01T18:44:00.000Z	0.61
memory	2018-08-01T18:44:00.000Z	0.65
disk	2018-08-01T18:44:00.000Z	0.64
cpu	2018-08-01T18:43:00.000Z	0.24
memory	2018-08-01T18:43:00.000Z	0.23
disk	2018-08-01T18:43:00.000Z	0.64
cpu	2018-08-01T18:42:00.000Z	0.58
memory	2018-08-01T18:42:00.000Z	0.63
disk	2018-08-01T18:42:00.000Z	0.65
cpu	2018-08-01T18:41:00.000Z	0.19
memory	2018-08-01T18:41:00.000Z	0.84
disk	2018-08-01T18:41:00.000Z	0.65
cpu	2018-08-01T18:40:00.000Z	0.88
memory	2018-08-01T18:40:00.000Z	0.44
disk	2018-08-01T18:40:00.000Z	0.66
cpu	2018-08-01T18:39:00.000Z	0.11
memory	2018-08-01T18:39:00.000Z	0.44
disk	2018-08-01T18:39:00.000Z	0.67
cpu	2018-08-01T18:38:00.000Z	0.36
memory	2018-08-01T18:38:00.000Z	0.14
disk	2018-08-01T18:38:00.000Z	0.67
cpu	2018-08-01T18:37:00.000Z	0.01
memory	2018-08-01T18:37:00.000Z	0.82
disk	2018-08-01T18:37:00.000Z	0.67
cpu	2018-08-01T18:36:00.000Z	0.68
memory	2018-08-01T18:36:00.000Z	0.93
disk	2018-08-01T18:36:00.000Z	0.67
cpu	2018-08-01T18:35:00.000Z	0.88
memory	2018-08-01T18:35:00.000Z	0.14
disk	2018-08-01T18:35:00.000Z	0.68
cpu	2018-08-01T18:34:00.000Z	0.57
memory	2018-08-01T18:34:00.000Z	0.09
disk	2018-08-01T18:34:00.000Z	0.68
cpu	2018-08-01T18:33:00.000Z	0.42
memory	2018-08-01T18:33:00.000Z	0.04
disk	2018-08-01T18:33:00.000Z	0.68
cpu	2018-08-01T18:32:00.000Z	0.87
memory	2018-08-01T18:32:00.000Z	0.37
disk	2018-08-01T18:32:00.000Z	0.69
cpu	2018-08-01T18:31:00.000Z	0.83
memory	2018-08-01T18:31:00.000Z	0.62
disk	2018-08-01T18:31:00.000Z	0.7
cpu	2018-08-01T18:30:00.000Z	0.18
memory	2018-08-01T18:30:00.000Z	0.64
disk	2018-08-01T18:30:00.000Z	0.71
cpu	2018-08-01T18:29:00.000Z	0.67
memory	2018-08-01T18:29:00.000Z	0.05
disk	2018-08-01T18:29:00.000Z	0.71
cpu	2018-08-01T18:28:00.000Z	0.47
memory	2018-08-01T18:28:00.000Z	0.15
disk	2018-08-01T18:28:00.000Z	0.71
cpu	2018-08-01T18:27:00.000Z	0.1
memory	2018-08-01T18:27:00.000Z	0.52
disk	2018-08-01T18:27:00.000Z	0.72
cpu	2018-08-01T18:26:00.000Z	0.1
memory	2018-08-01T18:26:00.000Z	0.11
disk	2018-08-01T18:26:00.000Z	0.73

The output looks like:

Disk processing for time Wed Aug 01 16:05:00 EDT 2018 - Wed Aug 01 16:00:00 EDT 2018
Mean : 0.21800001
Minimum : 0.21
Maximum : 0.23
Standard Deviation : 0.007483318787920247

Memory processing for time Wed Aug 01 16:05:00 EDT 2018 - Wed Aug 01 16:00:00 EDT 2018
Mean : 0.458
Minimum : 0.19
Maximum : 0.64
Standard Deviation : 0.14688770993694716

Cpu processing for time Wed Aug 01 16:05:00 EDT 2018 - Wed Aug 01 16:00:00 EDT 2018
Mean : 0.574
Minimum : 0.27
Maximum : 0.97
Standard Deviation : 0.26792536991710036

Disk processing for time Wed Aug 01 16:00:00 EDT 2018 - Wed Aug 01 15:55:00 EDT 2018
Mean : 0.246
Minimum : 0.24
Maximum : 0.26
Standard Deviation : 0.007999999076137408

Memory processing for time Wed Aug 01 16:00:00 EDT 2018 - Wed Aug 01 15:55:00 EDT 2018
Mean : 0.47199997
Minimum : 0.17
Maximum : 0.9
Standard Deviation : 0.3377217734427347

Cpu processing for time Wed Aug 01 16:00:00 EDT 2018 - Wed Aug 01 15:55:00 EDT 2018
Mean : 0.3675
Minimum : 0.01
Maximum : 0.71
Standard Deviation : 0.26061225501125834

Disk processing for time Wed Aug 01 15:55:00 EDT 2018 - Wed Aug 01 15:38:00 EDT 2018
Mean : 0.314
Minimum : 0.26
Maximum : 0.34
Standard Deviation : 0.028000005228182204

Memory processing for time Wed Aug 01 15:55:00 EDT 2018 - Wed Aug 01 15:38:00 EDT 2018
Mean : 0.388
Minimum : 0.02
Maximum : 0.82
Standard Deviation : 0.27051062345004245

Cpu processing for time Wed Aug 01 15:55:00 EDT 2018 - Wed Aug 01 15:38:00 EDT 2018
Mean : 0.59499997
Minimum : 0.35
Maximum : 0.94
Standard Deviation : 0.22096379896488974

Disk processing for time Wed Aug 01 15:38:00 EDT 2018 - Wed Aug 01 15:33:00 EDT 2018
Mean : 0.35799998
Minimum : 0.35
Maximum : 0.37
Standard Deviation : 0.007483320380953262

Memory processing for time Wed Aug 01 15:38:00 EDT 2018 - Wed Aug 01 15:33:00 EDT 2018
Mean : 0.678
Minimum : 0.3
Maximum : 0.9
Standard Deviation : 0.20488044060773372

Cpu processing for time Wed Aug 01 15:38:00 EDT 2018 - Wed Aug 01 15:33:00 EDT 2018
Mean : 0.53999996
Minimum : 0.23
Maximum : 1.0
Standard Deviation : 0.28257742339330233

Disk processing for time Wed Aug 01 15:33:00 EDT 2018 - Wed Aug 01 15:28:00 EDT 2018
Mean : 0.392
Minimum : 0.38
Maximum : 0.41
Standard Deviation : 0.01166190595678149

Memory processing for time Wed Aug 01 15:33:00 EDT 2018 - Wed Aug 01 15:28:00 EDT 2018
Mean : 0.52
Minimum : 0.14
Maximum : 0.82
Standard Deviation : 0.259229628810049

Cpu processing for time Wed Aug 01 15:33:00 EDT 2018 - Wed Aug 01 15:28:00 EDT 2018
Mean : 0.40999997
Minimum : 0.26
Maximum : 0.71
Standard Deviation : 0.17874562391513266

Disk processing for time Wed Aug 01 15:28:00 EDT 2018 - Wed Aug 01 15:23:00 EDT 2018
Mean : 0.42400002
Minimum : 0.41
Maximum : 0.44
Standard Deviation : 0.01019804215999939

Memory processing for time Wed Aug 01 15:28:00 EDT 2018 - Wed Aug 01 15:23:00 EDT 2018
Mean : 0.52400005
Minimum : 0.14
Maximum : 0.98
Standard Deviation : 0.3179056549621696

Cpu processing for time Wed Aug 01 15:28:00 EDT 2018 - Wed Aug 01 15:23:00 EDT 2018
Mean : 0.4875
Minimum : 0.11
Maximum : 0.63
Standard Deviation : 0.21844621476367507

Disk processing for time Wed Aug 01 15:23:00 EDT 2018 - Wed Aug 01 15:18:00 EDT 2018
Mean : 0.464
Minimum : 0.45
Maximum : 0.47
Standard Deviation : 0.008000002801429268

Memory processing for time Wed Aug 01 15:23:00 EDT 2018 - Wed Aug 01 15:18:00 EDT 2018
Mean : 0.55799997
Minimum : 0.14
Maximum : 0.9
Standard Deviation : 0.2886104546132763

Cpu processing for time Wed Aug 01 15:23:00 EDT 2018 - Wed Aug 01 15:18:00 EDT 2018
Mean : 0.815
Minimum : 0.58
Maximum : 0.91
Standard Deviation : 0.136106585128407

Disk processing for time Wed Aug 01 15:18:00 EDT 2018 - Wed Aug 01 15:13:00 EDT 2018
Mean : 0.48400003
Minimum : 0.47
Maximum : 0.5
Standard Deviation : 0.01019804215999939

Memory processing for time Wed Aug 01 15:18:00 EDT 2018 - Wed Aug 01 15:13:00 EDT 2018
Mean : 0.514
Minimum : 0.05
Maximum : 0.98
Standard Deviation : 0.29628365392467176

Cpu processing for time Wed Aug 01 15:18:00 EDT 2018 - Wed Aug 01 15:13:00 EDT 2018
Mean : 0.585
Minimum : 0.29
Maximum : 0.87
Standard Deviation : 0.24520399378780303

Disk processing for time Wed Aug 01 15:13:00 EDT 2018 - Wed Aug 01 15:08:00 EDT 2018
Mean : 0.51
Minimum : 0.5
Maximum : 0.52
Standard Deviation : 0.00894426338007676

Memory processing for time Wed Aug 01 15:13:00 EDT 2018 - Wed Aug 01 15:08:00 EDT 2018
Mean : 0.33600003
Minimum : 0.05
Maximum : 0.78
Standard Deviation : 0.31626570749910904

Cpu processing for time Wed Aug 01 15:13:00 EDT 2018 - Wed Aug 01 15:08:00 EDT 2018
Mean : 0.26749998
Minimum : 0.05
Maximum : 0.53
Standard Deviation : 0.1772533381959906

Disk processing for time Wed Aug 01 15:08:00 EDT 2018 - Wed Aug 01 15:03:00 EDT 2018
Mean : 0.534
Minimum : 0.52
Maximum : 0.55
Standard Deviation : 0.010198055018345671

Memory processing for time Wed Aug 01 15:08:00 EDT 2018 - Wed Aug 01 15:03:00 EDT 2018
Mean : 0.602
Minimum : 0.42
Maximum : 0.9
Standard Deviation : 0.17735839082621152

Cpu processing for time Wed Aug 01 15:08:00 EDT 2018 - Wed Aug 01 15:03:00 EDT 2018
Mean : 0.61
Minimum : 0.38
Maximum : 0.94
Standard Deviation : 0.23695991828354485

Disk processing for time Wed Aug 01 15:03:00 EDT 2018 - Wed Aug 01 14:58:00 EDT 2018
Mean : 0.55799997
Minimum : 0.55
Maximum : 0.56
Standard Deviation : 0.003999996185462607

Memory processing for time Wed Aug 01 15:03:00 EDT 2018 - Wed Aug 01 14:58:00 EDT 2018
Mean : 0.42200002
Minimum : 0.05
Maximum : 0.9
Standard Deviation : 0.32529370220118997

Cpu processing for time Wed Aug 01 15:03:00 EDT 2018 - Wed Aug 01 14:58:00 EDT 2018
Mean : 0.4925
Minimum : 0.05
Maximum : 0.85
Standard Deviation : 0.28864987941349296

Disk processing for time Wed Aug 01 14:58:00 EDT 2018 - Wed Aug 01 14:53:00 EDT 2018
Mean : 0.574
Minimum : 0.56
Maximum : 0.58
Standard Deviation : 0.007999992370614351

Memory processing for time Wed Aug 01 14:58:00 EDT 2018 - Wed Aug 01 14:53:00 EDT 2018
Mean : 0.194
Minimum : 0.05
Maximum : 0.3
Standard Deviation : 0.10326664686512713

Cpu processing for time Wed Aug 01 14:58:00 EDT 2018 - Wed Aug 01 14:53:00 EDT 2018
Mean : 0.595
Minimum : 0.34
Maximum : 0.81
Standard Deviation : 0.18607794358221322

Disk processing for time Wed Aug 01 14:53:00 EDT 2018 - Wed Aug 01 14:48:00 EDT 2018
Mean : 0.608
Minimum : 0.59
Maximum : 0.62
Standard Deviation : 0.01166191106786875

Memory processing for time Wed Aug 01 14:53:00 EDT 2018 - Wed Aug 01 14:48:00 EDT 2018
Mean : 0.38
Minimum : 0.12
Maximum : 0.87
Standard Deviation : 0.2721029236450692

Cpu processing for time Wed Aug 01 14:53:00 EDT 2018 - Wed Aug 01 14:48:00 EDT 2018
Mean : 0.47249997
Minimum : 0.18
Maximum : 0.88
Standard Deviation : 0.26280933839753917

Disk processing for time Wed Aug 01 14:48:00 EDT 2018 - Wed Aug 01 14:43:00 EDT 2018
Mean : 0.63199997
Minimum : 0.63
Maximum : 0.64
Standard Deviation : 0.003999996185373789

Memory processing for time Wed Aug 01 14:48:00 EDT 2018 - Wed Aug 01 14:43:00 EDT 2018
Mean : 0.332
Minimum : 0.05
Maximum : 0.65
Standard Deviation : 0.19681462491028026

Cpu processing for time Wed Aug 01 14:48:00 EDT 2018 - Wed Aug 01 14:43:00 EDT 2018
Mean : 0.625
Minimum : 0.33
Maximum : 0.93
Standard Deviation : 0.21230873518860477

Disk processing for time Wed Aug 01 14:43:00 EDT 2018 - Wed Aug 01 14:38:00 EDT 2018
Mean : 0.654
Minimum : 0.64
Maximum : 0.67
Standard Deviation : 0.010198055018345671

Memory processing for time Wed Aug 01 14:43:00 EDT 2018 - Wed Aug 01 14:38:00 EDT 2018
Mean : 0.51600003
Minimum : 0.23
Maximum : 0.84
Standard Deviation : 0.20558209078446765

Cpu processing for time Wed Aug 01 14:43:00 EDT 2018 - Wed Aug 01 14:38:00 EDT 2018
Mean : 0.44
Minimum : 0.11
Maximum : 0.88
Standard Deviation : 0.3100806317380661

Disk processing for time Wed Aug 01 14:38:00 EDT 2018 - Wed Aug 01 14:33:00 EDT 2018
Mean : 0.674
Minimum : 0.67
Maximum : 0.68
Standard Deviation : 0.004898974813549948

Memory processing for time Wed Aug 01 14:38:00 EDT 2018 - Wed Aug 01 14:33:00 EDT 2018
Mean : 0.42399997
Minimum : 0.09
Maximum : 0.93
Standard Deviation : 0.37032958253628784

Cpu processing for time Wed Aug 01 14:38:00 EDT 2018 - Wed Aug 01 14:33:00 EDT 2018
Mean : 0.53499997
Minimum : 0.01
Maximum : 0.88
Standard Deviation : 0.3228389685733755

Disk processing for time Wed Aug 01 14:33:00 EDT 2018 - Wed Aug 01 14:28:00 EDT 2018
Mean : 0.698
Minimum : 0.68
Maximum : 0.71
Standard Deviation : 0.011661892668056848

Memory processing for time Wed Aug 01 14:33:00 EDT 2018 - Wed Aug 01 14:28:00 EDT 2018
Mean : 0.34399998
Minimum : 0.04
Maximum : 0.64
Standard Deviation : 0.2620381630667451

Cpu processing for time Wed Aug 01 14:33:00 EDT 2018 - Wed Aug 01 14:28:00 EDT 2018
Mean : 0.63750005
Minimum : 0.18
Maximum : 0.87
Standard Deviation : 0.27453369116200255

nestedArray.nestedArray.main()

