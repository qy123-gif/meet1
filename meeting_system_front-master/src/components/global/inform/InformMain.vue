<script setup>
import router from "../../../js/router";
import store from "../../../js/store";
import { ref } from "vue";

const activeName = ref("first");
</script>

<template>
  <el-tabs v-model="activeName" type="card" class="demo-tabs">
    

    
    <el-tab-pane label="会议通知" name="third">
      <template #label>
        <el-badge :is-dot="store.state.meetingInfrom.length > 0">
          <span>会议通知</span>
        </el-badge> </template
      ><meeting-inform
    /></el-tab-pane>
  </el-tabs>
</template>

<style scoped></style>
