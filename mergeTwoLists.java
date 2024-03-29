# LinkedList
//合并两个有序链表
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 == null){
            cur.next = l2;
        }else if(l2 == null){
            cur.next = l1;
        }
        //上面的if语句可以写成cur.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
